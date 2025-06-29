package stacks;
import java.util.*;
public class StackOperations {
    //copy elements of one string to another
    public static void copyElements(java.util.Stack<Integer> s){
    java.util.Stack<Integer> s2=new java.util.Stack<>();
    java.util.Stack<Integer> s3=new java.util.Stack<>();
    System.out.println("original string:");
    System.out.println(s);
    System.out.println("reversed string:");
    while(s.size()>0){
        int y=s.pop();
        s2.push(y);
    }
    System.out.println(s2);
    System.out.println("copied string:");
    while (s2.size()>0){
        int x= s2.pop();
        s3.push(x);
        s.push(x);
    }
    System.out.println(s3);
    }
    //push element in the bottom of string recursively
    public static void pushAtBottom(Stack<Integer>s, int x){
        if(s.size()==0) {
            s.push(x);
            return;
        }
        int top= s.pop();
        pushAtBottom(s,x);
        s.push(top);
    }
    //recursively reverse the stack
    public static void reverseRecursive(Stack<Integer> s){
    if (s.size()==0) return;
    int x=s.pop();
    reverseRecursive(s);
    pushAtBottom(s,x);
    }
    //remove elements from any index
    public static void deleteElement(Stack<Integer> s, int idx){
        Stack<Integer> temp=new Stack<>();
        for(int i=1;i<=s.size();i++){
            if(i==idx) s.pop();
            else temp.push(s.pop());
        }
        while(temp.size()>0) s.push(temp.pop());
    }
    public static void main(String[] args) {
        java.util.Stack<Integer> s=new java.util.Stack<>();
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of elements: ");
        int n=sc.nextInt();
        System.out.println("enter the elements:");
        for(int i=1;i<=n;i++){
            int x=sc.nextInt();
            s.push(x);
        }
        copyElements(s);
        pushAtBottom(s,0);
        System.out.println(s);
        reverseRecursive(s);
        System.out.println(s);
        deleteElement(s,2);
        System.out.println(s);
    }
}
