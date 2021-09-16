import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Converter {
    public static void main(String[] args) {
        double km, metre, feet, inches, cm;
        try {
            System.out.println("Enter distance in km");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            km = Double.parseDouble(br.readLine());
            //1km = 1000 metre
            metre = Double.parseDouble(String.valueOf(km * 1000));
            System.out.format("%f metres \n", (double)metre);
            //1km = 39370.078740157 inches
            inches = Double.parseDouble(String.valueOf(km * 39370.078740157));
            System.out.format("%f inches \n",inches);
            //1km = 3280.8398950131 ft
            feet = Double.parseDouble(String.valueOf(km * 3280.8398950131));
            System.out.format("%f feets \n", feet);
            //1km = 100000cm
            cm = Double.parseDouble(String.valueOf(km * 100000));
            System.out.format("%f centimetres \n", cm);
        }
        catch (IOException e) {
            System.out.println("Error");
        }
    }
}
