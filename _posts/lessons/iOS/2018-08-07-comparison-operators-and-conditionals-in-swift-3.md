---
layout: post-lesson-ios
permalink: /learn/ios/comparison-operators-and-conditionals-in-swift-3/
lesson_title: Comparison operators and Conditionals in Swift
lesson_desc: This lesson is about conditional operators and some of their uses in iOS.
author: Valliappan Valliappan
---

<script src="/questions.js"></script>
Let’s jump right in!
<h3>Comparison operators</h3>
Comparison operators are very similar to arithmetic operators. The vocab bar below shows the conditional operators and their functions:
<table>
<tr>
<th colspan="2">Vocab Bar</th>
</tr>
<tr>
<td>==</td>
<td>Checks if both operands are exactly equal to each other</td>
</tr>
<tr>
<td><</td>
<td>Checks if the operand on the left of the < is less than the one on the right.</td>
</tr>
<tr>
<td><=</td>
<td>Checks if the operand on the left of the < =is less than or exactly equal to the operand on the right.</td>
</tr>
<tr>
<td>></td>
<td>Checks if the operand on the left of the > is greater than the one on the right.</td>
</tr>
<tr>
<td>>=</td>
<td>Checks if the operand on the left of the >= is greater than or exactly equal to the operand on the right.</td>
</tr>
<tr>
<td>!=</td>
<td>Checks if the operand on the left is not equal to the right.</td>
</tr>
</table>
Comparison operators require two variables or values that you want them to compare. These variables of course, need to be comparable. Variables need to be of the same type to be comparable. When a comparison operation is completed, we get a boolean output. In other words, the result of a comparison operation is always a value of type <code>Bool</code>:<code>true</code> or <code>false</code>.
For example, the <code>></code> operator checks if the operand on the left of the <code>></code> is greater than the operand on the right. If the left operand is greater than the right operand, the value given by the operation is <code>true</code>. Else, it is <code>false</code>.
Examples:

<pre>   <code>var trueOrFalse = (2 == 3) //This will make trueOrFalse have a value of false</code></pre>

<pre>   <code>trueOrFalse = (2 != 3) //This will make trueOrFalse have a value of true</code></pre>

<pre>   <code>trueOrFalse = (2 < 3) //This will make trueOrFalse have a value of true</code></pre>

<pre>   <code>trueOrFalse = (2 <= 3) //This will make trueOrFalse have a value of true</code></pre>

<h5>Do not go beyond without understanding the concepts given above.</h5>

<h3>Type declaration</h3>
You might have noticed that I didn’t tell the compiler that the variable <code>trueOrFalse</code> was a <code>Bool</code>. But the we get no errors. This is because Swift’s compiler is smart and assumes the type of variable you are creating from the nature of the value you assign to it. If you give it an <code>Int</code> value like <code>98</code>, it will assume that the variable is of <code>Int</code> type even if you don’t declare it to be of <code>Int</code> type.

<h3>Conditional statements</h3>
The most important place where comparison operators are used is in conditional statements. Conditional statements are lines of code that run only when specific conditions are satisfied. An example of a place where conditional statements can be used is when you want to decide if a person is eligible to vote. The condition her is “Is the person over the age of eighteen”. If that condition is true, only then we let the person vote. Otherwise, the person doesn’t get to vote. Let’s break up this situation:
If the age of a person is greater than or equal to 18{
Let them vote
}
If the condition is not satisfied{
Do not let them vote
}
What you saw above, was the English version of an if-else statement. Now let’s go to the Swift version of it. Let’s say that <code>age</code> is the variable that stores the age of the person you are checking for eligibility to vote and <code>canVote</code> is the variable you set to <code>true</code> if a person is eligible.Here is the Swift version of the if-else statement:
<pre>    <code>if age >= 18 {</code></pre>
<pre>        <code>canVote=true //person can vote</code></pre>
<pre>    <code>}</code></pre>
<pre>    <code>else{ //If the condition next to the “if” is not true</code></pre>
<pre>        <code>canVote=false //person can't vote</code></pre>
<pre>    <code>}</code></pre>
Lines of code that are enclosed in between <code>{</code> and <code>}</code> after a condition are what get executed when the condition is true. The <code>else</code> keyword represents a condition when the condition given after the <code>if</code> keyword is false. <code>if</code> statements can exist without an <code>else</code> to accompany them. But if you use an <code>else</code> statement, it will run only if the <code>if</code> condition directly above it is not true. It doesn’t consider any other <code>if</code>.

{% raw %}
{% endraw %}
