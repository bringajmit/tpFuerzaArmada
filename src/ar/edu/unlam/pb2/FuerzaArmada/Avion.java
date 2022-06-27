package ar.edu.unlam.pb2.FuerzaArmada;

public class Avion extends Vehiculo implements Volador {

	private Double altura;

	public Avion(int id, String modelo) {
		super(id, modelo);
		this.altura=0.0;
	}
	
	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getAltura() {
		return this.altura;
	}

	

}
