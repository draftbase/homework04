public class Circle {
    double r;

    Circle (double r) {
        this.r=r;
    }

    double calculateArea(Circle cirle){
        return 2*cirle.r*Math.PI;
    }

}
