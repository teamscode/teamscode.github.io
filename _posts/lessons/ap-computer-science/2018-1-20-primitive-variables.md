---
layout: post-lesson
permalink: /learn/ap-computer-science/primitive-variables/
lesson_title: Primitive Variables
lesson_desc: The different primitive variables and how to use them.
author: Chris Elliott
---

<script src="/questions.js"></script>

{% raw %}

<table>
  <tr>
    <th colspan="2">Vocab Bar</th>
  </tr>
  <tr>
    <td>Primitive Variable</td>
    <td>A type of simple variable that is built into Java.</td>
  </tr>
  <tr>
    <td>Variable Declaration</td>
    <td>Creating a new variable.</td>
  </tr>
  <tr>
    <td>Variable Assignment</td>
    <td>Assigning a value to a variable.</td>
  </tr>
</table>

<br>

<table>
  <tr>
    <th colspan="3">Code Bar</th>
  </tr>
  <tr>
    <td><code>int</code></td>
    <td>An integer variable.</td>
    <td><code>-148, -3, 0, 1, 15</code></td>
  </tr>
  <tr>
    <td><code>double</code></td>
    <td>A decimal variable.</td>
    <td><code>-12.26, 7.8102, 13.0</code></td>
  </tr>
  <tr>
    <td><code>float</code>
(less important)</td>
    <td>A less precise decimal variable.</td>
    <td><code>-12.26f, 7.8102f, 13.0f</code></td>
  </tr>
  <tr>
    <td><code>long</code>
(less important)</td>
    <td>An integer variable that can hold larger numbers.</td>
    <td><code>-148L, -3L, 0L, 1L, 15L</code></td>
  </tr>
  <tr>
    <td><code>boolean</code></td>
    <td>A true/false value.</td>
    <td><code>false, true</code></td>
  </tr>
  <tr>
    <td><code>char</code></td>
    <td>A character based on the ASCII system (essentially a list of different letters/symbols).</td>
    <td><code>‘a’, ‘f’, ‘J’, ‘0’, ‘.’</code></td>
  </tr>
</table>


**Primitive variables** are essentially basic variables, and includes six main types: **int**, **double**, **float**, **long**, **boolean**, and **char**. Variables in programming work like variables in math, but programming variables can have values different than numbers <code>(x = 15)</code>. Now, they can also equal booleans <code>(x = false)</code>, chars <code>(x = ‘d’)</code>, and much more.

In programming, there are two basic components of creating a new variable, the **Variable Declaration** and the **Variable Assignment**. The two components are shown in the diagram below:

<img src="/assets/lesson_images/variable_declaration_assignment.png" width="300">

In the above example, <code>int</code> is the type, <code>x</code> is the variable name, and <code>27</code> is the value of <code>x</code>. Primitive variables are all undercase, so declaring a primitive variable as uppercase (saying <code>Int</code> instead of <code>int</code>) throws an error. Variable names should represent their meaning in most cases to make code easier to understand (names such as <code>budget</code>, <code>bookNumber</code>, and <code>score</code> are good examples). These variable names make your code easier to interpret by others when working on group projects.

Additionally, all variable names are case-sensitive (<code>test</code> does not equal <code>Test</code>), cannot have spaces, and convention dictates that all names are used with camelCasing. This means that the first word is lowercase, and all following words start with a capital. This format is shown below with the other primitive variables:

        int myInteger = 27;

        double myDouble = 14.56;

        boolean myBoolean = true;

        char myChar = ‘A’;

If I reassign my variable value after declaration, the variable changes:

        int g = 87;

        System.out.println(g); // outputs 87

        g = 15;

        System.out.println(g); // outputs 15

The variable declaration and variable assignment are not required to be grouped together. For example, the following declaration is completely valid:

        int num; // num has no value

        num = 5; // num equals 5

Finally, there cannot be a mismatch between the variable declaration and variable assignment, or an error will be produced. For example:

        boolean testValue = 50; // ERROR

Primitive variables are used very commonly in programming, and often act as the basis of programs that do very complex tasks. Since they are such an important building block, you must remember all the rules of primitive variables.

<h1>Lesson Quiz</h1>

<h3>1. Primitive variables are NOT built into Java.</h3>

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

<h3>2. What does the below code output?</h3>

        int a = 1000;

	    System.out.println(a);

	    a = 8;
<form>
	<div>
		<input type="radio" value="a" name="cc" onchange="check(this, 'b')">
		a. <code>8</code>
	</div>
	<div>
		<input type="radio" value="b" name="cc" onchange="check(this, 'b')">
		b. <code>1000</code>
	</div>
	<div>
		<input type="radio" value="c" name="cc" onchange="check(this, 'b')">
		c. <code>1008</code>
	</div>
    <div>
		<input type="radio" value="d" name="cc" onchange="check(this, 'b')">
		c. <code>a</code>
	</div>
</form>

<h3>3. Is there an error in the below code?</h3>

	    boolean value = true;

	    System.out.println(Value);

<form>
	<div>
		<input type="radio" value="a" name="cc" onchange="check(this, 'a')">
		a. Yes; value should not be capitalized in the second line.
	</div>
	<div>
		<input type="radio" value="b" name="cc" onchange="check(this, 'a')">
		b. No; primitive variables are case-sensitive.
	</div>
</form>

<h3>4. What is the error in the below code?</h3>

        char fifteen = A;

<form>
	<div>
		<input type="radio" value="a" name="cc" onchange="check(this, 'c')">
		a. fifteen is not a valid variable name.
	</div>
	<div>
		<input type="radio" value="b" name="cc" onchange="check(this, 'c')">
		b. char should be capitalized.
	</div>
    <div>
		<input type="radio" value="c" name="cc" onchange="check(this, 'c')">
		c. The A needs to be changed to ‘A’.
	</div>
</form>

{% endraw %}

