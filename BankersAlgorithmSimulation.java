import java.util.*;
import java.lang.String;

class BankerAlgorithm {
    private int[] available;
    private int[][] maximum;
    private int[][] allocation;
    private int[][] need;
    private boolean[] finished;

    public BankerAlgorithm(int[] available, int[][] maximum, int[][] allocation) {
        this.available = available;
        this.maximum = maximum;
        this.allocation = allocation;
        this.need = new int[maximum.length][maximum[0].length];
        this.finished = new boolean[maximum.length];

        // Calculate the need matrix
        for (int i = 0; i < maximum.length; i++) {
            for (int j = 0; j < maximum[i].length; j++) {
                need[i][j] = maximum[i][j] - allocation[i][j];
            }
        }
    }

    public boolean isSafeState() {
        int[] work = Arrays.copyOf(available, available.length);
        boolean[] canFinish = new boolean[maximum.length];

        // Find an unfinished process whose needs can be satisfied
        int count = 0;
        while (count < maximum.length) {
            boolean found = false;

            for (int i = 0; i < maximum.length; i++) {
                if (!finished[i] && canProcess(i, work)) {
                    // Process i can be satisfied
                    for (int j = 0; j < work.length; j++) {
                        work[j] += allocation[i][j];
                    }

                    canFinish[i] = true;
                    finished[i] = true;
                    found = true;
                    count++;
                }
            }
            // If no process can be satisfied, the system is in an unsafe state
            if (!found) {
                return false;
            }
        }

        return true;
    }

    private boolean canProcess(int processIndex, int[] work) {
        for (int i = 0; i < work.length; i++) {
            if (need[processIndex][i] > work[i]) {
                return false;
            }
        }
        return true;
    }
}

public class BankersAlgorithmSimulation {
    public static void main(String[] args) {
        // Define the available resources
        int[] available = {3, 3, 2};

        // Define the maximum resource requirement for each process
        int[][] maximum = {
                {7, 5, 3},
                {3, 2, 2},
                {9, 0, 2},
                {2, 2, 2},
                {4, 3, 3}
        };

        // Define the current allocation of resources to each process
        int[][] allocation = {
                {0, 1, 0},
                {2, 0, 0},
                {3, 0, 2},
                {2, 1, 1},
                {0, 0, 2}
        };

        BankerAlgorithm bankerAlgorithm = new BankerAlgorithm(available, maximum, allocation);
        boolean isSafe = bankerAlgorithm.isSafeState();

        if (isSafe) {
            System.out.println("The system is in a safe state.");
        } else {
            System.out.println("The system is in an unsafe state.");
        }
    }
}
