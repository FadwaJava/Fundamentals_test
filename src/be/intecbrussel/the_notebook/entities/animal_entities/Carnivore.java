package be.intecbrussel.the_notebook.entities.animal_entities;

public class Carnivore extends Animal{

    private double maxFoodSize;

    public Carnivore(String name) {
        super(name);
    }

    public Carnivore(String name, double weigth, double heigth, double length) {
        super(name, weigth, heigth, length);
    }

    public double getMaxFoodSize() {
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }

    @Override
    public String toString() {
        return "Carnivore{ name = " + getName() +
                ", maxFoodSize=" + maxFoodSize +
                '}';
    }
}
