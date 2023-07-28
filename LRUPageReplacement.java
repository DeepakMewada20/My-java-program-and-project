import java.util.*;
public class LRUPageReplacement {
    public static void main(String[] args) {
        int[] pageRequests = {1, 2, 3, 4, 1, 2, 5, 1, 2, 3, 4, 5}; // Page requests
        int frames = 3; // Number of frames in the memory
        simulateLRU(pageRequests, frames);
    }
    public static void simulateLRU(int[] pageRequests, int frames) {
        List<Integer> pageList = new ArrayList<>();
        Set<Integer> pageSet = new HashSet<>();
        int pageFaults = 0;
        System.out.println("LRU Page Replacement Algorithm\n");
        System.out.println("Page Requests: " + Arrays.toString(pageRequests));
        System.out.println("Number of Frames: " + frames);
        for (int page : pageRequests) {
            if (!pageSet.contains(page)) {
                pageFaults++;
                if (pageList.size() == frames) {
                    int leastRecentlyUsedPage = pageList.get(0);
                    pageList.remove(0);
                    pageSet.remove(leastRecentlyUsedPage);
                }
                pageList.add(page);
                pageSet.add(page);
            } else {
                pageList.remove((Integer) page);
                pageList.add(page);
            }
            System.out.println("Page " + page + ": " + pageList);
        }
        System.out.println("\nPage Faults: " + pageFaults);
    }
}

