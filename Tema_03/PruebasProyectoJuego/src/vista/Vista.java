package vista;

import controller.ControllerJugador;

public class Vista {

		public static void imprimirCarton() {
			String[][] carton = ControllerJugador.generarEquis(3,3);
			for (int i = 0; i < carton.length; i++) {
				for (int j = 0; j < carton[i].length; j++) {
					
					if(i==1&&j==0) {
						System.out.println();
					}else if(i==2&&j==0) {
						System.out.println();
					}
					
					System.out.print(carton[i][j]+"\t");
					
				}
			}
		}
		
		public  void imprimirCarton(String[][]carton) {
			for (int i = 0; i < carton.length; i++) {
				for (int j = 0; j < carton[i].length; j++) {
					
					if(i==1&&j==0) {
						System.out.println();
					}else if(i==2&&j==0) {
						System.out.println();
					}
					
					System.out.print(carton[i][j]+"\t");
					
				}
			}
		}
	
}
