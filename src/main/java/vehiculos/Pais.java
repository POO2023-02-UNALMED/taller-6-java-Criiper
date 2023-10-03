package vehiculos;

import java.util.ArrayList;

public class Pais {
	protected static ArrayList<Pais> paises = new ArrayList<>();
	private String nombre;
	private Pais elementoMasRepetido = null;
    private int frecuenciaMaxima = 0;
    
    public Pais(String nombre) {
    	this.nombre = nombre;
    	}
    
    
	public void pasaPaises() {
		for(int i = 0; i< Fabricante.fabricantes.size(); i++) {
			Fabricante elemento = Fabricante.fabricantes.get(i);
			paises.add(elemento.getPais());
		}
	}
	
	
    
	public Pais paisMasVendedor() {
		pasaPaises();
		
		  for (int i = 0; i < paises.size(); i++) {
        Pais elementoActual = paises.get(i);
        int contador = 0;

        for (int j = 0; j < paises.size(); j++) {
            if (paises.get(j).equals(elementoActual)) {
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
  
	public String getNombre() {
		return nombre;
	}
	
}
