---
layout: post-lesson
permalink: /learn/ap-computer-science/logical-operators/
lesson_title: Logical Operators
lesson_desc: The different logical operators and forming compound Boolean expressions.
author: Chris Elliott
---

<script src="/questions.js"></script>

{% raw %}

<table>
  <tr>
    <th colspan="2">Code Bar</th>
  </tr>
  <tr>
    <td><code>&&</code></td>
    <td>AND</td>
  </tr>
  <tr>
    <td><code>||</code></td>
    <td>OR</td>
  </tr>
  <tr>
    <td><code>!</code></td>
    <td>NOT</td>
  </tr>
</table>


**Logical operators** are operators that form compound Boolean expressions that return a Boolean result. Essentially, the AND/OR operations are put in between two existing Boolean expressions and determine a new Boolean result.

The three main logical operators are shown above in the Code Bar. The meanings of these operations are:

* **&&** returns true if both Boolean expressions are true

* **\|\|** returns true if one of the Boolean expressions are true

* **!** is put in front of a Boolean to reverse its value

**Truth tables** are tables that represent the outcome of the operations. The truth tables for the AND/OR operations are:

<img src="/assets/lesson_images/and_truth_table.png" width="250">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<img src="/assets/lesson_images/or_truth_table.png" width="250">

These logical operators have a special syntax, which is shown below:

	true && false 		-> false

	false || true 		-> true

	!false 			-> true

	!true 			-> false

Logical operators are most commonly used in conjunction with relational operators, which were described **<a href="../relational-operators">last lesson (Relational Operators)</a>**. Here is an example:

	(4 == 5) || (7 >= 3)

Since (4 == 5) is **false**, and (7 >= 3) is **true**, this statement can be further broken down into the following:

	false || true		-> true

Looking at the truth tables, we can see that the above expression evaluates to **true**. Here are some more examples:

	(5 > 4) && (6 == 6) 	-> true

	(3 <= 2) || (50 != 50) 	-> false

	!(6 > 3) 		-> false

These operators are often used in **if statements**, **for loops**, and **while loops**, which we will get to in **<a href="../#4">lessons 12-15, Loops and Conditionals</a>**.

<h1>Lesson Quiz</h1>

<h3>What is output to the console in each of the following scenarios?</h3>

		int i = 5;

		boolean x = (i > 5) && ((12 * 2) != 24);

		System.out.println(x);

<form>
	<div>
		<input type="radio" value="a" name="cc" onchange="check(this, 'b')">
		a. True
	</div>
	<div>
		<input type="radio" value="b" name="cc" onchange="check(this, 'b')">
		b. False
	</div>
</form>

		System.out.println(!((5000 / 10) > 700));

<form>
	<div>
		<input type="radio" value="a" name="cc" onchange="check(this, 'a')">
		a. True
	</div>
	<div>
		<input type="radio" value="b" name="cc" onchange="check(this, 'a')">
		b. False
	</div>
</form>

		double y = 3.65;

		System.out.println(((y * 5) < 15) || true);

<form>
	<div>
		<input type="radio" value="a" name="cc" onchange="check(this, 'a')">
		a. True
	</div>
	<div>
		<input type="radio" value="b" name="cc" onchange="check(this, 'a')">
		b. False
	</div>
</form>

{% endraw %}

