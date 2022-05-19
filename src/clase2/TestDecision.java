package clase2;

public class TestDecision {

	public static void main(String[] args) {
		System.out.println(verCantidadAsistentes());
		// llamada al metodo estatico, llamada como metodo de clase
		TestDecision test = new TestDecision();
		System.out.println(test.verCantAsistentes());
		// llamada al metodo no estatico
		test.switchUse();
		test.switchUseTwo();
		test.forUse();
		test.forUseTwo();
		test.forUseThird();
		test.forUseFourth();
		test.whileUse();
	}

	static int verCantidadAsistentes() {
		int attendees = 4;
		boolean largeVenue;
		if (attendees >= 5) {
			largeVenue = true;
		} else {
			largeVenue = false;
		}

		largeVenue = (attendees >= 5);
		String a = "";
		// Ternary operator
		a = attendees >= 5 ? "SI" : "NO";
		System.out.println(a);
		System.out.println(attendees >= 5 ? "SI" : "NO");
		return attendees;
	}

	int verCantAsistentes() {
		int attendees = 4;
		boolean largeVenue;
		if (attendees >= 5) {
			largeVenue = true;
		} else {
			largeVenue = false;
		}

		largeVenue = (attendees >= 5);
		return attendees;
	}

	void switchUse() {
		int dia = 14;
		switch (dia) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sabado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("Error");
		}

		System.out.println("Salida del switch");
	}

	void switchUseTwo() {
		int mes = 2;
		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Tiene 31 días");
			break;
		case 2:
			System.out.println("Tiene 28 o 29 dias");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Tiene 30 dias");
			break;
		default:
			System.out.println("Error");
		}
		System.out.println("Salida del switch 2");
	}

	void forUse() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Valor del contador: " + i);
		}
	}

	void forUseTwo() {
		int j = 0;
		for (; j < 10; j++) {
			System.out.println("Valor del contador: " + j);
		}
	}

	void forUseThird() {
		for (int j = 10; j >= 0; j--) {
			System.out.println("Valor del contador para atras: " + j);
		}
	}

	void forUseFourth() {
		for (int j = 0; j < 10; j += 2) {
			System.out.println("Valor del par: " + j);
		}
	}

	void whileUse() {
		int cont = 10;
		while (cont++ < 10) {
			System.out.println("Numero 1 contador: " + cont);
		}

		int cont1 = 10;
		do {
			System.out.println("Numero 2 contador: " + cont1);
		} while (cont1++ < 10);
	}
}
