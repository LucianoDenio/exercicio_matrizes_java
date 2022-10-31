package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a quantidade de linhas da matriz? ");
		int n = sc.nextInt();
		while(n>10) {
			System.out.print("Por favor digite um número menor que 10 :");
			n =sc.nextInt();
		}
		System.out.print("Qual a quantidade de colunas da matriz? ");
		int m = sc.nextInt();
		while(m>10) {
			System.out.print("Por favor digite um número menor que 10 :");
			m =sc.nextInt();
		}
		
		int [][] mat = new int [n][m];
		
		for (int i=0;i<mat.length;i++) {
			for (int j=0;j<mat[i].length;j++) {
				System.out.print("Elemento ["+(i)+","+(j)+"]:");
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("VETORES NEGATIVOS: ");
		
		
		
		for (int i=0;i<mat.length;i++) {
			for (int j=0;j<mat[i].length;j++) {
				if (mat[i][j]< 0) {
					System.out.println(mat[i][j]);
				}
			}

		}
		
		
		
		
		
		
		sc.close();

	}

}
