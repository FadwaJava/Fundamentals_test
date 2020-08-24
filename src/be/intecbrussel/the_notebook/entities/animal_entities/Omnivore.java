package be.intecbrussel.the_notebook.entities.animal_entities;

import be.intecbrussel.the_notebook.entities.plant_entities.Plant;

import java.util.Set;

public class Omnivore extends Animal{

    private Set<Plant> plantDiet;
    private double maxFoodSize;

    public Omnivore(String name) {
        super(name);
    }

    public Omnivore(String name, double weigth, double heigth, double length) {
        super(name, weigth, heigth, length);
    }

    public Set<Plant> getPlantDiet() {
        return plantDiet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }

    public double getMaxFoodSize() {
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }

    public  void addPlantToDiet (Plant plant){
        plantDiet.add(plant);
    }

    @Override
    public String toString() {
        return "Omnivore{ name = " + getName() +
                " ,plantDiet=" + plantDiet +
                " ,maxFoodSize=" + maxFoodSize +
                '}';
    }
}
