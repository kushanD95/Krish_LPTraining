package prototype.vegetable;

import prototype.enums.PumpkinVarieties;

public class Pumpkin extends Vegetable{

    private PumpkinVarieties pumpkinVarieties;

    public PumpkinVarieties getPumpkinVarieties() {
        return pumpkinVarieties;
    }

    public void setPumpkinVarieties(PumpkinVarieties pumpkinVarieties) {
        this.pumpkinVarieties = pumpkinVarieties;
    }

    @Override
    public String toString() {
        return super.toString() + " Pumpkin{" +
                "pumpkinVarieties=" + pumpkinVarieties +
                '}';
    }
}
