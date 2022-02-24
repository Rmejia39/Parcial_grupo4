package com.example.parcial_grupo4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Reproductor extends AppCompatActivity implements
    View.OnClickListener {
        Button iniciar,parar;
        MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reproductor);

        iniciar = (Button)findViewById(R.id.iniciar);
        parar = (Button)findViewById(R.id.detener);
        mediaPlayer = MediaPlayer.create(this,R.raw.heart);

        iniciar.setOnClickListener(this);
        parar.setOnClickListener(this);
    }
    @Override
    public void onClick(View View) {
        switch (View.getId()){
            case R.id.iniciar:
                play();
            case R.id.detener:
                stop();
                break;
        }
    }
    private void play(){
        mediaPlayer.start();
    }
    private void stop(){
        mediaPlayer.stop();
    }
    public void regresar(View view){
        Intent volver = new Intent(this,MainActivity.class);
    }
}