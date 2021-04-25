package be.intecbrussel.the_notebook.entities.app;

import be.intecbrussel.the_notebook.entities.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.entities.plant_entities.*;
import be.intecbrussel.the_notebook.entities.service.ForestNotebook;

import java.util.HashSet;
import java.util.Set;

public class NatureApp {
    public static void main(String[] args) {
    //making new notebook
        ForestNotebook gregNotebook = new ForestNotebook();

    //making new plants + adding to notebook
        Tree tree1 = new Tree("apple Tree" , 250);
        gregNotebook.addPlant(tree1);

        Flower flower = new Flower("Aloe Vera" ,50 );
        gregNotebook.addPlant(flower);

        Weed weed = new Weed("og kush" , 100);
        gregNotebook.addPlant(weed);

        Bush bush = new Bush("mistletoe" , 90);
        gregNotebook.addPlant(bush);

        Tree tree2 = new Tree("banana tree" , 300);
        gregNotebook.addPlant(tree2);

    //making new plantdiet set + adding plants
        Set<Plant> plantDiet = new HashSet<>();
        plantDiet.add(tree1);
        plantDiet.add(flower);

    //making new carnivores + adding to notebook
        Carnivore carnivore = new Carnivore("lion",100,120,150);
        gregNotebook.addAnimal(carnivore);

        Carnivore carnivore2 = new Carnivore("wolf",70,90,120);
        gregNotebook.addAnimal(carnivore2);

        Carnivore carnivore3 = new Carnivore("cheetah",120,100,150);
        gregNotebook.addAnimal(carnivore3);

    //making new herbivores + omnivores , adding the diet to them and adding to notebook
        Herbivore herbivore = new Herbivore("cow",200,160,140);
        herbivore.setPlantDiet(plantDiet);
        gregNotebook.addAnimal(herbivore);

        Herbivore herbivore2 = new Herbivore("goat",70,60,90);
        herbivore.setPlantDiet(plantDiet);
        gregNotebook.addAnimal(herbivore2);

        Herbivore herbivore3 = new Herbivore("panda",140,160,100);
        herbivore.setPlantDiet(plantDiet);
        gregNotebook.addAnimal(herbivore3);


        Omnivore omnivore = new Omnivore("pig",90,70,80);
        omnivore.setPlantDiet(plantDiet);
        gregNotebook.addAnimal(omnivore);

        Omnivore omnivore2 = new Omnivore("dog",30,40,80);
        omnivore.setPlantDiet(plantDiet);
        gregNotebook.addAnimal(omnivore2);

        Omnivore omnivore3 = new Omnivore("bear",110,90,140);
        omnivore.setPlantDiet(plantDiet);
        gregNotebook.addAnimal(omnivore3);

    //printing the animal + plant count
        System.out.println("animal count : " + gregNotebook.getAnimalCount());
        System.out.println("plant count : " + gregNotebook.getPlantCount());

        System.out.println();

    //printing the plants and animals not sorted
        gregNotebook.printNotebook();

        System.out.println();

       System.out.println(gregNotebook.getCarnivores());
       System.out.println(gregNotebook.getHerbivores());
       System.out.println(gregNotebook.getOmnivores());

        System.out.println("----------------------");

    //sorting the animals and plants
        gregNotebook.sortAnimalsByName();
        gregNotebook.sortPlantsByName();

    //printing the sorted list with animals and plants
        gregNotebook.printNotebook();

    }
}
