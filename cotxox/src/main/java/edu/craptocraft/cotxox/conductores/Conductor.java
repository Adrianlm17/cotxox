package edu.craptocraft.cotxox.conductores;

public class Conductor {

    public String nombre; 
    public String matricula;
    public String modelo;
    public byte starts;
    public boolean ocupado = false;

    public Conductor(){};

    public Conductor(String nombre) {
        this.nombre = nombre;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setValoracion(byte starts) {
        this.starts = starts;
    }

    public boolean isOcupado() {
        return this.ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getModelo(){
        return this.modelo;
    }

    public String getMatricula(){
        return this.matricula;
    }

    public byte getValoracion(){
        return this.starts;
    }

}
