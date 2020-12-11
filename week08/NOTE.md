学习笔记

在某些情况，发现位云算可以更快，例如 / 2,检查是单/双数。

原来排序有很多种，重要是将时间降到O(nlogn)

**各种初级排序代码**

##### <u>冒泡排序（Bubble Sort）</u>

  public void bubbleSort(int[] num) {

​    for (int i = 0; i < num.length - 1; i++) {

​      for (int j = 1; j < num.length; j++) {

​        if (num[j] < num[j - 1]) {

​          int temp = num[j - 1]; num[j - 1] = num[j]; num[j] = temp;

​        }

​      }

​    }

  }



##### <u>选择排序（Selection Sort）</u>

  public void selectionSort(int[] num){

​    int minIndex = 0;

​    for (int i = 0; i < num.length; i++) {

​      minIndex = i;

​      for (int j = i + 1; j < num.length; j++) {

​        if (num[j] < num[minIndex]) minIndex = j;        

​      }

​      int temp = num[i]; num[i] = num[minIndex]; num[minIndex] = temp;

​    }

  }

##### **<u>插入排序（Insertion Sort）</u>**

  public void insertionSort(int[] num) {

​    int preIndex = 0, current = 0;

​    for (int i = 1; i < num.length; i++) {

​      preIndex = i - 1;

​      current = num[i];

​      while (preIndex >=0 && num[preIndex] > current) {

​        num[preIndex + 1] = num[preIndex--];        

​      }

​      num[preIndex + 1] = current;

​    }

  }