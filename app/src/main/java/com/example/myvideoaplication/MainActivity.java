package com.example.myvideoaplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.TextViewCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //declaration
    TextView tv;
    EditText etuser, etpassword;
    Button btnsubmit, btncancel;
    LinearLayout ly;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initialize
        etuser = findViewById(R.id.editTextemail);
        etpassword = findViewById(R.id.editText2);
        btnsubmit = findViewById(R.id.button);
        btncancel = findViewById(R.id.button2);
        //click handler
        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                String user = etuser.getText().toString().trim();
                String password = etpassword.getText().toString().trim();
                if (user.equals("shravu1753waghmare@gmail.com") && password.equals("1753")) {
                    Toast.makeText(MainActivity.this, "Authenticated", Toast.LENGTH_SHORT).show();
                    Intent ii=new Intent(MainActivity.this,SecondActivity.class);
                    startActivity(ii);

                } else {
                    Toast.makeText(MainActivity.this, "Denied", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btncancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etuser.setText(null);
                etpassword.setText(null);

            }
        });
    }
}







