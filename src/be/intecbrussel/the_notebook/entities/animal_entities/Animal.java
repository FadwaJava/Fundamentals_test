package be.intecbrussel.the_notebook.entities.animal_entities;

public class Animal {

    private String name;
    private double weigth;
    private double heigth;
    private double length;

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, double weigth, double heigth, double length) {
        this.name = name;
        this.weigth = weigth;
        this.heigth = heigth;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
