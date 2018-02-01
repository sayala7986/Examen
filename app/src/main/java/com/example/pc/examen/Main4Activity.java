package com.example.pc.examen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity implements View.OnClickListener {
    Button b7,b8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        b7=(Button)findViewById(R.id.b5);
        b7.setOnClickListener(this);
        b8=(Button)findViewById(R.id.b6);
        b8.setOnClickListener(this);
    }

    @Override
    public void onClick(View view2) {
        switch (view2.getId()){

            case(R.id.b7):
                Toast.makeText(Main4Activity.this,"CORRECTO",Toast.LENGTH_SHORT).show();
                Intent gan=new Intent(Main4Activity.this,Main5Activity.class);
                startActivity(gan);
                break;
            case(R.id.b8):
                Intent per=new Intent(Main4Activity.this,Main2Activity.class);
                startActivity(per);
                break;
        }
    }
}
