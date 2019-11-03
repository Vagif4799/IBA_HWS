package homework7;

public class Dog extends Pet {

    private Species sp = Species.DOG;

    public Dog(Species species, String nickname, int trickLevel) {
        species = sp;
        nickname = super.getNickname();
        trickLevel = super.getTrickLevel();
    }

    public Dog(Species species, String nickname, int age, int trickLevel, String[] habits) {
        species = sp;
        nickname = super.getNickname();
        age = super.getAge();
        trickLevel = super.getTrickLevel();
        habits = super.getHabits();
    }

    public Dog() {
        this(Species.UNKNOWN, "Dog", 60);
    }

    public Species getSp() {
        return sp;
    }

    public void setSp(Species sp) {
        this.sp = sp;
    }

    @Override
    public void respond() {
        System.out.printf("I can bark! bark! in danger cause I am %s\n", this.getNickname());
    }

    @Override
    public void foul() {
        System.out.println("I ate someone mistaken");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "species=" + sp +
                '}';
    }
}
