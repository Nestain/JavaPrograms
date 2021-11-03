/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class DayOfWeek {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);
        int y0 = y -(14-m)/12;
        int x = y0 + (y0/4) - (y0/100) + y0/400;
        int m0 = m + 12*((14-m)/12) -2;
        int d0 = (d + x + 31*m0/12) % 7;
        String output = String.format("The on which day %d of month %d, year %d is %d", d, m, y, d0);
        System.out.println(output);
    }
}
