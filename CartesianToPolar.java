/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class CartesianToPolar {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double r = Math.sqrt(x*x + y*y);
        double theta = Math.atan2(y,x);
        String output = String.format("The polar coordinates are r = %.1f and theta = %.1f", r, theta);
        System.out.println(output);
    }
}
