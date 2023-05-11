public class Binary_search_using_recursion {
    static int search(int arr[],int target,int start,int end){
        if(start>end){
            return -1;
        }
        int m=start+(end-start)/2;
        if(arr[m]==target){
            return m;
        }
        if (arr[m]<target){
            return search(arr,target,m+1,end);
        }
        return search(arr,target,start,m-1);
    }
    public static void main(String[] args) {
        int[] arr=new int[]{2,4,6,7,8,9,12,34,56,78,89};
        int target=12;
        int n= search(arr,target,0, arr.length);
        System.out.println(n);

    }
}
