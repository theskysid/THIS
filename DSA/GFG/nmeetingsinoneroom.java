package GFG;

import java.util.ArrayList;
import java.util.Arrays;

public class nmeetingsinoneroom {
   public int maxMeetings(int start[], int end[]) {
      int n = start.length;
      int[][] meetings = new int[n][3];
      for(int i = 0; i < n; i++){
         meetings[i][0] = start[i];
         meetings[i][1] = end[i];
         meetings[i][2] = i+1; //i indexed kr diyaa bs
      }

      //what we are doing is that we are basically putting shortest meeting first and longer ones later in the meeting
      Arrays.sort(meetings, (a,b)-> {
         if(a[1] != b[1]) return a[1] - b[1]; //when end time is different which one is smaller comes first
         return a[0] - b[0]; //if they have same start time then sort them by their index
      });

      ArrayList<Integer> result = new ArrayList<>();
      int freetime = -1; //time at which the meeting is freed
      int count = 0;
      for (int[] m : meetings) {  //int[] becuase it is a 2d array
         if (m[0] > freetime) {   // start > lastEnd
            result.add(m[2]);  //store the index
            freetime = m[1];     //updating the next free time
            count++;
         }
      }
      return count;
   }
}
