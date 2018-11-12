---
layout: post-lesson-ios
permalink: /learn/ios/collection-types-in-swift-7/
lesson_title: Collection Types in Swift
lesson_desc: This lesson is about collection types in Swift.
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

<pre>   <code>doubleStorer.append(23.45)</code></pre>

You might have noticed that the above line of code has some resemblance to how objects call methods. Yes, arrays are objects and they can call methods too. But you are restricted to call only the methods that are defined in the <code>Array</code> structure(similar like a class in Swift). To look at every method that is listed on the <code>Array</code> structure, follow these steps:

<pre>1)  Go to http://developer.apple.com/</pre>
<pre>2)  Type "array" in the search bar and search</pre>

The first search result that pops up would most probably be the <code>Array</code> under the Swift Standard Library. The Swift Standard Library is basically an infrastructure(folder) of all the classes and structures that define Swift as a programming language. It has everything that defines what Swift fundamentally is, such as data types, collection types, etc. The Swift Standard library is always used since it has very generalized uses. For example: You can use the <code>String</code> for any kind of app you are trying to build. Swift also does have other infrastructures that are used for more specific actions. For example, the SpriteKit infrastructure which is mainly used while building two dimensional games.

Here is an exercise you can use to learn to use the different methods for arrays: Create an array with 10 elements all of which have a default value of 213.234 and insert an element with a value of 20.09 into an index of 3. Finally, remove the last element of the array. Do all of this using methods.

<h3>Sets</h3>
Another widely used collection type is the <code>Set</code>. <code>Set</code>s are conceptually similar to arrays. They are both collections types that store a list values. But <code>Set</code>s cannot store two of the same values and has no specific way of ordering the elements it contains. This is why the method used to add an element into a set is called <code>insert</code> and not <code>append</code>. The insert method puts a specific element at a random position in the Set. The append method always puts the specified element at the end of the array, at the last index. Sets have no indices. So, worst case scenario, you will have to go through every single element to find an element with a value you are expecting.

Creating a Set that stores elements of the <code>Double</code> type:
<pre>   <code>var hello=Set<Double>()</code></pre>

Inserting and removing elements:

<pre>   <code>hello.insert(2000)</code></pre>
<pre>   <code>hello.insert(3456)</code></pre>
<pre>   <code>hello.remove(2000)</code></pre>

In the end, the <code>hello</code> Set has only one element which has a value of 3456.

Sets, just like Arrays, have a long list of methods you can use on them. These methods are mentioned in the developer website(http://developer.apple.com). The developer website is going to be one the most important resource for you when developing iOS apps. It explains to you everything you need to know about every single class that is porvided by Apple to its developers. I mean every single class. But sometimes the explanations given on the website may not be helpful enough in your project because you may be trying to use a class provided by Apple for a different application that usual. For times like that, I recommend using https://stackoverflow.com/ and YouTube.
In our next lesson we will be looking at another collection type called <code>Dictionary</code>.
{% raw %}
{% endraw %}