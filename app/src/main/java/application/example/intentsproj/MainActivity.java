package application.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static String EXTRA_NUMBER1;
    public static String EXTRA_NUMBER2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //creating toast object
        Context context = getApplicationContext();
        CharSequence message = "You Just clicked OK Button";
        int duration = Toast.LENGTH_SHORT;
        Toast toast1 = Toast.makeText(context,message,duration);
        toast1.show();
        toast1.setGravity(Gravity.TOP|Gravity.LEFT,0,0);

        //Creating the LayoutInflater instance
        LayoutInflater li = getLayoutInflater();
         //Getting the View object as defined in the customtoast.xml file
        View layout = li.inflate(R.layout.customtoast, (ViewGroup)
                findViewById(R.id.custom_toast_layout));
         //Creating the Toast object
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setView(layout);//setting the view of custom toast layout
        toast.show();

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
          Intent intent = new Intent(MainActivity.this,SecondActivity.class);
          startActivity(intent);
        }

         });
    }


    //Button button = (Button) findViewById(R.id.button);
        //button.setOnClickListener(new View.OnClickListener() {
            //@Override
            //public void onClick(View view) {
                //openSecondActivity();
            //}

       // });
        
   // }
    


    public void openSecondActivity() {

        EditText editText = (EditText) findViewById(R.id.editTextNumber1);
        int number1 = Integer.parseInt(editText.getText().toString());

        EditText editText1 = (EditText) findViewById(R.id.editTextNumber2);
        int number2 = Integer.parseInt(editText1.getText().toString());

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(EXTRA_NUMBER1,number1);
        intent.putExtra(EXTRA_NUMBER2,number2);
        startActivity(intent);
    }


}