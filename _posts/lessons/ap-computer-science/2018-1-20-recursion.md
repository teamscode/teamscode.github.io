---
layout: post-lesson
permalink: /learn/ap-computer-science/recursion/
lesson_title: Recursion
lesson_desc: Learning the usage and application of recursion.
author: Chris Elliott
---

<script src="/questions.js"></script>

{% raw %}

<table>
  <tr>
    <th colspan="2">Vocab Bar</th>
  </tr>
  <tr>
    <td>Recursion</td>
    <td>Recursion is a programming technique in which a method calls itself in order to accomplish a goal.</td>
  </tr>
  <tr>
    <td>Termination Condition</td>
    <td>The condition that causes the method to end.</td>
  </tr>
</table>


Recursion is a very popular programming technique that can be used to solve large/complex problems. A recursive method has two key elements:

1. A recursive method calls itself (sometimes multiple times, depending on the scenario).

2. A recursive method has a termination condition (or multiple, depending on the scenario).

For example, let’s say you wanted to print the factorial of a number (which is the product of an integer and all the positive integers below it). The iterative implementation (using a for loop) for this problem would look like this:

        public static int factorialIterative(int n) {

            int value = 1;

            for (int i = n; i > 0; i--) {

                value *= i;

            }

        }

 Now, the recursive implementation for this problem would look like this:

        public static int factorial(int n) {

            // termination condition

            if (n == 0) { 	

                return 1;

            }

            // re-calls method

            return n * factorial(n-1);

        }

The above two statements output the same value. What happens if we make the method call <code>factorial(5)</code> (the recursive method)? Let’s walk through it step by step.

<table>
  <tr>
    <th>Value of n</th>
    <th>Return statement</th>
  </tr>
  <tr>
    <td><code>5</code></td>
    <td><code>return 5 * factorial(4)</code></td>
  </tr>
  <tr>
    <td><code>4</code></td>
    <td><code>return 4 * factorial(3)</code></td>
  </tr>
  <tr>
    <td><code>3</code></td>
    <td><code>return 3 * factorial(2)</code></td>
  </tr>
  <tr>
    <td><code>2</code></td>
    <td><code>return 2 * factorial(1)</code></td>
  </tr>
  <tr>
    <td><code>1</code></td>
    <td><code>return 1 * factorial(0)</code></td>
  </tr>
  <tr>
    <td><code>0</code></td>
    <td><code>return 1</code></td>
  </tr>
</table>


The above table still has lots of method calls, which means it is not fully simplified. Here is a simplification of the table:

<table>
  <tr>
    <th>Value of n</th>
    <th>Return statement</th>
  </tr>
  <tr>
    <td><code>5</code></td>
    <td><code>return 5 * 4 * 3 * 2 * 1 * 1</code></td>
  </tr>
  <tr>
    <td><code>4</code></td>
    <td><code>return 4 * 3 * 2 * 1 * 1</code></td>
  </tr>
  <tr>
    <td><code>3</code></td>
    <td><code>return 3 * 2 * 1 * 1</code></td>
  </tr>
  <tr>
    <td><code>2</code></td>
    <td><code>return 2 * 1 * 1</code></td>
  </tr>
  <tr>
    <td><code>1</code></td>
    <td><code>return 1 * 1</code></td>
  </tr>
  <tr>
    <td><code>0</code></td>
    <td><code>return 1</code></td>
  </tr>
</table>


Finally, let’s simplify one more time:

<table>
  <tr>
    <th>Value of n</th>
    <th>Return statement</th>
  </tr>
  <tr>
    <td><code>5</code></td>
    <td><code>return 120</code></td>
  </tr>
  <tr>
    <td><code>4</code></td>
    <td><code>return 24</code></td>
  </tr>
  <tr>
    <td><code>3</code></td>
    <td><code>return 6</code></td>
  </tr>
  <tr>
    <td><code>2</code></td>
    <td><code>return 2</code></td>
  </tr>
  <tr>
    <td><code>1</code></td>
    <td><code>return 1</code></td>
  </tr>
  <tr>
    <td><code>0</code></td>
    <td><code>return 1</code></td>
  </tr>
</table>


Based on the above table, <code>factorial(5)</code> returns <code>120</code>. The reason the method did not continue calling itself was the termination condition, which returned <code>1</code> when <code>n == 0</code>. The termination condition is crucial to recursion – without the termination condition, the code results in an infinite loop.

One important usage of recursion is recursive backtracking – when you continue to try solutions until you reach an issue, at which point you return to a simpler solution and continue the program. For example, let’s say you wanted to test if a maze was solvable. A program could test multiple routes through the maze, and determine whether or not the maze had a solution. A maze-solving recursive method would contain the following parts:

1. A termination condition to see if the end of the maze has been reached.

2. Multiple if statements, each containing a recursive call checking whether the next space is open. (You check whether you can move up, down, left, or right.) If true, return true (thus the method returns a boolean).

3. A "flag" that marks the positions that you visited with a special icon so you don’t revisit a path twice.

4. A backtrack statement at the end of the method that allows you to backtrack from a dead-end path (shown in below gif).

5. Multiple parameters to keep track of the current x position, the current y position, and the current maze.

<img src="/assets/lesson_images/recursive_maze_solve.gif" width="400">
<br>
<h2 style="margin-top: -10px"><i>A program solving a maze recursively. <a href="https://rosettacode.org/mw/images/9/90/Mazesolve_bbc.gif">Source</a></i></h2>

Although recursion is often difficult to understand at first, with enough practice, you can master this useful technique.

<h1>Lesson Quiz</h1>

<h3>1. What happens if a recursive method doesn’t have a termination condition?</h3>

<form>
	<div>
		<input type="radio" value="a" name="cc" onchange="check(this, 'a')">
		a. The method results in an infinite loop.
	</div>
	<div>
		<input type="radio" value="b" name="cc" onchange="check(this, 'a')">
		b. Nothing – it works normally.
	</div>
	<div>
		<input type="radio" value="c" name="cc" onchange="check(this, 'a')">
		c. The method causes a null pointer exception.
	</div>
    <div>
		<input type="radio" value="d" name="cc" onchange="check(this, 'a')">
		d. The method stops at compile-time.
	</div>
</form>

<h3>2. Is it possible for a recursive method to have multiple termination conditions?</h3>

<form>
	<div>
		<input type="radio" value="a" name="cc" onchange="check(this, 'a')">
		a. Yes
	</div>
	<div>
		<input type="radio" value="b" name="cc" onchange="check(this, 'a')">
		b. No
	</div>
</form>

{% endraw %}

