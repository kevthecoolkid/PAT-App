package com.amazonaws.demo.userpreferencesom;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class RegisterP3 extends Activity {

    private static final String TAG = "UserPreferenceDemoActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registerpagethree);

        final Button getstartedBttn = (Button) findViewById(R.id.get_started_bttn);
        getstartedBttn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Log.i(TAG, "getstartedBttn clicked.");

                Intent intent = new Intent(RegisterP3.this, WelcomePage.class);
                startActivity(intent);
            }
        });
    }
}
