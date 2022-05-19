package clase2;

public class TestDecision {

	public static void main(String[] args) {
		System.out.println(verCantidadAsistentes());
		// llamada al metodo estatico, llamada como metodo de clase
		TestDecision test = new TestDecision();
		System.out.println(test.verCantAsistentes());
		// llamada al metodo no estatico
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
		int dia = 4;
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
}
