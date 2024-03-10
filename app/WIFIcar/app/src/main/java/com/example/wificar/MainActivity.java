package com.example.wificar;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {



    @SuppressLint("StaticFieldLeak")
    private static EditText editText;


    @SuppressLint("CommitPrefEdits")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.B1).setOnClickListener(this);
        editText = findViewById(R.id.E1);



    }
        @Override
    public void onClick(View v) {
        if(v.getId()==R.id.B1){


            Intent intent = new Intent(MainActivity.this,car.class);
            Bundle bundle = new Bundle();
            bundle.putString("IP",                                                                              t().toString());
            intent.putExtras(bundle);
            startActivity(intent);

        }

    }
}