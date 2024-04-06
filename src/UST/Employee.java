package UST;

public class Employee {
    public int empid;
    public String name;
    public String department;
    public String email;
    public double salary;
    public String gender;

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Employee(int empid, String name, String department, String email, double salary, String gender) {
        this.empid = empid;
        this.name = name;
        this.department = department;
        this.email = email;
        this.salary = salary;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                ", gender='" + gender + '\'' +
                '}';
    }
}
