package com.varshipcreations.eroticsniperadvance;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ClientLoginActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    private TextView Register;
    EditText EmailET, PasswordET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clientlogin);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Register = (TextView) findViewById(R.id.txt_clientlogin_register);
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent().setClass(ClientLoginActivity.this, ClientRegisterActivity.class);
                startActivity(i);
            }
        });

        EmailET=(EditText)findViewById(R.id.et_clientlogin_email);
        PasswordET=(EditText)findViewById(R.id.et_clientlogin_pswd);


    }

    public void OnClientLogin(View view)
    {
        String s_email=EmailET.getText().toString();
        String s_pswd=PasswordET.getText().toString();
        String type="login";
        BackgroundWorker backgroundWorker=new BackgroundWorker(this);
        backgroundWorker.execute(type, s_email,s_pswd);
    }
}
