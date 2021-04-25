package be.intecbrussel.the_notebook.entities.plant_entities;

public class Tree extends Plant {
    private leafType leafType;

    public Tree(String name) {
        super(name);
    }

    public Tree(String name, double height) {
        super(name, height);
    }

    public be.intecbrussel.the_notebook.entities.plant_entities.leafType getLeafType() {
        return leafType;
    }

    public void setLeafType(be.intecbrussel.the_notebook.entities.plant_entities.leafType leafType) {
        this.leafType = leafType;
    }


    @Override
    public String toString() {
        return "tree = " + getName() + " , height -> " + getHeight();
    }
}
