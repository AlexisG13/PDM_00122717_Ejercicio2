package com.alexisg13.ejercicio2;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView img_1;
    private ImageView img_2;
    private ImageView img_3;
    private ImageView img_4;
    private ImageView img_5;
    private ImageView img_6;
    private ImageView img_7;
    private ImageView img_8;
    private ImageView img_9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img_1=findViewById(R.id.img_1);
        img_2=findViewById(R.id.img_2);
        img_3=findViewById(R.id.img_3);
        img_4=findViewById(R.id.img_4);
        img_5=findViewById(R.id.img_5);
        img_6=findViewById(R.id.img_6);
        img_7=findViewById(R.id.img_7);
        img_8=findViewById(R.id.img_8);
        img_9=findViewById(R.id.img_9);


        img_1.setOnClickListener(this);
        img_2.setOnClickListener(this);
        img_3.setOnClickListener(this);
        img_4.setOnClickListener(this);
        img_5.setOnClickListener(this);
        img_6.setOnClickListener(this);
        img_7.setOnClickListener(this);
        img_8.setOnClickListener(this);
        img_9.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        ImageView[] imagenes={ img_1,img_2,img_3,img_4,img_5,img_6,img_7,img_8,img_9};
        int rnd = new Random().nextInt(imagenes.length);
        ImageView prueba = imagenes[rnd];
        int id_imagen = v.getId();
        ImageView imagen =  findViewById(id_imagen);
        Drawable nueva = prueba.getDrawable();
        imagen.setImageDrawable(nueva);
    }
}
