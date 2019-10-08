public class TestShape {
    public static void main(String[] args) {
        //metody
        ShapeCalculator wyniki = new ShapeCalculator();
        //figury
        Square kwadrat = new Square(5);
        Circle kolo = new Circle(2);
        Rectangle prostokat = new Rectangle(9,3);
        Triangle trojkat = new Triangle(6,5,4);
        //Wyniki
        System.out.println(wyniki.squareArea(kwadrat));
        System.out.println(wyniki.circleArea(kolo));
        System.out.println(wyniki.rectPerimeter(prostokat));
        System.out.println(wyniki.trianglePerimeter(trojkat));

        Rectangle rect = new Rectangle(5, 10);
        double rectArea = rect.calculateArea();
        System.out.print(rectArea); //wyświetla 50

    }
}
