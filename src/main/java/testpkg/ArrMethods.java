package testpkg;

import java.util.Random;

public class ArrMethods {
	
	
	// метод рандомной(k) генерации int массива с заданной размерностью n (размерность не будем рандомить)
	public static int[] randGenIntArr (int k, int n) { 
		Random r = new Random();
		int[] a = new int[n];   
		for (int i = 0; i < n; i++) { 
				a[i] = r.nextInt(k);
		}	
		return(a);
	}
	
	
	// метод для вывода int массива 
	public static void outputIntArr (int[] a) { 
		for (int i = 0; i <= a.length - 1; i++) { 
			System.out.print(a[i] + " ");
		}
		System.out.println(); 
	}
	
	// метод сортировки пузырьком
	public static int[] arrSortBub (int[] a) {
		int t = 0; 
		for (int i = 0; i <= a.length - 1; i++) { 
			for (int j = 0; j < a.length - i - 1; j++) { 
				if (a[j] > a[j+1]) { 
					t = a[j]; 
					a[j] = a[j+1]; 
					a[j+1] = t; 
				}
			}
		}
		return(a); 
	}
	
	// метод сортировки расческой
	public static int[] arrCombSort (int[] a) {
		double f = 1.247;  // фактор уменьшения шага
		int step = a.length;   // шаг обхода массива (изначально равен длине массива)
		boolean end = false;   
		int t;
		while (!end) {
			end = true;	 
			step /= f;   // сокращаем шаг
			if (step < 1) {  
				step = 1;
			}
			for (int i = 0; i < a.length - 1; i++) {	
				if ((i + step) < a.length) {
					if (a[i] > a[i + step]) {
						t = a[i];					// производим замену как в Пузырьке
						a[i] = a[i + step];		
						a[i + step] = t;
						end = false;				
					}
				} else {
					end = false;
				}

			}

		}
		return(a); 
	}

}