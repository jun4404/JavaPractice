package parctice1104;

public class FieldExample2 {

	public static void main(String[] args) {
		Circle obj = new Circle(0.0);
		obj.radius = 5.0;
		double area = obj.getArea();
		System.out.println(obj.radius);
		System.out.println(area);
	}

}
