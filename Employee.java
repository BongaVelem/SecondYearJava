
import javax.swing.JOptionPane;

public class Employee {

  private String empName;
  private String empSurname;
  private String empNumber;
  private double empSalary;
  private double newSalary;
  private double increasePercentage;

  public Employee() {
  }

  public Employee(String n, String sn, String num) {
    this.empName = n;
    this.empSurname = sn;
    this.empNumber = num;

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

  public void setNewSalary(double newSalary) {
    this.newSalary = newSalary;
  }

  public double getNewSalary() {
    return newSalary;
  }

  public void setIncreasePercentage(double increasePercentage) {
    this.increasePercentage = increasePercentage;
  }

  public double getincreasePercentage() {
    return increasePercentage;
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
    newSalary = empSalary + (empSalary * (amt / 100));

  }

  /**
   * @param args
   */

  public static void main(String[] args) {
    String empName;
    String empSurname;
    String empNumber;
    double empSalary;
    String userInput;
    double newSalary;
    double increasePercentage;

    empName = JOptionPane.showInputDialog("Enter employee name: ");
    empSurname = JOptionPane.showInputDialog("Enter employee Surname: ");
    empNumber = JOptionPane.showInputDialog("Enter employee Number: ");
    userInput = JOptionPane.showInputDialog("Enter employee Salary: ");
    empSalary = Double.parseDouble(userInput);
    userInput = JOptionPane.showInputDialog("Enter the percentage increase: ");
    increasePercentage = Double.parseDouble(userInput);
    newSalary = empSalary + (empSalary * (increasePercentage / 100));

    JOptionPane.showMessageDialog(null, "Employee Name:" + empName +
        "\nEmployee Surname: " + empSurname +
        "\nEmployee Number: " + empNumber +
        "\nEmployee Salary: R" + empSalary +
        "\nNew Salary: R" + newSalary);

  }
}
