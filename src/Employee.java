public class Employee {
private final Fio empFio;
private int department;
private int salary;
public int Id;

    public Employee(Fio empFio,int department, int salary,int Id) {
        this.empFio =empFio;
        this.department= department;
        this.salary=salary;
        this.Id=Id;

    }

    public Fio getEmpFio() {
    return this.empFio;
    }
    public int getDepartment() {
        return this.department;
    }
    public void setDepartment (int department){
        this.department= department;
    }
    public int getSalary() {
        return this.salary;
    }
    public void setSalary (int salary) {
        this.salary = salary;
    }

    public String toString() {
        return this.empFio+" Отдел: "+this.department+" Зарплата: "+this.salary+" Id: "+this.Id;
    }
    public int hashCode() {
        Object Employee = new Object();
        return java.util.Objects.hash(Employee);
    }





}
