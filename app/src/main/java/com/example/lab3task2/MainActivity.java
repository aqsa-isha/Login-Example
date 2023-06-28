package com.example.lab3task2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText uid,upass;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        uid=findViewById(R.id.uid);
        upass=findViewById(R.id.upass);
        b1=findViewById(R.id.lgn);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(("aqsa".equals(uid.getText().toString())&&"20sw14".equals(upass.getText().toString()))||("AQSA".equals(uid.getText().toString())&&"20SW14".equals(upass.getText().toString()))){
                    Toast.makeText(getApplicationContext(), "Success", Toast.LENGTH_SHORT).show();

                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}