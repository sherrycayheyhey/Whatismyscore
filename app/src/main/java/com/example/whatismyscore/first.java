package com.example.whatismyscore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class first extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        configureNextRoundButton();
    }

    private void configureNextRoundButton(){
        Button nextButton = (Button) findViewById(R.id.nextRoundButton);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(first.this, second.class));

            }
        });
    }

    //called when the user presses the $200 button
    public void value200(View view) {
        //do something in response to button being clicked

    }
}
