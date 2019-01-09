package com.example.mac.week1daily3homework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set variables to stand in for views
        final TextView textV = findViewById(R.id.textView);
        final EditText editV = findViewById(R.id.editView);
        final Button button = findViewById(R.id.edit_button);

        button.setOnClickListener( // Set up the on Click Listener for the button...
              new View.OnClickListener() { // to this on Click Listener ...
                    public void onClick(View view){ // that executes the following code.
                         // Take the text input to the EditText field...
                         String changeText = editV.getText().toString();
                         // and set the TextView to that input.
                         textV.setText(changeText);
                    }
              }
        );
    }

}
