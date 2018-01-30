---
layout: post-lesson
permalink: /learn/ap-computer-science/the-math-class/
lesson_title: The Math Class
lesson_desc: A description of the important methods of the Math class.
author: Jason Zhang
---

<script src="/questions.js"></script>

{% raw %}

<table>
  <tr>
    <th colspan="2">Code Bar</th>
  </tr>
  <tr>
    <td><code>Math.abs(int);</code></td>
    <td>Absolute Value Function for Ints</td>
  </tr>
  <tr>
    <td><code>Math.abs(double);</code></td>
    <td>Absolute Value Function for Doubles</td>
  </tr>
  <tr>
    <td><code>Math.pow(double, double);</code></td>
    <td>Power Function</td>
  </tr>
  <tr>
    <td><code>Math.sqrt(double);</code></td>
    <td>Square Root Function</td>
  </tr>
  <tr>
    <td><code>Math.random();</code></td>
    <td>Random Number Generator</td>
  </tr>
</table>


As you may have noticed, the Java set of basic numeral operators is missing some fundamental functions, such as exponents and absolute values. Java wrapped all of those into a helper class named <code>Math</code>. Inside the <code>Math</code> class, Java has implemented the absolute value function, the power function, and the square root function. The <code>Math</code> class also holds Euler’s number and Pi as constants. And the final method you need to know in the <code>Math</code> class is the random method; it functions as a random number generator.

The syntax for the <code>Math</code> class’s methods:

First you type <code>Math</code>. <code>Math</code> is the class from which the method is being called. Next you place at period, and finally the method. The method should be followed by parenthesis and a semicolon. Inside the parenthesis should be the list of parameters needed.

For the math absolute value function you would type <code>Math.abs()</code>;. Inside the parenthesis you would enter the parameters. The absolute function accepts either a <code>double</code> or an <code>int</code>. The function will return the absolute value of the parameter in same type entered.

        System.out.println(Math.abs(5));        // 5

        System.out.println(Math.abs(-5));       // 5

        System.out.println(Math.abs(5.0));      // 5.0

        System.out.println(Math.abs(-5.0));     // 5.0

The power function in the <code>Math.class</code> takes two <code>doubles</code> and returns the first <code>double</code> raised to the second <code>double</code>. Since <code>ints</code> are truncated <code>doubles</code>, inputting <code>ints</code> will work, but however the answer will still be returned in <code>double</code> form. For example, take a look at the following code, which prints the squares and cubes of the numbers 1 to 3:

        /* Squares */

        System.out.println(Math.pow(1, 2)); // 1^2 == 1.0

        System.out.println(Math.pow(2, 2)); // 2^2 == 4.0

        System.out.println(Math.pow(3, 2)); // 3^2 == 9.0

        /* Cubes */

        System.out.println(Math.pow(1, 3)); // 1^3 == 1.0

        System.out.println(Math.pow(2, 3)); // 2^3 == 8.0

        System.out.println(Math.pow(3, 3)); // 3^3 == 27.0

The square root function takes only one <code>double</code>, and returns the square root of it. Like the power function inputting <code>ints</code> will also work, but it will return a <code>double</code> answer. See the code below:

        System.out.println(Math.sqrt(1));       // 1.0

        System.out.println(Math.sqrt(4));       // 2.0

        System.out.println(Math.sqrt(9.0));     // 3.0

And the final function <code>Math.random()</code> produces a random double above or equal to 0, and below 1. If you multiple that returned digit by a number, then you can use it essentially as a random number generator. The following code will print a random number between one and hundred. First <code>Math.random()</code> returns a number between 0 and 1 (0, 1]. Then, after being multiplied by 100, the value is between 0 and 99.99… If we truncate this new value we get from 0 to 99. Finally, when you add one to the set, you get the range of 1 to 100.

	    int x = (int) (Math.random() * 100) + 1;

The final thing to remember is that the <code>Math</code> class holds the constant Pi and Euler's Number.

        double x = Math.PI; // 3.141592...

        double y = Math.E;  // 2.718281...

<h1>Lesson Quiz</h1>

<h3>1. What is the output of the following code blocks?</h3>

        int x = Math.abs(3) + Math.abs(-4);

        System.out.println(x);

<form>
	<div>
		<input type="radio" value="a" name="cc" onchange="check(this, 'c')">
		a. <code>5</code>
	</div>
	<div>
		<input type="radio" value="b" name="cc" onchange="check(this, 'c')">
		b. <code>6</code>
	</div>
	<div>
		<input type="radio" value="c" name="cc" onchange="check(this, 'c')">
		c. <code>7</code>
	</div>
</form>

	    System.out.println(Math.abs(-4.0));

<form>
	<div>
		<input type="radio" value="a" name="cc" onchange="check(this, 'b')">
		a. <code>4</code>
	</div>
	<div>
		<input type="radio" value="b" name="cc" onchange="check(this, 'b')">
		b. <code>4.0</code>
	</div>
	<div>
		<input type="radio" value="c" name="cc" onchange="check(this, 'b')">
		c. <code>-4</code>
	</div>
</form>

	    System.out.println(Math.pow(4.0, 3.0));

<form>
	<div>
		<input type="radio" value="a" name="cc" onchange="check(this, 'c')">
		a. <code>7.0</code>
	</div>
	<div>
		<input type="radio" value="b" name="cc" onchange="check(this, 'c')">
		b. <code>12.0</code>
	</div>
	<div>
		<input type="radio" value="c" name="cc" onchange="check(this, 'c')">
		c. <code>64.0</code>
	</div>
</form>

	    System.out.println(Math.sqrt(Math.pow(4.0, 4.0)));

<form>
	<div>
		<input type="radio" value="a" name="cc" onchange="check(this, 'a')">
		a. <code>16</code>
	</div>
	<div>
		<input type="radio" value="b" name="cc" onchange="check(this, 'a')">
		b. <code>24</code>
	</div>
	<div>
		<input type="radio" value="c" name="cc" onchange="check(this, 'a')">
		c. <code>64</code>
	</div>
</form>

{% endraw %}