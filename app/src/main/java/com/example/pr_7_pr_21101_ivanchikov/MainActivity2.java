package com.example.pr_7_pr_21101_ivanchikov;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    Button btn3,btn4,btn5;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn3=findViewById(R.id.btn3);
        btn3.setOnClickListener(this);
        btn4=findViewById(R.id.button4);
        btn4.setOnClickListener(this);
        btn5=findViewById(R.id.button5);
        btn5.setOnClickListener(this);
        txt.findViewById(R.id.textView4);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn3:
                btn3.setText("butt3");
                break;

            case R.id.button4:
                txt.setText("re-re");
                break;

            case R.id.button5:
                startActivity(new Intent(this, MainActivity.class));

        }

    }
}