package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	protected static ArrayList<Fabricante> fabricantes = new ArrayList<>();
	private String nombre;
	private Pais pais;
	private Fabricante elementoMasRepetido = null;
    private int frecuenciaMaxima = 0;
	
	public static void pasaFabricantes() {
		for(int i = 0; i<Vehiculo.vehiculos.size(); i++) {
			Vehiculo elemento = Vehiculo.vehiculos.get(i);
			fabricantes.add(elemento.getFabricante());
		}
	}
	
	public Fabricante fabricaMayorVentas() {
		pasaFabricantes();
		  for (int i = 0; i < fabricantes.size(); i++) {
      Fabricante elementoActual = fabricantes.get(i);
      int contador = 0;

      for (int j = 0; j < fabricantes.size(); j++) {
          if (fabricantes.get(j).equals(elementoActual)) {
              contador++;
          }
      }

      if (contador > frecuenciaMaxima) {
          elementoMasRepetido = elementoActual;
          frecuenciaMaxima = contador;
          }
  	}
	return elementoMasRepetido;
	}
	
	public Pais getPais() {
		return pais;
	}
	
	public void setPais(Pais pais) {
		this.pais= pais;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
