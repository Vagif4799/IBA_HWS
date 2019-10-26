package homework5;

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


}
