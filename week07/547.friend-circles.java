/*
 * @lc app=leetcode id=547 lang=java
 *
 * [547] Friend Circles
 */

// @lc code=start
class Solution {
    class UnionFind {
        int count = 0;
        private int[] parent;

        public UnionFind(int n) {
            count = n;
            parent = new int[n];
            for (int i = 0; i < parent.length; i++) {
                parent[i] = i;
            }
        }

        public int find(int p) {
            while (p != parent[p]) {
                parent[p] = parent[parent[p]];
                p = parent[p];
            }
            return p;
        }

        public void union(int p, int q) {
            int rootP = find(p);
            int rootQ = find(q);

            if (rootP == rootQ) return;
            parent[rootP] = rootQ;
            count--;
        }
    }
    public int findCircleNum(int[][] M) {
        UnionFind union = new UnionFind(M.length);

        for (int i = 0; i < M.length - 1; i++) {
            for (int j = i; j < M.length; j++) {
                if (M[i][j] == 1) union.union(i,j);
            }
            
        }
        return union.count;
    }
}
// @lc code=end

