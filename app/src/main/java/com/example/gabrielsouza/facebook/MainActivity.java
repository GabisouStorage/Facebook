package com.example.gabrielsouza.facebook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("Facebook");
        setContentView(R.layout.activity_main);

        final Button buttonLogin = (Button) findViewById(R.id.bLogin);
        final EditText fieldLogin = (EditText) findViewById(R.id.loginEnter);
        final EditText fieldPassword = (EditText) findViewById(R.id.passwordEnter);

        buttonLogin.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                String login = fieldLogin.getText().toString();
                String pass = fieldPassword.getText().toString();

                //if (login.equals("a") && pass.equals("d"))
            }
        });
    }
}
