---
layout: post-lesson-ios
permalink: /learn/ios/objects-and-classes-in-swift-5/
lesson_title: Objects and Classes in Swift
lesson_desc: This lesson is about object oriented programming in Swift.
author: Valliappan Valliappan
---

<script src="/questions.js"></script>
We will now be looking at the concept of classes and objects in Swift. Object and classes are at the center of object oriented programming. So, learning just the concept of objects and classes can go a long way in helping you learn other object-oriented languages a lot faster than a beginner. 
<h3>Objects and Classes</h3>
When you create a Class in Swift, you are creating a new variable type and also, you are creating a blueprint for a Car. The blueprint doesn't dictate what car we are allowed to build. It lets us decide the specific value for every property of the car we want to build. Things like color, name, maximum speed, fuel capacity, leg room, etc. are the properties we can specify. But they are the only properties we can specify because specifying the value of any other property which cars don't possess, which is not on the blueprint, will make what we are building, an aircraft or a water fountain. We definitely want a car. Thankfully, Swift doesn't let us specify any value that is not on the blueprint. It is the programmer who will be defining what properties make a car, and specifying the values for each of the cars she/he creates.

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

<h3>Functions</h3>
Continuiung with the Car blueprint example, the blueprints also specify what an object of a car can do. In the case of a car, it can move. Moving is a function of every car that is created from the blueprint. The blueprint dictates how the car moves. We can't change how a car drives. Now let's translate that to code. One of the Functions in the Car class is <code>drive</code> which dictates how a Car drives.

<pre>   <code>func drive(speed:Double, fuel:Int)->Double{</code></pre>

<pre>       <code>var fuelRemaining=fuelCapacity - fuel</code></pre>

<pre>       <code>currentSpeed=speed</code></pre>

<pre>       <code>return fuelRemaining</code></pre>

<pre>   <code>}</code></pre>

The way all of the cars move is by changing their current speed to the given speed because that's what the Car class says. The Function exists because you can use it to drive the Car you have created. Let's look closer at the structure of functions.

<h5>Structure of functions</h5>
Functions have 5 parts:the <code>func</code> keyword, name, inputs, output, return statement.
The <code>func</code> keyword tells the compiler that you are writing a function for the Car class. The name of the function, in this case drive, is used as a way of identifying the function when you want one of your objects to use it. Think of the function as a function in math. For example, y=2x+340.Here, y is the output and x is the input. Just like that, functions in Swift have inputs and an output. There are two inputs for the <code>drive</code> function. The first one is named <code>speed</code> and it is of the <code>Double</code> type. The second input is named <code>fuel</code> and is of the <code>Int</code> type. The inputs are named because only then, we can identify and work with the values they are given when the function is called. We also need to specify the type of the inputs(Inputs are known as parameters). Let's move on to the returning part of functions.
Just like that math function gives out the value of y when given an input, Swift functions give an output. In the first line of the function, which is called the header, we need to specify the variable type of the value that is going to be returned. In the case of <code>drive</code>, the return type(output type) is <code>Double</code>. The <code>-></code> before the return type is required whenever your function returns any value. If your function doesn't return any value, then you don't need the <code>-></code>, the return type or the return statement. When you say in the header of the function that you are going to return a value of a certain type, you need a return statement in the body of the function to return a value of the specified type. In this case, you need to return a <code>Double</code> value.
Returning is just outputing. To write a return statement, you write the <code>return</code> keyword followed by a space followed by the value you want to return. You can either return an actual value like <code>2.03</code> or you could just type the name of the variable whose value you want to return. That is the reason I typed <code>return fuelRemaining</code>.
{% raw %}
{% endraw %}
