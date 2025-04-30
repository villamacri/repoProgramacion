package ejemploconstructor;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		int id;
		String nombre, aux, nombreN;
		double precioBase, porc, pVP;
		//Datos puestos a cascaporra(not good, solo pa probar cositas)
		Producto p = new Producto(1, "Fanta", 1.70);
		Producto p3;
		Producto p4= new Producto(2, "Coca-cola");
		
		//Leyendo por teclado
		/*
		System.out.println("Diga id del producto");
		aux=sc.nextLine();
		id=Integer.parseInt(aux);
		
		System.out.println("Diga el nombre");
		nombre=sc.nextLine();
		
		System.out.println("Diga precio base");
		aux=sc.nextLine();
		precioBase=Double.parseDouble(aux);
		
		p3=new Producto(id, nombre, precioBase);
		*/
		System.out.println(p);
		System.out.println("Diga nuevo nombre");
		nombreN=sc.nextLine();
		p.setNombre(nombreN);
		System.out.println(p);
		
		System.out.println("Diga el porcentaje que desea aplicar para vender el producto");
		aux=sc.nextLine();
		porc=Double.parseDouble(aux);
		pVP=p.calcularPVP(porc);
		
		System.out.printf("\nEl precio de venta al público es %.2f", pVP);
	}

}
