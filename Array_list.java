import java.util.*;
import java.lang.String;
public class Array_list {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Process1>  processes = new ArrayList<>();
        processes.add(new Process1(43,54,23));
        processes.add(new Process1(43,54,23));

        for (int i=0;i<processes.size();i++){
            System.out.println(processes.get(i).burst_time);
        }


        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());

        for (int i=0;i< list.size();i++){
            for (int j=0;j<2;j++){
                list.get(i).add(i+j);
            }
        }

        System.out.println(list); //print all list
        System.out.println(list.get(0)); //print selected index list
        System.out.println(list.get(1).get(0)); //print single element in list
    }
}
class Process1 {
    int processId;
    int cpuBurstTime;
    int burst_time;
    public Process1(int processId, int cpuBurstTime,int burst_time) {
        this.processId = processId;
        this.cpuBurstTime = cpuBurstTime;
        this.burst_time=burst_time;
    }
}

class Execution1 {
    int processId;
    int startTime;
    int endTime;

    public Execution1(int processId, int startTime, int endTime) {
        this.processId = processId;
        this.startTime = startTime;
        this.endTime = endTime;
    }
}
