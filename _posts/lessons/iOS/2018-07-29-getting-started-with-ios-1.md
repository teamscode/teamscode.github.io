---
layout: post-lesson-ios
permalink: /learn/ios/getting-started-with-ios-1/
lesson_title: Getting Started with iOS
lesson_desc: Installing Xcode and learning the basics of programming in iOS
author: Valliappan Valliappan
---

<script src="/questions.js"></script>

{% raw %}

Hello! The first step in developing in iOS is to get Xcode on your computer. Please note that Xcode is not available on any other operating system other than macOS.

<h2>Xcode</h2>
Xcode is a programming environment for making applications for apple products. This course will be focussing only on devices that run iOS. This includes iPhones, iPads, etc. Xcode can be used to both write and test code. You can even test how the code you have written will work on an actual iPhone or iPad using the simulators Xcode provides.

<h2>Installation</h2>
Xcode is available on the Mac App Store. Search for Xcode on the App Store and download it. Again, I repeat that you need a Mac to develop for Apple devices.

<h2>Swift</h2>
The programming language we are going to use to make apps is called Swift. Swift is a programming language used to make iOS apps. The first part of this course will be focussed on teaching Swift concepts that are absolutely required to make apps. We will also be looking at concepts that are not used very often but come up once in a while. However, we will not be going into too much detail about them. Links will be provided to learn more about those concepts.

<h1>PART ONE : SWIFT</h1>

<h2>Variables</h2>
A variable is something that holds a value. Every variable has a name and type. The type of a variable is the type of value that will be stored in the variable. If the value that is going to be stored in a variable is 290, the type will be integer. This is because 290 is an integer. 

Variables also have a name. This makes it easy to refer to the value they store and differentiate between multiple variables. It is also used as a label that tells us what the variable is storing the value of.
In Swift, variables are defined like this:

<pre>   <code>var numberOfWheelsInACar : Int = 90</code></pre>

Int is the type, <code>numberOfWheelsInACar</code> is the name and 4 is the value stored in the variable. Int is a keyword that denotes integer in Swift. var is also a keyword. It denotes that we are creating a variable. Int means that the variable we are creating is an integer. Other basic variable types given to us by Swift include <code>String</code>, <code>Double</code>, <code>Float</code>, <code>Bool</code>, etc.
<table>
<tr>
<th colspan="2">Vocab Bar</th>
</tr>
<tr>
<td>String</td>
<td>A type that can store a string of characters. This includes sentences and words.</td>
</tr>
<tr>
<td>Bool</td>
<td>A type that has only two possible values:true and false.</td>
</tr>
<tr>
<td>Int</td>
<td>A type that can hold integer values anywhere between -2,147,483,648 and 2,147,483,647.</td>
</tr>
<tr>
<td>Float</td>
<td>A type that can store a decimal value upto a 32-bit accuracy.</td>
</tr>
<tr>
<td>Double</td>
<td>A type that can store a decimal value upto a 64-bit accuracy.</td>
</tr>
</table>

The types of variables mentioned above are not the only ones! In fact there are hundreds of types that Swift provides us with for various reasons. As we learn more, you will learn to define your own type too.

Now, let’s switch over to something totally different from our current discussion.


<h2>Comments</h2>
When a large group of people work on the same code, it is very helpful if the code had annotations of what it does. That’s what comments are. Everything that is a comment will be ignored by the compiler(the part of Swift that interprets your code). 
There are two kinds of comments in Swift:Single line and Multi line

Single line comments let you comment only until the end of the line you start your comment on, while multi line comments let you extend your comments to any number of lines.

<h4>Single line comment syntax:</h4>

<pre>   <code>// YOUR COMMENT</code></pre>

Everything after the <code>//</code> is a comment in this case.

<h4>Multi line comment syntax:</h4>
<pre>   <code>/* YOUR COMMENT </code></pre>
<pre>       <code>GOES</code></pre>
<pre>       <code>HERE*/</code></pre>

Everything between <code>/*</code> and <code>*/</code> is a comment in this case.
{% endraw %}
