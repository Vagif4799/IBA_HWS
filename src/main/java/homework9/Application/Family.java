package homework9.Application;

import java.util.*;

public class Family {

    private Human mother;
    private Human father;
    private static List<Human> children = new ArrayList<Human>();
    private Set<Pet> pet = new HashSet<Pet>();


    public Family() {
        // empty
    }

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
    }

    public Family(Human mother, Human father, List<Human> children) {
        this.mother = mother;
        this.father = father;
        this.children = children;
    }

    public Family(Human mother, Human father, List<Human> children, Set<Pet> pet) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet = pet;
    }



    public void addChild (Human child) {
        children.add(child);
    }

    public void deleteChild (int i) {
        children.remove(i);
    }

    public static int  countFamily (Family family) {
        int count=0;
        if(family.father != null) {
            count++;
        }
        if(family.mother != null) {
            count++;
        }
        if(family.children != null) {
            count += children.size();
        }
        return count;
    }


    public Human getMother() {
        return mother;
    }

    public Human getFather() {
        return father;
    }

    public List<Human> getChildren() {
        return children;
    }

    public Set<Pet> getPet() {
        return pet;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public void setChildren(List<Human> children) {
        this.children = children;
    }

    public void setPet(Set<Pet> pet) {
        this.pet = pet;
    }


    @Override
    public String toString() {
        return "Family contains -> \n Mother: " + mother + "\n Father: " + father + "\n Children: " +
                children + "\n and of course Pets: " + pet + "\n ;) ";
    }


    /*
    return "Family contains -> Mother: " + mother + "\n Father: " + father + "\n Children: " +
    children + "\n and of course Pets: " + pet + "\n ;) ";
     */


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Family)) return false;
        Family family = (Family) o;
        return Objects.equals(getMother(), family.getMother()) &&
                Objects.equals(getFather(), family.getFather()) &&
                Objects.equals(getChildren(), family.getChildren()) &&
                Objects.equals(getPet(), family.getPet());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getMother(), getFather(), getChildren(), getPet());
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalized in Family class: " + this);
    }
}



