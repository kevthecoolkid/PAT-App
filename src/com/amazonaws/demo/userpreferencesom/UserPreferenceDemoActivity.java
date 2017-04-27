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
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class UserPreferenceDemoActivity extends Activity {

    private static final String TAG = "UserPreferenceDemoActivity";
    public static AmazonClientManager clientManager = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        clientManager = new AmazonClientManager(this);

        final Button userLoginBttn = (Button) findViewById(R.id.user_login_bttn);
        userLoginBttn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Log.i(TAG, "UserLoginBttn clicked.");

                Intent intent = new Intent(UserPreferenceDemoActivity.this, userLogin.class);
                startActivity(intent);
            }
        });

        final Button registerBttn = (Button) findViewById(R.id.register_bttn);
        registerBttn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Log.i(TAG, "registerBttn clicked.");

                Intent intent2 = new Intent(UserPreferenceDemoActivity.this, RegisterP1.class);
                startActivity(intent2);
            }
        });

    };

}
