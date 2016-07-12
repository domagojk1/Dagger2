package dagger2.android.com.mainActivity;

/**
 * Created by domagoj on 12.07.16..
 */
public class Motor {
    private int speed;

    public Motor() {
        this.speed = 0;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void accelerate(int value) {
        speed = speed + value;
    }

    public void brake() {
        speed = 0;
    }
}
