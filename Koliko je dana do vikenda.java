package drugidomaci;

import java.util.Scanner;

public class PrviZ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("Broj dana u nedelji: ");
		a = sc.nextInt();

		switch (a) {
		case 1:
			System.out.println("Ponedeljak, ostalo je jos 5 dana");
			break;
		case 2:
			System.out.println("Utorak, ostalo je jos 4 dana");
			break;
		case 3:
			System.out.println("Sreda, ostalo je jos 3 dana");
			break;
		case 4:
			System.out.println("Cetvrtak, ostalo je jos 2 dana");
			break;
		case 5:
			System.out.println("Petak, ostalo je jos 1 dana");
			break;
		case 6:
			System.out.println("Subota");
			break;
		case 7:
			System.out.println("Nedelja");
			break;
		default:
			System.out.println("Los unos");
			break;

		}

	}
}