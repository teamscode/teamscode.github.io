---
layout: post-lesson-ios
permalink: /learn/ios/calling-functions-in-swift-6/
lesson_title: Calling Functions in Swift
lesson_desc: This lesson is about conditional operators and some of their uses in iOS.
author: Valliappan Valliappan
---

<script src="/questions.js"></script>
Last lesson, we looked at the concept of functions. Functions are useful only when you know how to use them. To use a function, you call it. Initializers are a type of function.
Below is the <code>Car</code> class(just for reference):
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

<h3>Initializers</h3>
Initializers are functions that return an object of a class. The function <code>init(curSpeed:Double, speed:Double, name:String, fuelCap:Double, AWD:Bool)</code> in the <code>Car</code> class. Before learning how to call an initializer, let's learn to write one.

First off, initializers are just functions that return objects of classes and to write one, you need only the <code>init</code> keyword. You do not need a return type, a return statement or a <code>func</code> keyword because the <code>init<code> keyword tells the compiler that you are about to write an initializer and it knows that initializers return objects of the <code>Car</code> type (in this case), and that they are functions.
Here is the header(first line) of an initializer:
<pre>   <code>init(curSpeed:Double, speed:Double, name:String, fuelCap:Double, AWD:Bool)</code></pre>
You might have noticed that it has parameters(inputs). The main use of these parameters is to get the specific values for the <code>Car</code> object you want to create. Because only if you create an object, you can drive it and use it in many ways. Just having the blueprint for a Car is not enough if you want to drive it. Inside the scope of the initializer(Scope=the code between the curly braces of an initializer), the inputs are assigned to each property of the Class. For example, the input called <code>name</code> gets the name of the car and in the scope of the initializer, we assign it to the property of the <code>Car</code> class called <code>nameOfCar</code>. Assigning inputs to their respective property is not the only thing you can do in an initializer. You can also get many other totally unrelated inputs from the programmer who is creating the object and not even use those inputs. Or you can use those inputs to calculate some value you are going to use in the future. What I mean is assigning the value of the parameters to the value of properties is not the only thing you can do with initializers. You can use them just like you use any other method.
Now, let's move on to how to call an initializar. Most of the time, when you are calling an initializer, you will want to assign the object it returns, to a variable. The below code is what you write if you want to create a variable named <code>prius</code> of the <code>Car</code> type(Classes give the blueprint for objects that can be created from them and when the objects are created, they are of the class's type) that will hold an object of the <code>Car</code> class, this is how you do it:
<pre>   <code>var prius:Car=Car(curSpeed:23.99, speed:12.334, name:"PRIUS", fuelCap:30.50, AWD:true)</code></pre>
The part of that code which says <code>Car(curSpeed:23.99, speed:12.334, name:"PRIUS", fuelCap:30.50, AWD:true)</code> is how you call the initializer. You just replace the <code>init</code> keyword in the initializer with the name of the class and fill up the values for the parameters while calling the initializer. 

<h3>Calling Functions outside the class</h3>
Calling a function from within the class in which it is defined is different from calling it in code that is written outside the curly braces of the class. Let's use the code we see in the <code>Car</code> class.The <code>drive</code> function, belongs to the <code>Car</code> class. Assume we are writing code outside of the <code>Car</code> class.  To call the <code>drive</code> function in this situation, we need an object. Let's create the object.

<pre>   <code>var hondaAccord:Car=Car(curSpeed:23.99, speed:12.334, name:"HONDA ACCORD", fuelCap:30.50, AWD:true)</code></pre>

Now, let's drive the Honda Accord we have created.

<pre>   <code>hondaAccord.drive(speed:90.322, fuel:0.9)</code></pre>

<code>drive</code> is a function that "drives" a Car object. To call the function, you first type the name of the object you want to drive. In this case the name is <code>hondaAccord</code>. Then type a dot or a full-stop or whatever you call ".". Then type the name of the function you want the object to call. In this case it is <code>drive</code>. After that, in parantheses(just like it is defined in the <code>Car</code>  class), type the names and the values of the parameters. The order matters. So, to know the right order, look at how you wrote it in the function definition of the <code>drive</code> method in the <code>Car</code> class. That's all!

Calling Functions inside the class
Calling a function from within the class in which it is defined is easier than calling it from outside. To call it within the class, you don't need an object. This is because the class is just a blueprint. And you don't need a Car to write instruction about how a Car drives.
Let's see this in the form of code. Let's say we want a function that makes the car drive like crazy. Using the <code>drive</code> function will make it easier to write how to drive crazy because driving like crazy, is a kind of driving(Driving like crazy definition=Driving with a speed of 100000 miles/s and using a fuel amount of 1500 gallons). This is what we do to define in the blueprint of a car how to drive like a crazy person(Please note that this code needs to be in the scope of the Car class):

<pre>       <code>func crazyDrive()->Double{</code></pre>

<pre>           <code>return drive(speed:100000, fuel:1500)</code></pre>

<pre>       <code>}</code></pre>

We call the drive method just like we called it outside the class in the previous topic but without the the name of the object and the ".". The return statement does something very interesting here. When you do something like that in Swift, this is what happens:
1)The <code>drive</code> function is called.
2)The <code>Double</code> value returned by the <code>drive</code> function is passed on to the <code>crazyDrive</code> function and it returns the <code>Double</code> value.

So, now we have most of the basics of object oriented programming. In the next lesson we will be learning about COLLECTION TYPES!!! 
{% raw %}
{% endraw %}
