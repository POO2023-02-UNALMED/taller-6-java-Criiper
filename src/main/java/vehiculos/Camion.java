package vehiculos;

public class Camion extends Vehiculo {
	private int ejes;
	private static int cantidadCamiones;
	
	public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes) {
		this.placa = placa;
		this.puertas = 2;
		this.velocidadMaxima = 80;
		this.nombre = nombre;
		this.precio = precio;
		this.peso =peso;
		this.traccion = "4X2";
		this.fabricante = fabricante;
		this.ejes = ejes;
		this.cantidadVehiculos ++;
		cantidadCamiones ++;
		vehiculos.add(this);

	}
	
	public static int getCantidadCamiones() {
		return cantidadCamiones;
	}
	
	public int getEjes() {
		return ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
	
}
