package homework11.Application;

import java.util.Set;

public class Fish extends Pet {
    @Override
    public void respond() {
        System.out.printf("I can swim very well, but can not fly cause I am %s\n", this.getNickname());
    }

    private Species sp = Species.FISH;


    public Fish(Species species, String nickname, int trickLevel) {
        species = sp;
        nickname =super.getNickname();
        trickLevel = super.getTrickLevel();
    }


    public Fish(Species species, String nickname, int age, int trickLevel, Set<String> habits) {
        species = sp;
        nickname = super.getNickname();
        age = super.getAge();
        trickLevel = super.getTrickLevel();
        habits = super.getHabits();
    }

    public Fish() {
        this(Species.UNKNOWN, "FISH", 60);
    }

    public Species getSp() {
        return sp;
    }

    public void setSp(Species sp) {
        this.sp = sp;
    }


    @Override
    public String toString() {
        return "Fish{" +
                "species=" + sp +
                '}';
    }
}
