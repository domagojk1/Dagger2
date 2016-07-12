package dagger2.android.com.mainActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import dagger2.android.com.mainActivity.component.DaggerVehicleComponent;
import dagger2.android.com.mainActivity.component.VehicleComponent;
import dagger2.android.com.mainActivity.module.VehicleModule;

public class MainActivity extends AppCompatActivity {

    private VehicleComponent component;
    private Vehicle vehicle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dagger);

        component = DaggerVehicleComponent.builder().vehicleModule(new VehicleModule()).build();
        vehicle = component.provideVehicle();
        vehicle.increaseSpeed(20);

        Toast.makeText(this, String.valueOf(vehicle.getSpeed()), Toast.LENGTH_SHORT).show();
    }
}
