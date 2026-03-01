package Leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Problem3852 {
   public int[] minDistinctFreqPair(int[] nums) {
      HashMap<Integer, Integer> map = new HashMap<>();
      for(int num : nums){
         map.put(num, map.getOrDefault(num, 0)+1);
      }

      List<Integer> val = new ArrayList<>(map.keySet());
      Collections.sort(val);

      for(int i = 0; i<val.size(); i++){
         for(int j = i+1; j <val.size(); j++){
            int x = val.get(i);
            int y = val.get(j);

            if(!map.get(x).equals(map.get(y))){
               return new int[]{x,y};
            }
         }
      }
      return new int[]{-1,-1};
   }
}
