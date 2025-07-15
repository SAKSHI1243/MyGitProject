package Recursion;
class LargestNumberAfterKSwap{
    public static String max="";
    public static void findMaximum(String string,int k, int idx){
        if (k == 0 || idx == string.length()) return;
        char maxDig=string.charAt(idx);

        for (int i = idx+1; i <string.length() ; i++) {
            if(string.charAt(i)>maxDig) maxDig=string.charAt(i);
        }
        if(maxDig==string.charAt(idx)){
            findMaximum(string,k,idx+1);
            return;
        }
        for (int i = idx; i <string.length() ; i++) {
            if(maxDig==string.charAt(i)){
                String swapped=swap(string,idx,i);
                if(swapped.compareTo(max)>0) max=swapped;
                findMaximum(swapped,k-1,idx+1);
            }
        }
    }
    public static String swap(String string, int i, int j){
        char []ar=string.toCharArray();
        char temp=ar[i];
        ar[i]=ar[j];
        ar[j]=temp;
        return new String(ar);
    }
    public static final String findMaximumAfterSwap(String string, int k){
        max=string;
        findMaximum(string,k,0);
        return max;
    }
    public static void main(String[] args) {
        System.out.print(findMaximumAfterSwap("243",2));
    }
}