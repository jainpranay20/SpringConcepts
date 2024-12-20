package oops.Inheritance;

public class MountainBike extends Bicycle{

    public int seatHeight;

    public MountainBike(int gear, int speed, int seatHeight) {
        super(gear, speed);
        this.seatHeight = seatHeight;
    }

    public int height(int height){
        seatHeight = seatHeight + height;
        return seatHeight;
    }


}
