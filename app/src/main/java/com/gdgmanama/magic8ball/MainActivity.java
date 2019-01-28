package com.gdgmanama.magic8ball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity  {

    //Declare the variable that will display and invoke the predictions
    TextView textView;
    //String array that will store a list of predictions
    String[] predictions;
    // Random object to choose from the list
    Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //specify the string array size
        predictions = new String[20];

        //Add all the predictions value
        predictions[0] = "It is certain";
        predictions[1] = "It is decidedly so";
        predictions[2] = "Without a doubt";
        predictions[3] = "Yes - definitely";
        predictions[4] = "You may rely on it";
        predictions[5] = "As I see it, yes";
        predictions[6] = "Most likely";
        predictions[7] = "Outlook good";
        predictions[8] = "Yes";
        predictions[9] = "Signs point to yes";
        predictions[10] = "Reply hazy, try again";
        predictions[11] = "Ask again later";
        predictions[12] = "Better not tell you now";
        predictions[13] = "Cannot predict now";
        predictions[14] = "Concentrate and ask again";
        predictions[15] = "Don't count on it";
        predictions[16] = "My reply is no";
        predictions[17] = "My sources say no";
        predictions[18] = "Outlook not so good";
        predictions[19] = "Very doubtful";

        // Create new Random object to be used to predict
        random = new Random();

        //Connect the textView variable with the layout element
        textView = (TextView) findViewById(R.id.textView);

        //When the text view is clicked it will run the code inside
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Choose a random prediction and display it on the text view
                textView.setText(predictions[random.nextInt(20)]);
            }
        });


    }
}
