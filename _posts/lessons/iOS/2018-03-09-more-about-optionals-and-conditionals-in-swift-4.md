---
layout: post-lesson-ios
permalink: /learn/ios/more-about-optionals-in-swift-4/
lesson_title: More about Optionals in Swift
lesson_desc: This lesson is about optional binding, unwrapping an optional, and the ternary operator in Swift.
author: Valliappan Valliappan
---

<script src="/questions.js"></script>
<h3>else-if statements</h3>
With the skills you have learned right now, here’s how you will write a program that assigns a student’s grade. Let <code>percent</code> be the percentage a student has in a class and <code>grade</code> be the grade you give him or her. Grades will be assigned following this pattern:(90%+)=A,(80%+)=B,(70%+)=C,(0%+)=F(for the sake of simplicity). Here is what you might write:
<pre>   <code>if percent > 90{</code></pre>
<pre>        <code>grade=”A”</code></pre>
<pre>   <code>}</code></pre>
<pre>   <code>if percent > 80{</code></pre>
<pre>        <code>grade=”B”</code></pre>
<pre>    <code>}</code></pre>
<pre>   <code>if percent > 70{</code></pre>
<pre>        <code>grade=”C”</code></pre>
<pre>    <code>}</code></pre>
<pre>   <code>if percent > 0{</code></pre>
<pre>        <code>grade=”F”</code></pre>
<pre>    <code>}</code></pre>

You might do something different but this code, in general, illustrates the mistake you would make. If you go through the code with random values you might find that by the end of running the program, the student’s grade is always an “F”. That’s certainly not what we wanted. A fact I hid from you is that when you put multiple <code>if</code> statements one after the other, they magically don’t become related. Looking at all the <code>if</code> statements separately, this happens because in the place where we make a student get an F, we ask if their percentage is over 0%. If they have 92% in the class, of course they have over 0% in the class. The same applies if they deserved a B or a C. There are two way to deal with this problem: add multiple conditions to one <code>if</code> statement or relate the <code>if</code> statements. What I mean by “relate the <code>if</code> statements” is that we need to combine the <code>if</code> statements in a way that checks if a percentage is over 90(an A) and if it’s not(we know it’s not an A), check if it’s over 80(a B) and if it’s not(we know it’s not an A or a B), check if it’s over 70(a C) and if it’s not(we know that it is not an A or a B or a C), we come to the conclusion that it’s an F.

<code>else if</code> statements let us do that. Here is what I described in the previous paragraph in the form of Swift code:
<pre>   <code>if percent > 90{</code></pre>
<pre>        <code>grade=”A”</code></pre>
<pre>   <code>}</code></pre>
<pre>   <code>else if percent > 80{</code></pre>
<pre>        <code>grade=”B”</code></pre>
<pre>    <code>}</code></pre>
<pre>   <code>else if percent > 70{</code></pre>
<pre>        <code>grade=”C”</code></pre>
<pre>    <code>}</code></pre>
<pre>   <code>else{</code></pre>
<pre>        <code>grade=”F”</code></pre>
<pre>    <code>}</code></pre>

Now, all of those <code>else if</code> statements are related and work together. If any of conditions is true, the compiler doesn’t bother checking conditions that are written below it. The <code>else</code> keyword is differently used in the case when it is used with <code>else if</code>. When use that way, the code under it is run only when the condition in the last <code>else if</code> is not satisfied. The last <code>else if</code> is not true only if the <code>else if</code> above it is not true and so on. So we can say that, the block of code(lines of code enclosed in curly braces) under the <code>else</code> keyword is run only when none of the conditions in the list of <code>else if</code> and <code>if</code> statements is not satisfied.

<h3>The Ternary operator</h3>
The ternary operator is a way of shrinking a particular <code>if-else</code> statement to one line. The <code>if-else</code> that was shrunk is one that only assigns a value to the same variable in both the <code>if</code> block and the <code>else</code> block like shown below:

<pre>   <code>var b = 100</code></pre>
<pre>   <code>if b < 90{</code></pre>
<pre>        <code>b=10</code></pre>
<pre>   <code>}</code></pre>
<pre>   <code>else{</code></pre>
<pre>        <code>b=40</code></pre>
<pre>   <code>}</code></pre>

If the value of <code>b</code> is less than 90, <code>b</code> becomes 10 else it becomes 40. The ternary operator can do the same with this line of code:

<pre>   <code>b = (b < 90) ? 10 : 40</code></pre>

That is the only thing the ternary operator does. It assigns values based on a boolean condition.

Now let's get back to optionals.
<h3>Optional Binding</h3>
Optional Binding is a kind of <code>if</code> statement that is used to check if an optional variable contains a value or just contains <code>nil</code>. If the optional variable contains a value, then the block of code in the if statement will run. Otherwise, the whole <code>if</code> statement is skipped over by the compiler.Here is the syntax for an optional binding statement:

<pre>   <code>if let b = a{</code></pre>
<pre>        <code>print(b)</code></pre>
<pre>   <code>}</code></pre>

In the above code, variable <code>a</code> is the optional we want to check for emptiness. If <code>a</code> does have a value that is not <code>nil</code>, then the value of <code>a</code> is copied over to variable <code>b</code>. <code>b</code> exists only within the optional binding statement(so you don't have to be super stressed about what you want to name it). Then, the value of <code>b</code>(which is the value of <code>a</code>) is printed on the console. Again, if <code>a</code> has a value of <code>nil</code>, the whole optional binding statement will be skipped over by the compiler.
<h3>Forced Unwrapping</h3>
Unlike regular variables, optionals have to be unwraped like a gift box so that you can look inside them. To use the value of an optional in your code, you NEED to unwrap it. Sometimes, we don't know whether an optional has a value or not. But sometimes, we are absolutely sure that it does. Only when we are sure, we should unwrap it. If you unwrap it when it has a value of <code>nil</code>, you will get a <code>Fatal error</code> and your program will terminate midway. To unwrap an optional variable, all you have to do is add a <code>!</code> to the end of the name of the optional whenever you want to use the value it holds.

<pre>   <code>var num:Int? = 2000</code></pre>
<pre>   <code>var sum = num! + 18</code></pre>

The result of that code is <code>sum</code>=2018!
<h3>Implicitly unwrapped optionals</h3>
If you know when you are initializing the optional that it is never going to have a value of <code>nil</code>, then you can declare the variable as an implicitly unwrapped optional. This is how you do it:

<pre>   <code>var hello:String!="Hello"</code></pre>

All you had to do was replace the <code>?</code>(used for regular optionals) with <code>!</code>.


{% raw %}
{% endraw %}
