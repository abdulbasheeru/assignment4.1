package com.acadgild.android.loginscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText editText2, editText3;
    TextView statusTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Type casting from XML to JAVA
        editText2 = (EditText) findViewById(R.id.editText2);
        editText3 = (EditText) findViewById(R.id.editText3);
        statusTV = (TextView) findViewById(R.id.textView);
        button = (Button) findViewById(R.id.button);

        // Event Handler :: onClick:
        // 3 ways to set onClickListener..... Anonymous Inner Clss Dec
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String Email = editText2.getText().toString();
                String Password = editText3.getText().toString();
                statusTV.setVisibility(TextView.VISIBLE);
                if (Email.equalsIgnoreCase("abdul") && Password.equals("abdul")) {
                    statusTV.setText("Login Success!\nUser : Abdul");
                    Toast.makeText(getApplicationContext(), "Login Success for " + Email, Toast.LENGTH_LONG).show();
                } else {
                    statusTV.setText("Incorrect Email ID/Password");

                }


            }

        });

    }

}