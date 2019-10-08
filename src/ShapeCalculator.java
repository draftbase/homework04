public class ShapeCalculator {


    double squareArea(Square square){
        return square.a*4; //obwód
    }

    double rectPerimeter(Rectangle rectangle){
        return (rectangle.a + rectangle.b)*2; //obwód
    }

    double circleArea(Circle cirle){
        return 2*cirle.r*Math.PI;
    }

    double trianglePerimeter(Triangle triangle){
        return triangle.a + triangle.b + triangle.c;
    }

}
