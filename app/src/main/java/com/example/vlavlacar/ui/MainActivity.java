package com.example.vlavlacar.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.vlavlacar.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final ImageButton TIEMPO = this.findViewById(R.id.botonTiempo);
        final ImageButton CONSUMO = this.findViewById(R.id.botonConsumo);

        TIEMPO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculaTiempo();
            }
        });

        CONSUMO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculaConsumo();
            }
        });
    }


    private void calculaTiempo() {

    }

    private void calculaConsumo(){

    }
}