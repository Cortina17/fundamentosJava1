package clase1;

public class Test {
//llamada a metodo de clase
//El metodo es estatico;
	public static void main(String args[]) {
		double area = Circle.findArea(3);
		System.out.println("Area of circle = " + area);

//llamada a metodo de objeto
//Crear una nueva instancia de circle.
		Circle circulo = new Circle(); // instaciacion
		circulo.calcutePerimeter(5);
		int perimeter = circulo.calcutePerimeter(5);
		System.out.println(perimeter);
		System.out.println(circulo.calcutePerimeter(8));
	}
}
//si es estatico no hay que instanciar