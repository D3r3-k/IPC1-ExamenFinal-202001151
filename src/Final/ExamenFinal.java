package Final;

import java.util.Scanner;

public class ExamenFinal {

	public static void main(String[] args) {
		boolean salir = false;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("|==========| Examen Final |==========|");
			System.out.println("| 1. Ejercicio 1     2. Ejercicio 2  |");
			System.out.println("| 3. Ejercicio 3     4. Salir        |");
			System.out.println("|====================================|");
			int op = sc.nextInt();
			System.out.println("");
			switch (op) {
			case 1:
				ejercicio1();
				break;
			case 2:
				ejercicio2();
				break;
			case 4:
				System.out.println("Adios\n");
				salir = true;
				break;

			default:
				System.out.println("Seleccione una opcion correcta");
			}
		} while (!salir);
	}

	public static void ejercicio1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====| Escriba 2 numeros |=====");
		System.out.print("|n1|: ");
		int n1 = sc.nextInt();
		System.out.print("|n2|: ");
		int n2 = sc.nextInt();
		if (n1 > n2) {
			System.out.println("|>>| " + n1 + " Es mayor");
		} else if (n2 > n1) {
			System.out.println("|>>| " + n2 + " Es mayor");
		} else {
			System.out.println("|>>| Son iguales");
		}

		System.out.println("");
	}

	public static void ejercicio2() {
		boolean fin = false;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("=====| Escriba un numero impar |=====");
			System.out.print("|>>|: ");
			int n = sc.nextInt();

			if (n % 2 == 0) {
				System.out.println("Escriba un numero impar");
			} else {
				System.out.println();
				for (int alto = 1; alto <= Math.ceil((float) n / 2); alto++) {
					for (int spacio = 1; spacio <= n - alto; spacio++) {
						System.out.print(" ");
					}
					for (int astk = 1; astk <= (alto * 2) - 1; astk++) {
						System.out.print("*");
					}
					System.out.println();
				}
				break;
			}

		} while (!fin);
		System.out.println("");
	}

}
