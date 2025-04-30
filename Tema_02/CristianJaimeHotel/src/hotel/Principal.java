package hotel;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Daily 1 30/10/2024
		 * 
		 * En el día de hoy hemos decidido que Cristian sea el secretario y Jaime el coordinador
		 * y una vez decidido que es lo que vamos a hacer procederemos a declarar las diferentes listas.
		 * 
		 * SESIÓN 1
		 * 	Hoy Cristian realizó el primer menú y el listado de precios relleno aleatoriamente además de realizar el case 2.
		 * 	Jaime ha realizado el array bidimensional de ocupacion y tipo de habitaciones además de haber empezado el case 1.
		 * 
		 * Daily 2 31/10/2024
		 * 
		 * En el día de hoy hemos revisado los casos de generación de datos y hemos decidido que se carguen al principio del programa
		 * sin que el usuario tenga que interactuar para ello.
		 * 
		 * SESIÓN 2
		 * Hoy haremos las funciones de mostrar uno o todos los datos, nos dividiremos esta tarea entre los dos para que cada uno realice el código
		 * que requiere cada función. Cristian ha creado una tabla con nombres, y ha generado los nombres. Jaime mejoró la impresión de los datos
		 * además de hacer el calculo de la media de ocupación.
		 * 
		 *  Daily 3 04/11/2024
		 *  
		 *  Para el día de hoy finalizaremos las funciones de mostrar datos, datos de un tipo de habitación, calculos y modificación de precios.
		 * 
		 * SESIÓN 3
		 * Hemos terminado las funciones planificadas. Cristian ha hecho la muestra de datos según un tipo de habitación además del calculo de ingresos brutos
		 * y mostrar que tipo de habitaciones estas mas y menos ocupadas, por otra parte Jaime ha hecho modificación de precios, muestra de los mismos y el submenú
		 * necesario para los distintos casos de los cálculos.
		 * 
		 * SESIÓN EXTRA
		 * Hemos solucionado un fallo al mostrar nombres, ya que siempre se mostraban los mismos.
		 * */
		
		 //Generador y array unidimensional
		Random rnd = new Random(System.nanoTime());
		Scanner sc = new Scanner(System.in);

		int opcion = 0, subOpcion = 0, desde=1, posicionNombre = 0, posicionApell, opcAux, indMayor = 0, indMenor = 0; 
		String aux, admin, contra;

		String [] listadoNombres={"José" , "Mario" , "Cristian" , "Gonzalo" , "Jaime" , "Marta" , "Paula" , "Tatiana" , "Sonia" , "Miriam"};
		String [] listadoApellido={" Villalba", " Marín", " Alemany", " Naranjo", " González", " Gómez", " Caballero", " Cabello", " Herrero", " Guerra", " Villamarín", " Sanchez", " Luque", " Villar", " Martínez"};
		String [] nombreOcupantes;
		String [] tiposHab={"Deluxe", "Premium","Palace","Suite"};  // tiposHab[mayorOcup] devuelve el nombre de los tipoos de hab.
		double [] listadoPrecios={100, 350, 1000, 2500};

		// Array bidimensional de habitaciones y ocupación
		/*
		*LINEA 1: Cant. de habs. por tipo (cantidad fija, 25)
		*LINEA 2: Cant. de habs. ocupadas (num random de 0 a 25)
		*LÍNEA 3: Cant. de habs. libres (diferencia entre linea 1 y linea 2)
		*LÍNEA 4: Núm. de personas por tipo de hab. (2 por hab.)
		*
		*COLUMNA 5: Total de las filas
		*/ 
		
		int ocupMin=0, ocupMax=25, sumaFilas=0, opcPrecios;
		int ocupFilas=4, ocupCol=5;
		int ocupacion[][]=new int[ocupFilas][ocupCol];
		double porcOcup, impuesto=5.0, impuestoApl=0, precioLeido, descuentoLeido, descuentoApl, precioFinal, sumaPrecio = 0.0, mediaPrecio;
		
		

		System.out.println("Generando ocupación...");
					
		for(int i=0;i<ocupacion[0].length;i++){ // Bucle para rellenar sólo la 1a fila con la cantidad fija de habs. (25 de cada tipo, 4 tipos)
				ocupacion[0][i]=ocupMax;
			}
		for(int i=0;i<ocupacion[1].length-1;i++){ // Para rellenar la 2da fila con un num. random de 0 a 25
			ocupacion[1][i]=rnd.nextInt(ocupMax-ocupMin-1)+ocupMin;
			}
		for(int i=0;i<ocupacion[2].length-1;i++){ // Para rellenar la 3a fila con la diferencia entre la 1a y la 2a fila
			ocupacion[2][i]=ocupacion[0][i]-ocupacion[1][i];
		}
		for(int i=0;i<ocupacion[3].length-1;i++){  // Para rellenar la 4ta fila con la cantidad de personas (siempre 2 personas por hab. ocupada)
			ocupacion[3][i]=ocupacion[1][i]*2;
		}
		for(int i=0;i<ocupacion.length;i++){  // Hace el sumatorio de los datos de cada fila y lo guarda en la última columna 
			for(int j=0;j<ocupacion[i].length;j++){
				if(j==ocupacion.length)
					ocupacion[i][j]=sumaFilas;
				else
					sumaFilas+=ocupacion[i][j];
			}
			sumaFilas=0;
		}
		

				//Generador de nombres
				nombreOcupantes=new String[ocupacion[1][4]];

				for (int i = 0; i < nombreOcupantes.length; i++) {
					posicionNombre=rnd.nextInt(listadoNombres.length-desde+1)+desde;
					posicionApell=rnd.nextInt(listadoApellido.length-desde+1)+desde;
					nombreOcupantes[i]=listadoNombres[posicionNombre-1]+listadoApellido[posicionApell-1];
				} // ocupacion[1][4] para consultar el num. total de personas
		
		System.out.print("Escriba la nueva contraseña de administrador: ");
		admin=sc.nextLine();
		//Comienzo del programa con el menú principal
		System.out.println("Bienvenido al Hotel Las 3000 Delicias");
		do{
			System.out.println("***********************************************");
			System.out.println("*           HOTEL LAS 3000 DELICIAS           *");
			System.out.println("***********************************************");
			System.out.println("""
					¿Qué desea hacer?

					0. Para salir.
					1. Mostrar tabla de ocupación.
					2. Mostrar nombres de titulares de hab.
					3. Modificar precios.
					4. Mostrar mayor y menor ocupación.
					5. Mostrar ingresos brutos.
					""");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);

			switch (opcion) {
				case 0:
					System.out.println("Saliendo...");
					break;

				case 1://Muestra de datos con array bidimensional
					System.out.println("***********************************************");
					System.out.println("*           HOTEL LAS 3000 DELICIAS           *");
					System.out.println("***********************************************");
					System.out.println("\tDeluxe  Premium Palace  Suite   TOTAL");
					for(int i=0;i<ocupacion.length;i++){
						switch(i) {
						case 0:
							System.out.print("Total\nhabs.\t");
							break;
						case 1:
							System.out.print("Ocup.\t");
							break;
						case 2:
							System.out.print("Libres\t");
							break;
						case 3:
							System.out.print("Pers.\t");
							break;
						}
						for(int j=0;j<ocupacion[i].length;j++){
							System.out.print("|"+ocupacion[i][j]+"\t");
	 						}
							System.out.println("\n--------------------------------------------");
						}
						porcOcup=((double)ocupacion[1][4]/ocupacion[0][4])*100;
						System.out.printf("OCUPACIÓN (%%): %.2f\n\n",porcOcup);
						break;
					
				case 2://Muestra de titulares filtrados(submenú) por tipo de habitación.
						do{
							System.out.println("""
									Diga de que tipo de habitación desea revisar titulares

									0. Para salir.
									1. Deluxe
									2. Premium
									3. Palace
									4. Suite
									""");
							aux=sc.nextLine();
							subOpcion=Integer.parseInt(aux);
							switch (subOpcion) {
								case 0:
									System.out.println("Saliendo...");
									break;
							
								case 1:
									System.out.println("\t\tDeluxe");
									System.out.println();
									for (int i = 0; i < ocupacion[1][0]; i++) {
										System.out.println("\tHab. "+(i+101)+": "+nombreOcupantes[i]);
									}
									System.out.println();
									break;

								case 2:
									System.out.println("\t\tPremium");
									System.out.println();
									for (int i = 0; i < ocupacion[1][1]; i++) {
										System.out.println("\tHab. "+(i+201)+": "+nombreOcupantes[i+ocupacion[1][0]]);
									}
									System.out.println();
									break;
								
								case 3:
									System.out.println("\t\tPalace");
									System.out.println();
									for (int i = 0; i < ocupacion[1][2]; i++) {
										System.out.println("\tHab. "+(i+301)+": "+nombreOcupantes[i+ocupacion[1][1]]);
									}
									System.out.println();
									break;
									
								case 4:
									System.out.println("\t\tSuite");
									System.out.println();
									for (int i = 0; i < ocupacion[1][3]; i++) {
										System.out.println("\tHab. "+(i+401)+": "+nombreOcupantes[i+ocupacion[1][2]]);
									}
									System.out.println();
									break;
								default:
									System.out.println("Opción no válida");
									break;
							}
						}while(subOpcion!=0);

					break;
				
				case 3:  // Submenú para la visualización y modificación de precios
					System.out.println("Introduzca contraseña de administrador");
					contra=sc.nextLine();
					while(!contra.equals(admin)) {
						System.out.println("Contraseña incorrecta");
						System.out.println("Introduzca contraseña de administrador");
						contra=sc.nextLine();
					}
					do{
						System.out.println("DELUXE\t\tPREMIUM\t\tPALACE\t\t\tSUITE");
						System.out.println("-----------------------------------------------------------------");  // Mostramos tabla
						for(double valor:listadoPrecios){ 
							System.out.printf("%.2f€\t\t",valor);
						}
						System.out.println("\n-----------------------------------------------------------------");
						System.out.printf("\nImpuesto turístico: %.2f%%\n", impuesto);
						System.out.println("-----------------------------------------------------------------");
						System.out.println();

						System.out.println("""
						Introduzca la acción que desee realizar: 
						0. Volver al menú principal
						1. Modificar Deluxe
						2. Modificar Premium
						3. Modificar Palace
						4. Modificar Suite
							
						""");
						aux=sc.nextLine();
						opcPrecios=Integer.parseInt(aux);
						
						switch(opcPrecios){
							case 0:
								break;
							case 1:
							case 2:								
							case 3:
							case 4:
								impuestoApl=0.0;
								descuentoApl=0.0;

								System.out.println("Introduzca el precio base: ");
								aux=sc.nextLine();
								precioLeido=Double.parseDouble(aux);
								
								while(precioLeido<=0) {
									System.out.println("ERROR: Introduzca un valor mayor que cero");
									
									System.out.println("Introduzca el precio base: ");
									aux=sc.nextLine();
									precioLeido=Double.parseDouble(aux);
								}
								System.out.println("¿Desea aplicar el impuesto turístico sobre el tipo de habitación?"
								+"\n1. Sí"
								+"\n2. No");
								aux=sc.nextLine();
								opcAux=Integer.parseInt(aux);
								while(opcAux<1||opcAux>2){
									System.out.println("ERROR: Escoja una opción válida.(1. Sí, 2. No)");
									aux=sc.nextLine();
									opcAux=Integer.parseInt(aux);
								}	
								if(opcAux==1)
									impuestoApl=precioLeido*(impuesto/100);

							
								System.out.println("Introduzca el porcentaje de descuento si dispone de alguno (0 para no aplicar ningún descuento):");
								aux=sc.nextLine();
								descuentoLeido=Integer.parseInt(aux);
								while(descuentoLeido<0||descuentoLeido>100){
									System.out.println("ERROR: Escoja un número entre 0 y 100");
									aux=sc.nextLine();
									descuentoLeido=Integer.parseInt(aux);
								}
								descuentoApl=(precioLeido+impuestoApl)*(descuentoLeido/100);
								precioFinal=precioLeido+impuestoApl-descuentoApl;
								
								System.out.printf("Precio Base: %.2f€", precioLeido);
								if (opcAux==1) 
									System.out.printf("\nImpuesto turístico (%.2f%%): %.2f€\n", impuesto, impuestoApl);
								System.out.printf("\nDescuento aplicado (%.2f%%): %.2f€\n", descuentoLeido,descuentoApl);
								System.out.printf("\nPRECIO FINAL: %.2f€\n", precioFinal);

								listadoPrecios[opcPrecios-1]=precioFinal;
								break;
							default:
								System.out.println("ERROR: Introduzca una opción válida.\n");
								break;
						}
						}while(opcPrecios!=0);
					break; 
					
				case 4://Busca cuál es el tipo de habitaciones mas y menos ocupadas.
					int menorOcup=ocupacion[1][0];
					int mayorOcup=0;
					for (int i = 0; i < ocupacion[1].length-1; i++) {
						if(ocupacion[1][i]>mayorOcup){
							mayorOcup=ocupacion[1][i];
							indMayor=i;
						}
						if(ocupacion[1][i]<menorOcup){
							menorOcup=ocupacion[1][i];
							indMenor=i;
						}
					}
					System.out.println("El tipo de habitación mas ocupada es " + tiposHab[indMayor] + " con " + mayorOcup + " habitaciones ocupadas, y el tipo que menos tiene es " + tiposHab[indMenor] + " con " + menorOcup + " habitaciones ocupadas.");
					break;
					
				case 5://Calculo y muestra de los ingresos brutos
					for (int i = 0; i < ocupacion[1].length-1; i++) {
						sumaPrecio+=ocupacion[1][i]*listadoPrecios[i];
					}
					
					//media de ingresos por hab
					mediaPrecio=sumaPrecio/ocupacion[1][4];
					
					System.out.printf("\nLos ingresos brutos son de %.2f€ con una media de %.2f€ por habitación.\n\n", sumaPrecio, mediaPrecio);
					break;
					
					default:
					System.out.println("Opción no válida");
					break;
			}

		}while(opcion!=0);
		
		System.out.println("Gracias por usar nuestro programa, un saludo.");
		
	}

}
