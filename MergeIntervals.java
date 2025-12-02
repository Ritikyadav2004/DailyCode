/*
Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

 

Example 1:

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
*/
import java.util.*;
public class MergeIntervals {
    
    public static  int[][] merge(int[][] arr) {
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        int currStart=arr[0][0];
        int currEnd=arr[0][1];

        // compare with rest intervals
        for(int i=1;i<arr.length;i++)
        {
            int nextStart=arr[i][0];
            int nextEnd=arr[i][1];

            // overlapinggg
            if(nextStart<=currEnd)
            {
               currEnd=Math.max(currEnd,nextEnd);
            }
            else
            {
                 ArrayList<Integer> row =  new ArrayList<>();
                row.add(currStart);
                row.add(currEnd);
                matrix.add(row);


                // updatimg intervel
                currStart=nextStart;
                currEnd=nextEnd;
            }
        }
        // adding the last elemnt 
                ArrayList<Integer> row =  new ArrayList<>();
                row.add(currStart);
                row.add(currEnd);
                matrix.add(row);



                //converting the arraylist in 2d mat
                int rows=matrix.size();
                int[][] result= new int[rows][2];
                for(int i=0;i<rows;i++)
                {
                    result[i][0]=matrix.get(i).get(0);
                    result[i][1]=matrix.get(i).get(1);
                }


                return result;
        }
        public static void main(String[] args) {
            int [][]intervals = {{1,3},{2,6},{8,10},{15,18}};
            int result[][]=merge(intervals);
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[i].length; j++) {
                    System.out.print(result[i][j]+",");
                }
                System.out.println();
            }
        }
        }