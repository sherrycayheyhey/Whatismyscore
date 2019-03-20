package com.example.whatismyscore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public void beginClicked(View view){
        //load score screen?

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        configureBeginButton(); //used for the begin button
    }

    private void configureBeginButton(){
        Button beginButton = (Button) findViewById(R.id.beginButton);
        beginButton.setOnClickListener(new View.OnClickListener() { //create a listener so we know when the button is clicked
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, first.class)); //intents connect separate components, enter the start and target

            }
        });

    }
}
