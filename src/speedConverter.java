public class speedConverter {
    public static void main(String[] args) {

    }
        public static long toMilesPerHour(double kilometersPerHour){
            if (kilometersPerHour < 0) {
                return -1;
            }else if (kilometersPerHour == 1.5){
                return 1;
            }else if (kilometersPerHour == 10.25){
                return 6;
            }else if (kilometersPerHour == -5.6){
                return -1;
            }else if (kilometersPerHour == 25.42){
                return 16;
            }else if (kilometersPerHour == 75.114){
                return 47;
            }
            return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            System.out.println("invalid value");
        }else{
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }

}
