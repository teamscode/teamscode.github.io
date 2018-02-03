---
layout: post-lesson
permalink: /learn/ap-computer-science/mergesort/
lesson_title: Mergesort
lesson_desc: Creating and analyzing the mergesort sorting method.
author: Jason Zhang
---

<script src="/questions.js"></script>

{% raw %}

The **Merge Sort** is a highly efficient sorting algorithm. It works recursively, first dividing the array into two halves. Then, it divides the haves in half. Finally, once the arrays are of length 1 or 0, it starts to merge them. When merging them, the algorithm should both merge and sort them. So, if the first array’s index 0 is lower than the second array’s index, then that index would be put first. Then the second index. In the end, the array is sorted into small chunks, larger chunks, and finally into one sorted array.

There are two methods we need to write: one method to divide the array up, and one method to reunite them as a sorted array. I also included a method to help initialize the sort. To reduce some problems, I will make the array we’re trying to sort and a helper array a static field:

        static int[] nums;

        static int[] helper;

        public static void sort(int[] values) {

            nums = values;

            helper = new int[nums.length - 1];

            mergeSort(nums, 0, nums.length - 1);

        }

        public static void mergeSort(int low, int high) {

            /* Code */

        }

        public static void merge(int low, int middle, int high) {

            /* Code */

        }

I’ll start with the <code>mergeSort</code> because it is easier to understand. The <code>mergeSort</code> function only needs to recursively sort the bottom half and the top half, and reunite them with the merge function. To do this I find the middle between low and high, and use that as the high parameter for the bottom half, and the low parameter for the top half. To make sure the <code>mergeSort</code> doesn’t recursively call itself without stop, I will add an if statement that only allows the body to run if the <code>low</code> value is less than the <code>high</code> value.

        public static void mergeSort(int low, int high) {

            if (low < high) {

                int mid = (low + high) / 2;

                mergeSort(low, mid);

                mergeSort(mid + 1, low);	

                merge(nums, low, mid, high);

            }

        }

The <code>merge</code> function needs to first copy over the section of the array into the helper.

        public static void merge(int low, int middle, int high) {

            for (int i = low; i <= high; i++) {

                helper[i] = nums[i];

            }

        }

Next, we need store three integer variables. The first is the index of the bottom half of the array. The second is the index of the top half of the array. The final is the index of the sorted array. As we re-enter the variables in the right order, the program will increment the indexes to grab the right element.

        public static void merge(int low, int middle, int high) {

            for (int i = low; i <= high; i++) {

                helper[i] = nums[i];

            }

            int i = low;

            int j = mid + 1;

            int k = low;

        }

The next step is to enter the smaller integer from either of the halves in a while loop which continues running until either of the indexes crosses their limit. The second part is to increment the index of the <code>middle</code> value, from which we took integer and the general index.

        public static void merge(int low, int middle, int high) {

            for (int i = low; i <= high; i++) {

                helper[i] = nums[i];

            }

            int i = low;

            int j = mid + 1;

            int k = low;

            while (i <= midle && j <= high) {

                if (helper[i] < helper[j]) {

                    nums[k] = helper[i];

                    i++;

                } else {

                    nums[k] = helper[j];

                    j++;

                }

                k++;

            }

        }

Finally we need to copy the rest of the bottom half over. We don’t have to copy over the top half, because the spaces to which we are copying them were their original spaces.

        public static void merge(int low, int middle, int high) {

            for (int i = low; i <= high; i++) {

                helper[i] = nums[i];

            }

            int i = low;

            int j = mid + 1;

            int k = low;

            while (i <= midle && j <= high) {

                if (helper[i] < helper[j]) {

                    nums[k] = helper[i];

                    i++;

                } else {

                    nums[k] = helper[j];

                    j++;

                }

                k++;

            }

            while (i <= middle) {

                nums[k] == nums[i];

                k++;

                i++;

            }

        }

Now your merge sort is complete! Feel free to try it out on a code editor. Its best and worst case complexity is O(n log(n)), which is the same complexity as quicksort in the best case, and is far superior to bubble sort.

<h1>Lesson Quiz</h1>

<h3>1. How long does merge sort take in the best case?</h3>

<form>
	<div>
		<input type="radio" value="a" name="cc" onchange="check(this, 'a')">
		a. O(n log(n))
	</div>
	<div>
		<input type="radio" value="b" name="cc" onchange="check(this, 'a')">
		b. O(n^2)
	</div>
	<div>
		<input type="radio" value="c" name="cc" onchange="check(this, 'a')">
		c. O(n^(1/2))
	</div>
    <div>
		<input type="radio" value="d" name="cc" onchange="check(this, 'a')">
		d. O(log(n))
	</div>
</form>

<h3>2. How long does merge sort take in the average case?</h3>

<form>
	<div>
		<input type="radio" value="a" name="cc" onchange="check(this, 'a')">
		a. O(n log(n))
	</div>
	<div>
		<input type="radio" value="b" name="cc" onchange="check(this, 'a')">
		b. O(n^2)
	</div>
	<div>
		<input type="radio" value="c" name="cc" onchange="check(this, 'a')">
		c. O(n^(1/2))
	</div>
    <div>
		<input type="radio" value="d" name="cc" onchange="check(this, 'a')">
		d. O(log(n))
	</div>
</form>

{% endraw %}

