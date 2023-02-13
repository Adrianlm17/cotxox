package edu.craptocraft.cotxox.carrera;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CarreraTest {
    
    Carrera carrera;

    @Before
    public void checkTarjetaCredito(){
        String tarjetaCredito = "4916119711304546";
        carrera = new Carrera(tarjetaCredito);
        assertEquals(tarjetaCredito, carrera.getTarjetaCredito());
    }

    @Test
    public void checkOrigen(){
        String origen = "Aeroport Son Sant Joan";
        carrera.setOrigen(origen);
        assertEquals(origen, carrera.getOrigen());
    }

    @Test
    public void checkDestino(){
        String destino = "Magaluf";
        carrera.setDestino(destino);
        assertEquals(destino, carrera.getDestino());
    }

    @Test
    public void checkDistancia(){
        double distancia = 7.75;
        carrera.setDistancia(distancia);
        assertEquals(distancia, carrera.getDistancia(), 0);
    }

    @Test
    public void checkTiempo(){
        int tiempoEsperadoMinutos = 10;
        carrera.setTiempoEsperado(tiempoEsperadoMinutos);
        assertEquals(tiempoEsperadoMinutos, carrera.getCosteEsperado());
    }
}
