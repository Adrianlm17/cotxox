package edu.craptocraft.cotxox.carrera;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import edu.craptocraft.cotxox.conductores.Conductor;

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

    @Test
    public void checkConductor(){
        
        String  nombre = "Mola";
        Conductor conductor = new Conductor(nombre);
        carrera.setConductor(conductor);

        assertEquals(nombre, carrera.getConductor().getNombre());
    }

    @Test
    public void checkModelo(){
        List<Conductor> poolConductores = new ArrayList<Conductor>();
        
        String  nombre = "Mola";
        Conductor conductor = new Conductor(nombre);
        carrera.setConductor(conductor);
        poolConductores.add(conductor);

        String  modelo = "Mercedes A";
        conductor.setModelo(modelo);

        assertEquals(modelo, carrera.getConductor().getModelo());
    }

    @Test
    public void checkMatricula(){
        List<Conductor> poolConductores = new ArrayList<Conductor>();
        
        String  nombre = "Mola";
        Conductor conductor = new Conductor(nombre);
        carrera.setConductor(conductor);
        poolConductores.add(conductor);

        String  matricula = "7JKK555";
        conductor.setMatricula(matricula);

        assertEquals(matricula, carrera.getConductor().getMatricula());
    }

    @Test
    public void checkInfoConductor(){
        List<Conductor> poolConductores = new ArrayList<Conductor>();
        
        String  nombre = "Mola";
        String  matricula = "7JKK555";
        String modelo = "Mercedes A";

        Conductor conductor = new Conductor(nombre);
        carrera.setConductor(conductor);
        poolConductores.add(conductor);

        conductor.setMatricula(matricula);
        conductor.setModelo(modelo);

        assertEquals(nombre + matricula + modelo, carrera.getConductor().getNombre() + carrera.getConductor().getMatricula() + carrera.getConductor().getModelo());

    }

}
