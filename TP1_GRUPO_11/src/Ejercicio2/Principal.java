package Ejercicio2;

public class Principal {

	public static void main(String[] args) {
		
		ProductoCongelado productoCongelado = new ProductoCongelado();
		ProductoFresco productoFresco = new ProductoFresco();	
		ProductoRefrigerado productoRefrigerado = new ProductoRefrigerado();
		

		productoCongelado.setFechaCaducidad("10/10/2024");
		productoCongelado.setNumeroLote(1010);
		productoCongelado.settempCongelacion(105);
		System.out.println(productoCongelado.toString());
		
		productoFresco.setFechaCaducidad("1/12/2024");
		productoFresco.setNumeroLote(4030);
		productoFresco.setFechaEnvasado("15/01/2020");
		productoFresco.setPaisOrigen("Argentina");
		System.out.println(productoFresco.toString());
		
		
		productoRefrigerado.setFechaCaducidad("18/11/2025");
		productoRefrigerado.setNumeroLote(5060);
		productoRefrigerado.setCodigoOrganismoSupervisor(9000);
		System.out.println(productoRefrigerado.toString());
		
		
	}

}
