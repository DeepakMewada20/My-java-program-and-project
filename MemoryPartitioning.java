import java.util.ArrayList;
import java.util.List;
import java.lang.String;
class MemoryPartition {
    int partitionId;
    int size;
    boolean allocated;
    int processId;
    public MemoryPartition(int partitionId, int size) {
        this.partitionId = partitionId;
        this.size = size;
        this.allocated = false;
        this.processId = -1;
    }
    @Override
    public String toString() {
        return "Partition " + partitionId + ": Size=" + size + ", Allocated=" + allocated + ", Process ID=" + processId;
    }
}
class Process {
    int processId;
    int size;
    public Process(int processId, int size) {
        this.processId = processId;
        this.size = size;
    }
    @Override
    public String toString() {
        return "Process " + processId + ": Size=" + size;
    }
}
public class MemoryPartitioning {
    public static void main(String[] args) {
        List<MemoryPartition> memoryPartitions = new ArrayList<>();
        List<Process> processes = new ArrayList<>();
        // Create memory partitions
        memoryPartitions.add(new MemoryPartition(1, 100));
        memoryPartitions.add(new MemoryPartition(2, 250));
        memoryPartitions.add(new MemoryPartition(3, 200));
        memoryPartitions.add(new MemoryPartition(4, 350));
        memoryPartitions.add(new MemoryPartition(5, 150));
        // Create processes
        processes.add(new Process(1, 130));
        processes.add(new Process(2, 200));
        processes.add(new Process(3, 80));
        processes.add(new Process(4, 300));
        // Simulate memory partitioning
        bestFit(memoryPartitions, processes);
    }
    public static void bestFit(List<MemoryPartition> memoryPartitions, List<Process> processes) {
        System.out.println("Best-Fit Memory Partitioning\n");
        for (Process process : processes) {
            boolean allocated = false;
            MemoryPartition bestFitPartition = null;
            System.out.println("Allocating " + process);
            for (MemoryPartition partition : memoryPartitions) {
                if (!partition.allocated && partition.size >= process.size) {
                    if (bestFitPartition == null || partition.size < bestFitPartition.size) {
                        bestFitPartition = partition;
                    }
                }
            }
            if (bestFitPartition != null) {
                bestFitPartition.allocated = true;
                bestFitPartition.processId = process.processId;
                allocated = true;
            }
            if (!allocated) {
                System.out.println("No suitable partition found for " + process);
            }
        }
        System.out.println("\nMemory Partition Status:");
        for (MemoryPartition partition : memoryPartitions) {
            System.out.println(partition);
        }
    }
}

