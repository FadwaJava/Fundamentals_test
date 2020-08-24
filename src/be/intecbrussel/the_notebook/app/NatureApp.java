package be.intecbrussel.the_notebook.app;

import be.intecbrussel.the_notebook.entities.animal_entities.Animal;
import be.intecbrussel.the_notebook.entities.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.entities.plant_entities.*;
import be.intecbrussel.the_notebook.service.ForestNoteBook;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NatureApp {
    public static void main(String[] args) {

        ForestNoteBook forestnotes = new ForestNoteBook();

        Bush  plant1 = new Bush("bush",LeafType.HAND);
        plant1.setFruit("Strawberry");
        forestnotes.addPlant(plant1);
        Flower  plant2 = new Flower("flower");
        plant2.setSmell(Scent.ORANGE);
        forestnotes.addPlant(plant2);
        Weed  plant3 = new Weed("weed",3.5);
        plant3.setArea(2.4);
        forestnotes.addPlant(plant3);
        Tree plant4 = new Tree("tree1",LeafType.NEEDLE);
        forestnotes.addPlant(plant4);
        Tree  plant5 = new Tree("tree2", LeafType.ROUND);
        forestnotes.addPlant(plant5);

        List<Carnivore> carnivores = new ArrayList<>();
        List<Omnivore> omnivores = new ArrayList<>();
        List <Herbivore> herbivores = new ArrayList<>();

        Carnivore animal1 = new Carnivore("lion");
        animal1.setMaxFoodSize(25);
        Carnivore animal2 = new Carnivore("tiger");
        animal2.setMaxFoodSize(15);
        Herbivore animal3 = new Herbivore("zebra");
        Herbivore animal4 = new Herbivore("elephant");
        Herbivore animal5 = new Herbivore("aap");
        Omnivore animal6 = new Omnivore("pig");
        animal6.setMaxFoodSize(15);
        Omnivore animal7 = new Omnivore("hond");
        animal7.setMaxFoodSize(12);
        Omnivore animal8 = new Omnivore("Crocodile");
        animal8.setMaxFoodSize(10);
        Omnivore animal9 = new Omnivore("beer");
        animal9.setMaxFoodSize(50);

        carnivores.add(animal1);
        carnivores.add(animal2);
        herbivores.add(animal3);
        herbivores.add(animal4);
        herbivores.add(animal5);
        omnivores.add(animal6);
        omnivores.add(animal7);
        omnivores.add(animal8);
        omnivores.add(animal9);

        forestnotes.setHerbivores(herbivores);
        forestnotes.setCarnivores(carnivores);
        forestnotes.setOmnivores(omnivores);

        Set<Plant> plantDiet = new HashSet<>();
        plantDiet.add(plant1);
        plantDiet.add(plant3);
        herbivores.stream().forEach(e->e.setPlantDiet(plantDiet));
        omnivores.stream().forEach(e->e.setPlantDiet(plantDiet));


        System.out.println("Aantal planten: "+ forestnotes.getPlantCount()+ " Aantal animals: "+ forestnotes.getAnimalCount());

        forestnotes.printNotebook();

        System.out.println("Omnivores : ");
        omnivores.stream().forEach(System.out::println);

        System.out.println("Herbivores : ");
        herbivores.stream().forEach(System.out::println);

        System.out.println("Carnivores : ");
        carnivores.stream().forEach(System.out::println);

        forestnotes.sortAllAnimalsByName();
        forestnotes.sortAllPlantsByName();
        forestnotes.printNotebook();

    }
}
