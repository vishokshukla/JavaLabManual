//Java Program to display first 100 prime numbers

public class Task27 {
    public static void main(String[] args) {
        int count = 0;
        int i = 2;
        while(count < 100) {
            if(isPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
    }
    public static boolean isPrime(int n) {
        int flag = 0;
        for(int i = 1; i<n ; i++) {
            if(n%i == 0)
                flag++;
        }
        if(flag == 1)
            return true;
        else
            return false;
    }
}
