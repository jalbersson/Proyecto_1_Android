package com.example.jalberssonplazas.intro1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pagina2 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina2);

        Button btnCont=(Button) findViewById(R.id.btnContactenos);

        btnCont.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {

                Intent intent = new Intent(Pagina2.this,Pagina4.class);
                startActivity(intent);
            }
        });
    }
}
