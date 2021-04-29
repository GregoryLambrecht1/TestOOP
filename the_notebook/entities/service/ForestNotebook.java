package be.intecbrussel.the_notebook.entities.service;

import be.intecbrussel.the_notebook.entities.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Animal;
import be.intecbrussel.the_notebook.entities.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.entities.plant_entities.Plant;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ForestNotebook {
    private final List<Carnivore> carnivores = new ArrayList<>();
    private final List<Omnivore> omnivores = new ArrayList<>();
    private final List<Herbivore> herbivores = new ArrayList<>();

    private int plantCount;
    private int animalCount;

    private final List<Animal> animals = new ArrayList<>();
    private final List<Plant> plants = new ArrayList<>();
    
    public ForestNotebook() {
    }

    public List<Carnivore> getCarnivores() {
        return carnivores;
    }

    public void setCarnivores(List<Carnivore> carnivores) {
        this.carnivores = carnivores;
    }

    public List<Omnivore> getOmnivores() {
        return omnivores;
    }

    public void setOmnivores(List<Omnivore> omnivores) {
        this.omnivores = omnivores;
    }

    public List<Herbivore> getHerbivores() {
        return herbivores;
    }

    public void setHerbivores(List<Herbivore> herbivores) {

        for (Herbivore herbivore : herbivores) {
            this.addAnimal(herbivore);
        }

        // this.herbivores = herbivores;
    }

    public int getPlantCount() {
        return plantCount;
    }

    public int getAnimalCount() {
        return animalCount;
    }

    // not null -> if !animallist contains animal -> add animal to list -> counter++
    public void addAnimal(Animal animal) {
        if (animal != null) {
            if (!animals.contains(animal)) {
                animals.add(animal);
                animalCount++;
            }
        }

        // if animal instanceOff -> add to the list
        if (animal instanceof Carnivore) {
            carnivores.add((Carnivore) animal);
        }
        if (animal instanceof Herbivore) {
            herbivores.add((Herbivore) animal);
        }
        if (animal instanceof Omnivore) {
            omnivores.add((Omnivore) animal);
        }
    }

    // not null -> if !plants contains plant -> add -> counter++
    public void addPlant(Plant plant) {
        if (plant != null) {
            if (!plants.contains(plant)) {
                plantCount++;
                plants.add(plant);
            }
        }
    }

    public void printNotebook() {
        // System.out.println("animals " + animals);
        this.getAnimals().forEach(animal -> System.out.println(animal));

        // System.out.println("plants " + plants);
        this.getPlants().forEach(plant -> System.out.println(plant));
    }

    public void sortAnimalsByName() {
        animals.sort((a1, a2) -> a1.getName().compareTo(a2.getName()));
    }

    public void sortPlantsByName() {
        plants.sort(Comparator.comparing(Plant::getName));
    }

    public void sortAnimalsByHeight() {
        animals.sort(Comparator.comparing(Animal::getHeight));
    }

    public void sortPlantsByHeight() {
        plants.sort(Comparator.comparing(Plant::getHeight));
    }

}
