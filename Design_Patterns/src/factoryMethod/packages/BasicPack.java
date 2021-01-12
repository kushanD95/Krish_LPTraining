package factoryMethod.packages;

import factoryMethod.features.WaterEvent;

public class BasicPack extends Package {
    @Override
    protected void createPackage() {
        events.add(new WaterEvent());
    }
}
