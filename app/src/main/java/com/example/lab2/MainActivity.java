package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button myB ;
EditText myT ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myB = (Button) findViewById(R.id.submition) ;
        myT = (EditText) findViewById(R.id.personName) ;

        myB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String enterd = myT.getText().toString() ;
                Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
                intent.putExtra("personName", enterd) ;
                startActivity(intent);
            }
        });
    }
}