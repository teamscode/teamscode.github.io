---
layout: post-lesson-ios
permalink: /learn/ios/dictionaries-and-loops-in-swift-8/
lesson_title: Dictionaries and Loops in Swift
lesson_desc: This lesson is about the dictionary collection type and all the loops there are in Swift.
author: Valliappan Valliappan
---

<script src="/questions.js"></script>
<h3>Dictionaries in Swift</h3>
Imagine you want to store the prices of all the phones on this planet. So, the data you need to store is a list of all the phones and their corresponding costs. The purpose of storing is to access the cost of any phone. What collection type would you store it in? Arrays could be good. But you would have to maintain two arrays. This is exactly the perfect situation to use a <code>Dictionary</code>.
<code>Dictionaries</code> are collection types where every element is made up of two different values:the key and the value. These two values can be of any type. They can be <code>Int</code>s or <code>String</code>s or any other type of your choice. When you add an element to a dictionary, you need to add both the key and the value of an element. Let's say you make an empty(contains no elements) dictionary which can store keys of the type <code>Double</code> and values of the type <code>String</code> as shown below, then you are saying that your keys will always be <code>Double</code>s and your values will always be <code>String</code>s.

<pre>       <code>var numberDictionary=[Double : String]() //[key : value]</code></pre>

<pre>       <code>numberDictionary = [49.2:"Forty nine point two", 25:"Twenty five"]  //adds two new elements</code></pre>

While using a dictionary in the real world, if you want to find the meaning of a specific word, all you do is find the word and right next to the word, there will be a meaning that is written. This is exactly the case with the dictionary collection type in swift. In the case of our <code>numberDictionary</code>, if we wanted to know how <code>49.2</code> was written in words, we can find the words, which are the value just using the key value of 49.2 as shown below:

<pre>   <code>print(numberDictionary[49.2])</code></pre>

To access the value that correspond to a key in a dictionary, use this syntax: nameOfDictionary[keyValue]. So, what the code above, does is it takes the value that correspond to the key value of 49.2 in the numberDictionary and prints it in the console for us to see. This is very similar to how we access the elements of arrays. If it helps, you can think of keys as the indices of a dictionary. But in this case the indices are defined by you.

That concludes our discussion of the topic of basic collection types. Sets, Arrays and Dictionaries are the only collections types provided to us by Swift. But the fun doesn't end here. You can do a lot with collection types. One example is looking through an entire array to find a value that you are searching for. To do that, we need loops.

<h3>Loops</h3>
Loops are blocks of code that can perform a given task over and over again without the programmer having to write the same code for a task over and over again. There are three types of loops: while, repeat-while and for-in.

<h4><code>while</code> loops</h4>
Let's say you have a variable x, that is a parameter/input for a function. In that case, it is not possible to know the value of x for certain. After the function gets the value, you want it to keep adding a value of 1 repetitively to the value of x until it reaches 200. It is helpful to figure out what the repeated task is, while(pun not intended) before writing the code for a loop. Here, the repeated task is the task of adding one to the value of x. The repeating stops the first time x is not less that 200. That is the termination condition. If it is false that x is less than 200, then the loop stops. Because we add 1s to x, the first time it is not less than 200 is when it is 200. Which means that the loop can continue as long as x is less than 200.
Below is the function that has the while loop:

<pre>   <code>func XtoTwoHundred(x:Int){</code></pre>

<pre>       <code>while(x<200){</code></pre>

<pre>       <code>x += 1 //means x=x+1</code></pre>

<pre>       <code>}</code></pre>

<pre>   <code>}</code></pre>

To write a while loop, you need the <code>while</code> keyword and you need to add a condition that evaluates to a <code>Bool</code>, in the paretheses after the keyword and then you need to add curly braces to indicate that the loop needs to perform the lines of code enclose in the curly braces again and again until the condition becomes false. If the condition is false to begin with, then the loop will never run.
This is the order of events in a while loop: Check if condition is true->run code and back to "Check if condition is true" and so on.

<h4>For-In loops</h4>
Let's start with an example for this one:

<pre>   <code>func printAll(array:[Int]){</code></pre>

<pre>       <code>for i in array {</code></pre>

<pre>       <code>println(i)</code></pre>

<pre>       <code>}</code></pre>

<pre>   <code>}</code></pre>

The <code>printAll</code> function above has a for-in loop. To write a for-in loop, you need a collection or range of values. In this case, the collection of values is an array. The <code>for</code> and the <code>in</code> keyword are necessary. <code>i</code> is a variable of a type that is same as that of values which are stored in the <code>array</code>. In this case because <code>array</code> stores <code>Int</code> values, variable <code>i</code> is of the <code>Int</code> type. What happens when we run this loop? For the first time it runs, the value of the variable <code>i</code> is set to the first value in the <code>array</code> and the value of <code>i</code> is printed on the console. The second time the loop runs, the second value of the <code>array</code> which is set to the variable <code>i</code>, is printed. The same process goes on until the last element of the array is printed on the console and we see every single element of the array occupying its own line in the console. Now, because there are no more elements in the collection type/range of values, the loop stops.

<pre>       <code>for a in 1...10 {</code></pre>

<pre>       <code>println(a)</code></pre>

<pre>       <code>}</code></pre>

In the above code, the part that says <code>1...10</code> represents a range of values starting at 1 and going all the way up to 10. When the loop runs, the variable <code>a</code> is set to a value of 1 and then that value is printed. Throughout all the iterations of the loop, <code>a</code> is set to every integer value between and including 1 and 10. This results in all the values in the range of 1 to 10 including 1 and 10 being printed on the console one number per line.

<h4>repeat-while loops</code>
Repeat while loops are very similar to the <code>while</code> loops we discussed. The only difference is that instead of "Check if condition is true->run code", their order of events is "run code->Check if condition is true".

<pre>   <code>func XtoTwoHundred(x:Int){</code></pre>

<pre>       <code>repeat{</code></pre>

<pre>       <code>x+=1</code></pre>

<pre>       <code>}while x < 200</code></pre>

<pre>   <code>}</code></pre>

This is how the above loop will run: the first time, the block of code under the <code>repeat<code> keyword will run and then the next iteration of the block of code will be run if the condition specified after the <code>while</code> keyword is true. If false, the loop stops and the value of x is one more than it was when it came in as a parameter/input to the function.

That is all the loops there are in Swift. Loops are difficult to use and understand when you are a beginner. So, I recommend that you keep playing with them until you are comfortable. Have fun!!
{% raw %}
{% endraw %}
