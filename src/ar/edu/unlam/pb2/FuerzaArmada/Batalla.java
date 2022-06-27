package ar.edu.unlam.pb2.FuerzaArmada;

import java.util.HashSet;
import java.util.Set;

public class Batalla {

	private Double latitud;
	private Double longitud;
	private TipoDeBatalla tipo;
	private Set<Vehiculo> vehiculosEnLaBatalla;
	private String nombre;

	public Batalla(String nombre, TipoDeBatalla tipo, Double latitud, Double longitud) {
		this.nombre=nombre;
		this.tipo=tipo;
		this.latitud=latitud;
		this.longitud=longitud;
		vehiculosEnLaBatalla= new HashSet<Vehiculo>();
	}

	public Double getLatitud() {
		return latitud;
	}

	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}

	public Double getLongitud() {
		return longitud;
	}

	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}

	public TipoDeBatalla getTipo() {
		return tipo;
	}

	public void setTipo(TipoDeBatalla tipo) {
		this.tipo = tipo;
	}

	public Set<Vehiculo> getVehiculosEnLaBatalla() {
		return vehiculosEnLaBatalla;
	}

	public void setVehiculosEnLaBatalla(Set<Vehiculo> vehiculosEnLaBatalla) {
		this.vehiculosEnLaBatalla = vehiculosEnLaBatalla;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((latitud == null) ? 0 : latitud.hashCode());
		result = prime * result + ((longitud == null) ? 0 : longitud.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		result = prime * result + ((vehiculosEnLaBatalla == null) ? 0 : vehiculosEnLaBatalla.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Batalla other = (Batalla) obj;
		if (latitud == null) {
			if (other.latitud != null)
				return false;
		} else if (!latitud.equals(other.latitud))
			return false;
		if (longitud == null) {
			if (other.longitud != null)
				return false;
		} else if (!longitud.equals(other.longitud))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (tipo != other.tipo)
			return false;
		if (vehiculosEnLaBatalla == null) {
			if (other.vehiculosEnLaBatalla != null)
				return false;
		} else if (!vehiculosEnLaBatalla.equals(other.vehiculosEnLaBatalla))
			return false;
		return true;
	}

	public Boolean agregarVehiculo(Vehiculo nuevo) throws VehiculoIncompatible {
		switch (tipo) {
		case TERRESTRE:
			if(nuevo instanceof Terrestre) {
				vehiculosEnLaBatalla.add(nuevo);
			}else {
				throw new VehiculoIncompatible("La batalla es en tierra");
			}
			break;
		case NAVAL:
			if(nuevo instanceof Acuatico) {
				vehiculosEnLaBatalla.add(nuevo);
			}else {
				throw new VehiculoIncompatible("La batalla es en agua");
			}
			break;
		case AEREA:
			if(nuevo instanceof Volador) {
				vehiculosEnLaBatalla.add(nuevo);
			}else {
				throw new VehiculoIncompatible("La batalla es en el aire");
			}
			break;
		}
		return false;
	}
	
}
