package com.varshipcreations.eroticsniperadvance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ClientRegisterActivity extends AppCompatActivity {

    EditText EmailET, UsernameET, PasswordET;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_register);
        EmailET=(EditText)findViewById(R.id.et_clientregister_email);
        UsernameET=(EditText)findViewById(R.id.et_clientregister_username);
        PasswordET=(EditText)findViewById(R.id.et_clientregister_pswd);
    }
    public void OnClientRegister(View view)
    {
        String s_email=EmailET.getText().toString();
        String  s_username=UsernameET.getText().toString();
        String  s_password=PasswordET.getText().toString();
        String type="client_register";
        BackgroundWorker backgroundWorker=new BackgroundWorker(this);
        backgroundWorker.execute(type, s_email,s_username,s_password);

    }
}
