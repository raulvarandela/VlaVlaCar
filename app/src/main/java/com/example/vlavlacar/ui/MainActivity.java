package com.example.vlavlacar.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import com.example.vlavlacar.R;
import com.example.vlavlacar.core.calculadoraCoche;

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

    calculadoraCoche miCalculadora = new calculadoraCoche();

    private void calculaTiempo() {
        //para pasar los datos
        final EditText km = this.findViewById(R.id.km);
        final EditText tipoCarretera = this.findViewById(R.id.carretera);
        String strKm = km.getText().toString().trim();
        int kilometros = Integer.parseInt( strKm );
        char carretera = tipoCarretera.toString().charAt(0);
        miCalculadora.setKilometros(kilometros);
        miCalculadora.setTipoCarretera(carretera);

        final EditText min = this.findViewById(R.id.minutos);
        final EditText h = this.findViewById(R.id.horas);
        int tiempo = miCalculadora.calcularTiempo();
        h.setText(Integer.toString( tiempo / 60  ));
        min.setText(Integer.toString(tiempo % 60));

        calculaConsumo();
    }

    private void calculaConsumo(){
        //para pasar lo datos
        final EditText km = this.findViewById(R.id.km);
        String strKm = km.getText().toString().trim();
        int kilometros = Integer.parseInt( strKm );
        final EditText ed_consumo = this.findViewById(R.id.consumo);
        String strConsumo = ed_consumo.getText().toString().trim();
        double consumo = Double.parseDouble( strConsumo );
        miCalculadora.setConsumo(consumo);
        miCalculadora.setKilometros(kilometros);

        ed_consumo.setText(Double.toString(miCalculadora.calcularConsumo()));
    }


}