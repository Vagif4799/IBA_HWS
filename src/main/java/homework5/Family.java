package homework5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Family {

    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    public void addChild (Human child) {
        if (children != null) {
            Human[] deti = new Human[children.length + 1];
            for (int i = 0; i < children.length; i++) {
                deti[i] = children[i];
            }
            deti[children.length] = child;
            children = deti;
        } else {
            Human[] deti = new Human[1];
            deti[0]=child;
            children=deti;
        }
    }

    public void deleteChild (int i) {
        if (children != null) {
            Human[] deti = new Human[children.length-1];
            for (int j = 0; j < children.length; j++) {
                if (j < i) {
                    deti[j] = children[j];
                } else if (j > i) {
                    deti[j - 1] = children[j];
                }
            }
            children = deti;
        }
    }

    public int countFamily (Family family) {
        int count=0;
        if(family.father != null) {
            count++;
        }
        if(family.mother != null) {
            count++;
        }
        if(family.children != null) {
            count += children.length;
        }
        return count;
    }



    public Family() {
        // empty
    }


    public Family(Human mother, Human father, Human[] children) {
        this.mother = mother;
        this.father = father;
        this.children = children;
    }

    public Human getMother() {
        return mother;
    }

    public Human getFather() {
        return father;
    }

    public Human[] getChildren() {
        return children;
    }

    public Pet getPet() {
        return pet;
    }



    public void setMother(Human mother) {
        this.mother = mother;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }


    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children) +
                ", pet=" + pet +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Family)) return false;
        Family family = (Family) o;
        return Objects.equals(getMother(), family.getMother()) &&
                Objects.equals(getFather(), family.getFather()) &&
                Arrays.equals(getChildren(), family.getChildren());
    }

    @Override
    public int hashCode() {

        int result = Objects.hash(getMother(), getFather());
        result = 31 * result + Arrays.hashCode(getChildren());
        return result;
    }
}



