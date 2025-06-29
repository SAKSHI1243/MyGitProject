package ARRAYS;
public class ZeroMatrix {
   public static void setZeros(int [][]nums){
       int m=nums.length;
       int n=nums[0].length;
       boolean []row=new boolean[m];
       boolean []col= new boolean[n];
       for (int i = 0; i <m ; i++) {
           for (int j = 0; j < n; j++) {
               if(nums[i][j]==0){
                   row[i]=true;
                   col[j]=true;
               }
           }
       }
       for (int i = 0; i < m; i++) {
           for (int j = 0; j < n; j++) {
               if(row[i]||col[j]) nums[i][j]=0;
           }
       }
   }
    public static void main(String[] args) {
       int [][]nums={{1,0,1},{1,1,1},{1,1,1}};
       setZeros(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j <nums[0].length ; j++) {
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }
}