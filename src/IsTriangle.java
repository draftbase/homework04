import static java.lang.Math.pow;

public class IsTriangle {
    boolean isRightTriangle(Triangle triangle){
        return (pow(triangle.a,2) + pow(triangle.b,2) == pow(triangle.c,2));
    }
}
