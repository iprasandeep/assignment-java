import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EmployeeDetails {
    public static void main(String[] args) {
        String employeesFile = "employees.csv";
        String managersFile = "managers.csv";
        String singleNameFile = "single_name_employees.csv";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(employeesFile));
            FileWriter managersWriter = new FileWriter(managersFile);
            FileWriter singleNameWriter = new FileWriter(singleNameFile);
            String line = null;

            while ((line = reader.readLine()) != null) {
                String[] employeeData = line.split(",");
                String name = employeeData[0];
                String role = employeeData[1];
                String division = employeeData[2];

                if (role.equals("Manager") && division.equals("R&D")) {
                    managersWriter.write(line + "\n");
                }

                String[] names = name.split(" ");
                if (names.length == 1) {
                    singleNameWriter.write(line + "\n");
                }
            }

            reader.close();
            managersWriter.close();
            singleNameWriter.close();

            System.out.println("Collected Employee Details Done!");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
