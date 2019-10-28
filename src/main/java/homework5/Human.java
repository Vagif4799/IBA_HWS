package homework5;

import java.util.Arrays;

public class Human {


    private String name;
    private String surname;
    private int year;
    private short iq;
    private String[][] schedule = new String[7][2];
    private Family family;

    public void welcomeTheFavorite() {
        System.out.println("Hello, " + family.getPet().getNickname());
    }

    public void describeTheFavourite() {
        System.out.println("I have a " + family.getPet().getSpecies() + ", he is " + family.getPet().getAge() + " years old, he is " + ((family.getPet().getTrickLevel() > 50) ? "Very sly" : "almost not sly"));
    }

    public void feed(boolean isTime) {

        if (isTime) {
            System.out.println("feed the pet, it is time...");
        } else {
            int currentPetMood = (int) (Math.random() * 100);
            if (family.getPet().getTrickLevel() > currentPetMood) {
                System.out.printf("Hm... I will feed %s.\n", family.getPet().getNickname());
            } else if (family.getPet().getTrickLevel() < currentPetMood) {
                System.out.printf("I think %s is not hungry.\n", family.getPet().getNickname());
            }
        }

    }


    public Human(String name, String surname, int year, short iq, String[][] schedule, Family family) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
        this.family = family;
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
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

    public Family getFamily() {
        return family;
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

    public void setFamily(Family family) {
        this.family = family;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", schedule=" + Arrays.toString(schedule) +
                '}';
    }
}


