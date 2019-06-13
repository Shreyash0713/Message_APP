package com.shreyash.whatsappclone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edtUserName,edtEmailId,edtPassword;
    private Button btnSignUp,btnLoginTransition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Sign Up Here!!!!");
        edtUserName = findViewById(R.id.edtUserName);
        edtEmailId = findViewById(R.id.edtEmailId);
        edtPassword = findViewById(R.id.edtPassword);
        edtPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnSignUp = findViewById(R.id.btnSignUp);
        btnLoginTransition = findViewById(R.id.btnLoginTransition);
    }
}
