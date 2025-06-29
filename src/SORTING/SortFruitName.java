package SORTING;
public class SortFruitName {
    public static void main(String[] args) {
        String []fruits={"papaya","lime","watermelon","apple","mango","kiwi"};
        for (int i = 0; i < fruits.length; i++) {
            int minIdx=i;
            for (int j = i+1; j < fruits.length ; j++) {
                if (fruits[j].compareTo(fruits[minIdx])<0) minIdx=j;
            }
            String temp= fruits[i];
            fruits[i]=fruits[minIdx];
            fruits[minIdx]=temp;
        }
        for (int i = 0; i < fruits.length; i++) System.out.print(fruits[i]+" ");
    }
}