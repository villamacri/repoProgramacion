package controller;

import java.util.Random;

import datos.Datos;

public class ControllerJugador {

    public static int generarNumeroAleatorio(int desde, int hasta) {

        Random rnd = new Random(System.nanoTime());
        return rnd.nextInt(hasta - desde + 1) + desde;
    }

    public static int[][] generarNumCarton(int filas, int columnas) {
        int[][] cartonJuego = new int[filas][columnas];
        int [] numerosGuardados= new int[filas*columnas];
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        int cont=0;
        int desde=0 ;
        int hasta=90;
        
        for (int i = 0; i < cartonJuego.length; i++) {
        	for (int j = 0; j < cartonJuego.length; j++) {
        		cartonJuego[i][j]=generarNumeroAleatorio(desde, hasta);
        		while(numerosGuardados[cont]==cartonJuego[i][j]&&cont<numerosGuardados.length){
            		cartonJuego[i][j]=generarNumeroAleatorio(desde, hasta);
            		cont++;
        		}
        		numerosGuardados[j]=cartonJuego[i][j];
			}
        }

//            for (int j = 0; j < cartonJuego[i].length; j++) {
//                int numero = generarNumeroAleatorio(0, 1);
//                if (j == 0) {
//
//                    if (numero == 0 && contador1 < 2) {
//                        cartonJuego[i][j] = 0;
//                        contador1++;
//                    } else if (i == 2 && contador1 == 0) {
//
//                        cartonJuego[i][j] = 0;
//
//                    } else {
//                        cartonJuego[i][j] = generarNumeroAleatorio(1, 10);
//                    }
//
//                } else if (j == 1) {
//                    if (numero == 0 && contador2 < 2) {
//                        cartonJuego[i][j] = 0;
//                        contador2++;
//                    } else if (i == 2 && contador2 == 0) {
//
//                        cartonJuego[i][j] = 0;
//
//                    } else {
//                        cartonJuego[i][j] = generarNumeroAleatorio(11, 20);
//                    }
//
//                } else if (j == 2) {
//                    if (numero == 0 && contador3 < 2) {
//                        cartonJuego[i][j] = 0;
//                        contador3++;
//                    } else if (i == 2 && contador3 == 0) {
//
//                        cartonJuego[i][j] = 0;
//
//                    } else {
//                        cartonJuego[i][j] = generarNumeroAleatorio(21, 30);
//                    }
//
//                }
//
//            }
//        }

        return cartonJuego;

    }
	
    public static String[][] generarCarton(int filas, int columnas) {
        String[][] cartonJuego = new String[filas][columnas];
        Datos dato = new Datos();
        String[] elementosGuardados=new String[filas*columnas];
        String[][] numerosValidos;
        String numeroPos;
        numerosValidos = dato.getNumerosBingo();
        int numeroj, cont=0;
        
        for (int i = 0; i < cartonJuego.length; i++) {
			for (int j = 0; j < cartonJuego[i].length; j++) {
				cartonJuego[i][j]=numerosValidos[generarNumeroAleatorio(0,8)][generarNumeroAleatorio(0,8)];
				while(cont < elementosGuardados.length && cartonJuego[i][j].equalsIgnoreCase(elementosGuardados[cont])) {
					cartonJuego[i][j]=numerosValidos[generarNumeroAleatorio(0,9)][generarNumeroAleatorio(0,8)];
					cont++;
				}
				elementosGuardados[i]=cartonJuego[i][j];
			}
		}
        
//        for (int j = 0; j < cartonJuego.length; j++) {
//            for (int i = 0; i < cartonJuego[j].length; i++) {
//
//                numeroj = generarNumeroAleatorio(0, 9);
//                numeroPos = numerosValidos[j][numeroj];
//                if (numeroPos != "X") {
//                    cartonJuego[i][j] = numeroPos;
//                    numerosValidos[j][numeroj] = "X";
//                } else {
//                    while (numeroPos == "X") {
//                        numeroj = generarNumeroAleatorio(0, 9);
//                        numeroPos = numerosValidos[j][numeroj];
//                    }
//
//                    cartonJuego[i][j] = numeroPos;
//                }
//            }
//
//        }

        return cartonJuego;
    }

    public static String[][] generarEquis(int filas, int columnas) {
        int numeroAleatorio, contadorX;
        String[][] carton = generarCarton(filas, columnas);
        
        // Array para saber si una columna ya tiene una "X"
        boolean[] columnasConX = new boolean[columnas];
        
        // Recorremos cada fila
        for (int j = 0; j < carton.length; j++) {
            contadorX = 0;  // Resetear contador de "X" por fila
            boolean filaConX = false; // Flag para saber si se debe permitir agregar más "X"
            
            // Recorremos cada columna en la fila
            for (int i = 0; i < carton[j].length; i++) {
                numeroAleatorio = generarNumeroAleatorio(0, 1);
                
                // Si ya hay 2 "X" en la fila o la columna ya tiene una "X", no agregar más
//                if (contadorX >= 2 || columnasConX[i]) {
//                    continue; // Saltamos la asignación en esta celda
//                }
                
                // Lógica para asignar "X" en la celda si no se ha excedido el límite
                if (numeroAleatorio == 0 && contadorX < 2 && !columnasConX[i]) {
                    carton[j][i] = "X";
                    contadorX++;
                    columnasConX[i] = true; // Marcar que la columna ahora tiene una "X"
                    filaConX = true; // Marca que esta fila ya tiene al menos una "X"
                }
            }
            
            // Si la fila no tiene ninguna "X", asignar una "X" aleatoria sin repetir columna
            if (!filaConX) {
                // Buscar una columna libre
                int columnaLibre = -1;
                for (int i = 0; i < columnas; i++) {
                    if (!columnasConX[i]) {
                        columnaLibre = i;
                        break;
                    }
                }
                
                // Verificamos si se encontró una columna libre
                if (columnaLibre != -1) {
                    // Asignamos la "X" en esa columna
                    carton[j][columnaLibre] = "X";
                    columnasConX[columnaLibre] = true; // Marcar la columna como ocupada
                }
            }
        }
        
        return carton;
    }

    
    /*
    public static String[][] generarEquis(int filas,int columnas) {
        int numeroAleatorio,contadorX=0,contarI=0,contarJ=0, contXAux;
        String[][] carton=generarCarton(filas, columnas);
        boolean relleno=false;
        
            for (int j = 0; j < carton.length; j++) {   
            	contXAux=0;
                for (int i = 0; i < carton[j].length; i++) {
                    numeroAleatorio=generarNumeroAleatorio(0, 1);
                    if(i>0 && carton[j][i].equalsIgnoreCase(carton[j][i-1])) {
                    	if(numeroAleatorio==0&&contadorX<2) {
                            carton[i][j]="X";
                            contXAux++;
                            contadorX++;
                            if(j!=contarJ) {
                                if(i!=contarI) {
                                    carton[i][j]="X";
                                    contXAux++;
                                    contadorX++;
                                }
                            }
                    	}
                    }
                    if(i==carton.length-1 && contadorX==0|| contXAux<2 && relleno) {
                        carton[i][j]="X";
                        contXAux++;
                    }
                }
                if(contadorX==2) {
                    relleno=true;
                }else {
                    relleno=false;
                }
            }
            
        return carton;
    }
    */
    public  String[][] rellenarCartón (String [][] carton, String numeroAleatorio){
        for (int i = 0; i < carton.length; i++) {
            for (int j = 0; j < carton[i].length; j++) {
                if(carton[i][j].equalsIgnoreCase(numeroAleatorio)) { 
                    carton[i][j]="X";
                }
                
            }
        }
        return carton;
    }
}
