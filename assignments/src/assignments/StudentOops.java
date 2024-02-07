package assignments;

public class StudentOops {
	
    private String name;

    public StudentOops(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        StudentOops student = new StudentOops("John Doe");
        System.out.println("Student Name: " + student.getName());
    }
}
