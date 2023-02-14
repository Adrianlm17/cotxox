package edu.craptocraft.cotxox.conductores;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ConductorTest {
    

    @Test 
    public void checkNombre(){
        String nombre = "Mola";
        Conductor conductor = new Conductor(nombre);
        assertEquals(nombre, conductor.getNombre());

    }

}
