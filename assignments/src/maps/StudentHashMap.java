package maps;

import java.util.HashMap;

class Student {
    private String firstName;
    private String lastName;
    private double gpa;

    public Student(String firstName, String lastName, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getGpa() {
        return gpa;
    }
}

public class StudentHashMap {
    public static void main(String[] args) {
        // Create a HashMap to store Student objects
        HashMap<String, Student> studentMap = new HashMap<>();

        // Add 8 Student objects to the HashMap
        studentMap.put("John", new Student("John", "Doe", 3.8));
        studentMap.put("Alice", new Student("Alice", "Smith", 3.9));
        studentMap.put("Bob", new Student("Bob", "Johnson", 3.5));
        studentMap.put("Emily", new Student("Emily", "Brown", 3.7));
        studentMap.put("Michael", new Student("Michael", "Wilson", 3.6));
        studentMap.put("Sophia", new Student("Sophia", "Miller", 3.9));
        studentMap.put("David", new Student("David", "Davis", 3.4));
        studentMap.put("Emma", new Student("Emma", "Jones", 3.8));

        // Retrieve a Student object from the HashMap
        String searchName = "Alice";
        Student student = getStudentByName(studentMap, searchName);

        // Print information about the retrieved student
        if (student != null) {
            System.out.println("Student found: " + student.getFirstName() + " " + student.getLastName() +
                    ", GPA: " + student.getGpa());
        } else {
            System.out.println("Student with name " + searchName + " not found.");
        }
    }

    // Method to get a Student object by name from the HashMap
    public static Student getStudentByName(HashMap<String, Student> map, String name) {
        // Check if the HashMap contains the name
        if (map.containsKey(name)) {
            return map.get(name); // Return the Student object associated with the name
        } else {
            return null; // Return null if the name is not found in the HashMap
        }
    }
}
