package clase2;

public class TestArray {
	static int[] misNros = { 3, 6, 9, 12 };

	public static void main(String[] args) {
		TestArray.ejemplo1();
		TestArray.ejemplo2();
		TestArray.ejemplo3();

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
		int[] valores = null;
		valores[0] = 4;
		valores[1] = 5;
		valores[2] = 6;
//uso de un array con alcance global para todos los metodos(en este caso estaticos)
		for (int i = 0; i < misNros.length; i++) {
			System.out.println(misNros[i]);
		}
	}
}