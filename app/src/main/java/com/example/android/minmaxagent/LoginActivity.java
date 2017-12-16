package com.example.android.minmaxagent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        button = (Button) findViewById(R.id.loginButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText usernameEditor = (EditText) findViewById(R.id.editUsername);
                String username = (String) usernameEditor.getText();

                EditText passwordEditor = (EditText) findViewById(R.id.editPassword);
                String password = (String) passwordEditor.getText();

                String toastString = "Username : " + username + "\tPassword : " + password;
                Toast.makeText(getActivity(), toastString ,
                        Toast.LENGTH_LONG).show();
            }
        });

    }
}
