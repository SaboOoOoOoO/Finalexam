package finalexam.task2;

public class FactoryTester {
    public static void main(String[] args)  {
        PaperFactory factory = new PaperFactory();

        Person p1 = new Person("John", "Doe", "12345");
        Person p2 = new Person("Jane", "Smith", "67890");
        Person p3 = new Person("Alice", "Johnson", "54321");

        factory.addPerson(p1);
        factory.addPerson(p2);
        factory.addPerson(p3);

        System.out.println("Staff after adding persons: ");
        System.out.println(factory);

        factory.deletePerson(p2);

        System.out.println("Staff after deleting person p2: ");
        System.out.println(factory);
    }
}
