package ejercicio03;

import java.util.Arrays;
import java.util.Random;

public class ArrayReales implements IEstadisticas{

	private double [] num;

	public ArrayReales(double[] num) {
		super();
		this.num = num;
	}

	public double[] getNum() {
		return num;
	}

	public void setNum(double[] num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "ArrayReales [num=" + Arrays.toString(num) + "]";
	}
	
	public void rellenarArray() {
		Random rnd=new Random(System.nanoTime());
		double desde=0, hasta=100;
		
		for (int i = 0; i < num.length; i++) {
			num[i]=rnd.nextDouble((hasta-desde+1)+desde);
		}
	}

	@Override
	public double calcularMinimo() {
		// TODO Auto-generated method stub
		double min=num[0];
		
		for (int i = 0; i < num.length; i++) {
			if(num[i]<min) {
				min=num[i];
			}
		}
		return min;
	}

	@Override
	public double calcularMaximo() {
		// TODO Auto-generated method stub
		double max=num[0];
		
		for (int i = 0; i < num.length; i++) {
			if(num[i]>max) {
				max=num[i];
			}
		}
		return max;
	}

	@Override
	public double calcularSumatorio() {
		// TODO Auto-generated method stub
		double suma=0;
		
		for (int i = 0; i < num.length; i++) {
			suma+=num[i];
		}
		return suma;
	}
	
	public void mostrarArray() {
		for (int i = 0; i < num.length; i++) {
			System.out.printf("%.2f\n",num[i]);
		}
	}
}
