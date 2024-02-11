
public class Employee {
  private String empName;
  private String empSurname;
  private String empNumber;
  private Double empSalary;

  public Employee() {
  }

  public Employee(String n, String sn, String num, Double salary) {
    this.empName = n;
    this.empSurname = sn;
    this.empNumber = num;
    this.empSalary = salary;
  }

  public void setEmpName(String nm) {
    this.empName = nm;
  }

  public void setEmpSurname(String snm) {
    this.empSurname = snm;
  }

  public void setEmpNumber(String num) {
    this.empNumber = num;
  }

  public void setEmpSalary(double sal) {
    this.empSalary = sal;
  }

  public String getEmpName() {
    return empName;
  }

  public String getEmpSurname() {
    return empSurname;
  }

  public String getEmpNumber() {
    return empNumber;
  }

  public double getEmpSalary() {
    return empSalary;
  }

  public void increaseSalary(double amt) {
    Double currentSalary = this.getEmpSalary();
    Double amountAfterIncrease = currentSalary + (currentSalary * (amt / 100));

    this.setEmpSalary(amountAfterIncrease);
  }

  public String toString() {
    return "Employee Name: " + this.getEmpName() +
        "\nEmployee Surname:" + this.getEmpSurname() +
        "\nEmployee Number: " + this.getEmpNumber() +
        "\nEmployee Salary: " + this.getEmpSalary();
  }
}
