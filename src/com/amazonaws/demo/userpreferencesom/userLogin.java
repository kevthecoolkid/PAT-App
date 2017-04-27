package com.amazonaws.demo.userpreferencesom;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class userLogin extends Activity {

    private static final String TAG = "UserPreferenceDemoActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        final Button credLoginBttn = (Button) findViewById(R.id.cred_login);
        credLoginBttn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Log.i(TAG, "UserLoginBttn clicked.");

                Intent intent = new Intent(userLogin.this, WelcomePage.class);
                startActivity(intent);
            }
        });

    }
}
