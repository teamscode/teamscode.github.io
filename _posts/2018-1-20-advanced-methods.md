---
layout: post-lesson
permalink: /learn/ap-computer-science/advanced-methods/
lesson_title: Advanced Methods
lesson_desc: How to call methods and more advanced method rules.
author: Chris Elliott
---

<script src="/questions.js"></script>

{% raw %}

<table>
  <tr>
    <th colspan="2">Vocab Bar</th>
  </tr>
  <tr>
    <td>Method Call</td>
    <td>A statement that calls a method, which runs the method with the parameters given.</td>
  </tr>
  <tr>
    <td>Method Overloading</td>
    <td>A feature of Java that allows more than one methods to have the same name but different parameter lists.</td>
  </tr>
</table>


You have now learned the fundamental structure of methods, but there are still many other features you have to learn. For example, take the code below that was shown in **<a href="../what-is-programming">lesson 1 (What is Programming)</a>**.

		public static String toBaseN(int num, int base) {

			String newNum = "";

			while (num > 0) {

				int result = num % base;

				newNum = result + newNum;

				num /= base;

			}

			return newNum;

		}

This method converts a number to a different base. In this lesson, we cover how are we supposed to use this method. In order to make this method run, we have to add a **method call** somewhere else in the program. Here is the structure of a method call:

<img src="/assets/lesson_images/method_call.png" width="400">

Below, there is a main method with a **bolded method call** to the method <code>toBaseN(int num, int base)</code>.
<pre><code>
	public static void main(String[] args) {

		String newValue = <b>toBaseN(55, 2)</b>;

		System.out.println(newValue); // will output 110111

	}
</code></pre>
The method name signals the computer as to which method is being used, and the parameters list provides the specific inputs needed for that method. If the method has no parameters, the parameter list is left empty. For example, if the method <code>toBaseN(int num, int base)</code> had no parameters, the method call would be:

		toBaseN();

**Note:** The method calls <code>toBaseN(55, 2)</code> and <code>toBaseN()</code> only work **if it is being called in the same class**. Since classes have not been covered, and we have only worked in one class so far, simply understand this syntax only works when working in a single class.

Finally, **method overloading** is used when you want to methods to have the same name and they have different parameter lists. Below is an example of two methods that demonstrate this idea:

		// adds the word two to the end of a string

		public String addTwo(String str) {

			return (str + " two");

		}

		// adds the number two to an integer

		public int addTwo(int num) {

			return (num + 2);

		}

Both of these methods may be useful, and both are appropriately named <code>addTwo</code>, so method overloading is brought into effect. Now, it is useful to note that method overloading is caused by different **parameters**, not by different return types. Method overloading still works when the methods have the same return types, but does **not** work when they have the same parameters. Below is an example of an invalid overloading method:

		// adds the word two to the end of a string

		public String addTwo(String str) {

			return (str + " two");

		}

		// adds the number two to the end of a string

		public int addTwo(String num) {

			return (num + 2);

		}

A method call of <code>addTwo</code> in the above scenario would result in an error because they have the same parameter type (<code>String</code>). Method calls and the concept of method overloading are both important to understanding how to create and use methods.

<h1>Lesson Quiz</h1>

<h3>1. What is method overloading?</h3>

<form>
	<div>
		<input type="radio" value="a" name="cc" onchange="check(this, 'c')">
		a. An error produced when you have to many methods.
	</div>
	<div>
		<input type="radio" value="b" name="cc" onchange="check(this, 'c')">
		b. Changing the output of one method in another method.
	</div>
	<div>
		<input type="radio" value="c" name="cc" onchange="check(this, 'c')">
		c. Two or more methods having the same name with different parameter lists.
	</div>
	<div>
		<input type="radio" value="d" name="cc" onchange="check(this, 'c')">
		d. The act of calling a method.
	</div>
</form>

<h3>2. What is wrong with the code below?</h3>

		public static int addTwo(int num) {

			return (num + 2);

		}

		public static void main(String[] args) {

			System.out.println(addTwo());

		}

<form>
	<div>
		<input type="radio" value="a" name="cc" onchange="check(this, 'b')">
		a. The method addTwo does not return an integer.
	</div>
	<div>
		<input type="radio" value="b" name="cc" onchange="check(this, 'b')">
		b. The method call of addTwo does not have a complete parameter list.
	</div>
	<div>
		<input type="radio" value="c" name="cc" onchange="check(this, 'b')">
		c. The main method is incorrectly formatted.
	</div>
	<div>
		<input type="radio" value="d" name="cc" onchange="check(this, 'b')">
		d. The method name addTwo does not match its purpose.
	</div>
</form>

{% endraw %}

