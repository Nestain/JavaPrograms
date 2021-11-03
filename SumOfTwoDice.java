/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class SumOfTwoDice {
    public static void main(String[] args) {
        double rand = Math.random() * 6;
        int firstRand = (int) (rand + 1);
        int secondRand = (int) (rand + 1);
        int sum = firstRand + secondRand;
        System.out.println(sum);
    }
}
