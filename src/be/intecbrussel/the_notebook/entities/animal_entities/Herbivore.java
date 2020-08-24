package be.intecbrussel.the_notebook.entities.animal_entities;

import be.intecbrussel.the_notebook.entities.plant_entities.Plant;

import java.util.Set;

public class Herbivore extends Animal{

    private Set <Plant> plantDiet;

    public Herbivore(String name) {
        super(name);
    }

    public Herbivore(String name, double weigth, double heigth, double length) {
        super(name, weigth, heigth, length);
    }

    public Set<Plant> getPlantDiet() {
        return plantDiet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }

    public  void addPlantToDiet (Plant plant){
        plantDiet.add(plant);
    }

    public void printDiet(){
        plantDiet.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Herbivore{ name= " + getName() +
                " ,plantDiet= " + plantDiet +
                '}';
    }
}
