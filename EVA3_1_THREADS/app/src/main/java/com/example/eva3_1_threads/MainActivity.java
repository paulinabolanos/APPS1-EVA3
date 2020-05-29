package com.example.eva3_1_threads;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    //HILO PRINCIPAL
    //Consume la atención
    //Controla la interfaz gráfica

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Simular una actividad que tome mucho tiempo
        //Por ejemplo una conexión a una BD
        //10 seg.
        for (int i = 0; i<10; i++){
            //Duerme al hilo principal
            try {
                Thread.sleep(1000); // 1 seg = 1000 milisegundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
