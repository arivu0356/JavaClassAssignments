package assignments;

public class EngineeringDepartment extends Department {
    private int departmentSize;

    public EngineeringDepartment(int departmentSize) {
        this.departmentSize = departmentSize;
    }

    @Override
    public int getDepartmentSize() {
        return departmentSize;
    }

    public static void main(String[] args) {
        EngineeringDepartment engineeringDepartment = new EngineeringDepartment(50);
        System.out.println("Engineering Department Size: " + engineeringDepartment.getDepartmentSize());
    }
}