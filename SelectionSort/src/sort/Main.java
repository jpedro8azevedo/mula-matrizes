package sort;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		SelectionSort ss = new SelectionSort();
		Scanner sc = new Scanner(System.in);
		String[] entrada = sc.nextLine().split(" ");
		int[] numEntrada = new int[entrada.length];
		for (int i = 0; i < numEntrada.length; i++) {
			numEntrada[i] = Integer.parseInt(entrada[i]);
		}
		int[] answer = ss.selectionSort(numEntrada);
		System.out.println(Arrays.toString(answer));

	}
	
	/*
	public static int[] selectionSort(int[] numEntrada) {
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
	*/
	
}
