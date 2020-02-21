package daksh;

public class Digitsum {
    public static long sumdigits(int number) {
        int sum = 0;
        int tmp ;
        if (number < 10) {
            return -1;
        } else {
            while ( number != 0){

                tmp = number % 10;
                sum = sum+tmp;
                number = number / 10;

            }
            return sum;
        }
    }
}
//THIS IS DAKSH'S SOLUTION
