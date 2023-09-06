import java.util.*;
import java.lang.String;
public class Sortest_job_first {
    float average_tat = 0, average_wt = 0;

    public static void main(String[] args) {
        Processs p = new Processs(0, 0, 0);
        List<Time> timing = new ArrayList<>();
        List<Processs> processes = new ArrayList();
        Sortest_job_first sjf = new Sortest_job_first();

        processes.add(new Processs(1, 1, 6));
        processes.add(new Processs(2, 3, 3));
        processes.add(new Processs(3, 4, 5));
        processes.add(new Processs(4, 7, 3));
        processes.add(new Processs(5, 4, 9));
        sort(processes);
        sjf.calculetion(processes, timing);
        sjf.print(processes, timing);
    }

    static void sort(List<Processs> processses) {
        int temp;
        for (int i = 0; i < processses.size() - 1; i++) {
            for (int j = i + 1; j < processses.size(); j++) {
                if (processses.get(i).burest_time > processses.get(j).burest_time) {
                    temp = processses.get(i).process_id;
                    processses.get(i).process_id = processses.get(j).process_id;
                    processses.get(j).process_id = temp;
                    temp = processses.get(i).aroval_time;
                    processses.get(i).aroval_time = processses.get(j).aroval_time;
                    processses.get(j).aroval_time = temp;
                    temp = processses.get(i).burest_time;
                    processses.get(i).burest_time = processses.get(j).burest_time;
                    processses.get(j).burest_time = temp;
                }
            }
        }
    }
    void print(List<Processs> processes, List<Time> timing) {
        System.out.println("Sortest job first CPU seduling");
        System.out.println("P.\t\tAT\t\tBT\t\tCT\t\tTAT\t\tWT");
        for (int i = 0; i < processes.size(); i++) {
            System.out.print(processes.get(i).process_id + "\t\t" + processes.get(i).aroval_time + "\t\t");
            System.out.print(processes.get(i).burest_time + "\t\t");
            System.out.print(timing.get(i).complition_time + "\t\t" + timing.get(i).turn_around_time + "\t\t");
            System.out.println(timing.get(i).waiting_time);
        }
        System.out.println("Average Turn Around Time = " + average_tat);
        System.out.println("Average Waiting Time = " + average_wt);
    }

    void calculetion(List<Processs> processes, List<Time> timing) {
        int sum_of_turn_around_time = 0, sum_of_waiting_time = 0;
        int grand_chart_num = 0;
        for (int i = 0; i < processes.size(); i++) {
            int complition_time, turn_around_time, waiting_time;
            if (processes.get(i).aroval_time <= grand_chart_num) {
                complition_time = processes.get(i).burest_time + grand_chart_num;
                grand_chart_num = complition_time;
                turn_around_time = complition_time - processes.get(i).aroval_time;
                waiting_time = turn_around_time - processes.get(i).burest_time;
                timing.add(new Time(complition_time, turn_around_time, waiting_time));
                sum_of_turn_around_time += timing.get(i).turn_around_time;
                sum_of_waiting_time += timing.get(i).waiting_time;
            } else {
                i--;
                grand_chart_num++;
            }
        }
        average_tat = (float) sum_of_turn_around_time / processes.size();
        average_wt = (float) sum_of_waiting_time / processes.size();
    }

}
class Time{
    int complition_time;
    int turn_around_time;
    int waiting_time;
    Time(int complition_time,int turn_around_time,int waiting_time){
        this.complition_time=complition_time;
        this.turn_around_time=turn_around_time;
        this.waiting_time=waiting_time;
    }
}
class Processs{
    int process_id;
    int aroval_time;
    int burest_time;

    Processs(int process_id, int aroval_time, int burest_time){
        this.process_id=process_id;
        this.aroval_time=aroval_time;
        this.burest_time=burest_time;
    }
}

