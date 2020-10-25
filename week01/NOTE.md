学习笔记
学到了
1. 不要死磕 - 5 分钟后想不到答案，看解题的方法
2. 五毒神掌 - 有时间间隔的重复练习
3. 学习 double pointer 
	-用在 array 上去解需要在同一个Array上前后比较的问题
	- 用在两端向中间靠拢 （计算最大/最小的面积）
4. 拿到题目时
	- 看清楚题目
	- 分成小区块
	- 寻找重复性
	- 先把可能性的方法写出来，再比较时间和空间的优化性。
	- 多看学习别人的好的code
5. 程序的基础由以下组成
	- if/else
	- while
	- recursive
6. Stack 适用于 LIFO
   Queue 适用于 FIFO
   
7. 
Type,Access,Search,Insertion,Deletion, Space
Array , O(1),O(1),O(n),O(n),O(n)
Stack, O(n),O(n),O(1),O(1),O(n)
Queue, O(n),O(n),O(1),O(1),O(n)
Linked List, O(n),O(n),O(1),O(1)
Skip List,O(log n),O(log n),O(log n),O(log n)

8.分析 Queue 的源码
Queue is an interface.
It has 6 methods : add, offer, remove, poll, element, peek.
The methods below will throw exception if hits space constraint or element not found:
 - add,remove,element
The methods below will return specific value if hits space constraint or element not found:
offer,peek,poll


9.分析 Priority Queue 的源码
Priority Queue(PQ) is extending AbstractQueue.

It has a variable (used) to keep track of number of elements currently in the PQ.
It uses Array to store the elements.
It also has a Comparator used for sorting purpose.
If the constructor parameter is empty, it always initialized with 11 elements .
Else, it will initialized with the parameters pass in, e..g collections, priority queue , capacity needed.
The comparator is either derived from the input collections, or it can be specified as input parameter.


When an element is added , it first checks if the current Array size has been fully utilized.
If yes, it will create a new array with double the size of the current Array, copy the current Array into the begining of the new Array and then make this new Array as the currrent Storage Array.
If no, it will loop through the Array and find the first empty (NULL) slot and return its position index.
The new element will then insert into this new index pos in the Storage Array.
After that, it will do sorting with Comparator.
For insertion, it is a O(N) time and space operation in the worst case scenario.

When an element is removed, it loopd through the Array to find the position index of the element.
if the element is found, it moves the least child element and moving it into place.
For deletion, it is a O(N) time and space operation in the worst case scenario.

For accessing the first element, it is a O(1) time operation.

