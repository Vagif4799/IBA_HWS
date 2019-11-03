package homework7;

public class DomesticCat extends Pet {

    private Species sp = Species.DOMESTICCAT;

    public DomesticCat(Species species, String nickname, int trickLevel) {
        species = sp;
        nickname = super.getNickname();
        trickLevel = super.getTrickLevel();
    }

    public DomesticCat(Species species, String nickname, int age, int trickLevel, String[] habits) {
        species = sp;
        nickname = super.getNickname();
        age = super.getAge();
        trickLevel = super.getTrickLevel();
        habits = super.getHabits();
    }

    public DomesticCat() {
        this(Species.UNKNOWN, "DomesticCat", 60);
    }

    @Override
    public void respond() {
        System.out.printf("I can meow in case I feel hungry cause I am %s\n", this.getNickname());
    }

    @Override
    public void foul() {
        System.out.println("I peed at home");
    }

    public Species getSp() {
        return sp;
    }

    public void setSp(Species sp) {
        this.sp = sp;
    }
}
