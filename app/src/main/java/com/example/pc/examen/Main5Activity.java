package com.example.pc.examen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main5Activity extends AppCompatActivity implements View.OnClickListener {
    Button b9,b10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        b9=(Button)findViewById(R.id.b5);
        b9.setOnClickListener(this);
        b10=(Button)findViewById(R.id.b6);
        b10.setOnClickListener(this);
    }

    @Override
    public void onClick(View view3) {
        switch (view3.getId()){

            case(R.id.b9):
                Intent per=new Intent(Main5Activity.this,Main2Activity.class);
                startActivity(per);
                break;
            case(R.id.b10):
                Toast.makeText(Main5Activity.this,"CORRECTO",Toast.LENGTH_SHORT).show();
                Intent gan=new Intent(Main5Activity.this,Main6Activity.class);
                startActivity(gan);

                break;
        }
    }
}
