package factoryMethod.packages;

import factoryMethod.features.AdventureEvent;
import factoryMethod.features.HikingEvent;
import factoryMethod.features.WaterEvent;

public class GoldPack extends Package {
    @Override
    protected void createPackage() {
        events.add(new WaterEvent());
        events.add(new AdventureEvent());
        events.add(new HikingEvent());
    }
}
