---
layout: post-lesson
permalink: /learn/ap-computer-science/searching-methods/
lesson_title: Searching Methods
lesson_desc: Learning some basic searching methods.
author: Jason Zhang
---

<script src="/questions.js"></script>

{% raw %}

<table>
  <tr>
    <th colspan="2">Vocab Bar</th>
  </tr>
  <tr>
    <td>Sequential Search</td>
    <td>A search that starts from the beginning and progresses</td>
  </tr>
  <tr>
    <td>Binary Search</td>
    <td>A search that recursively guesses the midpoint of lowest bound and highest bound</td>
  </tr>
</table>


**Search algorithms** are used to find the index of a specified value from an ordered list. There are two algorithms I will be covering: the sequential search and binary search.

The sequential search is the most basic search. It starts at the front and when it finds the value specified, it returns the index and ends. Understandably, it will take O(n) time at most. But if the sought value is the first one, it takes only O time. Sequential search is the only search that does not require a sorted list. First, we want a for loop that loops through every element.

        public static int sequentialSearch(int[] nums, int target) {

            for (int i = 0; i < nums.length; i++) {

                /* Code */

            }

        }

Next we compare inside the loop whether or not the current value is equal to the target.

        public static int sequentialSearch(int[] nums, int target) {

            for (int i = 0; i < nums.length; i++) {

                if (nums[i] == target) {

                    /* Code */

                }

            }

        }

Finally we just return <code>i</code> inside the if loop. However just in case the target is not inside the list, we need to also add <code>return -1</code>; at the end. In general, if an object is not in a list, we <code>return -1</code>.

        public static int sequentialSearch(int[] nums, int target) {

            for (int i = 0; i < nums.length; i++) {

                if (nums[i] == target) {

                    return i;

                }

            }

            return -1;

        }

The next search is the binary search. Have you ever played the game "higher and lower"? The premise of the game is that one person chooses a number, and a second person tries to guess the number. After each guess the first player says "higher" or "lower", signifying whether his or her number is higher or lower. You should probably start at 50. Say the number is above that, the next best guess is 75. As you can see the best guess is always the middle between the lowest bound and highest bound. This is the essentially what binary search is. Of course the nature of the sort means the list must be sorted. The time complexity is equal in the worst and average case: O(log(n)). However, if the desired value is directly in the middle, the function needs only to look at it, so the best case time complexity is O(1). To make this function, first we need to write the method header.

        public static int binarySearch(int[] nums, int target, int low, int high) {

            /* Code */

        }

The first step is to find the midpoint.

        public static int binarySearch(int[] nums, int target, int low, int high) {

            int mid = (low + high) / 2;

            /* Code */

        }

As you can see from the game higher and lower, the search is recursive. You use the method on 1 to 100, then 50 to 100. So first we need to differentiate when to recursively call; if <code>nums[i] == target</code> then the method should return i. If <code>nums[i] > target</code>, it should recursively call itself except the <code>mid - 1</code> is inputted as high. If <code>nums[i] < target</code>, it should recursively call itself except the <code>mid - 1</code> is inputted as low.

        public static int binarySearch(int[] nums, int target, int low, int high) {

            int mid = (low + high) / 2;

            if (nums[mid] == target) {

                return mid;

            } else if (nums[mid] > target) {

                return binarySearch(nums, target, low, mid - 1);

            } else {

                return binarySearch(nums, target, mid + 1, high);

            }

        }

However, here are still some hiccups in the code. If the target value doesn't exist insist inside the list, lower will equal higher and the method would never terminate. So we need to put an exit clause.

        public static int binarySearch(int[] nums, int target, int low, int high) {		

            int mid = (low + high) / 2;

            if (nums[mid] == target) {

                return mid;

            } else if (low == high) {

                return -1;

            } else if (nums[mid] > target) {

                return binarySearch(nums, target, low, mid - 1);

            } else {

                return binarySearch(nums, target, mid + 1, high);

            }

        }

The way I implemented binary search uses recursion, but there is a way to implement the binary search only using a while loop.

        public static int binarySearch(int[] array, int target)  {

            int low = 0;

            int high = array.length - 1;

            int mid;

            while (low <= high) {

                mid = (low + high) / 2;

                if (array[mid] == target) {

                    return mid;

                } else if (array[mid] > target) {

                    high = mid - 1;

                } else {

                    low = mid + 1;

                }

            }

            return -1;

        }

These are the only search methods this course (and the AP Computer Science Exam) covers; however, there are many other types of searches. TeamsCode encourages you to do more research!

<h1>Lesson Quiz</h1>

<h3>1. In an array size n, how many elements will be compared in sequential search for the <b>best case</b>?</h3>

<form>
	<div>
		<input type="radio" value="a" name="cc" onchange="check(this, 'a')">
		a. 1
	</div>
	<div>
		<input type="radio" value="b" name="cc" onchange="check(this, 'a')">
		b. 2
	</div>
	<div>
		<input type="radio" value="c" name="cc" onchange="check(this, 'a')">
		c. n
	</div>
    <div>
		<input type="radio" value="d" name="cc" onchange="check(this, 'a')">
		d. 2n
	</div>
</form>

<h3>2. What should a search return if the element is not in the array?</h3>

<form>
	<div>
		<input type="radio" value="a" name="cc" onchange="check(this, 'a')">
		a. -1
	</div>
	<div>
		<input type="radio" value="b" name="cc" onchange="check(this, 'a')">
		b. 0
	</div>
	<div>
		<input type="radio" value="c" name="cc" onchange="check(this, 'a')">
		c. 1
	</div>
    <div>
		<input type="radio" value="d" name="cc" onchange="check(this, 'a')">
		d. n
	</div>
</form>

{% endraw %}