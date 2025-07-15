package Recursion;
public class towerOfHanoi {
    public static void solve(int n ,char s, char d, char h){
        if(n==1) {
            System.out.println("plates 1 form "+s+" to "+d);
            return;
        }

        solve(n-1,s,h,d);
        System.out.println("plates "+n+" form "+s+" to "+d);
        solve(n-1,h,d,s);
    }
    public static void main(String[] args) {
        solve(3,'A','B','C');
    }
}
