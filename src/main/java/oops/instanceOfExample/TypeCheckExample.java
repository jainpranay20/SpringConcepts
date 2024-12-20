package oops.instanceOfExample;

public class TypeCheckExample {
    public static void main(String[] args) {
        Object number = 1234L;
        if(number instanceof Long) {
            System.out.println(number + " is of type long");
        }else if (number instanceof Double) {
            System.out.println(number + " is of type double");
        } else {
            System.out.println("Unknown type");
        }
    }
}
