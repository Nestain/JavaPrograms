/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class DivisorPattern {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);

        for(int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++){
                if(i %j == 0 || j % i == 0)
                    System.out.print("*");
                else
                    System.out.print(".");
            }
            System.out.println(i);
        }
    }
}
