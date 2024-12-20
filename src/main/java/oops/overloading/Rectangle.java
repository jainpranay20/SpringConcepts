package oops.overloading;

public class Rectangle {
    int length;
    int breadth;

    int area(int length, int breadth){
        return length* breadth;
    }

    double area(double length, double breadth){
        return length*breadth;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.area(5,6));

        System.out.println(rectangle.area(5.6, 5.3));
    }
}
