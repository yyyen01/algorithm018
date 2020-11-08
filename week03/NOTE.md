**<u>学习笔记</u>**

1. **<u>Recursion 递归</u>**

- Recursion is a loop.
- 自体循环
- 向下循环，再一层层的回来
- 每一层的环境都是一个拷贝
- 每一层利用函数参数来沟通
- 如何做
  - 不要人肉递归
  - generalization (find the repeat part)
  - find the formula that can apply to different level
- Template:
  - //terminator
  - process
  - drill down
  - reverse state
  - 

**<u>Divide & Conquer 分治</u>**

![image-20201108134443214](C:\Users\yyyen\AppData\Roaming\Typora\typora-user-images\image-20201108134443214.png)

**Template:**

//Terminator

- if Problem is none, process result, return

//Prepare data

- split the problem into repeatable sub problem

//conquer subproblems

- drill down

//process and generate the final result

- combine the result

//revert current state

**<u>Backtracking 回溯</u>**

枚举所有的可能性，然后再判断可不可行

用可递归同样的template