package ar.edu.unlam.pb2.FuerzaArmada;

public class Camion extends Vehiculo implements Terrestre{

	private Double velocidad;

	public Camion(Integer id, String modelo) {
		super(id, modelo);
		this.velocidad=0.0;
	}

	public Double getVelocidad() {
		// TODO Auto-generated method stub
		return this.velocidad;
	}

	public void setVelocidad(Double velocidad) {
		// TODO Auto-generated method stub
		this.velocidad=velocidad;
	}

}
