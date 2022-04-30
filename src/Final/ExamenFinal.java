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
			case 3:
				ejercicio3();
				break;
			case 4:
				System.out.println("Adios\n");
				salir = true;
				break;

			default:
				System.out.println("Seleccione una opcion correcta\n");
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

	public static void ejercicio3() {
		// PARA 8 VACAS
				System.out.println("=========| Produccion para 8 vacas |=========");
				int kg8cow = 1000;
				int[] Peso8cow = { 223, 243, 100, 200, 200, 155, 300, 150 };
				int[] Produccion8cow = { 30, 34, 28, 45, 31, 50, 29, 1 };
				int[] temp8Peso = Peso8cow.clone();
				int[] temp8Product = Produccion8cow.clone();

				int tempPeso = 0;
				int tempProduct = 0;
				for (int i = 0; i < temp8Peso.length; i++) {
					for (int j = 1; j < (temp8Peso.length - i); j++) {
						if (temp8Peso[j - 1] < temp8Peso[j]) {

							tempPeso = temp8Peso[j - 1];
							temp8Peso[j - 1] = temp8Peso[j];
							temp8Peso[j] = tempPeso;

							tempProduct = temp8Product[j - 1];
							temp8Product[j - 1] = temp8Product[j];
							temp8Product[j] = tempProduct;

						}
					}
				}
				// sumando
				int totalProduct = temp8Product[0];
				int totalPeso = temp8Peso[0];
				for (int i = 1; i < Produccion8cow.length; i++) {
					if (totalPeso < kg8cow) {
						totalProduct = totalProduct + temp8Product[i];
					}
				}
				System.out.println("|>>|: " + totalProduct + " Litros");
				// PARA 10 VACAS
				System.out.println("=========| Produccion para 10 vacas |=========");
				int kg10cow = 2000;
				int[] Peso10cow = { 340, 355, 223, 243, 130, 240, 260, 155, 302, 130 };
				int[] Produccion10cow = { 45, 50, 34, 39, 29, 40, 30, 52, 31, 1 };
				int[] temp10Peso = Peso10cow.clone();
				int[] temp10Product = Produccion10cow.clone();

				int temp10Pes = 0;
				int temp10Pro = 0;
				for (int i = 0; i < temp10Peso.length; i++) {
					for (int j = 1; j < (temp10Peso.length - i); j++) {
						if (temp10Peso[j - 1] < temp10Peso[j]) {

							temp10Pes = temp10Peso[j - 1];
							temp10Peso[j - 1] = temp10Peso[j];
							temp10Peso[j] = temp10Pes;

							temp10Pro = temp10Product[j - 1];
							temp10Product[j - 1] = temp10Product[j];
							temp10Product[j] = temp10Pro;

						}
					}
				}
				// sumando
				int total10Product = temp10Product[0];
				int total10Peso = temp10Peso[0];
				for (int i = 1; i < Produccion10cow.length; i++) {
					if (total10Peso < kg10cow) {
						total10Product = total10Product + temp10Product[i];
					}
				}
				System.out.println("|>>|: " + total10Product + " Litros\n");
	}
	
}
