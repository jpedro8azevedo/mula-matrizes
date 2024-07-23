package sort;

public class SelectionSort {

	public int[] selectionSort(int[] numEntrada) {
		for (int j = 0; j < numEntrada.length - 1; j++) {
			int indiceMenor = j;
			for (int k = j + 1; k < numEntrada.length; k++) {
				if (numEntrada[k] < numEntrada[indiceMenor]) {
					indiceMenor = k;
				}
			}
			int aux = numEntrada[j];
			numEntrada[j] = numEntrada[indiceMenor];
			numEntrada[indiceMenor] = aux;
		}
		return numEntrada;
	}
	
	
}
