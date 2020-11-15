import java.util.List;
import java.util.ArrayList;

/*
 * @lc app=leetcode id=860 lang=java
 *
 * [860] Lemonade Change
 */

// @lc code=start
class Solution {
    public boolean lemonadeChange(int[] bills) {
        boolean result = true;

        int count5 = 0;
        int count10 = 0;
        int count20 = 0;

        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 10) {
                  if (count5 == 0)  return false;
                  count5--;
                  count10++;  
            }else if (bills[i] == 20) {
                int total = 15;
                if (count10 > 0) {
                    count10--;
                    total -= 10;
                }

                int changeno = total / 5;

                if (count5 < changeno)  return false;
                count5 -= changeno;
            }
            else {
               count5++;
            }
        }

        return result;
    }
}
// @lc code=end

