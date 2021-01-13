package prototype.vegetable;

import prototype.enums.VegetableGrade;

public abstract class Vegetable implements Cloneable {

    private String name;
    private VegetableGrade vegetableGrade;
    private float quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VegetableGrade getVegetableGrade() {
        return vegetableGrade;
    }

    public void setVegetableGrade(VegetableGrade vegitableGrade) {
        this.vegetableGrade = vegitableGrade;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Vegetable{" +
                "name='" + name + '\'' +
                ", vegetableGrade=" + vegetableGrade +
                ", quantity=" + quantity +
                '}';
    }
}
