package Ejercicio2;

public class mainEjercicio2 {

	public static void main(String[] args) {
		
		ProductoCongelado productoCongelado = new ProductoCongelado("10/10/2024", 1010, 105);
		ProductoFresco productoFresco = new ProductoFresco("1/12/2024", 4030, "15/01/2020", "Argentina");	
		ProductoRefrigerado productoRefrigerado = new ProductoRefrigerado("18/11/2025", 5060, 9000);
		
		productoCongelado.mostrarInformacion();
		productoFresco.mostrarInformacion();
		productoRefrigerado.mostrarInformacion();
	}

}
