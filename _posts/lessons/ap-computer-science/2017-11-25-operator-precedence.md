---
layout: post-lesson
permalink: /learn/ap-computer-science/operator-precedence/
lesson_title: Operator Precedence
lesson_desc: Order of operations in Strings, boolean expressions, and basic algebra.
author: Alan Bi
---

<script src="/questions.js"></script>

{% raw %}

<br>
Just like how in math there is an order of operations, in programming, certain operators take precedence over others. With regards to simple arithmetic operators, you all should be familiar with PEMDAS. The same rules apply to programming, with the addition of the modulo <code>%</code> operator, which is grouped together with multiplication and division. 

However, in programming, there are other operators as well. Assignment operators, relational operators, and many other symbols come into play, making it sometimes hard to follow what’s happening in a line of code. Here is a chart that helps with this: 

<table>
  <tr>
    <th>Operators</th>
    <th>Precedence</th>
  </tr>
  <tr>
    <td>postfix</td>
    <td><code>expr++ expr--</code></td>
  </tr>
  <tr>
    <td>unary</td>
    <td><code>++expr  --expr !</code></td>
  </tr>
  <tr>
    <td>multiplicative</td>
    <td><code>* / %</code></td>
  </tr>
  <tr>
    <td>additive</td>
    <td><code>+ -</code></td>
  </tr>
  <tr>
    <td>relational</td>
    <td><code>< > <= >=</code></td>
  </tr>
  <tr>
    <td>equality</td>
    <td><code>== !=</code></td>
  </tr>
  <tr>
    <td>logical AND</td>
    <td><code>&amp;&amp;</code></td>
  </tr>
  <tr>
    <td>logical OR</td>
    <td><code>||</code></td>
  </tr>
  <tr>
    <td>assignment</td>
    <td><code>= += -= *= /= %=</code></td>
  </tr>
</table>

Everything you need to know and more is included in this chart. However, do not feel the need to memorize it. First of all, if you take a look at some of the things that we have learned, a lot of it makes sense. With enough practice on your own time, you will eventually start to naturally know which operators come first. And secondly, many people simply use parentheses to clear things up when they are not sure which operation comes first. 

Going into something more specific, we are now going to cover precedence when using the <code>+</code> sign with strings. This is a very simple topic but worth going over once. Take a look at the following line of code: 

		System.out.println("2 + 3 is equal to " + 2 + 3);

You might at first think the output produced would be "2 + 3 is equal to 5", as desired. However, the thing to note with strings is that the moment you have a string and another data type being added together with the <code>+</code> symbol, the other data type is immediately converted to a string. Therefore, in the example above, instead of printing “2 + 3 is equal to 5”, the 2 is first concatenated to the “2 + 3 is equal to ” and then the 3 as well, which leads to the output of “2 + 3 is equal to 23”. If you had the statement the other way around however, things would be different: 

		System.out.println(2 + 3 + " is equal to 2 + 3");

		// Prints "5 is equal to 2 + 3"

In this case, going from left to right, the 2 and 3 are added together first, and then the result is added to the following string and converted to a string itself. Note that if you had code like this: 

		System.out.println("5 - 2 is equal to " + 5 - 2);

		// Throws error

An error is thrown because of the minus sign. At first, the 5 is concatenated to the string because of the <code>+</code> sign. However, it then encounters a minus sign. How do you subtract the number 2 from a string? You can’t, and therefore an error is thrown. Of course, there are easy workarounds to all of these scenarios. The best way is to simply use parentheses. 

		System.out.println("5 - 2 is equal to " + (5 - 2));

		// Prints "5 - 2 is equal to 3"

<h1>Lesson Quiz</h1>

<h3>1. What is the output to the console?</h3>

		System.out.println(9 - 2 + "" + 4 + 1);

<form>
	<div>
		<input type="radio" value="a" name="cc" onchange="check(this, 'b')">
		a. <code>75</code>
	</div>
	<div>
		<input type="radio" value="b" name="cc" onchange="check(this, 'b')">
		b. <code>741</code>
	</div>
	<div>
		<input type="radio" value="c" name="cc" onchange="check(this, 'b')">
		c. Error
	</div>
</form>

<h3>2. What is the output to the console?</h3>

		System.out.println("Hi" + 3 - 2);

<form>
	<div>
		<input type="radio" value="a" name="cc" onchange="check(this, 'c')">
		a. <code>Hi32</code>
	</div>
	<div>
		<input type="radio" value="b" name="cc" onchange="check(this, 'c')">
		b. <code>Hi1</code>
	</div>
	<div>
		<input type="radio" value="c" name="cc" onchange="check(this, 'c')">
		c. Error
	</div>
</form>

<h3>3. What is the output to the console?</h3>

		System.out.println(true || false && false);

<form>
	<div>
		<input type="radio" value="a" name="cc" onchange="check(this, 'a')">
		a. <code>true</code>
	</div>
	<div>
		<input type="radio" value="b" name="cc" onchange="check(this, 'a')">
		b. <code>false</code>
	</div>
	<div>
		<input type="radio" value="c" name="cc" onchange="check(this, 'a')">
		c. Error
	</div>
</form>

<h3>4. What is the output to the console?</h3>

		System.out.println("True or false: " + true || false);

<form>
	<div>
		<input type="radio" value="a" name="cc" onchange="check(this, 'c')">
		a. <code>true</code>
	</div>
	<div>
		<input type="radio" value="b" name="cc" onchange="check(this, 'c')">
		b. <code>false</code>
	</div>
	<div>
		<input type="radio" value="c" name="cc" onchange="check(this, 'c')">
		c. Error
	</div>
</form>


{% endraw %}
