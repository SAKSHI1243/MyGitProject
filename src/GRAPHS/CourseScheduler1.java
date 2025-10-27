package GRAPHS;
import java.util.*;
public class CourseScheduler1 {
    public static boolean courseScheduler(int numCourses, int[][]prerequisite){
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for (int i = 0; i < numCourses; i++) adj.add(new ArrayList<>());
        for (int i = 0; i < prerequisite.length; i++) {
            int course=prerequisite[i][0];
            int pre=prerequisite[i][1];
            adj.get(pre).add(course);
        }
        int []indegree=new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            for (int it: adj.get(i)) indegree[it]++;
        }
        Queue<Integer>q=new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i]==0) q.add(i);
        }
        int cnt=0;
        while (!q.isEmpty()){
            int node= q.poll();
            cnt++;
            for (int i : adj.get(node)) {
                indegree[i]--;
                if (indegree[i]==0) q.add(i);
            }
        }
        return cnt==numCourses;
    }
    public static void main(String[] args) {
        int numCourses=2;
        int [][]prerequisite={{1,0}};
        System.out.println(courseScheduler(numCourses,prerequisite));
        int [][]pre2={{1,0},{0,1}};
        System.out.print(courseScheduler(numCourses,pre2));
    }
}