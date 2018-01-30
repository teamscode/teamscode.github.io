---
layout: post-lesson
permalink: /learn/ap-computer-science/sorting-methods/
lesson_title: Sorting Methods
lesson_desc: Describing the implementation of basic sorting methods.
author: Jason Zhang
---

<script src="/questions.js"></script>

{% raw %}

<table>
  <tr>
    <th colspan="2">Vocab Bar</th>
  </tr>
  <tr>
    <td>Selection Sort</td>
    <td>A sort that finds the smallest unsorted value and moves it forward</td>
  </tr>
  <tr>
    <td>Insertion Sort</td>
    <td>A sort that starts from the beginning and inserts the next value in the sorted position</td>
  </tr>
</table>


This chapter will cover **selection sort** and **insertion sort**. I will walk you through step by step on coding the sorts. However, these two sorts are neither the most efficient or most quick. They are two sorts that are widely known and starting steps. Since nowadays data sets are often many gigabytes, it is very important to know good sorting methods.

The selection sort starts by sorting the front and moves to the end. It does this by scanning each unsorted value and finding the smallest value. It then takes that value and moves it to the beginning of the unsorted value. This process repeats, excluding the newly sorted value. In layman terms, this means moving the smallest values forward one by one.

Since it scans every value and repeats that n times, it starts very similarly to bubble sort. Therefore, it also has a O(n^2) notation in every case.

        public static void selectionSort(int[] nums) {

            for (int i = 0; i < nums.length; i++) {

                for (int j = i; j < nums.length; j++) {

                    /* Code */

                }

            }

        }

However, the <code>i</code> is in the inner initialization statement instead of termination, as in the bubble sort. That is because the first <code>i</code> elements will be sorted instead of the last <code>i</code> elements. Next, we need to find the minimum value in every inner cycle. We accomplish that by creating a variable which I compare to every value. We also need to store the index of the minimum, to be able to swap the values. To make sure that the minimum variable initialization is larger than the smallest value, I will initialize it as the first unsorted element.

        public static void selectionSort(int[] nums) {

            for (int i = 0; i < nums.length; i++) {

                int min = nums[i];

                int minIndex = i;

                for (int j = i; j < nums.length; j++) {

                    if (nums[j] < min) {

                        min = nums[j];

                        minIndex = j;

                    }

                }

            }

        }

The final step is switching the minimum value with the value, that is at the lowest bound, or <code>i</code>.

        public static void selectionSort(int[] nums) {

            for (int i = 0; i < nums.length; i++) {

                int min = Integer.MAX_VALUE;

                int minIndex = i;

                for (int j = i; j < nums.length; j++) {

                    if (nums[j] < min) {

                        min = nums[j];

                        minIndex = j;

                    }

                }

                int x = nums[i];

                nums[i] = nums[minIndex];

                nums[minIndex] = x;

            }

        }

That is the selection sort. It is pretty basic and slow. However, it is the best sort when you need only the smallest digits in the list, because it sorts from the smallest values first. Selection Sort’s best, average, and worst cases’ time complexity is O(n^2); this is because the program cycles through the array n times. Therefore n multiplied by n.

The next sort is insertion sort. The insertion sort also starts at the beginning. It then moves to the next value. It takes the next value and places it in the sorted position in the sorted values. Since it takes n cycles of n steps, it has the same best and average case as bubble sort and selection sort. However, in the best case the sort will only look at one entry for every cycle. Therfore, the time complexity for the best case is only O(n).

        public static void insertionSort(int[] nums) {

            for (int i = 1; i < nums.length; i++) {

                /* Code */

            }

        }

I then save the key value and the index, and for every value greater than the key, I shift right and change the index. When I find a value equal to or less than the key, I place the key into the position.

        public static void insertionSort(int[] nums) {

            for (int i = 1; i < nums.length; i++) {

                int j = i - 1;

                int key = nums[i];

                while (j >= 0 && nums[j] > key) {

                    nums[j + 1] = nums[j];

                    j--;

                }

                nums[j + 1] = key;

            }

        }

Ta da!

<h1>Lesson Quiz</h1>

<h3>1. Which sort has better time in the best case: selection sort or insertion sort?</h3>

<form>
	<div>
		<input type="radio" value="a" name="cc" onchange="check(this, 'b')">
		a. Selection Sort
	</div>
	<div>
		<input type="radio" value="b" name="cc" onchange="check(this, 'b')">
		b. Insertion Sort
	</div>
	<div>
		<input type="radio" value="c" name="cc" onchange="check(this, 'b')">
		c. Neither
	</div>
</form>

{% endraw %}

