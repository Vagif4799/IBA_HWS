package homework5;

import java.util.Arrays;

public class Human {


    private String name;
    private String surname;
    private int year;
    private short iq;
    private String[][] schedule = new String[7][2];
    private Pet pet;


    public void greetPet() {
        System.out.println("Hello, " + pet.getNickname());
    }

    public void describePet() {
        System.out.println("I have a " + pet.getSpecies() + ", he is " + pet.getAge() + " years old, he is " + ((pet.getTrickLevel() > 50) ? "Very sly" : "almost not sly"));
    }

    public void feedPet(boolean isTime) {

        if (isTime) {
            System.out.println("feed the pet, it is time...");
        } else {
            int currentPetMood = (int) (Math.random() * 100);
            if (pet.getTrickLevel() > currentPetMood) {
                System.out.printf("Hm... I will feed %s.\n", pet.getNickname());
            } else if (pet.getTrickLevel() < currentPetMood) {
                System.out.printf("I think %s is not hungry.\n", pet.getNickname());
            }
        }

    }


    public Human(String name, String surname, int year, Pet dog) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.pet = dog;
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, short iq, Pet pet, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.schedule = schedule;
    }

    public Human() {
        // empty constructor

    }

    public String getName() {
        return name;
    }


    public String getSurname() {
        return surname;
    }

    public int getYear() {
        return year;
    }

    public short getIq() {
        return iq;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public Pet getPet() {
        return pet;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setIq(short iq) {
        this.iq = iq;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", schedule=" + Arrays.toString(schedule) +
                ", pet=" + pet +
                '}';
    }
}


