package homework9.Application;

import java.util.Objects;

public class Human {


    private String name;
    private String surname;
    private int year;
    private short iq;
    private Schedule schedule;
    private Family family;




    public Human(String name, String surname, int year, short iq, Schedule schedule, Family family) {
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


    public Human(String name, String surname, int year, Schedule schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.schedule = schedule;
    }

    public Human() {
        // empty constructor
        super();
        System.out.println("This object reference is located on the heap at: " + this);
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

    public Schedule getSchedule() {
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

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public void setFamily(Family family) {
        this.family = family;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return getYear() == human.getYear() &&
                Objects.equals(getName(), human.getName()) &&
                Objects.equals(getSurname(), human.getSurname());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getName(), getSurname(), getYear());
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", schedule=" + schedule +
                ", family=" + family +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalized in Human class:" + this);
    }
}


