package lesson1;

public class RunningTrack implements Obstacle{
    public final int lenghth;

    public RunningTrack(int lenghth) {this.lenghth = lenghth;}

    @Override
    public String toString() {
        return String.format("running track with lenghth: %d, lenghth");
    }

}
