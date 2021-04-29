package be.intecbrussel.the_notebook.entities.plant_entities;

public class Bush extends Plant {
    private String fruit;
    private leafType leafType;


    public Bush(String name) {
        super(name);
    }

    public Bush(String name, double height) {
        super(name, height);
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public be.intecbrussel.the_notebook.entities.plant_entities.leafType getLeafType() {
        return leafType;
    }

    public void setLeafType(be.intecbrussel.the_notebook.entities.plant_entities.leafType leafType) {
        this.leafType = leafType;
    }


    @Override
    public String toString() {
        return "bush = " + getName() + " , height -> " + getHeight() + ", fruit =  " + getFruit();
    }
}
