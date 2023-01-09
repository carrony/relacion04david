package ejercicios;

import java.util.Scanner;

public class FuncionesVectores {

	public static void pedirVector(double v[]) {
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < v.length; i++) {
			System.out.println("Introduce el elemento "+i);
			v[i] = teclado.nextDouble();
		}
	}
	
	
	public static int [] pideVectorCompleto() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Cuántos elementos quieres?: ");
		int longitud = teclado.nextInt();
		
		int numeros []= new int[longitud];
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce el elemento "+i);
			numeros[i] = teclado.nextInt();
		}
		return numeros;
	}
	
	
	public static void pedirVector(int v[]) {
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < v.length; i++) {
			System.out.println("Introduce el elemento "+i);
			v[i] = teclado.nextInt();
		}
	}
	
	public static void mostrar_vector(double v[]) {
		for (int i = 0; i < v.length; i++) {
			System.out.printf("%.2f ", v[i]);
		}
		System.out.println();
	}

	public static void mostrar_vector(int v[]) {
		for (int i = 0; i < v.length; i++) {
			System.out.printf("%d ", v[i]);
		}
		System.out.println();
	}
	
	public static void mostrarMenoresQue(int v[], int tope) {
		for(int i=0; i<v.length; i++) {
			if (v[i]<tope) {
				System.out.print(v[i]+" ");
			}
		}
	}
	
	public static int devuelveMenor(int v[]) {
		int menor = v[0];
		for (int i = 1; i<v.length; i++) {
			if (v[i]<menor) {
				menor = v[i];
			}
		}
		return menor;
	}
	
	/**
	 * Procedimiento que muestra los valores del vector que se enecuentran en 
	 * el intervalo [a,b). Se comprueba que los valores de a y b vienen ordenados
	 * @param v vector de double con los valores
	 * @param a valor incial del intervalo
	 * @param b valor final del intervalo
	 */
	public static void muestraEnIntervaloAB(double v[], int a, int b) {
		for(int i=0; i< v.length; i++) {
			if (v[i]>=Math.min(a, b) && v[i]<Math.max(a,b)) {
				System.out.print(v[i]+ " ");
			}
		}
	}


	public static void rotarIzquierda(int vector[]) {
		int aux=vector[0];
		for (int i = 0; i < vector.length-1; i++) {
			vector[i]=vector[i+1];
		}
		vector[vector.length-1]=aux;
	}
	
	public static void rotarIzquierda(int vector[], int veces) {
		for (int i = 0; i < veces; i++) {
			rotarIzquierda(vector);
		}
	}
	
//	public static void rotarIzquierdav2(int[] vector) {
//		int aux=vector[0];
//		for (int i = 1; i < vector.length; i++) {
//			vector[i-1]=vector[i];
//		}
//		vector[vector.length-1]=aux;
//	}
	
	
	public static void rotarDerecha(int vector[]) {
		int aux=vector[vector.length-1];
		for (int i = vector.length-1; i > 0; i--) {
			vector[i]=vector[i-1];
		}
		vector[0]=aux;
	}
	
	public static void mostrarDesdeMayorA(int vector[], int num) {
		int i=0;
		//for (i = 0; i < vector.length && vector[i]<num; i++);
		for (i=0; i<vector.length; i++) {
			if (vector[i]>num) {
				break;
			}
		}
		for (int j = i; j < vector.length; j++) {
			System.out.print(vector[j]+ " ");
		}
	}
	
	public static void mostrarDesdeMayorAv2(int vector[], int num) {
		int pos=-1;
		//for (i = 0; i < vector.length && vector[i]<num; i++);
		for (int i=0; i<vector.length && pos ==-1; i++) {
			if (vector[i]>num) {
				pos=i;
			}
		}
		if (pos !=-1) {
			for (int i = pos; i < vector.length; i++) {
				System.out.print(vector[i]+ " ");
			}
		} else {
			System.out.println("No se ha encontrado un elemento mayor a "+num);
		}
		
	}
	
	public static boolean sonParalelos(double v1[], double v2[]) {
		if (v1.length!=v2.length) {
			return false;
		}
			
		boolean paralelos= true;
		double factor=v1[0]/v2[0];
		
		for(int i=1;i<v1.length && paralelos ;i++) {
			if (v1[i]/v2[i] != factor && (v1[i]!=0 || v2[i]!=0 )) {
				paralelos=false;
			}
		}
		return paralelos;
	}
	
	public static boolean esCapicua(int vector[]) {
		boolean capicua=true;
		// for(int i=0, j=vector.length-1; i<j; i++, j--) {
		for(int i=0, j=vector.length-1; i<vector.length/2 && capicua; i++,j--) {
			if (vector[i]!=vector[j]) {
				capicua=false;
			}
		}
		return capicua;
	}
	
	
	public static int[]  calcularInverso(int v[]) {
		int resultado [] = new int[v.length];
		for (int i=0, j=v.length-1; i<v.length; i++, j--) {
			resultado[i]=v[j];
		}
		
		return resultado;
	}
	
	public static int [] concatenar(int v1[], int v2[]) {
		int v3[] = new int[v1.length+v2.length];
		
		for (int i=0; i<v1.length; i++) {
			v3[i] = v1[i];
		}
		
//		for (int i=0;i<v2.length;i++) {
//			v3[v1.length+i]=v2[i];
//		}
		
//		for (int i=v1.length; i<v3.length; i++) {
//			v3[i]=v2[i-v1.length];
//		}
		
		for (int i=0, j=v1.length; i<v2.length; i++,j++) {
			v3[j]=v2[i];
		}
		return v3;
	}
	
	public static int [] sumar(int v1[], int v2[] ) {
		if (v1.length!=v2.length) {
			return null;
		}
		int v3 [] = new int[v1.length];
		
		for (int i = 0; i < v1.length; i++) {
			v3[i] = v1[i]+v2[i];
		}
		return v3;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
