package homework4;


public class Human {

        private String name;
        private String surname;
        private int year;
        private short iq;
        Pet pet = new Pet();
        Human mother;
        Human father;
        String[][] schedule = new String[7][2];


        public void greetPet () {
            System.out.println("Hello, " + pet.getNickname());
        }

        public void describePet () {
            System.out.println("I have a "  + pet.getSpecies() + ", he is " + pet.getAge() + " years old, he is " + ((pet.getTrickLevel()>50)?"Very sly":"almost not sly"));
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




    public String toString () {
            return "Human{ name= " + getName() + ", surname= " + getSurname() + ", year= " + getYear() + ", iq= " + getIq() + ", mother= " + mother + ", father= " + father + "pet= " + pet.toString() + "}";
    }


    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
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


    public static void main(String[] args) {
            Human tom = new Human("Tom", "Tommy", 25);
            Human jerry = new Human("Jerry", "Freaky", 20);
            Human berry = new Human("Berry", "Black", 2);

        System.out.println(tom.getName());
        System.out.println(jerry.getName());
        System.out.println(berry.getName());
    }


}


