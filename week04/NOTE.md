<u>学习笔记</u>

<u>深度优先搜索、广度优先搜索的特性</u>

If the tree or map does not have specific characteristic and we need to search through the data structure:

1)make sure each node is visited and

2)only visited once.

<u>Type of search</u>

- BFS
- DFS
- Priority Search

<u>DFS</u>

Search all children nodes on particular node before going to the sibling

<u>BFS</u>

Search sibling node first then go to child node

**<u>贪心的实现、特性</u>**

- 只适用于在每一步做出最佳的决定，而这个子最佳的决定，最终能导致最后最佳的结果。
- 没有回退的功能

**<u>二分查找</u>**

要有以下的特征才能使用：

- 单调
- 上下界（bounded）
- indexing

**<u>作业：**</u>

使用二分查找，寻找一个半有序数组 [4, 5, 6, 7, 0, 1, 2] 中间无序的地方

利用二分查找来减少搜索的次数。每次找到mid 以后，

如果mid 的值比最后的值小，mid 有可能是无序开始的地方，那么就在看看前面有没有更小的值。

如果不是，那么就往mid + 1 后面找最小的值。

这样的方法是O(LogN)

public int findOutSequeceIndex(int[] nums) {

​      //use binary search to find the first index that not in sequence

​      int start = 0, end = nums.length - 1;

   while (start < end) {
        mid = (start + end) / 2;  
      

        if (nums[mid] < nums[end]) end = mid;
        else start = mid  + 1;                                   
    }   
return end;

  }

