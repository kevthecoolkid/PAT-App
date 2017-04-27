package com.amazonaws.demo.userpreferencesom;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class RegisterP1 extends Activity {

    private static final String TAG = "UserPreferenceDemoActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        final Button regBttn = (Button) findViewById(R.id.continue_reg_bttn);
        regBttn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Log.i(TAG, "ContRegBttn clicked.");

                Intent intent = new Intent(RegisterP1.this, RegisterP2.class);
                startActivity(intent);
            }
        });

    }
}
