package homework7;

public class RoboCat extends Pet {

    private Species sp = Species.ROBOCAT;


    public RoboCat(Species species, String nickname, int trickLevel) {
        species = sp;
        nickname = super.getNickname();
        trickLevel = super.getTrickLevel();
    }

    public RoboCat(Species species, String nickname, int age, int trickLevel, String[] habits) {
        species = sp;
        nickname = super.getNickname();
        age = super.getAge();
        trickLevel = super.getTrickLevel();
        habits = super.getHabits();
    }

    public RoboCat() {
        this(Species.UNKNOWN, "RoboCat", 60);
    }

    @Override
    public void respond() {
        System.out.printf("I am under update cause I am %s\n", this.getNickname());
    }

    @Override
    public void foul() {
        System.out.println("Ups! I bowed away with bombs");
    }


    public Species getSp() {
        return sp;
    }

    public void setSp(Species sp) {
        this.sp = sp;
    }


    @Override
    public String toString() {
        return "RoboCat{" +
                "species=" + sp +
                '}';
    }
}
