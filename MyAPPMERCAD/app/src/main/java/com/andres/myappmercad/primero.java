package com.andres.myappmercad;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class primero extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.primerlayout);
        Button boton = (Button) findViewById(R.id.ingresa);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuario=((EditText)findViewById(R.id.usua)).getText().toString();
                String contraseña=((EditText)findViewById(R.id.cont)).getText().toString();
                if (usuario.equals("Andres")&& contraseña.equals("123456"))
                {
                    Intent nuevoform= new Intent(primero.this, segundo.class);
                    startActivity(nuevoform);


                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Usuario Incorrecto",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}
