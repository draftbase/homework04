public class Triangle {
    double a;
    double b;
    double c;

    Triangle (double a, double b, double c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    double calculateArea(Triangle triangle){
        return triangle.a + triangle.b + triangle.c;
    }
}
