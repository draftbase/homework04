public class Rectangle {
    double a;
    double b;

    Rectangle (double a, double b) {
        this.a=a;
        this.b=b;
    }

    double calculateArea(){
        return (a + b)*2; //obwód
    }

}
