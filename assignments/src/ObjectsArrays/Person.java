package ObjectsArrays;

public class Person {
    private int height;
    private int weight;
    private String ssn;
    private String phoneNumber;

    public Person(int height, int weight, String ssn, String phoneNumber) {
        this.height = height;
        this.weight = weight;
        this.ssn = ssn;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Person)) {
            return false;
        }
        Person person = (Person) obj;
        return ssn.equals(person.ssn);
    }


    public static void main(String[] args) {
        Person person1 = new Person(170, 70, "123-45-6789", "123-456-7890");
        Person person2 = new Person(165, 65, "987-65-4321", "987-654-3210");
        Person person3 = new Person(175, 75, "123-45-6789", "555-555-5555");

        System.out.println("Are person1 and person2 equal " + person1.equals(person2)); // Should print false
        System.out.println("Are person1 and person3 equal " + person1.equals(person3)); // Should print true
    }
}

