package com.example.juegos_preguntas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {
    //declaramos variables
    RadioGroup rgpregunta1;
    RadioButton radioButton1,radioButton2,radioButton3,radioButton4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        //referenciamos
        referencia();
    }

    private void referencia() {
        rgpregunta1=findViewById(R.id.rgpregunta1);
        radioButton1=findViewById(R.id.radioButton1);
        radioButton2=findViewById(R.id.radioButton2);
        radioButton3=findViewById(R.id.radioButton3);
        radioButton4=findViewById(R.id.radioButton4);

        rgpregunta1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int chechedId) {
                switch (chechedId){
                    case R.id.radioButton1:
                        Toast.makeText(MainActivity4.this,"Incorrecta",Toast.LENGTH_LONG).show();
                        break;
                    case R.id.radioButton2:
                        Toast.makeText(MainActivity4.this,"Incorrecta",Toast.LENGTH_LONG).show();
                        break;
                    case R.id.radioButton3:
                        Toast.makeText(MainActivity4.this,"Correcta",Toast.LENGTH_LONG).show();
                        break;
                    case R.id.radioButton4:
                        Toast.makeText(MainActivity4.this,"Incorrecta",Toast.LENGTH_LONG).show();
                        break;

                }

            }
        });
    }
}