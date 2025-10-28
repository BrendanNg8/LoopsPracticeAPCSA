//Brendan Ng
// 27/25

public class ExampleOne {
    public static void main(String[] args) {
        System.out.println(count_factors(24));   
        System.out.println(isPrime(5));
        System.out.println(countPrimes(24));
    }
    public static int count_factors(int n){
        int count = 0;
        int num = 1;
        while (true) {
            if (n % num == 0) {
                count ++;
            }
            if (num > 24) {
                break;
            }
            num++;
        }
        return count;
        }
    public static boolean isPrime(int n) {
        return count_factors(n) == 2;
    }
    public static int countPrimes(int n) {
        int count = 0;
        int num = 2;
        while (num <= n) {
            if (isPrime(num)) {
                count++;
            }
            num++;
        }
        return count;
    }
}
