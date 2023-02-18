package edu.craptocraft.cotxox.tarifa;

import edu.craptocraft.cotxox.carrera.Carrera;

public class Tarifa{

    final static double costeMilla = 1.35;
    final static double costeMinuto = 0.35;
    final static double costeMinimo = 5.0;
    final static byte porcentajeComision = 20;

    public Tarifa(){}

    public static double getCosteDistancia(double distancia){
        return distancia * costeMilla;
    }

    public static double getCosteTiempo(double minutos){
        return minutos * costeMinuto;
    }

    public static double getCosteTotalEsperado(Carrera carrera){
        double costeTotal = getCosteDistancia(carrera.getDistancia()) + getCosteTiempo(carrera.getTiempoEsperado());
        if (costeTotal < costeMinimo){
            return costeMinimo;
        } else {
            return costeTotal;
        }
    }


}