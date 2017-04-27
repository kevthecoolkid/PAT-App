/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.demo.userpreferencesom;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Spinner;
import android.widget.TextView;

import com.amazonaws.demo.userpreferencesom.DynamoDBManager.UserPreference;

import java.util.ArrayList;

import static com.amazonaws.demo.userpreferencesom.DynamoDBManager.UserPreference.*;

public class UserActivity extends Activity {

    private String Session = "";
    private String Timestamp = "";
    private String testsession = "";
    private String testtimestamp = "";
    private UserPreference userInfo = null;
    private ArrayList<String> labels = null;
    private ArrayAdapter<String> arrayAdapter = null;
    private ArrayList<UserPreference> items = null;


    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_preference);
        Session = String.valueOf(getIntent().getExtras().getString("SESSION"));
        Timestamp = String.valueOf(getIntent().getExtras().getString("TIMESTAMP"));
        System.out.println(testsession);
        System.out.println(testtimestamp);
        new GetUserInfoTask().execute();
    }

    private class GetUserInfoTask extends AsyncTask<Void, Void, Void> {

        protected Void doInBackground(Void... voids) {

            // Uses timestamp and session from User Clicked item as passable variables to obtain
            // Workout data
            userInfo = DynamoDBManager.getUserPreference(Session,Timestamp);
            return null;
        }

        protected void onPostExecute(Void result) {

            String Reps = userInfo.getReps();
            String Set = userInfo.getSet();
            String Weight = userInfo.getWeight();
            System.out.println(Set);
            System.out.println(Reps);
            System.out.println(Weight);
            System.out.println("Debug the Sets/Reps/Weight displayed if necessary");

            //Sets relevant workout data in the layout page
            TextView NumberofReps = (TextView) findViewById(R.id.rep_number);
            NumberofReps.setText(Reps);
            TextView CountWeight = (TextView) findViewById(R.id.weight);
            CountWeight.setText(Weight + "lbs");
            TextView CountSet = (TextView) findViewById(R.id.Set);
            CountSet.setText(Set);

        }
    }

    private class UpdateAttributeTask extends AsyncTask<Void, Void, Void> {

        protected Void doInBackground(Void... voids) {

            DynamoDBManager.updateUserPreference(userInfo);

            return null;
        }
    }
}
