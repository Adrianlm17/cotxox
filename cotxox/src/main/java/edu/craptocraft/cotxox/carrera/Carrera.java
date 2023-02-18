package edu.craptocraft.cotxox.carrera;

import edu.craptocraft.cotxox.conductores.Conductor;
import edu.craptocraft.cotxox.conductores.PoolConductores;
import edu.craptocraft.cotxox.tarifa.Tarifa;

public class Carrera {

    private Conductor conductor = null;

    public String tarjetaCredito;
    public String origen;
    public String destino;
    public double distancia;

    public double tiempoEsperado;
    public double tiempoCarrera;
    public double costeTotal;

    private int propina;

    private int tiempoEsperadoMinutos;

    private double pago;

    public Carrera(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public void setTiempoEsperado(int tiempoEsperadoMinutos) {
        this.tiempoEsperadoMinutos = tiempoEsperadoMinutos;
    }

    public String getTarjetaCredito() {
        return this.tarjetaCredito;
    }

    public String getOrigen() {
        return this.origen;
    }

    public String getDestino() {
        return this.destino;
    }

    public double getDistancia() {
        return this.distancia;
    }

    public double getCosteEsperado() {
        return Tarifa.getCosteTotalEsperado(this);
    }

    public void asignarConductor(PoolConductores conductores) {
        setConductor(conductores.asignarConductor());
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public Conductor getConductor() {
        return this.conductor;
    }

    public void realizarPago(double pago) {
        this.pago = pago;
    }

	public void recibirPropina(int propina) {
        this.propina = propina;
	}

	public int getPropina() {
		return this.propina;
	}

    public double getTiempoEsperado() {
        return this.tiempoEsperadoMinutos;
    }

    public void liberarConductor() {
        getConductor().setOcupado(false);
    }
    
}
