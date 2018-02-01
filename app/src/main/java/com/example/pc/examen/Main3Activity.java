package com.example.pc.examen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener{
    Button b5,b6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        b5=(Button)findViewById(R.id.b5);
        b5.setOnClickListener(this);
        b6=(Button)findViewById(R.id.b6);
        b6.setOnClickListener(this);
    }

    @Override
    public void onClick(View view1) {
        switch (view1.getId()){
            case(R.id.b5):
                Toast.makeText(Main3Activity.this,"CORRECTO",Toast.LENGTH_SHORT).show();
                Intent gan1=new Intent(Main3Activity.this,Main4Activity.class);
                startActivity(gan1);
                break;
            case(R.id.b6):
                Intent per1=new Intent(Main3Activity.this,Main2Activity.class);
                startActivity(per1);
                break;
        }
    }
}
