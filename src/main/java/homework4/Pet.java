package homework4;

public class Pet {

    private String species;
    private String nickname;
    private int age;
    private short trickLevel;
    private String[] habits = new String[100];

    public void eat () {
        System.out.println("I am eating");
    }

    public void respond () {
        System.out.printf("Hello owner. I am " + this.nickname + " I miss you!");
    }

    public void foul () {
        System.out.println("I need to cover it up.");
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

    public short getTrickLevel() {
        return trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }


    public Pet(String species, String nickname, int age, short trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Pet () {
        // empty constructor
    }



}







