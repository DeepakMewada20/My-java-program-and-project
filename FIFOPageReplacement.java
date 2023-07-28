import java.util.*;
public class FIFOPageReplacement {
    public static void main(String[] args) {
        int[] pageRequests = {1, 2, 3, 4, 1, 2, 5, 1, 2, 3, 4, 5}; // Page requests
        int frames = 3; // Number of frames in the memory
        simulateFIFO(pageRequests, frames);
    }
    public static void simulateFIFO(int[] pageRequests, int frames) {
        Set<Integer> pageSet = new HashSet<>();
        Queue<Integer> pageQueue = new LinkedList<>();
        int pageFaults = 0;

        System.out.println("FIFO Page Replacement Algorithm\n");
        System.out.println("Page Requests: " + Arrays.toString(pageRequests));
        System.out.println("Number of Frames: " + frames);

        for (int page : pageRequests) {
            if (!pageSet.contains(page)) {
                pageFaults++;
                if (pageSet.size() == frames) {
                    int removedPage = pageQueue.poll();
                    pageSet.remove(removedPage);
                }
                pageSet.add(page);
                pageQueue.offer(page);
            }
            System.out.println("Page " + page + ": " + pageSet);
        }
        System.out.println("\nPage Faults: " + pageFaults);
    }
}

