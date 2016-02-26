package com.example.gabrielsouza.facebook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView labelAuth;
    int coin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("Facebook");
        setContentView(R.layout.activity_main);

        final Button buttonLogin = (Button) findViewById(R.id.bLogin);
        final EditText fieldLogin = (EditText) findViewById(R.id.loginEnter);
        final EditText fieldPassword = (EditText) findViewById(R.id.passwordEnter);
        final TextView labelSignUp = (TextView) findViewById(R.id.lblSignUp);
        labelAuth = (TextView) findViewById(R.id.relativeLayoutLabelAuth);
        final EditText passCheck = (EditText) findViewById(R.id.passwordCheck);
        final ImageView helpImage = (ImageView) findViewById(R.id.imageHelp);



        buttonLogin.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                String login = fieldLogin.getText().toString();
                String pass = fieldPassword.getText().toString();
                String checkPass = passCheck.getText().toString();

                if (passCheck.getVisibility() == View.VISIBLE){
                    if (checkPass.equals(pass)){
                        labelAuth.setText(getString(R.string.sucessReg));
                    }else{
                        labelAuth.setText(getString(R.string.errorReg));
                    }
                }else{
                    if (login.equals("milho") && pass.equals("cozido")){
                        labelAuth.setText(getString(R.string.ok));
                        Toast.makeText(v.getContext(), "You're logged", Toast.LENGTH_SHORT).show();
                    }else{
                        labelAuth.setText(getString(R.string.wrong));
                        Toast.makeText(v.getContext(), "Incorrect Data", Toast.LENGTH_SHORT).show();
                    }
                }
                labelAuth.setVisibility(View.VISIBLE);
            }
        });

        labelSignUp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                labelSignUp.setVisibility(View.GONE);
                passCheck.setVisibility(View.VISIBLE);
                buttonLogin.setText("Registrar");
            }
        });

        helpImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(coin < 99) {
                    coin++;
                    Toast.makeText(v.getContext(), "Coins:" + coin, Toast.LENGTH_SHORT).show();
                }else {
                    coin = 0;
                    Toast.makeText(v.getContext(), "1 UP", Toast.LENGTH_SHORT).show();
                    Toast.makeText(v.getContext(), "Coins:" + coin, Toast.LENGTH_SHORT).show();
                }
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
