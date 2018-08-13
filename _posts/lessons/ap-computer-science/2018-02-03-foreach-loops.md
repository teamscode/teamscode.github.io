---
layout: post-lesson
permalink: /learn/ap-computer-science/foreach-loops/
lesson_title: Foreach Loops
lesson_desc: Using foreach loops to quickly loop through an array. 
author: James Richardson
---

<script src="/questions.js"></script>

{% raw %}

**Foreach loops** are for loops specifically designed to be used with arrays, lists, and other data structures. Arrays and Lists - covered in [the ArrayLists lesson](https://teamscode.com/learn/ap-computer-science/arraylists/) - have a series of values. Foreach loops will go through the entire series, allowing the user to manipulate each individual value in a systematic way. Here is the syntax:

        for (int x : y) {

            ...

        }

The variable x is the given local variable which represents the current value in the data structure. The variable x must be the same type as the variables stored in the data structure. The variable y calls the data structure. 

Here is an application of the foreach loop.

        int[] a = {0,1,2,3,4};

        for (int i : a) { 

            System.out.print(i + 1 + " "); // example code

        }

The above code will print "1 2 3 4 5 ".

You can do something similar with 2D arrays: 

        int[][] array = {{1, 2}, {2, 3}, {3, 4}};

        for (int[] arr : array) {

            for (int i : arr) {

                ...

            }

        }


<h1>Lesson Quiz</h1>

<h3>1. On what type of array would the below for each loop work?</h3>

        for (int i : j) { }

<form>
    <div>
        <input type="radio" value="a" name="cc" onchange="check(this, 'c')">
        a. Two dimensional String array
    </div>
    <div>
        <input type="radio" value="b" name="cc" onchange="check(this, 'c')">
        b. One dimensional String array
    </div>
    <div>
        <input type="radio" value="c" name="cc" onchange="check(this, 'c')">
        c. One dimensional int array
    </div>
    <div>
        <input type="radio" value="d" name="cc" onchange="check(this, 'c')">
        d. Two dimensional int array
    </div>
</form>

{% endraw %}