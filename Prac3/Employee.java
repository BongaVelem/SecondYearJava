
public class Employee implements Comparable<Employee> {
  private String empName;
  private String empSurname;
  private Double empSalary;

  public Employee() {
  }

  public Employee(String name, String surname, Double salary) {
    this.empName = name;
    this.empSurname = surname;
    this.empSalary = salary;

  }

  public void setEmpName(String name) {
    this.empName = name;
  }

  public void setEmpSurname(String surname) {
    this.empSurname = surname;
  }

  public void setEmpSalary(Double salary) {
    this.empSalary = salary;

  }

  public String getEmpName() {
    return empName;
  }

  public String getEmpSurname() {
    return empSurname;

  }

  public Double getEmpSalary() {
    return empSalary;
  }

  public String toString() {
    return "\nEmployee details: " +
        "\nName: " + this.getEmpName() + " Surname: " + this.getEmpSurname() + "Salary: R" + this.getEmpSalary();

  }

  @Override
  public int compareTo(Employee other) {

    int result = this.getEmpSurname().compareTo(other.getEmpSurname());
    if (result == 0) {
      return (int) Double.compare(this.getEmpSalary(), this.getEmpSalary());
    }
    return result;

  }

}
