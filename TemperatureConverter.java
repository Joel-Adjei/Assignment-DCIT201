import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        double celsius = 0.0;
        double fahrenheit = 0.0;
        Scanner scanner = new Scanner(System.in);

        //Intro and to take user input
        System.out.println("Welcome to the Temperature Converter!\n"
                            +"Choose an option:\n"+
                            "1. Convert Celsius to Fahrenheit\n"+
                            "2. Convert Fahrenheit to Celsius");
        
        //A loop that prompt the user to input a valid option
        int selected = scanner.nextInt();
            while(selected != 1 && selected != 2){
                System.out.println("Invalid Seclection, select 1 or 2 from the option\n" +
                                    "1.Convert Celsius to Fahrenheit \n" +
                                    "2.Convert Fahrenheit to Celsius");
                                    selected = scanner.nextInt();
        }
         // Makes the convertion base on the user choice
        switch (selected) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                celsius = scanner.nextDouble(); // Input Celsius temperature
                fahrenheit = (celsius * 9 / 5) + 32; // Convert to Fahrenheit
                System.out.printf("Temperature in Fahrenheit: %.2f°F%n", fahrenheit);
                break;
            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                fahrenheit = scanner.nextDouble(); // Input Fahrenheit temperature
                celsius = (fahrenheit - 32) * 5 / 9; // Convert to Celsius
                System.out.printf("Temperature in Celsius: %.2f°C%n", celsius);
            default:
                // This case won't be reached due to the validation loop
                System.out.println("Unexpected error!");
                break;
        }
    }
}
