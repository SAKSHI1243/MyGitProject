package GRAPHS;
import java.util.*;
public class CourseScheduler2 {
    public static int[] canFinish(int numCourses, int [][]prerequisites){
        ArrayList<ArrayList<Integer>>adj= new ArrayList<>();
        for (int i = 0; i <numCourses ; i++) adj.add(new ArrayList<>());
        for (int []pair:prerequisites){
            int course=pair[0],pre=pair[1];
            if(course>=numCourses || pre>=numCourses){
                System.out.println(0+" ");
                return new int[0];
            }
        }
        for (int i = 0; i < prerequisites.length; i++) {
            int course=prerequisites[i][0],pre=prerequisites[i][1];
            if(pre<numCourses && course<numCourses) adj.get(pre).add(course);
        }
        int []indegree=new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            for (int it:adj.get(i)) indegree[it]++;
        }
        Queue<Integer>q=new LinkedList<>();
        for (int i = 0; i <numCourses ; i++) {
            if (indegree[i]==0) q.add(i);
        }
        int []topo=new int[numCourses];
        int i=0;
        while (!q.isEmpty()){
            int node=q.poll();
            topo[i++]=node;
            for (int it:adj.get(node)) {
                indegree[it]--;
                if (indegree[it]==0) q.add(it);
            }
        }
        if(i!=numCourses){
            System.out.print(0+" ");
            return new int[0];
        }
        return topo;
    }
    public static void main(String[] args) {
        int numCourses=4;
        int [][]prerequisites={{1,0},{2,1},{3,2}};
        int []ans=canFinish(numCourses,prerequisites);
        for (int i:ans) System.out.print(i+" ");
        System.out.println();
        int [][]pre2={{1,0},{2,0},{3,1},{3,2}};
        int []x=canFinish(4,pre2);
        for (int i:x) System.out.print(i+" ");
        System.out.println();
        int [][] pre3 = {{0,1},{1,2},{2,0}};
        int [] y = canFinish(3, pre3);
        for(int n : y) System.out.print(n + " ");
    }
}