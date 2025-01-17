package baitapweb.student;


public class Staff extends Person {
    private String school;
    private double salary;

    public Staff(String name, String address, String school, double salary) {
        super(name, address);
        this.school = school;
        this.salary = salary;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double upToSalary(int percent) {
        this.salary += this.salary * percent / 100.0;
        return this.salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", School: " + school + ", Salary: " + salary;
    }
}

