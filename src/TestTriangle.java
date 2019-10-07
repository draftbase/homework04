public class TestTriangle {
    public static void main(String[] args) {
        boolean test;
        Triangle triangle = new Triangle(3,4,6);
        IsTriangle isTriangle = new IsTriangle();
        test = isTriangle.isRightTriangle(triangle);
        System.out.println(test);
    }
}
