package com.esatgozcu.sharedprefothermethods;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Map;

public class MainActivity extends AppCompatActivity {

    Button button;

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    Map<?,?> map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.start);

        sharedPreferences = getSharedPreferences("MyPref",Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();

        editor.putString("stringKey","strawberry");
        editor.putInt("intKey",12);
        editor.putBoolean("boolKey",true);
        editor.apply();
    }

    public void start(View view){

        boolean boolValue = sharedPreferences.contains("intKey");
        Log.d("MyPref","Contains Method : " + boolValue);

        map = sharedPreferences.getAll();
        Log.d("MyPref","GetAll Method : "+map);

    }
}
