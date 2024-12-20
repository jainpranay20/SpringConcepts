package oops.Inheritance;

public class Main {
    public static void main(String[] args) {

        MountainBike mountainBike = new MountainBike(3, 4, 10);
        System.out.println(mountainBike.height(4));

        mountainBike.applyBrake(4);
        System.out.println(mountainBike);

    }
}
