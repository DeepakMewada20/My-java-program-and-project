public class First_come_first_serve_cpu_seduling {
    public static void main(String[] args) {
        int size=8,grand_chart_num=0,sum_tat=0,sum_wt=0;
        float average_tat,aversge_wt;
        int[] araval_time=new int[]{0,1,5,6,8,25,3,0};
        int[] burst_time=new int[]{2,2,3,4,4,9,2,3};
        int[] completion_time=new int[size];
        int[] turn_around_time=new int[size];
        int[] waiting_time=new int[size];
        for(int procees=0;procees<size;procees++){
            if(araval_time[procees]<=grand_chart_num){
                completion_time[procees] = grand_chart_num + burst_time[procees];
                grand_chart_num=completion_time[procees];
                turn_around_time[procees] = completion_time[procees] - araval_time[procees];
                waiting_time[procees] = turn_around_time[procees]-burst_time[procees];
                sum_tat=sum_tat+turn_around_time[procees];
                sum_wt=sum_wt+waiting_time[procees];
            }
            else {
                procees--;
                grand_chart_num++;
            }
        }
        average_tat=(float)sum_tat/ size;
        aversge_wt=(float)sum_wt/size;
        System.out.println("pro\t\tAT\t\tBT\t\tCT\t\tTAT\t\tWT");
        for (int procees=0;procees<size;procees++){
            System.out.print(procees+"\t\t"+araval_time[procees]+"\t\t"+burst_time[procees]+"\t\t");
            System.out.print(completion_time[procees]+"\t\t"+turn_around_time[procees]+"\t\t");
            System.out.println(waiting_time[procees]);
        }
        System.out.println("Average Turn_around_time = "+average_tat);
        System.out.println("Average Waiting time = "+aversge_wt);
    }
}
