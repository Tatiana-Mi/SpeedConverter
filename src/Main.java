public class Main {

    public static void main(String[] args) {

       double miles = speedConverter.toMilesPerHour(10.5);
       miles = speedConverter.toMilesPerHour(1.5);
       miles = speedConverter.toMilesPerHour(10.25);
       miles = speedConverter.toMilesPerHour(-5.6);
       miles = speedConverter.toMilesPerHour(25.42);
       miles = speedConverter.toMilesPerHour(75.114);

        System.out.println("Miles = " + miles);


        speedConverter.printConversion(10.5);
        speedConverter.printConversion(1.5);
        speedConverter.printConversion(10.25);
        speedConverter.printConversion(-5.6);
        speedConverter.printConversion(25.42);
        speedConverter.printConversion(75.114);
    }
}
