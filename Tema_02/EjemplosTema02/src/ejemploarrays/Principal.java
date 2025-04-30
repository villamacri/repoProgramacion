package ejemploarrays;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String aux;
		//int []edades;
        //edades=new int [tam],int tam=4;
        //int[] edades=new int [tam];
        //int[] edades{4,4,7,6,2}; no se puede hacer en 2 lineas
        
        
        
        int [] edades;
        int tam=4,valorEdad=0;
        //System.out.println("introduzca el numero de alumnos");
        //tam=Leer.datoInt();
        
        edades=new int[tam];
        
        //int edades2[]=new int [tam];
        //mata si pones el codigo de arriba sin pedir el tam 0
        //tercera forma
        //int []edades3= {24,43,42,53,32,22,55,45,45,24,12,12,114,11,21,84};
        
        //imprimir un valor
    //para arrays siempre usamos for
        
        
    //for (int i = 0; i < edades3.length; i++) {
        //se usa .length siempre lo usamos en los for que rexorrem array
    
            //valorEdad++;
            
            //System.out.print("\t"+edades3[i]);
        
        
        for (int i = 0; i < edades.length; i++) {
	            System.out.println("dime la edad");
	            aux=sc.nextLine();
	            edades[i]=Integer.parseInt(aux);
	            
	            
		}
		
        
        //usamos 1 for para rellenar y otro for para mostrar el array
        for (int i=0; i < edades.length; i++) {
        	System.out.println(edades[i]+ "\t");
        	
        	
        }
        
        //para buscar
        //por indice(regulinchis)
        
        
        
	}

}
