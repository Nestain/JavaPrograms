/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class Distance {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double distance = Math.sqrt(x*x +y*y);
        String output = String.format("The euclidean distance from point (%.1f,%.1f) to (0,0) is %.2f", x, y , distance);
        System.out.println(output);

    }
}
