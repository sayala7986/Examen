package com.example.pc.examen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b1=(Button)findViewById(R.id.b1);
        b1.setOnClickListener(this);
        b2=(Button)findViewById(R.id.b2);
        b2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.b1:
                Intent abrir_v1 =new Intent(Main2Activity.this,MainActivity.class);
                startActivity(abrir_v1);
                break;
        }

    }
}
