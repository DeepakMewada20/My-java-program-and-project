public class Reverse_array {
    public static void main(String[] args) {
        int[][] array=new int[][]{
                {0,1,1},
                {1,0,0},
                {1,1,1}
        };
        for (int row=0;row<3;row++){
            int start=0,end=2;
            while ((start!=end)&&(start<end)){
                int temp=array[row][start];
                array[row][start]=array[row][end];
                array[row][end]=temp;
                start++;
                end--;
            }
        }
        for (int i=0;i<3;i++){
           for (int j=0;j<3;j++){
               System.out.print(array[i][j]+" ");
           }
            System.out.println();
        }
    }
}
