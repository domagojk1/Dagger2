package dagger2.android.com.mainActivity;

import javax.inject.Inject;

/**
 * Created by domagoj on 12.07.16..
 */
public class Vehicle {
    private Motor motor;

    @Inject
    public Vehicle(Motor motor) {
        this.motor = motor;
    }

    public void increaseSpeed(int value) {
        motor.accelerate(value);
    }

    public void stop() {
        motor.brake();
    }

    public int getSpeed() {
        return motor.getSpeed();
    }
}
