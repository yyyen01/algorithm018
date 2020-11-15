import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode id=874 lang=java
 *
 * [874] Walking Robot Simulation
 */

// @lc code=start
class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {        
        //dir = 0 reps north ,1-east, 2-south, 3 - west
        int max = 0, x = 0, y = 0, dir = 0;
        //direction to move a step in each direction (north,east,south,west)
        int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

        Set<String> set = new HashSet<>();

        for (int[] obs : obstacles) {
            set.add(obs[0]+ ","+ obs[1]);
        }

        for (int move : commands) {
            if (move == -1) dir = dir == 3? 0 : dir + 1;
            else if (move == -2) dir = dir == 0? 3 : dir - 1;
            else {
                int[] tmp = dirs[dir];
                while (move-- > 0 && !set.contains((x + tmp[0]) + "," + (y + tmp[1]))) {
                    x += tmp[0];
                    y += tmp[1];
                }
                max = Math.max(max, x * x + y * y);
            }
        }

        return max;
          }
          public static void main(String[] args) {
            int[] commands = new int[] {4,-1,4,-2,4};
            int[][]  obstacles = new int[][] {{2,4}};
            Solution s = new Solution();
            System.out.println(" output :"+ s.robotSim(commands, obstacles));
           
        }
}
          


  

// @lc code=end

