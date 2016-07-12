package dagger2.android.com.mainActivity.module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger2.android.com.mainActivity.Motor;
import dagger2.android.com.mainActivity.Vehicle;

/**
 * Created by domagoj on 12.07.16..
 */
@Module
public class VehicleModule {
    @Provides @Singleton
    Motor provideMotor() {
        return new Motor();
    }

    @Provides @Singleton
    Vehicle provideVehicle() {
        return new Vehicle(new Motor());
    }
}
