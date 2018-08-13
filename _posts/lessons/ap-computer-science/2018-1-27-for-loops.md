---
layout: post-lesson
permalink: /learn/ap-computer-science/for-loops/
lesson_title: For Loops
lesson_desc: Introduction to the syntax and usage of for loops.
author: Jason Zhang
---

<script src="/questions.js"></script>

{% raw %}

**For loops** are control structures that allow the computer to perform a task over and over again.

        for (init; test; update statement) {

                body;

        }

First the computer runs the statement in the init statement. The init statement is normally used to initialize the counter used for the test and update; it is executes once at the beginning. Next, it evaluates the test. The test is just a conditional for the continuation of the for loop. If the test returns true, the body executes and at afterward the update executes. After the update statement has finished, the cycle restarts. Once the test evaluates as false, the control passes the loop. 

The code above is only an abstract version of the explanation. Once you replace the placeholders with real code, the for loop will run.

A simple non-abstract example is using a for loop to print all the numbers from 1 to 10:

        for (int i = 1; i <= 10; i++) {

                System.out.println(i);

        }

        System.out.println("Finished!");

This code will provide the output:

        1

        2

        3

        4

        5

        6

        7

        8

        9

        10

        Finished!

Let’s try to follow along. First the for loop initializes integer <code>i</code> at <code>1</code>. I then prints out <code>i</code>, increments by <code>1</code> (I used <code>i++</code> to increment but <code>i += 1</code> works). It then checks whether the condition is false; if it isn’t, the loop repeats. This continues till <code>i</code> reaches <code>10</code>, thus making the condition false, then it finally exits and prints "<code>Finished!</code>".

When making a for loop, you can use pre-existing variables. However, if you are using a pre-existing variable, you can’t re-declare the variable. The code below will result in the same output as above.

        int i;

        for (i = 0; i <= 10; i++) {

            System.out.println(i);

        }

        System.out.println("Finished!");

**The variable inside the test can change.** It acts like any regular variable; this means all regular operators work just as well.

For example this line of code will update the variable inside the for loop:

        for (int i = 1; i < 50; i++) {

            i = i * 2;

            System.out.println(i);

        }

This will result in the following output:

        2

        6

        14

        30

        62

This occurs because the <code>i</code> variable is updated in the for loop as well. This chart is shows the cycle and the value of <code>i</code>. The first value of <code>i</code> in every cycle is printed out.

<table>
  <tr>
    <th>Cycle</th>
    <th><code>i</code></th>
  </tr>
  <tr>
    <td>0</td>
    <td><code>1</code></td>
  </tr>
  <tr>
    <td rowspan="2">1</td>
    <td><code>2</code></td>
  </tr>
  <tr>
    <td><code>3</code></td>
  </tr>
  <tr>
    <td rowspan="2">2</td>
    <td><code>6</code></td>
  </tr>
  <tr>
    <td><code>7</code></td>
  </tr>
  <tr>
    <td rowspan="2">3</td>
    <td><code>14</code></td>
  </tr>
  <tr>
    <td><code>15</code></td>
  </tr>
  <tr>
    <td rowspan="2">4</td>
    <td><code>30</code></td>
  </tr>
  <tr>
    <td><code>31</code></td>
  </tr>
  <tr>
    <td rowspan="2">5</td>
    <td><code>62</code></td>
  </tr>
  <tr>
    <td><code>63</code></td>
  </tr>
</table>


The for loop terminates after the 5th cycle, because 63 is larger than 50. But this piece of code shows that the variables in the expression can be changed to deviate from the how you might expect.

<h1>Lesson Quiz</h1>

<h3>1. How many times do the below loops repeat?</h3>

        for (int i = 0; i < 5; i++) {



        }

<form>
	<div>
		<input type="radio" value="a" name="cc" onchange="check(this, 'b')">
		a. 4
	</div>
	<div>
		<input type="radio" value="b" name="cc" onchange="check(this, 'b')">
		b. 5
	</div>
	<div>
		<input type="radio" value="c" name="cc" onchange="check(this, 'b')">
		c. 6
	</div>
    <div>
		<input type="radio" value="d" name="cc" onchange="check(this, 'b')">
		d. 7
	</div>
</form>

        for (int i = 0; i <= 10; i++) {

            i++;

        }

<form>
	<div>
		<input type="radio" value="a" name="cc" onchange="check(this, 'b')">
		a. 4
	</div>
	<div>
		<input type="radio" value="b" name="cc" onchange="check(this, 'b')">
		b. 5
	</div>
	<div>
		<input type="radio" value="c" name="cc" onchange="check(this, 'b')">
		c. 6
	</div>
    <div>
		<input type="radio" value="d" name="cc" onchange="check(this, 'b')">
		d. 7
	</div>
</form>

<h3>2. What does the below code block output?</h3>

        for (int i = 1; i <= 4; i++) {

            System.out.print((i * i) + " ");

        }

<form>
	<div>
		<input type="radio" value="a" name="cc" onchange="check(this, 'd')">
		a. <code>1 2 3 4</code>
	</div>
	<div>
		<input type="radio" value="b" name="cc" onchange="check(this, 'd')">
		b. <code>1 4 9</code>
	</div>
	<div>
		<input type="radio" value="c" name="cc" onchange="check(this, 'd')">
		c. <code>1 2 3</code>
	</div>
    <div>
		<input type="radio" value="d" name="cc" onchange="check(this, 'd')">
		d. <code>1 4 9 16</code>
	</div>
</form>

{% endraw %}

