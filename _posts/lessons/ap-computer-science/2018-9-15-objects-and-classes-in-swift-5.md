---
layout: post-lesson
permalink: /learn/ap-computer-science/objects-and-classes-in-swift-5/
lesson_title: Collection Types in Swift
lesson_desc: This lesson is about conditional operators and some of their uses in iOS.
author: Valliappan Valliappan
---

<script src="/questions.js"></script>
We will now be looking at the concept of classes and objects in Swift. Object and classes are at the center of object oriented programming. So, learning just the concept of objects and classes can go a long way in helping you learn other object-oriented languages a lot faster than a beginner. 
<h3>Objects and Classes</h3>
When you create a Class in Swift, you are creating a new variable type and also, you are creating a blueprint for a Car. The blueprint doesn't dictate what car we are allowed to build. It lets us decide the specific value for every property of the car we want to build. Things like color, name, maximum speed, fuel capacity, leg room, etc. are the properties we can specify. But they are the only properties we can specify because specifying the value of any other property which cars don't possess, which is not on the blueprint, will make what we are building, an aircraft or a water fountain. We definitely want a car. Thankfully, Swift doesn't let us specify any value that is not on the blueprint. It is the programmer who will be defining what properties make a car, a car and specifying the values for each of the cars she/he creates.

Building a Car using that blueprint is called creating an object of the Car class or creating an instance of the Car class. The Car you build isn't the general blue print of a Car but a Toyota Prius or a Honda Accord. Objects are what we get when we specify the value for each property of a class. This process of specifying each property of a class is called initialization of an object. Initialization doesn't limit you to have only one Toyota Prius. You can have as many as you want. Now, enough of that metaphor.
Let's get to the coding part. Here is the <code>Car</code> class:

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

<pre>   <code>}</code></pre>

<pre>   <code>}</code></pre>

The properties don't have any value assigned to them yet because they are in the Class and Classes are blueprints. It is during initialization that we set the values for all of the properties. Let's take a short detour to learn about Functions in Swift so that we learn about Initialization because it is a very specific form of a function in Swift.

<h3>Functions</code>
Continuiung with the Car blueprint example, the blueprints also specify what an object of a car can do. In the case of a car, it can move. Moving is a function of every car that is created from the blueprint. The blueprint dictates how the car moves. We can't change how a car drives. Now let's translate that to code. One of the Functions in the Car class is <code>drive()</code> which dictates how a Car drives.

<pre>   <code>func drive()->Void{</code></pre>

<pre>   <code>currentSpeed=maxSpeed</code></pre>

<pre>   <code>}</code></pre>

The way all of the cars move is by changing their current speed to the fastest speed they can go at because that's what the Car class says. The Functions exist because you can use them to drive the Car you have created. Let's look closer at the structure of functions.

{% raw %}
{% endraw %}