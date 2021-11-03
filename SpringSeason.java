/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class SpringSeason {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        boolean isSpringSeason = (m>=3 && m<=6);
        isSpringSeason = isSpringSeason && (m==3) && (d>=20 && d<=31);
        isSpringSeason = isSpringSeason || ((m==4) && (d>= 1 && d<=30));
        isSpringSeason = isSpringSeason || ((m==5) && (d>=1 && d<=31));
        isSpringSeason = isSpringSeason || ((m==6) && (d>=1 && d<=20));
        String output = String.format("Is The Season between March 20 and june 20 %s", isSpringSeason);
        System.out.println(output);
    }
}
