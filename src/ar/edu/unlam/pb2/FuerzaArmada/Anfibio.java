package ar.edu.unlam.pb2.FuerzaArmada;

public class Anfibio extends Vehiculo implements Terrestre, Acuatico {

	private Double velocidad;
	private Double profundidad;

	public Anfibio(Integer id, String modelo) {
		super(id, modelo);
		this.velocidad=0.0;
		this.profundidad=0.0;
	}

	public Double getProfundidad() {
		// TODO Auto-generated method stub
		return this.profundidad;
	}

	public Double getVelocidad() {
		// TODO Auto-generated method stub
		return this.velocidad;
	}

	public void setProfundidad(Double profundidad) {
		this.profundidad=profundidad;		
	}

	public void setVelocidad(Double velocidad) {
		this.velocidad=velocidad;		
	}

}
