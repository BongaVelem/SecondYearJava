import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.JOptionPane;

public class Main {

  /**
   * @param args
   */
  public static void main(String[] args) {

    ArrayList<Employee> employeeList = new ArrayList<>();

    employeeList.add(new Employee("Bonga", "Velem", (double) 55000));
    employeeList.add(new Employee("Lebron", "James", (double) 10000));
    employeeList.add(new Employee("Marshall", "Mathers", (double) 81000));
    employeeList.add(new Employee("Matt", "Mase", (double) 5000));
    employeeList.add(new Employee("June", "Potters", (double) 4500));
    employeeList.add(new Employee("Tucker", "Carlson", (double) 15000));

    // Answer A

    JOptionPane.showMessageDialog(null, employeeList.toString());

    // Answer B
    // String letter = "M";
    // String allEmployees = " ";

    /*
     * for (int i = 0; i < employeeList.size(); i++) {
     * if
     * (employeeList.get(i).getEmpName().toLowerCase().startsWith(letter.toLowerCase
     * ())) {
     * allEmployees += "Name: " + employeeList.get(i).getEmpName() + "\n";
     * allEmployees += "Surname: " + employeeList.get(i).getEmpSurname() + "\n";
     * allEmployees += "Salary: " + employeeList.get(i).getEmpSalary() + "\n\n";
     * 
     * }
     * 
     * }
     * JOptionPane.showMessageDialog(null, allEmployees);
     * 
     * 
     * for (Employee employee : employeeList) {
     * if (employee.getEmpSalary() <= 5000) {
     * allEmployees += "Name: " + employee.getEmpName() + "\n";
     * allEmployees += "Surname: " + employee.getEmpSurname() + "\n";
     * allEmployees += "Salary: R" + employee.getEmpSalary() + "\n\n";
     * }
     * }
     * JOptionPane.showMessageDialog(null, allEmployees);
     */
    Collections.sort(employeeList);

    // Answer for D
    Collections.sort(employeeList, Comparator.comparing(Employee::getEmpSurname));

    JOptionPane.showMessageDialog(null, employeeList);

    // Answer for E
    Collections.sort(employeeList, Comparator.comparing(Employee::getEmpSalary));

    JOptionPane.showMessageDialog(null, employeeList);

  }

}

/*
 * 
 * // Methods that i was trying out.
 * //Answer for A
 * JOptionPane.showMessageDialog(null, employeeList.toString());
 * 
 * // Answer for C
 * String allEmployees = "";
 * for (Employee employee : employeeList) {
 * if (employee.getEmpSalary() <= 5000) {
 * allEmployees += "Name: " + employee.getEmpName() + "\n";
 * allEmployees += "Surname: " + employee.getEmpSurname() + "\n";
 * allEmployees += "Salary: R" + employee.getEmpSalary() + "\n\n";
 * }
 * }
 * JOptionPane.showMessageDialog(null, allEmployees);
 * }
 * for (int i = 0; i < employeeList.size(); i++) {
 * if (employeeList.get(i).getEmpSalary() <= 5000) {
 * employeeList.remove(i);
 * i++;
 * 
 * }
 * String mess = "These employees earn less than 5k " + i;
 * JOptionPane.showMessageDialog(null, mess);
 * }
 * 
 * // Answer for D
 * Collections.sort(employeeList,
 * Comparator.comparing(Employee::getEmpSurname));
 * 
 * JOptionPane.showMessageDialog(null, employeeList);
 * 
 * // Answer for E
 * Collections.sort(employeeList, Comparator.comparing(Employee::getEmpSalary));
 * 
 * JOptionPane.showMessageDialog(null, employeeList);
 * 
 * Collections.sort(employeeList);
 * 
 * 
 * 
 * for (Employee employee : employeeList) {
 * if
 * (allEmployees.append(employee.getEmpSurname()).append(employee.getEmpSurname(
 * ))) {
 * allEmployees += "Name: " + employee.getEmpName() + "\n";
 * allEmployees += "Surname: " + employee.getEmpSurname() + "\n";
 * allEmployees += "Salary: R" + employee.getEmpSalary() + "\n\n";
 * 
 * }
 * }
 * JOptionPane.showMessageDialog(null, allEmployees);
 */
