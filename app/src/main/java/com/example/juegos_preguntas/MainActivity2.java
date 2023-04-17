package com.example.juegos_preguntas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    //declaramos variables
 RadioGroup rgpregunta1;
 RadioButton radioButton1,radioButton2,radioButton3,radioButton4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //REFERENCIAMOS
        Referecia();
    }

    private void Referecia() {
        rgpregunta1 = findViewById(R.id.rgpregunta1);
        radioButton1 = findViewById(R.id.radioButton1);
        radioButton2=findViewById(R.id.radioButton2);
        radioButton3 =findViewById(R.id.radioButton3);
        radioButton4 =findViewById(R.id.radioButton4);
    rgpregunta1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup radioGroup, int chechedId) {
            switch(chechedId) {
                case R.id.radioButton1:
                    Toast.makeText(MainActivity2.this,"Incorrecto",Toast.LENGTH_LONG).show();
                    break;
                    case R.id.radioButton2:
                        Toast.makeText(MainActivity2.this,"incorrecto",Toast.LENGTH_LONG).show();
                        break;
                        case R.id.radioButton3:
                            Toast.makeText(MainActivity2.this,"INCORRECTO",Toast.LENGTH_LONG).show();
                            case R.id.radioButton4:
                                Toast.makeText(MainActivity2.this,"CORRECTO",Toast.LENGTH_LONG).show();

                                break;
            }
        }
    });
    }
}