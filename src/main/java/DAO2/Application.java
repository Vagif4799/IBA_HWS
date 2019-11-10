package DAO2;

public class Application {
  public static void main(String[] args) {

    DAO<Person> pps = new DAOPersonHashMap(); // new DAOPErsonArray();


    pps.put(new Person(1, "Ulvi", 20));
    pps.put(new Person(2, "Emin", 21));
    pps.put(new Person(3, "Fatima", 21));
    pps.put(new Person(4, "Cabbar", 15));
    pps.put(new Person(5, "Abdulla", 50));


    pps.delete(5);
    System.out.println(pps.get(2));
    System.out.println(pps.getAll());



    Person p1 = new Person(1, "Alex", 33);
    Person p2 = new Person(2, "Natale", 44);
    Pizza pz1 = new Pizza(112, 30, 45);
    Pizza pz2 = new Pizza(113, 60, 90);

    DeepRabbitHole deepRabbitHole = new DeepRabbitHole();
    deepRabbitHole.process(() -> p1);
    deepRabbitHole.process(() -> pps.get(1));


  }
}
