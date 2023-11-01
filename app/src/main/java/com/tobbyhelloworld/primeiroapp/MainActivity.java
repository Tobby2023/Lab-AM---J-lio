package com.tobbyhelloworld.primeiroapp;

import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "Executar o método criado: ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "Iniciado");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "Parado");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "Pausado");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "Resumido");
    }

    public void clicado(View view) {
        Log.i(TAG, "Executar o método criado: ");

    }
}