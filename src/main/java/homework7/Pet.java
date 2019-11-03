package homework7;
import java.util.Objects;

public abstract class Pet {

    enum Species {
        FISH,
        DOMESTICCAT,
        DOG,
        ROBOCAT,
        UNKNOWN
    }


    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits = new String[100];



    public Pet(String nickname, int trickLevel) {
        this.nickname = nickname;
        this.trickLevel = trickLevel;
    }


    public Pet(String nickname, int age, short trickLevel, String[] habits) {
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Pet() {
        // empty constructor


    }



    public void eat() {
        System.out.println("I am eating");
    }

    public abstract void respond();

    public void foul() {
        System.out.println("I need to cover it up.");
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
        return "{nickname= " + getNickname() + ", age= " + getAge() + ", trickLevel= " + getTrickLevel() + ", habits= " + getHabits() + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pet)) return false;
        Pet pet = (Pet) o;
        return Objects.equals(getNickname(), pet.getNickname());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getNickname());
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalized in Pet class: " + this);
    }
}
