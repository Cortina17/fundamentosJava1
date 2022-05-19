package clase2;

public class TestArray {

	public static void main(String[] args) {
		TestArray.ejemplo1();
		TestArray.ejemplo2();

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
			System.out.println("Demasiadas cosasen el armario");
		} catch (Exception e) {
			System.out.println("Error");
		}
	}
}
