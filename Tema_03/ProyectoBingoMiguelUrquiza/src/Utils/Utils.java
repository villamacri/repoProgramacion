package Utils;

import java.util.Random;

public class Utils {

	 public static String[][] numerosBingo(){
	        return new String[][]{
	                {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"},
	                {"11", "12", "13", "14", "15", "16", "17", "18", "19", "20"},
	                {"21", "22", "23", "24", "25", "26", "27", "28", "29", "30"},
	                {"31", "32", "33", "34", "35", "36", "37", "38", "39", "40"},
	                {"41", "42", "43", "44", "45", "46", "47", "48", "49", "50"},
	                {"51", "52", "53", "54", "55", "56", "57", "58", "59", "60"},
	                {"61", "62", "63", "64", "65", "66", "67", "68", "69", "70"},
	                {"71", "72", "73", "74", "75", "76", "77", "78", "79", "80"},
	                {"81", "82", "83", "84", "85", "86", "87", "88", "89", "90"}};
	    };
	    
	    public static int randomNumberGenerator(int min,int max) {
	    	Random rnd = new Random(System.nanoTime());
	    	return rnd.nextInt(max-min+1)+min;
	    	
	    }
	    
	    public static int size(Object [] array) {
			int counter = 0;
			for (int i = 0; i < array.length; i++) {
				if (array[i] != null) {
					counter++;
				}
			}

			return counter;
	    }
	    
	    
	    public static void add (Object []array, Object object) {
	    	array[Utils.size(array)]=object;
	    }
	    
	    public static Object[] cloneArray(Object[]array) {
			Object[] temp = new Object[array.length];

			for (int i = 0; i < array.length; i++) {
				temp[i] = array[i];
			}

			return temp;
	    }
	    
	    public static boolean find(Object[]array, Object element) {
			boolean exist = false;
			for (Object o : array) {
				if (o != null && o.equals(element)) {
					exist = true;
				}
			}
			return exist;
	    }
	    
	    public static int findPosition(Object[]array,Object element) {
			int position = 0;
			for (int i = 0; i < array.length; i++) {
				if(array[i] != null && array[i].equals(element)){
					position = i;
				}
			}
			return position;
	    }
	    
}
