---
layout: post-lesson
permalink: /learn/ap-computer-science/sorting-and-searching/
lesson_title: Sorting and Searching
lesson_desc: An introduction to the concepts and terms of sorting and searching.
author: Jason Zhang
---

<script src="/questions.js"></script>

{% raw %}

<table>
  <tr>
    <th colspan="2">Vocab Bar</th>
  </tr>
  <tr>
    <td>Sorting</td>
    <td>The act of re-arranging an array or list to be sorted.</td>
  </tr>
  <tr>
    <td>Searching</td>
    <td>The act of finding a specified value in an array or list.</td>
  </tr>
  <tr>
    <td>Big O Notation</td>
    <td>A notation used to represent the time used by an algorithm.</td>
  </tr>
  <tr>
    <td>Bubble Sort</td>
    <td>A sort that systematically moves the largest value to back one at a time.</td>
  </tr>
</table>


It is very important for programmers to be able to efficiently **sort** and **search**. And it is very important programmers are able to do this quickly. In the modern age of big data, data samples can reach terabytes, and the programmers must be able to manage them. So how do they do it?

In this lesson and the following chapters, we will cover sorting and searching. Sorting is the act of re-arranging the values in an array or list, so that the array is sorted in ascending order. We will cover bubble sort, selection sort, insertion sort, mergesort, and quicksort in this course.

Searching is the act of finding the index of a specified value in an array or list. We will cover sequential search and binary search in this course.

Before we dive-in the sorts and searches, we should first cover how we judge the effectiveness of a algorithm; this is Big O Notation. Big O Notation is a notation that is used to represent the upper limit of time used by algorithms, using only the letters O and n. For example, imagine you need to look through n entries. Big O Notation for the program would be O(n) because you’re examining n entries once.

The O is a symbol that represents that the number is in Big O notation. Usually after you calculate the time, you add O to the front. All other constants are dropped with Big O notation, things like O(100n) would be simplified simply to O(n).

The n represents the the number of elements. It’s Big O notation would be O(n). O is to represent Big O Notation, and (n) is because it reviews every element once.

        public static void printArray(int[] nums) {

            for (int i = 0; i < nums.length; i++) {

                System.out.println(nums[i]);

            }

        }

Sometimes you’ll need nested for loops in your code. A good usage for nested for loops is traversing a 2D array. Take a look at the code below:

        public static void print2DArray(int[][] nums) {

            for (int i = 0; i < nums.length; i++) {

                for (int j = 0; j < nums[i].length; j++) {

                    System.out.println(nums[i][j]);

                }

            }

        }

As you can see, the array has n entries. But we assume for every entry, being an array, has n entries. Therefore the function prints n values n times. So the Big O notation is O(n^2).

        public static void printArray(int[] nums) {

            for (int i = 0; i < nums.length; i++) {

                System.out.println(nums[i]);

            }

        }

        public static void printArrayTwice(int[] nums) {

            for (int i = 0; i < nums.length; i++) {

                System.out.println(nums[i]);

                System.out.println(nums[i]);

            }

        }

To us, it seems clear that <code>printArrayTwice</code> will take twice as long as <code>printArray</code>. But they actually have the same time in Big O notation. This is because O(2n) is actually simplified to just O(n).

The functions above, however, neither sort nor search. The <code>printArray</code> does function similarly to the test if an array is sorted. So we will first program that. When checking whether or not a list is sorted, you need to check whether it is the ascending order, and to do that make sure, for each value the value in front is greater than the original value. So first we need to make sure the code runs for every data point except the last one. Because on the last data point, you can’t look further.

        public static boolean isSorted(int[] nums) {

            for (int i = 0; i < nums.length; i++) {

                /* Code */

            }

        }

Next we need to check whether or not the next value is smaller than the value we are at. If the array is fully sorted in ascending order, the if loop will never be executed.

        public static boolean isSorted(int[] nums) {

            for (int i = 0; i < nums.length; i++) {

                if (nums[i + 1] < nums[i]) {

                    /* Code */

                }

            }

        }

The code should, if the numbers are all ascending it, return <code>true</code>, but if even a single one isn’t it should return <code>false</code>. If we just make sure nothing is <code>false</code>, we can return <code>true</code>.

        public static boolean isSorted(int[] nums) {

            for (int i = 0; i < nums.length - 1; i++) {

                if (nums[i + 1] < nums[i]) {

                    return false;

                }

            }

            return true;

        }

And that is the algorithm to check whether a list is sorted. Like the previous algorithm it has O(n) evaluation. Next we will code the Bubble Sort. The bubble sort is the basic sort everybody learns.

In bubble sort you examine each element, n times, and if an element is larger than the next, you switch them. Each round moves the largest unsorted value to the last index minus the amount of cycles. After n cycles the entire list is sorted. So the first component is writing two for loops, one to evaluate every n values, one to repeat that n times. Therefore, the Big O Notation is O(n^2) in the worst case. However, if the list is already sorted ,no swapping is necessary and the loop cycles n times, making the best case is O(n). The average case is however, O(n^2). In general, O(n^2) is the worst possible searching time.

        public static void bubbleSort(int[] nums) {

            for (int i = 0; i < nums.length; i++) {

                for (int j = 0; j < nums.length - i; j++) {

                    /* Code */

                }

            }

        }

The inner loop’s termination clause is <code>nums.length - i</code> because every loop sorts the largest value to the end. Therefore, there will be <code>i</code> sorted indexes at the end.

Next we need to check on every index whether the value is larger than the value of the next.

        public static void bubbleSort(int[] nums) {

            for (int i = 0; i < nums.length; i++) {

                for (int j = 0; j < nums.length - i - 1; j++) {

                    if (nums[j + 1] > nums[j]) {

                        /* Code */

                    }

                }

            }

        }

As you may have noticed, I changed the inner termination clause by adding <code>-1</code>. That is because if I hadn’t, <code>j + 1</code> would exceed the bounds during the first iteration of the outer loop and last iteration of the inner loop.

The final step is to switch the values.

        public static void bubbleSort(int[] nums) {

            for (int i = 0; i < nums.length; i++) {

                for (int j = 0; j < nums.length - i - 1; j++) {

                    if (nums[j + 1] < nums[j]) {

                        int temp = nums[j];

                        nums[j] = nums[j + 1];

                        nums[j + 1] = temp;

                    }

                }

            }

        }

That is the final bubble sort algorithm. It is a start, but we will also cover two more sorts. And those sorts will be more and more complex.

{% endraw %}

