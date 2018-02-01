package com.example.pc.examen;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b3=(Button)findViewById(R.id.b3);
        b3.setOnClickListener(this);
        b4=(Button)findViewById(R.id.b4);
        b4.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case(R.id.b3):
                Toast.makeText(MainActivity.this,"CORRECTO",Toast.LENGTH_SHORT).show();
                Intent gan=new Intent(MainActivity.this,Main3Activity.class);
                startActivity(gan);
                break;
            case(R.id.b4):
                Intent per=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(per);
                break;
        }
    }
}
