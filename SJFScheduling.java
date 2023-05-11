import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SJFScheduling {
    public static void main(String[] args) {
        // Create a list of processes with process ID and CPU burst time
        List<Process> processes = new ArrayList<>();
        processes.add(new Process(1, 10));
        processes.add(new Process(2, 5));
        processes.add(new Process(3, 8));
        processes.add(new Process(4, 4));

        // Call the SJF scheduling algorithm to schedule the processes
        List<Execution> executionOrder = sjfScheduling(processes);
        for (Execution e: executionOrder) {
            System.out.println(e.processId+" "+e.startTime+" "+e.endTime);
        }

        // Print the execution order and the average waiting time and turnaround time
        System.out.println("Process Execution Order:");
        for (Execution execution : executionOrder) {
            System.out.println("Process " + execution.processId + " executed from time " + execution.startTime
                    + " to time " + execution.endTime);
        }
        double avgWaitingTime = calculateAverageWaitingTime(executionOrder);
        System.out.println("Average Waiting Time: " + avgWaitingTime);
        double avgTurnaroundTime = calculateAverageTurnaroundTime(executionOrder);
        System.out.println("Average Turnaround Time: " + avgTurnaroundTime);
    }

    private static List<Execution> sjfScheduling(List<Process> processes) {
        List<Execution> executionOrder = new ArrayList<>();
        int currentTime = 0;
        int numProcesses = processes.size();

        // Sort the processes by their CPU burst time
        Collections.sort(processes, (p1, p2) -> Integer.compare(p1.cpuBurstTime, p2.cpuBurstTime));
        for (Process p :processes){
            System.out.println(p.processId+" "+p.cpuBurstTime);
        }

        // Execute the processes in order of their CPU burst time
        for (Process process : processes) {
            Execution execution = new Execution(process.processId,currentTime,currentTime + process.cpuBurstTime);
            executionOrder.add(execution);
            //System.out.println(executionOrder);
            currentTime += process.cpuBurstTime;
        }

        return executionOrder;
    }

    private static double calculateAverageWaitingTime(List<Execution> executionOrder){
        double totalWaitingTime = 0;
        System.out.println("Waiting time");
        for (int i = 0; i < executionOrder.size(); i++) {
            Execution execution = executionOrder.get(i);
            int waitingTime = 0;
            for (int j = 0; j < i; j++) {
                waitingTime += executionOrder.get(j).endTime - executionOrder.get(j).startTime;
            }
            totalWaitingTime += waitingTime;
            System.out.println(totalWaitingTime);
        }
        return totalWaitingTime / executionOrder.size();
    }
    private static double calculateAverageTurnaroundTime(List<Execution> executionOrder) {
        double totalTurnaroundTime = 0;
        for (Execution execution : executionOrder) {
            int turnaroundTime = execution.endTime - execution.startTime;
            totalTurnaroundTime += turnaroundTime;
        }
        return totalTurnaroundTime / executionOrder.size();
    }
}

class Process {
    int processId;
    int cpuBurstTime;

    public Process(int processId, int cpuBurstTime) {
        this.processId = processId;
        this.cpuBurstTime = cpuBurstTime;
    }
}

class Execution {
    int processId;
    int startTime;
    int endTime;

    public Execution(int processId, int startTime, int endTime) {
        this.processId = processId;
        this.startTime = startTime;
        this.endTime = endTime;
    }
}

