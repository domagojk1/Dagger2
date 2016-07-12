package dagger2.android.com.mainActivity.component;

import javax.inject.Singleton;

import dagger.Component;
import dagger2.android.com.mainActivity.Vehicle;
import dagger2.android.com.mainActivity.module.VehicleModule;

/**
 * Created by domagoj on 12.07.16..
 */
@Singleton
@Component(modules = {VehicleModule.class})
public interface VehicleComponent {
    Vehicle provideVehicle();
}
