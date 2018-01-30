---
layout: post-lesson
permalink: /learn/ap-computer-science/assignment-operators/
lesson_title: Assignment Operators
lesson_desc: How to use assignment operators in Java programming.
author: Jason Zhang
---

<script src="/questions.js"></script>

{% raw %}

<table>
  <tr>
    <th colspan="2">Code Bar</th>
  </tr>
  <tr>
    <td><code>=</code></td>
    <td>Simple Assignment</td>
  </tr>
  <tr>
    <td><code>+=</code></td>
    <td>Addition Assignment</td>
  </tr>
  <tr>
    <td><code>-=</code></td>
    <td>Subtraction Assignment</td>
  </tr>
  <tr>
    <td><code>*=</code></td>
    <td>Multiplication Assignment</td>
  </tr>
  <tr>
    <td><code>/=</code></td>
    <td>Division Assignment</td>
  </tr>
  <tr>
    <td><code>%=</code></td>
    <td>Modulo Assignment</td>
  </tr>
</table>


The first and by far most important assignment operator is the **simple assignment**. It is the simplest assignment operator and works for every type of variable. It assigns the value on the right into the variable on the left. Here are some examples of it in use:

        boolean trueOrFalse = false;

        int x = 4;

        String hello = "helloWorld";

The other assignment operators are called compound assignment operators. They work exclusively on numerical variables, because each assignment statement performs a numerical operation. The **addition assignment** adds the value on the right to the variable on the left. The **subtraction assignment** subtracts the value on the right from the variable on the left.

For example the code written below will output <code>8</code> three times.

        int x = 4;  // 4                ASSIGNMENT

        x += 4;     // 4 + 4 = 8        ADDITION

        System.out.println(x); // 8

        x += 8;     // 8 + 8 = 16       ADDITION

        x /= 2;     // 16 / 2 = 8       DIVISION

        System.out.println(x); // 8

        x *= 3;     // 8 * 3 = 24       MULTIPLICATION

        x -= 16;    // 24 - 16 = 8      SUBTRACTION

        System.out.println(x); // 8

Since compound assignment operators only perform numerical operations on existing numbers, they cannot serve as initialization statements. The following code will throw an error because the computer is trying the add <code>5</code> to a non-existent number.

        int x;

        x += 5;

        System.out.println(x);

<h1>Lesson Quiz</h1>

<h2>What is the output of the below code blocks?</h2>

        int x = 9;

        x %= 2;

        x *= 5;

        System.out.println(x);

<form>
	<div>
		<input type="radio" value="a" name="cc" onchange="check(this, 'c')">
		a. <code>2</code>
	</div>
	<div>
		<input type="radio" value="b" name="cc" onchange="check(this, 'c')">
		b. <code>3</code>
	</div>
	<div>
		<input type="radio" value="c" name="cc" onchange="check(this, 'c')">
		c. <code>5</code>
	</div>
    <div>
		<input type="radio" value="d" name="cc" onchange="check(this, 'c')">
		d. <code>7</code>
	</div>
</form>

        int x = 4;

        x *= 5;

        x = 3;

        System.out.println(x);

<form>
	<div>
		<input type="radio" value="a" name="cc" onchange="check(this, 'b')">
		a. <code>2</code>
	</div>
	<div>
		<input type="radio" value="b" name="cc" onchange="check(this, 'b')">
		b. <code>3</code>
	</div>
	<div>
		<input type="radio" value="c" name="cc" onchange="check(this, 'b')">
		c. <code>5</code>
	</div>
    <div>
		<input type="radio" value="d" name="cc" onchange="check(this, 'b')">
		d. <code>7</code>
	</div>
</form>

        int x = 3;

        x -= 1;

        x *= 5;

        System.out.println(x);

<form>
	<div>
		<input type="radio" value="a" name="cc" onchange="check(this, 'd')">
		a. <code>5</code>
	</div>
	<div>
		<input type="radio" value="b" name="cc" onchange="check(this, 'd')">
		b. <code>7</code>
	</div>
	<div>
		<input type="radio" value="c" name="cc" onchange="check(this, 'd')">
		c. <code>9</code>
	</div>
    <div>
		<input type="radio" value="d" name="cc" onchange="check(this, 'd')">
		d. <code>10</code>
	</div>
</form>

{% endraw %}

