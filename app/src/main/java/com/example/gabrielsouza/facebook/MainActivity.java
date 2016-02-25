package com.example.gabrielsouza.facebook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView labelAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("Facebook");
        setContentView(R.layout.activity_main);

        final Button buttonLogin = (Button) findViewById(R.id.bLogin);
        final EditText fieldLogin = (EditText) findViewById(R.id.loginEnter);
        final EditText fieldPassword = (EditText) findViewById(R.id.passwordEnter);
        labelAuth = (TextView) findViewById(R.id.relativeLayoutLabelAuth);

        buttonLogin.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                String login = fieldLogin.getText().toString();
                String pass = fieldPassword.getText().toString();

                if (login.equals("milho") && pass.equals("cozido")){
                    labelAuth.setText(getString(R.string.ok));
                    Toast.makeText(v.getContext(), "You're logged", Toast.LENGTH_SHORT).show();
                }else{
                    labelAuth.setText(getString(R.string.wrong));
                    Toast.makeText(v.getContext(), "Incorrect Data", Toast.LENGTH_SHORT).show();
                }
                labelAuth.setVisibility(View.VISIBLE);
            }
        });

    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
        labelAuth.setVisibility(View.INVISIBLE);
    }
}
