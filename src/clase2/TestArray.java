package clase2;

public class TestArray {
	static int[] misNros = { 3, 6, 9, 12 };

	public static void main(String[] args) {
		TestArray.ejemplo1();
		TestArray.ejemplo2();
		TestArray.ejemplo3();
		TestArray.ejemplo4();
		TestArray.ejemplo5();
		TestArray.ejemplo6();

		char[] letras = ejemplo5();
		for (int i = 0; i < letras.length; i++) {
			System.out.println(letras[i]);
		}
	}

	static void ejemplo1() {
		String[] items = { "Shirt", "Trousers", "Scarf" };
		for (int i = 0; i < items.length; i++) {
			System.out.println(items[i]);
		}
	}

	static void ejemplo2() {
		String[] items = { "Shirt", "Trousers", "Scarf" };
		try {
			for (int i = 0; i <= items.length; i++) {
				System.out.println(items[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Demasiadas cosas en el armario");
		} catch (Exception e) {
			System.out.println("Error");
		}
	}

	static void ejemplo3() {
		int[] nros = { 1, 2, 3 };
		int[] valores = new int[3];
		valores[0] = 4;
		valores[1] = 5;
		valores[2] = 6;
//uso de un array con alcance global para todos los metodos(en este caso estaticos)
		for (int i = 0; i < misNros.length; i++) {
			System.out.println(misNros[i]);
		}
	}

	static void ejemplo4() {
		int[] ages = new int[3];
		ages[0] = 19;
		ages[1] = 21;
		ages[2] = 24;

		String[] names = new String[3];
		names[0] = "May";
		names[1] = "Bob";
		names[2] = "Leo";

		int[] nros = new int[5];
		for (int i = 0; i < nros.length; i++) {
			nros[i] = (int) (Math.random() * 100);
			System.out.println(nros[i]);
		}
	}

	static char[] ejemplo5() {
		char[] s;
		s = new char[26];
		for (int i = 0; i < 26; i++) {
			s[i] = (char) ('A' + i);
		}
		return s;
	}

	static void ejemplo6() {
		// Matriz de dos filas y tres columnas
		String[][] ciudades = { { "BsAs", "Sao Paulo", "Madrid" }, { "Argentina", "Brasil", "España" } };
		for (int i = 0; i < ciudades.length; i++) {
			// se posiciona en las filas
			for (int j = 0; j < ciudades[i].length; j++) {
				// se posiciona en las columnas
				System.out.println(ciudades[i][j]); // ciudades[fila][columna]
			}
		}
	}
}