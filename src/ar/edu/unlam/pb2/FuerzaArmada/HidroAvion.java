package ar.edu.unlam.pb2.FuerzaArmada;

public class HidroAvion extends Vehiculo implements Volador, Acuatico{

	private Double profundidad;
	private Double altura;

	public HidroAvion(Integer id, String modelo) {
		super(id, modelo);
		this.profundidad=0.0;
		this.altura=0.0;
	}

	public Double getProfundidad() {
		// TODO Auto-generated method stub
		return profundidad;
	}

	public Double getAltura() {
		// TODO Auto-generated method stub
		return altura;
	}


	public void setAltura(Double altura) {
		this.altura=altura;		
	}

	public void setProfundidad(Double profundidad) {
		this.profundidad=profundidad;
	}

}
