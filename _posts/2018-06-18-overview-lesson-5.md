---
layout: post-lesson
permalink: /learn/ap-computer-science/overview-lesson-5/
lesson_title: "Overview Lesson #5"
author: Alan Bi
---

<script src="/questions.js"></script>

{% raw %}

Below is a list of all the lessons this overview lesson will cover. 

1. ArrayLists 
2. Recursion
3. Sorting and Searching
4. Common Sorting Methods
5. Common Searching
6. Mergesort
7. Quicksort

<h1>Lesson Quiz</h1>

_The first two questions in this quiz cover ArrayLists and Recursion. The remaining questions cover material taught in lessons 3-7 above._


<h3>1. Which of the following is an advantage of arrays over ArrayLists?</h3>

<form>
    <div>
        <input type="radio" value="a" name="cc" onchange="check(this, 'b')">
        a. Arrays are primitive whereas ArrayLists are objects.
    </div>
    <div>
        <input type="radio" value="b" name="cc" onchange="check(this, 'b')">
        b. Arrays are slightly faster in performance compared to ArrayLists when dealing with a fixed amount of data.
    </div>
    <div>
        <input type="radio" value="c" name="cc" onchange="check(this, 'b')">
        c. Arrays are able to increase in size to fit more data. 
    </div>
    <div>
        <input type="radio" value="d" name="cc" onchange="check(this, 'b')">
        d. Array uses .length whereas ArrayLists use .size().
    </div>
</form>


<h3>2. Which of the following is not a common use of recursion?</h3>

<form>
    <div>
        <input type="radio" value="a" name="cc" onchange="check(this, 'a')">
        a. Solving mathematical paradoxes.
    </div>
    <div>
        <input type="radio" value="b" name="cc" onchange="check(this, 'a')">
        b. Searching through all possible answer choices.
    </div>
    <div>
        <input type="radio" value="c" name="cc" onchange="check(this, 'a')">
        c. Solving problems using backtracking.
    </div>
    <div>
        <input type="radio" value="d" name="cc" onchange="check(this, 'a')">
        d. Generating all possible combinations.
    </div>
</form>

<h3>3. What is the time complexity of the following code?</h3>

        public void temp(int n) { 
            for (int i = 0; i < n; i++) { 
                System.out.println(n);
                temp(n-1); 
            } 
        }

<form>
    <div>
        <input type="radio" value="a" name="cc" onchange="check(this, 'c')">
        a. O(n)
    </div>
    <div>
        <input type="radio" value="b" name="cc" onchange="check(this, 'c')">
        b. O(n^2)
    </div>
    <div>
        <input type="radio" value="c" name="cc" onchange="check(this, 'c')">
        c. O(n!)
    </div>
    <div>
        <input type="radio" value="d" name="cc" onchange="check(this, 'c')">
        d. O(n^n)
    </div>
</form>

<h3>4. Which of the sorting methods would be the most efficient in finding the top 5 scores in a competition with 500 thousand participants?</h3>

<form>
    <div>
        <input type="radio" value="a" name="cc" onchange="check(this, 'a')">
        a. Selection Sort terminated after five iterations
    </div>
    <div>
        <input type="radio" value="b" name="cc" onchange="check(this, 'a')">
        b. Insertion Sort terminated after five iterations
    </div>
    <div>
        <input type="radio" value="c" name="cc" onchange="check(this, 'a')">
        c. Merge Sort
    </div>
    <div>
        <input type="radio" value="d" name="cc" onchange="check(this, 'a')">
        d. Quicksort
    </div>
</form>

<h3>5. Which of the sorting methods would be most efficient in sorting an array of one million integers where each integer is a number between 1 and 3?</h3>

<form>
    <div>
        <input type="radio" value="a" name="cc" onchange="check(this, 'c')">
        a. Selection Sort
    </div>
    <div>
        <input type="radio" value="b" name="cc" onchange="check(this, 'c')">
        b. Insertion Sort
    </div>
    <div>
        <input type="radio" value="c" name="cc" onchange="check(this, 'c')">
        c. Merge Sort
    </div>
    <div>
        <input type="radio" value="d" name="cc" onchange="check(this, 'c')">
        d. Quicksort
    </div>
</form>

<h3>6. What is one advantage Quicksort has over Merge Sort?</h3>

<form>
    <div>
        <input type="radio" value="a" name="cc" onchange="check(this, 'c')">
        a. Quicksort’s best, average, and worst case scenario are all better than Merge Sort.
    </div>
    <div>
        <input type="radio" value="b" name="cc" onchange="check(this, 'c')">
        b. Quicksort performs better when all elements are the same.
    </div>
    <div>
        <input type="radio" value="c" name="cc" onchange="check(this, 'c')">
        c. Quicksort can have O(1) space complexity whereas Merge Sort always has O(n).
    </div>
    <div>
        <input type="radio" value="d" name="cc" onchange="check(this, 'c')">
        d. Quicksort has a best case scenario of O(log n) compared to Merge Sort’s O(n log n). 
    </div>
</form>

<h3>7. The following code is an incorrect implementation of binary search. Which line contains the mistake?</h3>

        public static int binarySearch(int[] arr, int val) {
            int left = 0;
            int right = arr.length - 1;
            while (left <= right) {             // Line 1
                int mid = left + right / 2;     // Line 2
                if (arr[mid] == val) {
                    return mid;
                } else if (val < arr[mid]) {    // Line 3
                    right = mid - 1;
                } else {
                    left = mid + 1;             // Line 4
                }
            }
            return -1;                          // Line 5
        }

<form>
    <div>
        <input type="radio" value="a" name="cc" onchange="check(this, 'b')">
        a. Line 1
    </div>
    <div>
        <input type="radio" value="b" name="cc" onchange="check(this, 'b')">
        b. Line 2
    </div>
    <div>
        <input type="radio" value="c" name="cc" onchange="check(this, 'b')">
        c. Line 3
    </div>
    <div>
        <input type="radio" value="d" name="cc" onchange="check(this, 'b')">
        d. Line 4
    </div>
    <div>
        <input type="radio" value="e" name="cc" onchange="check(this, 'b')">
        e. Line 5
    </div>
</form>

{% endraw %}

