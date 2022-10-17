public class Employee {

    private final String name;
    private int department;
    private int salary;
    private int id;
    private static int counter=1;

    public Employee(String fullName, int department, int salary){
        this.id = counter++;
        this.name = fullName;
        this.department = department;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;

    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString(){
        return "id:" + this.getId() + " full neme:"+ this.getName() + " department:" + this.getDepartment() + " salary:" + this.getSalary();
    }
}