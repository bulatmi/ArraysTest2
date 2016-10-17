package testpkg;


public class ArrSort {

	public static void main(String[] args) {
		
		ArrMethods arrmeth = new ArrMethods();   // экземпляр класса ArrMethods
		
		int[] arr = arrmeth.randGenIntArr(50, 15);
		System.out.println("Исходный массив:");
		arrmeth.outputIntArr(arr);
		System.out.println("Пузырьком: ");
		arrmeth.outputIntArr(arrmeth.arrSortBub(arr));
		
		System.out.println("----------------------------------------------"); 
		
		int[] arr2 = arrmeth.randGenIntArr(100, 20); 
		System.out.println("Исходный массив:");
		arrmeth.outputIntArr(arr2);
		System.out.println("Расческой: ");
		arrmeth.outputIntArr(arrmeth.arrCombSort(arr2));		
	}
	
	// Some code 1 
	// Some code 2 
}
