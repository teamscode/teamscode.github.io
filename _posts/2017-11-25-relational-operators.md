---
layout: post-lesson
permalink: /learn/ap-computer-science/relational-operators/
lesson_title: Relational Operators
lesson_desc: Using relational operators to compare different values.
author: Alan Bi
---

<script src="/questions.js"></script>

{% raw %}

<br>
<table>
<tr>
<th colspan="2">Code Bar</th>
</tr>
<tr>
<td><code>></code></td>
<td><code><</code></td>
</tr>
<tr>
<td><code>>=</code></td>
<td><code><=</code></td>
</tr>
<tr>
<td><code>==</code></td>
<td><code>!=</code></td>
</tr>
<tr>
<td><code>str1.equals(str2)</code></td>
<td><code>!str1.equals(str2)</code></td>
</tr>
</table>

So far, we have learned the basics about primitive variables and assigning values to them. However, in the case of booleans, there doesn’t seem to be much of a point in simply assigning it a true or false value. Most of the time, you would want a boolean to tell you important information on whether or not certain conditions are true. For example, you could assign a boolean to be true if a number is less than 0 and false otherwise, and you would therefore have useful information stored in that boolean. 

So far, we have learned how to assign values to different primitive variables and how to manipulate those values. Besides just knowing how to set values, we need to know how to compare them. Just like how in math class, you would use symbols such as >, <, ≥, ≤, =, and ≠, in programming, the same **relational operators** are used. Now, in programming, there are a few differences: the ≥ and ≤ symbols are replaced by <code>>=</code> and <code><=</code> and the = and ≠ symbols are replaced by <code>==</code> and <code>!=</code>. However, the overall concept is exactly the same. 

**Note**: You will see the <code>!</code> symbol a lot when programming and might wonder why it is used to represent "does not equal." Essentially, <code>!</code> means “not.” For example, <code>!true</code> would mean not true, or false, and <code>!false</code> would mean not false, or true. This will be covered in more detail in a later lesson. 

Try running the following code: 

		int num = 5; 

		boolean isPositive = (num > 0); 

		System.out.println(isPositive); // Prints true

Note that the parentheses around <code>num > 0</code> are purely optional in this case and are only put there to make the statement easier to read. The computer is able to recognize that the statement is not <code>(isPositive = num > 0)</code> and we will explain why further on. 

Since the statement <code>(num > 0)</code> will obviously evaluate to true, the boolean <code>isPositive</code> will also be set to <code>true</code>. However, if you changed <code>num</code> to be -5, <code>isPositive</code> would of course be set to <code>false</code>. You can also try changing this statement up with the other relational operators: <code>>=</code>, <code><=</code>, <code><</code>, <code>==</code>, and <code>!=</code>. 

One thing that you should keep in mind though is if you have two Strings, <code>str1</code> and <code>str2</code>, <code>==</code> and <code>!=</code> don’t work properly. What you would do instead is <code>str1.equals(str2)</code> and <code>!str1.equals(str2)</code>. This will return whether or not <code>str1</code> and <code>str2</code> are equal. For any of the other data types we’ve learned about, <code>==</code> and <code>!=</code> work fine. For example: 

		String str1 = new String("hello");

		String str2 = new String("hi");

		boolean b1 = str1.equals(str2); // Correct: returns true

		boolean b2 = (str1 == str2); // Incorrect: returns false

Now, there is an important distinction between the <code>=</code> sign and <code>==</code> sign. The <code>=</code> sign is used to assign variables a value, as we have learned. The <code>==</code> sign, on the other hand, is used to compare different values. Thus, <code>=</code> is an assignment operator and <code>==</code> is a relational operator. 

Take a look at the following two snippets of code. 

		num = 5 

		num == 5

In the first line, <code>num</code> is being assigned the value of 5. In the second line, <code>num</code> is being compared to the value 5. Since <code>num</code> does in fact equal 5, the second statement would have a value of <code>true</code>. 

These relational operators are very important and are heavily used in programming. We will revisit them in one of the next lessons where we go over the if/else statement, a selection construct lets you execute certain statements based on whether a condition is true or not. 

<h1>Lesson Quiz</h1>

<h3>1. What is the output to the console?</h3>

		int num = 5;

		boolean b = num + 5 <= num * 2;

		System.out.println(b);

<form>
	<div>
		<input type="radio" value="a" name="cc" onchange="check(this, 'a')">
		a. <code>true</code>
	</div>
	<div>
		<input type="radio" value="b" name="cc" onchange="check(this, 'a')">
		b. <code>false</code>
	</div>
</form>

<h3>2. What is the output to the console?</h3>

		double dec = 14.4;

		boolean b = !(dec / 2 != 12 * 0.6);

		System.out.println(!b);

<form>
	<div>
		<input type="radio" value="a" name="cc" onchange="check(this, 'b')">
		a. <code>true</code>
	</div>
	<div>
		<input type="radio" value="b" name="cc" onchange="check(this, 'b')">
		b. <code>false</code>
	</div>
</form>


{% endraw %}


