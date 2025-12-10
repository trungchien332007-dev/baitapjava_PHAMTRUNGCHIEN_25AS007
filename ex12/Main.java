package ex12;

public class Main {
    public static void main(String[] args) {

        // Tạo đối tượng Circle với radius mặc định 1.0
        Circle c1 = new Circle();
        System.out.println("c1: " + c1.toString());
        System.out.println("Radius: " + c1.getRadius());
        System.out.println("Area: " + c1.getArea());
        System.out.println("Circumference: " + c1.getCircumference());
        
        System.out.println();

        // Tạo đối tượng Circle với radius = 2.5
        Circle c2 = new Circle(2.5);
        System.out.println("c2: " + c2.toString());
        System.out.println("Radius: " + c2.getRadius());
        System.out.println("Area: " + c2.getArea());
        System.out.println("Circumference: " + c2.getCircumference());
        
        System.out.println();

        // Thay đổi bán kính
        c2.setRadius(5.0);
        System.out.println("After change radius of c2:");
        System.out.println("c2: " + c2.toString());
        System.out.println("New Area: " + c2.getArea());
        System.out.println("New Circumference: " + c2.getCircumference());
    }
}
