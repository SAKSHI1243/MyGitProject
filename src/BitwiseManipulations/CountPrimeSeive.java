package BitwiseManipulations;
public class CountPrimeSeive {
    public static int countPrime(int n){
        if(n<2) return 0;
        int []prime=new int[n];
        for (int i = 2; i<n ; i++) prime[i]=1;
        for (int i = 2; i*i<n ; i++) {
            if (prime[i]==1){
                for (int j = i*i; j <n ; j+=i) prime[j]=0;
            }
        }
        int c=0;
        for (int i = 2; i<n ; i++) {
            if(prime[i]==1) c++;
        }
        return c;
    }
    public static void main(String[] args) {
        System.out.print(countPrime(10));
    }
}