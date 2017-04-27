package com.amazonaws.demo.userpreferencesom;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class WelcomePage extends Activity {

    private static final String TAG = "UserPreferenceDemoActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);

        final Button profileBttn = (Button) findViewById(R.id.profile_bttn);
        profileBttn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Log.i(TAG, "profileBttn clicked.");

                Intent intent = new Intent(WelcomePage.this, ProfilePage.class);
                startActivity(intent);
            }
        });
        /*
        final Button newworkoutBttn = (Button) findViewById(R.id.new_workout_bttn);
        newworkoutBttn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Log.i(TAG, "newworkoutBttn clicked.");

                Intent intent = new Intent(WelcomePage.this, GenerateWorkout.class);
                startActivity(intent);
            }
        });
        */
        final Button showworkoutBttn = (Button) findViewById(R.id.show_workouts_bttn);
        showworkoutBttn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Log.i(TAG, "showworkoutBttn clicked.");

                Intent intent = new Intent(WelcomePage.this, UserListActivity.class);
                startActivity(intent);
            }
        });

    }
}
