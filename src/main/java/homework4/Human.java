package homework4;


public class Human {

    private String name;
    private String surname;
    private int year;
    private short iq;
    Pet pet = new Pet();
    Human mother;
    Human father;
    Pet dog;
    String[][] schedule = new String[7][2];


    public void greetPet() {
        System.out.println("Hello, " + pet.getNickname());
    }

    public void describePet() {
        System.out.println("I have a " + pet.getSpecies() + ", he is " + pet.getAge() + " years old, he is " + ((pet.getTrickLevel() > 50) ? "Very sly" : "almost not sly"));
    }

    public void feedPet(boolean isTime) {

        if (isTime) {
            System.out.println("feed the pet, it is time...");
        } else {
            int currentPetMood = (int) (Math.random() * 100);
            if (pet.getTrickLevel() > currentPetMood) {
                System.out.printf("Hm... I will feed %s\n", pet.getNickname());
                System.out.println(currentPetMood);
            } else if (pet.getTrickLevel() < currentPetMood) {
                System.out.printf("I think %s is not hungry.\n", pet.getNickname());
                System.out.println(currentPetMood);
            }
        }

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


    public String toString() {
        return "Human{ name= " + getName() + ", surname= " + getSurname() + ", year= " + getYear() + ",\n iq= " + getIq() + ", mother= " + mother + ", father= " + father + ",\npet= " + pet.toString() + "}";
    }


    public Human(String name, String surname, int year, Pet dog) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.pet = dog;
    }

    public Human(String name, String surname, int year, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int year, short iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public Human() {
        // empty constructor
    }


}


