package vehiculos;

public class Automovil extends Vehiculo {
	private int puestos;
	private static int cantidadAutomoviles;
	
	public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
		this.placa = placa;
		this.puertas = 4;
		this.velocidadMaxima = 100;
		this.nombre = nombre;
		this.precio = precio;
		this.peso =peso;
		this.traccion = "FWD";
		this.fabricante = fabricante;
		this.puestos = puestos;
		cantidadVehiculos ++;
		cantidadAutomoviles ++;
		vehiculos.add(this);
	}
	
	public static int getCantidadAutomoviles() {
		return cantidadAutomoviles;
	}
		
	public int getPuestos() {
		return puestos;
	}
	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
}
