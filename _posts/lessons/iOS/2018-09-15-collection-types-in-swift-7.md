---
layout: post-lesson-ios
permalink: /learn/ios/collection-types-in-swift-7/
lesson_title: Collection Types in Swift
lesson_desc: THIS LESSON IS INCOMPLETEThis lesson is about collection types in Swift.
author: Valliappan Valliappan
---

<script src="/questions.js"></script>
Get ready... This is going to be one of the most useful lessons.
<h2>Collection Types</h2>
Collection types in Swift are nothing but a variable type. There are 3 main collection types that Swift gives us: <code>Array</code>, <code>Dictionary</code> and <code>Set</code>. All collection types in Swift can store only one type of value. You need to declare what the type you want them to store while creating the variable. If I want an <code>Array</code> to store <code>String</code> values, then I will have to specify that when I am creating the <code>Array</code> variable.

<h3>Arrays</h3>
All collection types are just like any other type of variable. You definitely need a variable belonging to a collection type in order to store values of a specific type. So let's create an <code>Array</code> that stores <code>Double</code> values.

<pre>   <code>var doubleStorer : [Double]</code></pre>

In the above line of code, we are creating a variable named <code>doubleStorer</code>(I could have called it Bob if I wanted to) of the type <code>[Double]</code>. <code>[Double]</code> is the interesting part. The "[" and "]" surrounding <code>Double</code> denote that the variable is an array. And the variable type specified in between the "[" and "]" tells us what type of value the array is going to store. Arrays can store ONLY ONE type of value. So, now we have a <code>Double<code> array.
As of now, this array has a value of <code>nil</code>. We want to make an array that stores values. Before that, let's create an empty array.

<pre>   <code>doubleStorer = [Double]() //This will assign an empty Double array to doubleStorer</code></pre>

This makes the array have no values but also not <code>nil</code>. Now, let's see how to store multiple <code>Double</code> values in the array.

<pre>   <code>doubleStorer = [2.0, 3.4, 5.6]</code></pre>

In the above line of code, the <code>Double</code> values stored in <code>doubleStorer</code> include 2.0, 3.4 and 5.6.
Arrays are an organized collection type. Hotels have rooms in them and if you want to see a person in the hotel, the most efficient way to do that is to look for the room number of the person you are searching for. Like hotel rooms have numbers to identify them, values in an array have indices(Plural of index). Room numbers can start at any number but array indices always start at 0 and increase by 1 for every consecutive array element( The 6th element means the 6th value stored in the array).Every element that is stored in an array, has an index. In the case of <code>doubleStorer</code>, we have the value <code>2.0</code> at the index of 0, we have the value <code>3.4</code> at the index of 1 and we have the value <code>5.6</code> at the index of 2.

If you want to add elements into an array, just call the <code>append()</code> method. Here is how you call it:














{% raw %}
{% endraw %}
