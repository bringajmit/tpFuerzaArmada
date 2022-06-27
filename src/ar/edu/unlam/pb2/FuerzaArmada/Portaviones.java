package ar.edu.unlam.pb2.FuerzaArmada;

public class Portaviones extends Vehiculo  implements Acuatico{

	private Double profundidad;

	public Portaviones(Integer id, String modelo) {
		super(id, modelo);
		this.profundidad=0.0;
	}

	public Double getProfundidad() {
		// TODO Auto-generated method stub
		return this.profundidad;
	}

	public void setProfundidad(Double profundidad) {
		this.profundidad=profundidad;
	}

}
