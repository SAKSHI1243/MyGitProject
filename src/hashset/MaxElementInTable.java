package hashset;
import java.util.*;
public class MaxElementInTable {
    public int maxNumOnTable(int [] bag){
        HashSet<Integer> table= new HashSet<>();
        int max=0;
        for(int i:bag){
            int num=bag[i];
            if(table.contains(num)) table.remove(num);
            else table.add(num);
            max = Math.max(max, table.size());
        }
        return max;
    }
    public static void main(String[] args) {
        MaxElementInTable obj= new MaxElementInTable();
        int []ar={2,1,1,3,2,3};
        System.out.println(obj.maxNumOnTable(ar));
    }
}