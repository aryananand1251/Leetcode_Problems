package Leetcodeproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class merge_intervals {


    public static void main(String[] args) {
                int intervals[][]={{1,3},{2,6},{8,10},{15,18}};
                merge(intervals);
        int[][] newArr = merge(intervals);

        // Print the merged intervals
        System.out.println("Merged intervals:");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print("[");
            for (int j = 0; j < newArr[i].length; j++) {
                System.out.print(newArr[i][j]);
                if (j < newArr[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }






    }

             public  static  int[][] merge(int[][] intervals)
            {

                Arrays.sort(intervals,(a, b)->(a[0]-b[0]));
                List<List<Integer>>list=new ArrayList<>();
                int start=intervals[0][0];
                int end=intervals[0][1];

                for(int i=1;i<intervals.length;i++){
                    if(intervals[i][0]<=end  ){
                        if(intervals[i][1]>=end){
                            end=intervals[i][1];
                        } if(intervals[i][0]<=start){
                            start=intervals[i][0];
                        }

                    }

                    else{
                        List<Integer>ans=new ArrayList<>();

                        ans.add(start);
                        ans.add(end);
                        list.add(ans);
                        start=intervals[i][0];
                        end=intervals[i][1];
                    }
                }
                List<Integer> ans=new ArrayList<>();
                ans.add(start);
                ans.add(end);
                list.add(ans);
                System.out.println(list);
                int[][] newArr=new int[list.size()][2];
                for(int i=0;i<list.size();i++){
                    for(int j=0;j<2;j++){
                        newArr[i][j]=list.get(i).get(j);

                    }
                }

                return newArr;

            }



        }












