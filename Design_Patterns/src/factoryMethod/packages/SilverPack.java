package factoryMethod.packages;

import factoryMethod.features.AdventureEvent;
import factoryMethod.features.WaterEvent;

public class SilverPack extends Package {
    @Override
    protected void createPackage() {
        events.add(new WaterEvent());
        events.add(new AdventureEvent());
    }
}
