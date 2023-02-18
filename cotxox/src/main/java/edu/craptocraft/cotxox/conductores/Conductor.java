package edu.craptocraft.cotxox.conductores;

import java.util.ArrayList;

public class Conductor {

    public String nombre; 
    public String matricula;
    public String modelo;
    public byte starts;
    public boolean ocupado = false;
    private double valoracionMedia = 0;
    private ArrayList<Byte> valoraciones = new ArrayList<>();

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

    public double getValoracion(){
        return this.valoracionMedia;
    }

    private double calcularValoracionMedia() {
		int sumaValoraciones = 0;
		for (byte starts : this.valoraciones) {
			sumaValoraciones += starts;
		}
		this.valoracionMedia = (double) sumaValoraciones / this.valoraciones.size();
		return this.valoracionMedia;
	}

    
    public void setValoracion(byte starts) {
        this.valoraciones.add(starts);
		this.calcularValoracionMedia();
    }

}
