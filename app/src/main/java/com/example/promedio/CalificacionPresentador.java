package com.example.promedio;


public class CalificacionPresentador implements Main.Presentador {
    private Main.Model model;
    private Main.Vista vista;
    public CalificacionPresentador(Main.Vista vista){
        this.vista=vista;
        model = new CalificacionModel(this);
    }
    @Override
    public void mostrarCalificacion (String r){
        if(vista!=null){
            vista.mostrarCalificacion(r);
        }
    }
    @Override
    public void calcular(Integer n1,Integer n2,Integer n3){
        if(vista!=null){
            model.calcular(n1,n2,n3);
        }
    }
}

