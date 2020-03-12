---
layout: post-lesson-ios
permalink: /learn/ios/optionals-and-operators-in-swift-2/
lesson_title: Optionals and Operators in Swift
lesson_desc: This lesson is about arithmetic operators and optionals in Swift.
author: Valliappan Valliappan
---

<script src="/questions.js"></script>

{% raw %}
<h3>Setting up Xcode to experiment with Swift</h3>
Xcode has a feature called “playground” for experimenting with Swift quickly. Here’s how you create a playground:
Open Xcode -> File -> New -> Playground.
After that, in the window that opens, select the “iOS tab” and select “Blank”. Now, name the playground whatever you want, and save it wherever you want.
You are now ready to start coding in Swift!
<h3>Optionals</h3>
You declare a variable optional when you know that there is a possibility for it to have no value. You can declare a variable as optional only when you are declaring what type it is. And you can declare the type only when you create a variable. 
There is a very small difference between creating a variable that is not optional and creating one that is optional:

<pre>   <code>var numberOfBones:Int=216 //This variable is not optional</code></pre>

<pre>   <code>var numberOfBonesOptional:Int? //This variable is an optional</code></pre>

As you can see, the only difference is the change from <code>Int</code> to <code>Int?</code>. That change makes a variable of type <code>Int</code> that can either hold a value or not hold a value. Notice that because <code>numberOfBonesOptional</code> is an optional <code>Int</code> variable, we did not have to set it equal to a value.
To create optional variables of other types, just add a <code>?</code> to the end of the type name when you are creating a variable.

<h3>The <code>nil</code> keyword</h3>
If an optional variable is not assigned a value, it is in the state of having no value. But what do you do when you want an optional to store no value after storing a value. The <code>nil</code> keyword in Swift is used exactly for this. It takes a variable to a state of having no value. You take an optional variable and set it equal to <code>nil</code> and that’s it!

<pre>   <code>numberOfBonesOptional=nil</code></pre>

This is not the only use for the <code>nil</code> keyword. It is used just like a value of a variable(like 29 for an <code>Int</code>). The only difference is that it can be assigned to variables of all types and has a value of “nothing”.

<h4>A new skill</h4>
To explain the next part of this lesson we are going to have to learn a new skill that we won’t fully understand. I promise that I will come back and explain it in detail when we are ready for it. The skill is displaying the value of a variable on the screen. It’s often called printing a variable on the screen. 
You can print using just this one line of code:

<pre>   <code>print(name)</code></pre>

Replace name with the name of the variable you want to print.Remember, every part of that line of code is necessary.
<h4>Applying the skill</h4>
Let’s create an <code>Int?</code> variable called <code>hello</code>:

<pre>   <code>var hello:Int?</code></pre>

We haven’t assigned any value to the variable <code>hello</code>. So, it’s value right now, is <code>nil</code>. Let’s print the value of <code>hello</code> and find out if we are right!

<pre>   <code>print(hello)</code></pre>

In the area where what we print appears in Xcode, we get a result that displays <code>nil</code>. We were RIGHT!
Let’s assign a value to <code>hello</code> and check if that value is displayed to us.

<pre>   <code>hello=3421 //Assigned 3421 to hello</code></pre>

<pre>   <code>print(hello)</code></pre>

The result of running that code is 3421 being displayed on Xcode. Remember the concept of optionals! They are extremely helpful in Swift and in iOS. Now, we will be switching over to a completely different topic.

<h3>Arithmetic operators</h3>
Arithmetic operators are operators like <code>+</code> and <code>-</code> that you can use to carry out mathematical operations. The vocab bar below gives all the arithmetic operators in Swift along with their functions:
<table>
<tr>
<th colspan="2">Vocab Bar</th>
</tr>
<tr>
<td>+</td>
<td>Adds two numbers.</td>
</tr>
<tr>
<td>-</td>
<td>Subtracts two numbers.</td>
</tr>
<tr>
<td>*</td>
<td>Multiplies two numbers.</td>
</tr>
<tr>
<td>/</td>
<td>Divides two numbers and gives the quotient.</td>
</tr>
<tr>
<td>%</td>
<td>Divides two numbers and gives the remainder.</td>
</tr>
</table>
Examples of how to use the operators mentioned above:

<pre>   <code>var i:Int?</code></pre>

Addition:

<pre>   <code>i=2+1 //Makes i=3</code></pre>

Subtraction:

<pre>   <code>i=2934-2 //Makes i=2932</code></pre>

Multiplication:

<pre>   <code>i=2*25 //Makes i=50</code></pre>

Division giving quotient:

<pre>   <code>i=1000/2 //Makes i=500</code></pre>

Division giving remainder:

<pre>   <code>i=5%3 //Makes i=2</code></pre>

<h4>Unary operators</h4>
Unary operators are the unary <code>+</code> and the unary . When you add a unary <code>+</code> in the beginning of a number or variable, it is like multiplying its value by plus 1. If you add a unary <code>-</code>, that’s like multiplying the value of the variable or the number by negative one.

<pre>   <code>var a = +hello //Makes a=hello</code></pre>

<pre>   <code>var b = -hello //Makes b=hello*-1</code></pre>

<h3>Compound assignment operators</h3>

<pre>   <code>var count:Int=19</code></pre>

If <code>count</code> is occasionally incremented by 1, then that means that we need the current value of count to calculate its next value. We could store it in another variable called <code>backup</code> and then we could say:

<pre>   <code>count=backup+1</code></pre>

when we want to update the value of count. But that takes way too much effort.
So Swift has a shortcut for this. We can just say:

<pre>   <code>count=count+1</code></pre>

That was easy!
But programmers wanted it to be easier because it feels unnecessary to type <code>count</code> twice.
That statement was shortened to:

<pre>   <code>count+=1</code></pre>

This gives the same result as <code>count=count+1</code>.
This is not just true for the addition operation but for other operations too.

<pre>   <code>count*=2 //Means count=count*2</code></pre>

<pre>   <code>count/=2 //Means count=count/2</code></pre>

<pre>   <code>count-=2 //Means count=count-2</code></pre>

<pre>   <code>count%=2 //Means count=the remainder when count is divided by 2</code></pre>
{% endraw %}


