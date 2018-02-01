package com.example.pc.examen;

import android.app.Dialog;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
    }
public void abre_d(View v){
    AlertDialog.Builder b=new AlertDialog.Builder(this);
    b.setTitle("GANASTE");
    b.setNegativeButton("CERRAR",null);
    Dialog dialog =b.create();
    dialog.show();

}
}
