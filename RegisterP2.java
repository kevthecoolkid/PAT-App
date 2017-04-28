package com.amazonaws.demo.userpreferencesom;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Spinner;


public class RegisterP2 extends Activity {

    private static final String TAG = "UserPreferenceDemoActivity";
	private String FirstName = "";
	private String LastName = "";
	private String Gender = "";
	private String Age = "";
	private String UserWeight = "";
	private String HeightFT = "";
	private String HeightIN = "";
	
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registerpage2);

		
        final Button nextBttn = (Button) findViewById(R.id.next_bttn);
        nextBttn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Log.i(TAG, "NextBttn clicked.");

				// Pull all data entered into the text boxes once NextBttn has been clicked
				final EditText firstNameBox = (EditText) findViewById(R.id.firstName);
				final EditText lastNameBox = (EditText) findViewById(R.id.lastName);
				final Spinner genderSpinner = (Spinner) findViewById(R.id.gender);
				final EditText ageBox = (EditText) findViewById(R.id.age);
				final EditText userWeightBox = (EditText) findViewById(R.id.userWeight);
				final EditText heightFTBox = (EditText) findViewById(R.id.heightFT);
				final EditText heightINBox = (EditText) findViewById(R.id.heightIN);
				
				FirstName = firstNameBox.getText().toString();
				LastName = lastNameBox.getText().toString();
				Gender = mySpinner.getSelectedItem().toString();
				Age = ageBox.getText().toString();
				UserWeight = userWeightBox.getText().toString();
				HeightFT = heightFTBox.getText().toString();
				HeightIN = heightINBox.getText().toString();
				
				
				
				/*
				spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
						Object item = parent.getItemAtPosition(pos);
					}
					public void onNothingSelected(AdapterView<?> parent) {
					}
				*/
});
				
				
				/*
                Intent intent = new Intent(RegisterP2.this, RegisterP3.class);
                startActivity(intent);
				*/
            }
        });

    }
}