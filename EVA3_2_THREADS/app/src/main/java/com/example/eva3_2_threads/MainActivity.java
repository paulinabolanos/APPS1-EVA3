package com.example.eva3_2_threads;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    // THREADS --- Clase    --- Sobreescribir metodo Run()
    //RUNABLES --- Interfaz --- Implementar Run()
    //           tienen una función llamada Run() {Hace el trabajo que se quiere pasar a segundo plano}

    //JAVA: Usa herencia simple

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*for (int i = 0; i<10; i++){
            //Duerme al hilo principal
            try {
                Thread.sleep(1000); // 1 seg = 1000 milisegundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/
        Thread tHilo1 = new Thread(){ //Aquí es donde va el trabajo en segundo plano
            @Override
            public void run() {
                super.run();
                // Aquí
                for (int i = 0; i<10; i++){
                    //Duerme al hilo principal
                    try {
                        Thread.sleep(1000); // 1 seg = 1000 milisegundos
                        Log.wtf("tHio1", i + "");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        tHilo1.start(); // Crea un nuevo hilo
    }
}
