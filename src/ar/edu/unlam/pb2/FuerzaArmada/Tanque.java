package ar.edu.unlam.pb2.FuerzaArmada;

public class Tanque extends Vehiculo implements Terrestre{

	

	private double velocidad;

	public Tanque(Integer id, String modelo) {
		super(id, modelo);
		this.velocidad=0.0;
	}

	public Double getVelocidad() {
		// TODO Auto-generated method stub
		return this.velocidad;
	}

	public void setVelocidad(Double velocidad) {
		this.velocidad=velocidad;
		
	}

}
