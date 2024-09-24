package com.primerp.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Esplach extends AppCompatActivity {

    private TextView timerTextView; // Referencia al TextView

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esplach);

        // Inicializar el TextView
        timerTextView = findViewById(R.id.timerTextView);

        // Contador de 3 segundos
        new CountDownTimer(3000, 1000) {
            public void onTick(long millisUntilFinished) {
                // Actualizar el TextView con el número de segundos restantes
                timerTextView.setText("Cargando en " + millisUntilFinished / 1000 + " segundos...");
            }

            public void onFinish() {
                // Cuando el temporizador termine, redirigir a la siguiente actividad (MainActivity)
                Intent intent = new Intent(Esplach.this, MainActivity.class);
                startActivity(intent);
                finish(); // Finaliza la actividad actual
            }
        }.start();
    }
}
