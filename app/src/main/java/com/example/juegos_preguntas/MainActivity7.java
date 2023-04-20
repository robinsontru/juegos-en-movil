package com.example.juegos_preguntas;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity7 extends AppCompatActivity {
//declaramos variables
    Button btn1,btn2,btn3,btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        referencia();
    }

    private void referencia() {

        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);

////

        btn1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity7.this,"ud seleciono favoritos",Toast.LENGTH_LONG).show();
        }
    });

        btn2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          //  Toast.makeText(MainActivity7.this,"ud seleciono favoritos",Toast.LENGTH_LONG).show();
            createAlert();
        }
    });

        btn3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity7.this,"ud seleciono favoritos",Toast.LENGTH_LONG).show();
        }
    });

        btn4.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity7.this,"ud seleciono favoritos",Toast.LENGTH_LONG).show();
        }
    });
//


    }
    public void createAlert(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("ADVERTENCIA DE SEGURIDAD");
        builder.setMessage("estas seguro de lo que vas hacer? super seguro? en serio?");
        builder.setPositiveButton("aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity7.this, "Ud acepto algo que no debia", Toast.LENGTH_SHORT).show();
            }
        });

        builder.setNegativeButton("cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity7.this, "UD tomo la decision correcta", Toast.LENGTH_SHORT).show();
            }
        });
    builder.show();

    }
}