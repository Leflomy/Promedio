package com.example.promedio;


public class CalificacionModel  implements Main.Model{
    private Main.Presentador presentador;
    private Integer calificaciónfinal;
    private String indicador;

    public CalificacionModel (Main.Presentador presentador) {this.presentador=presentador;}
    @Override
            public void calcular(Integer n1, Integer n2, Integer n3){
        //calificacionfinal = String.valueOf((n1+n2+n3)/3);
        calificaciónfinal= (n1+n2+n3)/3;

     if (calificaciónfinal<12.4) {
         indicador = "No logrado";
     }else if(12.5<=calificaciónfinal && calificaciónfinal <=14){
         indicador = "Logrado bajo";
     }else if (15<=calificaciónfinal && calificaciónfinal <=17){
         indicador ="Logrado medio";
     }else if (18<=calificaciónfinal && calificaciónfinal <=20){
         indicador ="Logrado destacado";
     }
     presentador.mostrarCalificacion(String.valueOf(calificaciónfinal)+""+indicador);
     }

    }



