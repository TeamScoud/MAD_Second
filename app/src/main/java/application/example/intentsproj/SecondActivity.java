package application.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.json.JSONArray;

import java.text.BreakIterator;

public class SecondActivity extends AppCompatActivity {

    Button Add_button;
    TextView result;
    int ans=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        final int number1 = intent.getIntExtra(MainActivity.EXTRA_NUMBER1,0);
        final int number2 = intent.getIntExtra(MainActivity.EXTRA_NUMBER2,0);

        final TextView textView1 = (TextView) findViewById(R.id.textView1);
        final TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView1.setText(""+number1);
        textView2.setText(""+number2);


        Add_button=(Button) findViewById(R.id.add_button);
        result = (TextView) findViewById(R.id.textView_answer);

        // Add_button add clicklistener
        Add_button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                int num1 = Integer.parseInt(textView1.getText().toString());
                int num2 = Integer.parseInt(textView2.getText().toString());

                int sum = num1 + num2;
                // set it ot result textview

                result.setText(Integer.toString(sum));
            }
        });


    }
}