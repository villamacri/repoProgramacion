package controller;

import java.util.Random;

import datos.Datos;

public class ControllerJugador {

	public static int generarNumeroAleatorio(int desde, int hasta) {

		Random rnd = new Random(System.nanoTime());
		return rnd.nextInt(hasta - desde + 1) + desde;
	}

	public static int[][] generarCarton(int filas, int columnas, int desde, int hasta) {
		int[][] cartonJuego = new int[filas][columnas];
		int contador1 = 0;
		int contador2 = 0;
		int contador3 = 0;

		for (int i = 0; i < cartonJuego.length; i++) {

			for (int j = 0; j < cartonJuego[i].length; j++) {
				int numero = generarNumeroAleatorio(0, 1);
				if (j == 0) {

					if (numero == 0 && contador1 < 2) {
						cartonJuego[i][j] = 0;
						contador1++;
					} else if (i == 2 && contador1 == 0) {

						cartonJuego[i][j] = 0;

					} else {
						cartonJuego[i][j] = generarNumeroAleatorio(1, 10);
					}

				} else if (j == 1) {
					if (numero == 0 && contador2 < 2) {
						cartonJuego[i][j] = 0;
						contador2++;
					} else if (i == 2 && contador2 == 0) {

						cartonJuego[i][j] = 0;

					} else {
						cartonJuego[i][j] = generarNumeroAleatorio(11, 20);
					}

				} else if (j == 2) {
					if (numero == 0 && contador3 < 2) {
						cartonJuego[i][j] = 0;
						contador3++;
					} else if (i == 2 && contador3 == 0) {

						cartonJuego[i][j] = 0;

					} else {
						cartonJuego[i][j] = generarNumeroAleatorio(21, 30);
					}

				}

			}
		}

		return cartonJuego;

	}

//	public static String[][] generarCarton(int filas, int columnas) {
//		String[][] cartonJuego = new String[filas][columnas];
//		Datos dato = new Datos();
//		String[][] numerosValidos;
//		numerosValidos = dato.getNumerosBingo();
//		int numeroj,numero,contador1=0;
//		for (int i = 0; i < cartonJuego.length; i++) {
//			for (int j = 0; j < cartonJuego[i].length; j++) {
//				
//				if(j ==0) {
//					 numero = generarNumeroAleatorio(0, 1);
//					if (numero == 0 && contador1 < 2) {
//						cartonJuego[i][j] = "X";
//						contador1++;
//					} else if (i == 2 && contador1 == 0) {
//
//						cartonJuego[i][j] = "X";
//
//					} else {
//						numeroj =generarNumeroAleatorio(0, 9);
//						cartonJuego[i][j]=numerosValidos[0][numeroj];
//					}
//				
//					
//				}
//				if(j==1) {
//					 numero = generarNumeroAleatorio(0, 1);
//						if (numero == 0 && contador1 < 2) {
//							cartonJuego[i][j] = "X";
//							contador1++;
//						} else if (i == 2 && contador1 == 0) {
//
//							cartonJuego[i][j] = "X";
////							contador1=0;
//
//						} else {
//							numeroj =generarNumeroAleatorio(0, 9);
//							cartonJuego[i][j]=numerosValidos[1][numeroj];
//						}
//						
//				}
//				if(j==2) {
//					 numero = generarNumeroAleatorio(0, 1);
//						if (numero == 0 && contador1 < 2) {
//							cartonJuego[i][j] = "X";
//							contador1++;
//						} else if (i == 2 && contador1 == 0) {
//
//							cartonJuego[i][j] = "X";
//
//						} else {
//							numeroj =generarNumeroAleatorio(0, 9);
//							cartonJuego[i][j]=numerosValidos[2][numeroj];
//						}
//						
//					
//				}
//			}
//		}
//		
//		return cartonJuego;
//	}
	
	
	public static String[][] generarCarton(int filas, int columnas) {
		String[][] cartonJuego = new String[filas][columnas];
		Datos dato = new Datos();
		String[][] numerosValidos;
		String numeroPos;
		numerosValidos = dato.getNumerosBingo();
		int numeroj,numero,contador1=0;
		for (int j = 0; j < cartonJuego.length; j++) {
			for (int i = 0; i < cartonJuego[j].length; i++) {
				
				
					numeroj =generarNumeroAleatorio(0, 9);
					System.out.println(numeroj);
					numeroPos=numerosValidos[j][numeroj];
					if(numeroPos !="X") {
						
						cartonJuego[i][j] = numeroPos;
						numerosValidos[j][numeroj]= "X";
					}else {
						while(numeroPos=="X") {
							numeroj =generarNumeroAleatorio(0, 9);
							System.out.println(numeroj);
							numeroPos=numerosValidos[j][numeroj];
					}
						
						cartonJuego[i][j] = numeroPos;
					
					
		
				
					
				}
				
				
//				if(j==1) {
//					numeroj =generarNumeroAleatorio(0, 9);
//					cartonJuego[i][j]=numerosValidos[j][numeroj];
//						
//				}
//				if(j==2) {
//					 
//					numeroj =generarNumeroAleatorio(0, 9);
//					cartonJuego[i][j]=numerosValidos[j][numeroj];
//						
//						
//					
//				}
			}
		}
		
		return cartonJuego;
	}
	
//	public String generarEquis(String [][] carton) {
//		
//			for (int j = 0; j < carton.length; j++) {
//				for (int i = 0; i < carton[j].length; i++) {
//					
//				}
//			}
//		
//	}

}
