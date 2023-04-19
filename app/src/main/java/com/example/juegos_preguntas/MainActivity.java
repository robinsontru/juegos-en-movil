package com.example.juegos_preguntas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //declaramos la variables
    RadioGroup rgpregunta1;
    RadioButton radioButton1, radioButton2, radioButton3, radioButton4;
    MediaPlayer bien, mal;
    public  static int punto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        referencia();
    }


    private void referencia() {
        bien = MediaPlayer.create(this,  R.raw.bien);
        mal = MediaPlayer.create(this,  R.raw.mal);
        rgpregunta1 = findViewById(R.id.rgpregunta1);
        radioButton1 = findViewById(R.id.radioButton1);
        radioButton2 = findViewById(R.id.radioButton2);
        radioButton3 = findViewById(R.id.radioButton3);
        radioButton4 = findViewById(R.id.radioButton4);

        rgpregunta1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int chechedId) {
                switch (chechedId) {
                    case R.id.radioButton1:
                        Toast.makeText(MainActivity.this, "incoreecto", Toast.LENGTH_LONG).show();
                        mal.start();
                        break;
                    case R.id.radioButton2:
                        Toast.makeText(MainActivity.this, "incoreecto", Toast.LENGTH_LONG).show();
                        mal.start();
                        break;
                    case R.id.radioButton3:
                        Toast.makeText(MainActivity.this, "correcto", Toast.LENGTH_LONG).show();
                        Intent radioButton3 = new Intent(MainActivity.this, MainActivity2.class);
                        startActivity(radioButton3);
                        bien.start();
                        punto=punto+4;
                        break;
                    case R.id.radioButton4:
                        Toast.makeText(MainActivity.this, "incoreecto", Toast.LENGTH_LONG).show();
                        mal.start();
                        break;
                }
            }
        });
    }


}
