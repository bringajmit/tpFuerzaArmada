package ar.edu.unlam.pb2.FuerzaArmada;

public class Submarino extends Vehiculo implements Acuatico {

	private Double profundidad;

	public Submarino(Integer id, String modelo) {
		super(id, modelo);
		this.profundidad=0.0;
	}

	public Double getProfundidad() {
		return this.profundidad;
	}

	public void setProfundidad(Double profundidad) {
		this.profundidad=profundidad;
		
	}

}
