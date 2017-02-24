package com.example.jalberssonplazas.intro1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnJug=(Button) findViewById(R.id.btnJugadores);
        Button btnMod=(Button) findViewById(R.id.btnModelos);
        Button btnCer=(Button) findViewById(R.id.btnCerrar);

        btnJug.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {

                Intent intent = new Intent(MainActivity.this,Pagina3.class);
                startActivity(intent);
            }
        });
        btnMod.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {

                Intent intent = new Intent(MainActivity.this,Pagina2.class);
                startActivity(intent);
            }
        });

    }
}
