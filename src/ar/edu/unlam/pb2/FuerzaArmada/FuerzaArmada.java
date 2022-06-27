package ar.edu.unlam.pb2.FuerzaArmada;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FuerzaArmada {

	private Set<Vehiculo> convoy;
	private Map<String, Batalla> batallas;
	private String nombre;
	
	public FuerzaArmada(String nombre) {
		this.nombre=nombre;
		batallas= new HashMap<String, Batalla>();
		convoy=new HashSet<Vehiculo>();
	}
	
	public FuerzaArmada() {
		batallas= new HashMap<String, Batalla>();
		convoy=new HashSet<Vehiculo>();
	}

	public void agregarVehiculo(Vehiculo vehiculo) {
		convoy.add(vehiculo);
	}

	public Integer getCapacidadDeDefensa() {
		Integer cantidad=convoy.size();
		return cantidad;
	}

	public void crearBatalla(String nombre, TipoDeBatalla tipo, Double latitud, Double longitud) {
		batallas.put(nombre, new Batalla(nombre,tipo,latitud,longitud));
		
	}

	public Batalla getBatalla(String nombre) {
		return batallas.get(nombre);
	}

	public Boolean enviarALaBatalla(String nombreBatalla, Integer codVehiculo) throws VehiculoInexistente, VehiculoIncompatible{
		batallas.get(nombreBatalla).agregarVehiculo(buscarVehiculo(codVehiculo));
		return true;
	}

	private Vehiculo buscarVehiculo(Integer codVehiculo) throws VehiculoInexistente {
		for (Vehiculo vehiculo : convoy) {
			if(vehiculo.getId().equals(codVehiculo)) {
				return vehiculo;
			}
		}
		throw new VehiculoInexistente();
	} 
	
}
