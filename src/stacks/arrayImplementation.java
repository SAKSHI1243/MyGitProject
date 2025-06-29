package stacks;
public class arrayImplementation {
    public static class Stack{
        int []ar= new int[5];
        int idx=0;
         void push(int x){
             if(isFull()){
                 System.out.println("stack is full");
                 return;
             }
        ar[idx]=x;
        idx++;
        }
        int peek(){
             if(isEmpty()){
                 System.out.println("stack is empty");
                 return -1;
             }
             else{
                 return ar[idx-1];
             }
        }
        int pop(){
             if(isEmpty()){
                 System.out.println("stack is empty");
                 return -1;
             }
             else{
                 int top=ar[idx-1];
                 ar[idx-1]=0;
                 idx--;
                 return top;
             }
        }
        int size(){
             return idx;
        }
        int capacity(){
             return ar.length;
        }
        boolean isEmpty(){
             if(size()==0) return true;
             else return false;
        }
        boolean isFull(){
            if(size()==ar.length) return true;
            else return false;
        }
        void display(){
             for(int i=0;i<idx;i++){
                 System.out.print(ar[i]+" ");
             }
             System.out.println();
        }
    }
    public static void main(String[] args) {
        Stack st= new Stack();
        st.push(3);
       st.display();
        st.push(4);
        st.display();
        st.push(9);
        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();
    }
}