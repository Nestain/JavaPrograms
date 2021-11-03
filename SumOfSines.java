/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class SumOfSines {
    public static void main(String[] args) {
        double angle = Double.parseDouble(args[0]);
        double sum = Math.sin(2*angle) + Math.sin(3*angle);
        System.out.println(sum);

    }
}
