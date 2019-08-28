package com.example.promedio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Main {
    public interface Vista{
        public void mostrarCalificacion (String r);

    }
    public interface Presentador{
        public void mostrarCalificacion (String r);

        public void calcular(Integer N1, Integer N2, Integer N3);
    }
    public interface Model {
        public  void calcular (Integer N1, Integer N2, Integer N3);
    }
    
    }

