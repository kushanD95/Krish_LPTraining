package prototype.vegetable;

import prototype.enums.VegetableSize;

public class Carrot extends Vegetable {
    private VegetableSize vegetableSize;

    public VegetableSize getVegetableSize() {
        return vegetableSize;
    }

    public void setVegetableSize(VegetableSize vegetableSize) {
        this.vegetableSize = vegetableSize;
    }

    @Override
    public String toString() {
        return super.toString() + " Carrot{" +
                "vegetableSize=" + vegetableSize +
                '}';
    }
}
