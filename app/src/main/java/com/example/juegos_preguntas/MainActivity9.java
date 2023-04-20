package com.example.juegos_preguntas;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity9 extends AppCompatActivity {
  Spinner spinner;
    String [] Valores = new  String[]{"Cali","Popayan","Medellin","Pasto",};
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
      spinner= (Spinner) findViewById(R.id.spinner);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,Valores);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                    Toast.makeText(getApplicationContext(),"cuidad:"+spinner.getItemAtPosition(position),Toast.LENGTH_LONG).show();
                }



            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}