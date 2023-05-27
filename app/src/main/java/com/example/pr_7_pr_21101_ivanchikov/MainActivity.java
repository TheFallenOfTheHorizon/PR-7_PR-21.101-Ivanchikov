package com.example.pr_7_pr_21101_ivanchikov;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startNewActivity(View v) {
        Intent intent = new Intent(this, Second_Activity.class);
        startActivity(intent);
    }

    public void startNewActivity2(View v) {
        Intent intent = new Intent(this, Second_Activity.class);
        startActivity(intent);
    }
}