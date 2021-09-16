import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Salary {
    public static void main(String[] args) {
        int basic_salary, gross_salary, hra, dearness_allowance;
        try {
            System.out.println("Enter Salary");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            basic_salary = Integer.parseInt(br.readLine());
            dearness_allowance = 40 * basic_salary / 100;
            hra = 20 * basic_salary / 100;
            gross_salary = basic_salary + hra + dearness_allowance;
            System.out.println("Gross Salary is: " + (int)gross_salary);
        }
        catch (IOException e) {
            System.out.println("Error");
        }
    }
}
