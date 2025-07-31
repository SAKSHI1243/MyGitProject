package stacks;
public class TrappingRainWater {
   public static int trap(int []ar){
       int n= ar.length;
       int []p=new int[n];
       int []s=new int[n];
       p[0]=ar[0];
       for (int i = 1; i < p.length; i++) p[i]=Math.max(p[i-1],ar[i]);
       s[n-1]=ar[n-1];
       for (int i = n-2; i >=0 ; i--) s[i]=Math.max(s[i+1],ar[i]);
       int trapped=0;
       for(int i=0;i<n;i++) trapped+=Math.min(p[i],s[i])-ar[i];
       return trapped;
   }
   public static int optimized(int []ar){
       int n=ar.length;
       int l=0,r=n-1;
       int lmax=ar[l],rmax=ar[r];
       int res=0;
       while(l<r){
           if(lmax<=rmax){
               l++;
               lmax=Math.max(lmax,ar[l]);
               res+=lmax-ar[l];
           }
           else{
               r--;
               rmax=Math.max(rmax,ar[r]);
               res+=rmax-ar[r];
           }
       }
       return res;
   }
    public static void main(String[] args) {
        int []ar={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.print(trap(ar));
        System.out.println();
        System.out.print(optimized(ar));
    }
}