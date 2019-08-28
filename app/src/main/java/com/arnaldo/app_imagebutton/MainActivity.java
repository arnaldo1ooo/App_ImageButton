package com.arnaldo.app_imagebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void MensajeImageButton1 (View view){
        Toast.makeText(this, "Has hecho click en ImageBoton 1", Toast.LENGTH_SHORT).show();
    }

    public void MensajeImageButton2 (View view){
        Toast.makeText(this, "Has hecho click en ImageBoton 2", Toast.LENGTH_SHORT).show();
    }
}
