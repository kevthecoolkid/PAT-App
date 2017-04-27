package com.amazonaws.demo.userpreferencesom;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class RegisterP2 extends Activity {

    private static final String TAG = "UserPreferenceDemoActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registerpage2);

        final Button nextBttn = (Button) findViewById(R.id.next_bttn);
        nextBttn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Log.i(TAG, "NextBttn clicked.");

                Intent intent = new Intent(RegisterP2.this, RegisterP3.class);
                startActivity(intent);
            }
        });

    }
}