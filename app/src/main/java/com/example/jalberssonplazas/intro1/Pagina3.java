package com.example.jalberssonplazas.intro1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pagina3 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina3);

        Button btnContac=(Button) findViewById(R.id.btnContactenos);

        btnContac.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {

                Intent intent = new Intent(Pagina3.this,Pagina4.class);
                startActivity(intent);
            }
        });
    }
}
