package com.bard.helloworldsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Overrides method of super class
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Set view to the layout file activity_main (res/layout/activity_main)
        setContentView(R.layout.activity_main);

        //Define a textView
        TextView firstTextView;
        //Get the object by using findViewById. R.id.<id written in xml file>
        firstTextView = (TextView)findViewById(R.id.hola_world_textview);
        //Set text of textView
        firstTextView.setText("I got hold of this text view");

        final TextView helloBanglaTextView = (TextView)findViewById(R.id.hello_bangla_text);
        //set visibility as gone
        helloBanglaTextView.setVisibility(View.GONE);

        final EditText nameEditText = (EditText)findViewById(R.id.enter_name_edit_text);
        Button showButton = (Button) findViewById(R.id.my_button);

        //set what happens when button is clicked
        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ///This function will be called when the button is clicked
                String name = nameEditText.getText().toString();
                helloBanglaTextView.setText(name);
                helloBanglaTextView.setVisibility(View.VISIBLE);
            }
        });

        //Log is similar to print statement. Can be seen in Android->Logcat
        Log.d("MainActivity", "onCreate ");

        //This is a simple toast
        Toast.makeText(MainActivity.this, "Sample Bard Toast", Toast.LENGTH_SHORT).show();
    }
}
