package com.example.juegos_preguntas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity6 extends AppCompatActivity {
    ImageView whap,telefono,ubicacion;
    Button siguiente1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        referencia();
    }

    private void referencia() {
        siguiente1 = findViewById(R.id.siguiente1);
        whap = findViewById(R.id.whap);
        telefono = findViewById(R.id.telefono);
        telefono = findViewById(R.id.telefono);
    }




    public void whap(){
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("https://web.whatsapp.com/"));
    }

    public void Telefono(){
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:3178853540"));
    }

    public void ubicacion(){
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("geo:41.65.6313,-0.877351"));
    }

    public void siguiente1(View view){
        Intent siguiente1 =new Intent(this,MainActivity.class);
        startActivity(siguiente1);
    }


}