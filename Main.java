import javax.swing.JOptionPane;

public class Main {
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

    Employee employee = new Employee();
  }

}
