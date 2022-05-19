package clase2;

public class TestArray {

	public static void main(String[] args) {
		ejemplo1();
		TestArray.ejemplo1();
		
	}

	static void ejemplo1() {
		String[] items = { "Shirt", "Trousers", "Scarf" };
		for (int i = 0; i < items.length; i++) {
			System.out.println(items[i]);
		}
	}
}
