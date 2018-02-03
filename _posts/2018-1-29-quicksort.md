---
layout: post-lesson
permalink: /learn/ap-computer-science/quicksort/
lesson_title: Quicksort
lesson_desc: Creating and analyzing the quicksort sorting method.
author: Jason Zhang
---

<script src="/questions.js"></script>

{% raw %}

The **Quick Sort** is perhaps one of the quickest and most complex searching algorithms. It first selects a pivot - I will use a random index as the pivot. Then it holds an imaginary "partition index", and cycles through the list. Every value less than the pivot value should be moved to the left, and every value more than the pivot value should be moved to the right. Finally, insert the pivot into the partition position, and quicksort the two sublists (which are the values to the left of the partition and the values to the right of the partition).

First, we need to write the headers. This specific sort needs two methods: one to divide it up, and one to sort the sublist.

        public static void quicksort(int[] nums, int low, int high) {

            /* Code */

        }

        public static int partition(int[] nums, int low, int high) {

            /* Code */

        }

The quicksort function first needs to check whether the <code>low</code> value is less than the <code>high</code> value. If so, then it must find the partition and quicksort everything left and right of it.

        public static void quicksort(int[] nums, int low, int high) {

            if (low < high) {

                int part = partition(nums, low, high);

                quicksort(nums, low, part - 1);

                quicksort(nums, part + 1, high);

            }

        }

The partition function must first select a pivot. For this, it’s best to choose a value between <code>low</code> and <code>high</code> randomly, and switch it with the value at <code>high</code> - to keep it out of the sort. Next, it needs to initialize an integer at the lower bound.

        public static int partition(int[] nums, int low, int high) {

            Random rand = new Random();

            int pivotIndex = low + rand.nextInt(high - low + 1);

            int pivot = nums[pivotIndex];

            int temp = nums[pivotIndex];

            nums[pivotIndex] = nums[high];

            nums[high] = temp;

            int i = low;

        }

After that, the function needs to loop through each and swap values lower than the partition with the index <code>i</code>, and increment <code>i</code>.

        public static int partition(int[] nums, int low, int high) {

            Random rand = new Random();

            int pivot = nums[low + rand.nextInt(high - low + 1)];

            int temp = nums[pivotIndex];

            nums[pivotIndex] = nums[high];

            nums[high] = temp;

            int i = low;

            for (int j = low; j < high; j++) {

                if (nums[j] <= pivot) {

                    int temp = nums[i];

                    nums[i] = nums[j];

                    nums[j] = temp;

                    i++;

                } 

            }

        }

Finally, swap the pivot and <code>i</code>, and <code>return i + 1</code>.

        public static int partition(int[] nums, int low, int high) {

            Random rand = new Random();

            int pivotIndex = low + rand.nextInt(high - low + 1)

            int pivot = nums[pivotIndex];

            int temp = nums[pivotIndex];

            nums[pivotIndex] = nums[high];

            nums[high] = temp;

            int i = low;

            for (int j = low; j < high; j++) {

                if (nums[j] <= pivot) {

                    int temp = nums[i];

                    nums[i] = nums[j];

                    nums[j] = temp;

                    i++;

                }

                int temp = nums[i + 1];

                nums[i + 1] = nums[high];

                nums[high] = temp;

                return i + 1;

            }

        }

There you have it. The quicksort has a best case time complexity of O(n log(n)) and a worse case time complexity of O(n^2). It is very efficient, beating selection sort, insertion sort, and bubble sort. However, in the best case quicksort still ties mergesort. 

<h1>Lesson Quiz</h1>

<h3>1. The pivot must be the last element. (true/false)</h3>

<form>
	<div>
		<input type="radio" value="a" name="cc" onchange="check(this, 'b')">
		a. true
	</div>
	<div>
		<input type="radio" value="b" name="cc" onchange="check(this, 'b')">
		b. false
	</div>
</form>

{% endraw %}