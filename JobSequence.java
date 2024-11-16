
import Recursion.Array;
import java.util.*;

public class JobSequence {
     static class job {
          int deadline;
          int profit;
          int id;

          public job(int i, int p, int d) {
               id = i;
               deadline = d;
               profit = p;
          }
     }

     public static void main(String args[]){
          int jobInfo[][]={{4,20},{1,10},{1,40},{1,30}};
          ArrayList<Integer>job=new ArrayList<>();
          for(int i=0;i<jobInfo.length();i++){
               job.add(new ,job(jobInfo[i][0],jobInfo[i][1]));

          }
          Collection.sort(job,(obj1,obj2) ->obj2.profit-obj1.profit);
          ArrayList <Integer> seq=new ArrayList<>();
          int time=0;
          for(int i=0;i<job.size();i++){
               job curr=job.get(i);
               if(curr.deadline>time){
                    seq.add(curr.id);
                    time++;
               }
          }
          System.out.println("max job="+ seq.size()+" ");
          for(int i=0;i<seq.size();i++){
               System.out.print(seq.get(i)+" ");
          }
          System.out.println();

     }
}
