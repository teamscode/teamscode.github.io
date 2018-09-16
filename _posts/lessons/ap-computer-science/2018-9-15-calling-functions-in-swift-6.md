---
layout: post-lesson
permalink: /learn/ap-computer-science/calling-functions-in-swift-5/
lesson_title: Calling Functions in Swift
lesson_desc: This lesson is about conditional operators and some of their uses in iOS.
author: Valliappan Valliappan
---

<script src="/questions.js"></script>
Last lesson, we looked at the concept of functions. Functions are useful only when you know how to use them. To use a function, you call it.
<h3>Calling Functions outside the class</h3>
Calling a function from within the class in which it is defined is differnt from calling it in code that is written outside the curly braces of the class. Let's use the function we wrote in the previous lesson.
<pre>   <code>class Car{</code></pre>

<pre>   <code>//All of the variables below are the properties.</code></pre>

<pre>       <code>var nameOfCar:String //Name of the car</code></pre>

<pre>       <code>var color:String //Color of the car</code></pre>

<pre>       <code>var fuelCapacity:Double // Fuel capacity</code></pre>

<pre>       <code>var currentSpeed:Double</code></pre>

<pre>       <code>var maxSpeed:Double // Max speed</code></pre>

<pre>       <code>var allWheelDrive:Bool // Is it an all wheel drive?</code></pre>

<pre>       <code>init(curSpeed:Double, speed:Double, name:String, fuelCap:Double, AWD:Bool){</code></pre>

<pre>           <code>currentSpeed=curSpeed</code></pre>

<pre>           <code>maxSpeed=speed</code></pre>

<pre>           <code>nameOfCar=name</code></pre>

<pre>           <code>fuelCapacity=fuelCap</code></pre>

<pre>           <code>allWheelDrive=AWD</code></pre>

<pre>       <code>}</code></pre>

<pre>       <code>func drive(speed:Double, fuel:Int)->Double{</code></pre>

<pre>           <code>var fuelRemaining=fuelCapacity - fuel</code></pre>

<pre>           <code>currentSpeed=speed</code></pre>

<pre>           <code>return fuelRemaining</code></pre>

<pre>       <code>}</code></pre>

<pre>   <code>}</code></pre>


This function, belongs to the <code>Car</code> class. Assume we are writing code outside of the <code>Car</code> class.  To call the <code>drive</code> function in this situation, we need an object. Let's create the object.

<pre>   <code>var hondaAccord:Car=Car(</code></pre>



{% raw %}
{% endraw %}