package be.intecbrussel.the_notebook.service;

import be.intecbrussel.the_notebook.entities.animal_entities.Animal;
import be.intecbrussel.the_notebook.entities.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.entities.plant_entities.Plant;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ForestNoteBook {

    private List<Carnivore> carnivores;
    private List<Omnivore> omnivores;
    private List<Herbivore> herbivores;

    private List<Animal> animals = new ArrayList<>();
    private List<Plant> plants = new ArrayList<>();


    private int plantCount;
    private int animalCount;

    public List<Carnivore> getCarnivores() {
        return carnivores;
    }

    public void setCarnivores(List<Carnivore> carnivores) {
        this.carnivores = carnivores;
        this.animals.addAll(carnivores);
    }

    public List<Omnivore> getOmnivores() {
        return omnivores;
    }

    public void setOmnivores(List<Omnivore> omnivores) {
        this.omnivores = omnivores;
        this.animals.addAll(omnivores);

    }

    public List<Herbivore> getHerbivores() {
        return herbivores;
    }

    public void setHerbivores(List<Herbivore> herbivores) {
        this.herbivores = herbivores;
        this.animals.addAll(herbivores);

    }

    public int getPlantCount() {
        return plants.size();
    }

    public int getAnimalCount() {
        return animals.size();
    }

    public void addAnimal(Animal animal){
        if (animals.contains(animal.getName())) {
            System.out.println("Animal already exists in our notebook");
        }
        else {
            animals.add(animal);
            animalCount++;
        }
    }
    public void addPlant(Plant plant){
        if (plants.contains(plant.getName())) {
            System.out.println("Plant already exists in our notebook");
        }
        else {
            plants.add(plant);
            plantCount++;
        }
    }

    public void printNotebook(){

        System.out.println("Plants : ");
        plants.stream().forEach(System.out::println);

        System.out.println("Animals : ");
        animals.stream().forEach(System.out::println);
    }

    public void sortAllAnimalsByName(){

        animals.stream().sorted(Comparator.comparing(e -> e.getName()));

    }

    public void sortAllPlantsByName (){

        plants.stream().sorted(Comparator.comparing(e -> e.getName()));
    }

    public void printHeavyAnimalsCount(){

        int heavyCarnivores = 0;
        int heavyHerbivores = 0;
        int heavyOmnivores = 0;

        for (Carnivore c: (Carnivore[]) carnivores.toArray() ){

            if (c.getWeigth()>50)
                heavyCarnivores++;
        }

        for (Herbivore h: (Herbivore[])herbivores.toArray()){

            if (h.getWeigth()>50)
                heavyHerbivores++;
        }

        for (Omnivore c: (Omnivore[]) omnivores.toArray() ){

            if (c.getWeigth()>50)
                heavyOmnivores++;
        }

        System.out.println( "Number of Heavy Carnivores: " + heavyCarnivores
                            + "Number of Heavy Herbivores : "+ heavyHerbivores
                            + "Number of Heavy Omnivores : " + heavyOmnivores);
    }
    public void printTallAnimals() {
        animals.stream()
                .sorted(Comparator.comparing(e-> e.getHeigth() > 100))
                .forEach(System.out::println);
    }

}
