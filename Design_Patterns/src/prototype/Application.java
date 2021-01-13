package prototype;

import prototype.enums.PumpkinVarieties;
import prototype.enums.VegetableTypes;
import prototype.vegetable.Carrot;
import prototype.vegetable.Pumpkin;

public class Application {

    public static void main(String[] args) {
        Registry registry = new Registry();

        Carrot carrot = (Carrot) registry.getVegetables(VegetableTypes.CARROT);
        carrot.setName("unidentified carrot");
        System.out.println(carrot);

        Carrot carrot1 = (Carrot) registry.getVegetables(VegetableTypes.CARROT);
        System.out.println(carrot1);
/**
        registry.getVegetables(VegetableTypes.CARROT).setName("carrot");

        System.out.println(registry.getVegetables(VegetableTypes.CARROT).getName());
**/

        Pumpkin pumpkin = (Pumpkin) registry.getVegetables(VegetableTypes.PUMPKIN);
        pumpkin.setPumpkinVarieties(PumpkinVarieties.C);
        System.out.println(pumpkin);

    }
}
