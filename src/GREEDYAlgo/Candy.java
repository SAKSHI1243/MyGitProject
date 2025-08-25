package GREEDYAlgo;
public class Candy {
    public static int findCandies(int []ratings){
        int []res=new int[ratings.length];
        for (int i=0;i< ratings.length;i++) res[i]=1;
        int candy=0;
        for(int i=1;i<ratings.length;i++){
            if(ratings[i]>ratings[i-1]) res[i]=res[i-1]+1;
        }
        for (int j = ratings.length-2; j >=0 ; j--) {
            if(ratings[j]>ratings[j+1]) res[j]=Math.max(res[j],res[j+1]+1);
        }
        for (int x:res) candy+=x;
        return candy;
    }
    public static void main(String[] args) {
        int []ratings={1,0,2};
        System.out.print(findCandies(ratings));
    }
}