/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class WindChill {
    public static void main(String[] args) {
        double temp = Double.parseDouble(args[0]);
        double speed = Double.parseDouble(args[1]);
        double w = 35.74 + 0.6215 * temp + (0.4275* temp - 35.75) * Math.pow(speed, 0.16);
        String output = String.format("Given a temperature %.1f and a speed of %.2f miles/hour, its wind chill is %.1f", temp, speed, w);
        System.out.println(output);


    }
}
