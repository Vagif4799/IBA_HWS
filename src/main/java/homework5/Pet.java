package homework5;

import java.util.Objects;

public class Pet {


    private String species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits = new String[100];

    public void eat() {
        System.out.println("I am eating");
    }

    public void respond() {
        System.out.println("Hello owner. I am " + this.nickname + " I miss you!");
    }

    public void foul() {
        System.out.println("I need to cover it up.");
    }


    public Pet(String species, String nickname, int trickLevel) {
        this.species = species;
        this.nickname = nickname;
        this.trickLevel = trickLevel;
    }


    public Pet(String species, String nickname, int age, short trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Pet() {
        // empty constructor


    }


    public String getSpecies() {
        return species;
    }

    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }


    public String toString() {
        return getSpecies() + "{nickname= " + getNickname() + ", age= " + getAge() + ", trickLevel= " + getTrickLevel() + ", habits= " + getHabits() + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pet)) return false;
        Pet pet = (Pet) o;
        return Objects.equals(getSpecies(), pet.getSpecies()) &&
                Objects.equals(getNickname(), pet.getNickname());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getSpecies(), getNickname());
    }
}
