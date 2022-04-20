package com.example.tugas1akbif310119097;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class login extends Activity {
    TextView reg;
    Button logn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        reg = (TextView) findViewById(R.id.BuatAkunBaru);
        logn = (Button) findViewById(R.id.button);

        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toRegister = new Intent(login.this, Register.class);
                startActivity(toRegister);
            }
        });
        logn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Main();
            }
        });
    }
    public void Main(){
        Intent toMain = new Intent(login.this, MainActivity.class);
        startActivity(toMain);
    }
}