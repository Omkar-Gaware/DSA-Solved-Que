import java.util.*;

public class F_Job_sequencing {
    public static void main(String[] args) {
        int jobinfo[][] = {{1,4,20}, {2,1,10}, {3,1,40}, {4,1,30}};

        Arrays.sort(jobinfo, Comparator.comparingDouble(o -> o[2]));
        

        ArrayList<Integer> ans = new ArrayList<>();

        int time = 0;
        int No_of_jobs = 0;
        int salary = 0;

        for(int i=jobinfo.length-1; i>=0; i--){
            if (jobinfo[i][1] > time) {
                ans.add(jobinfo[i][0]);
                No_of_jobs++;
                salary+= jobinfo[i][2];
                time++;
            }
        }

        System.out.println("Maximum Salary of Jobs Are "+ salary);
        System.out.println("Maximum no of Jobs :"+No_of_jobs);
        System.out.println(ans);

    }
}
