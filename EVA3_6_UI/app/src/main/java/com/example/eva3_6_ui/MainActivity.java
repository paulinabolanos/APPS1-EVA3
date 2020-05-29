package com.example.eva3_6_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // La UI(Interfaz Gráfica) es controlada por el hilo principal
    // Un hilo no puede modificar un objeto de la UI que no le pertenece

    TextView txtVwDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtVwDatos = findViewById(R.id.txtVwDatos);

        Thread tHilo = new Thread(){
            @Override
            public void run() {
                super.run();
                int i = 0;
                while(true){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Log.wtf("tHilo", i + "");
                    txtVwDatos.append(i + "/n");
                    i++;
                }
            }
        };
        tHilo.start();
    }
}
