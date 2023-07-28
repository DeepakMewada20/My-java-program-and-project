import java.util.*;
public class Array_list {
    public static void main(String[] args){
        //Process1 p1=new Process1();
        Scanner sc=new Scanner(System.in);
        List<Integer>  processes = new ArrayList<>();
/*
        processes.add(new Process1(3,6,1));
        processes.add(new Process1(4,3,6));
        processes.add(new Process1(6,7,9));
        processes.remove(0);
        processes.remove(0);
        //processes.remove(0);
        System.out.println(processes.size());
*/
        for (int i=0;i<6;i++) {
            processes.add(i);
        }
        //processes.add(76);
        for (int i=0;i< processes.size();i++){
            System.out.println(processes.get(i));
        }
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
