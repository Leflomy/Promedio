package com.example.promedio;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Main.Vista{
    private  Main.Presentador presentador;
    private EditText nota1, nota2, nota3;
    private Boolean dato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presentador = new CalificacionPresentador(this);
        nota1= (EditText) findViewById(R.id.nota1);
        nota2= (EditText) findViewById(R.id.nota2);
        nota3= (EditText) findViewById(R.id.nota3);

    }
    public void calcular (View view){
    Integer calificacion1,calificacion2,calificacion3;
    dato =true;
    if (nota1.getText().toString().equals("")){
        dato = false;
        Toast.makeText(getApplicationContext(),"Ingresar calificación número 1",Toast.LENGTH_SHORT).show();
    }
    if (nota2.getText().toString().equals("")){
        dato = false;
        Toast.makeText(getApplicationContext(),"Ingresar calificación numer2",Toast.LENGTH_SHORT).show();
    }
    if(nota3.getText().toString().equals("")){
        dato = false;
        Toast.makeText(getApplicationContext(),"Ingresar calificación número 3",Toast.LENGTH_SHORT).show();
    }
    if (dato){
        calificacion1 = Integer.parseInt(nota1.getText().toString());
        calificacion2 = Integer.parseInt(nota2.getText().toString());
        calificacion3 = Integer.parseInt(nota3.getText().toString());


        presentador.calcular(calificacion1,calificacion2,calificacion3);
    }

    }
    @Override
    public void mostrarCalificacion(String r){
        Toast.makeText(getApplicationContext(),"El promedio final es:"+r, Toast.LENGTH_LONG).show();
    }
}
