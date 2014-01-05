package EmployeeArray;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 02/11/13
 * Time: 22:13
 * To change this template use File | Settings | File Templates.
 */
public class employeeArray {

    public static void main(String[] args) {
        Integer[] employeeIDArray;
        employeeIDArray = new Integer[10];
        String[] employeeNamesArray;
        employeeNamesArray = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Please enter the ID of employee " + (i + 1) + " : ");
            int input = Integer.parseInt(System.console().readLine());
            employeeIDArray[i] = input;
            System.out.print("Please enter the name of employee " + (i + 1) + ": ");
            String input2 = System.console().readLine();
            employeeNamesArray[i] = input2;
        }
        //print ID and name of all employees with ID less than 1000
        System.out.println("ID and names of all employees whose ID is less than 1000: ");
        for (int j = 0; j < 10; j++) {
            if (employeeIDArray[j] < 1000) {
                System.out.println("Employee number: " + employeeIDArray[j]);
                System.out.println("Employee name: " + employeeNamesArray[j]);
            }
        }
        //print ID and name of all employees whose names start with J and S
        System.out.println("ID and names of all employees whose name start with J or S: ");
        for (int n = 0; n < 10; n++) {
            String firstLetter = employeeNamesArray[n].substring(0,1);
            if (firstLetter.equals("J") || firstLetter.equals("S")) {
                System.out.println("Employee number: " + employeeIDArray[n]);
                System.out.println("Employee name: " + employeeNamesArray[n]);
            }
        }

    }
}
