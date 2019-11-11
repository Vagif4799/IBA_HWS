package homework10.Application;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Human {


    private String name;
    private String surname;
    private LocalDate birthDate;
    private short iq;
    private Schedule schedule;
    private Family family;


    public Human(String name, String surname, LocalDate birthDate, short iq) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.iq = iq;
    }

    public Human(String name, String surname, LocalDate birthDate, short iq, Schedule schedule, Family family) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.iq = iq;
        this.schedule = schedule;
        this.family = family;
    }

    public Human(String name, String surname, LocalDate birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }


    public Human(String name, String surname, LocalDate birthDate, Schedule schedule) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.schedule = schedule;
    }

    public Human() {
        // empty constructor
        super();
        System.out.println("This object reference is located on the heap at: " + this);
    }

    public String describeAge(Human human) {

        LocalDate finalTime = LocalDate.now();
        LocalDate initialTime = human.birthDate;
        int period2 = Period.between(initialTime, finalTime).getYears();
        int period3 = Period.between(initialTime, finalTime).getMonths();
        int period4 = Period.between(initialTime, finalTime).getDays();


        return "Years: " + period2 + "Months: " + period3 + "Days: " + period4;
    }


    public String getName() {
        return name;
    }


    public String getSurname() {
        return surname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
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

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
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
        return getBirthDate() == human.getBirthDate() &&
                Objects.equals(getName(), human.getName()) &&
                Objects.equals(getSurname(), human.getSurname());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getName(), getSurname(), getBirthDate());
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate=" + birthDate +
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


