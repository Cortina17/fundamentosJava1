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
}
