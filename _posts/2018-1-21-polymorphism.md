---
layout: post-lesson
permalink: /learn/ap-computer-science/polymorphism/
lesson_title: Polymorphism
lesson_desc: How to use polymorphism to write better code. 
author: Alan Bi
---

<script src="/questions.js"></script>

{% raw %}

Polymorphism is when different subclasses can have their own unique implementations of methods while still falling under the same type as their parent class. When declaring a variable, we learned that on the left side of the equals sign is a type that specifies what kind of object the variable is able to hold, while the right side assigns that variable the actual object of that type or of a subclass. The great thing about this is that you can safely substitute different subclasses in for the object on the right, and you will get different behavior based on each of those subclasses’ implementation of their methods. 

For example, the type on the left could be an electronic reader and the object on the right could be anything that you can read books on, like an iPhone or a Kindle:

        ElectronicReader reader1 = new iPhone();

        ElectronicReader reader2 = new Kindle();

        // ElectronicReader is the type, iPhone and Kindle are the actual objects

Remember that the type describes which methods are available to that variable, which means that you can’t call any methods that aren’t specified by that type, even if those methods are included in subclasses. This might seem like a limitation, but this actually helps to prevent any errors from occurring when someone tries to call a method on a specific subclass that might not be available on all subclasses and isn’t specified in the parent class. 

To explain this in terms of the electronic reader example, imagine that you had an object whose type is an electronic reader. Now try asking that object to make a call or text someone. You can definitely do that with an iPhone, but not with a Kindle; trying to call that method on a Kindle would produce an error. Because the actual electronic reader could be either an iPhone or a Kindle, you are restricted from all methods in an iPhone that aren’t specified in an electronic reader. This way, because people asked for an electronic reader, they will for sure get an electronic reader, but they are not going to get any extra features if they happen to get a more advanced iPhone instead of a Kindle. 

However, if you for sure know that you have an iPhone, you could cast your electronic reader into an iPhone to use the call and text features. For example, if you have an iPhone classified as an electronic reader, you can cast the electronic reader to be an iPhone and that will allow you to use an iPhone’s methods. However, be careful when doing this; if you tried to cast the electronic reader into an iPhone but it turned out that the electronic reader was a Kindle, you would have gotten a <code>ClassCastException</code>. 

Let’s move on to some examples. The following is the code for three different classes: 

        public abstract class Shape {

            public abstract double area();

        }

        public class Square extends Shape {

            private double length;


            public Square(double length) {

                this.length = length;

            }

            public double area() {

                return length * length;

            }

        }

        public class Circle extends Shape {

            private double radius;


            public Circle(double radius) {

                this.radius = radius;

            }

            public double area() {

                return Math.PI * radius * radius;

            }

            public double circumference() {

                return 2 * Math.PI * radius;

            }

        }

Now consider the following variables: 

        Shape s1 = new Square(5);

        Shape s2 = new Circle(2);

And the following method calls:

        s1.area();                      // 25

        s2.area();                      // 12.566 (4π)

        ((Circle) s2).circumference();  // 12.566 (4π)

        s2.circumference();             // Compiler error

        ((Circle) s1).circumference();  // Runtime error

The first three calls are valid. The calls to the area method will find the respective methods in each of the <code>Square</code> and <code>Circle</code> classes and return the proper value through polymorphism. The third call casts <code>s2</code> into a <code>Circle</code>. Although the actual object is already a circle, casting the type defined on the left side of the equals sign tells the computer to actually treat it as a circle instead of as a shape. Now that <code>s2</code> has been casted, the call to the <code>circumference</code> method is valid. 

The last two calls, however, are invalid. The call to the <code>circumference</code> method on <code>s2</code> is not valid in the fourth call because <code>s2</code> has not been casted to a circle. Java still sees <code>s2</code> as a simple <code>Shape</code>, and the <code>Shape</code> class does not have a <code>circumference</code> method. Therefore, this call will produce a compiler error.

The fifth call is invalid because <code>s1</code> holds a <code>Square</code>, and you can’t cast a <code>Square</code> into a <code>Circle</code>. At first, the compiler will allow the cast because it doesn’t check if the cast is valid. Instead it checks whether the <code>Circle</code> class, which <code>s1</code> is being casted into, has the specified <code>circumference</code> method. As long as the method is found, the compiler tests will pass. However, once you run the program and attempt to cast <code>s1</code> into a <code>Circle</code>, the runtime error will be produced. 

You still might be wondering why you would have defined the variables above as shapes instead of doing something like this: 

        Square s1 = new Square(5);

        Circle s2 = new Circle(2);

The reason is simple. Using inheritance allows you to be much more flexible if you ever decide to go back and change your code. For example, if you initially had the following variable and method: 

<pre><code>
    <b>Square</b> s = new <b>Square</b>(5);

    public boolean areaLessThanTen(<b>Square</b> s) {

        return s.area() < 10.0;

    }
</code></pre>

And then you later decided you wanted to switch the object to be a <code>Circle</code> instead of a <code>Square</code>, you’d have to change everything in bold from <code>Circle</code> to Square. On the other hand, consider this:

<pre><code>
    Shape s = new <b>Square</b>(5);

    public boolean areaLessThanTen(Shape s) {

        return s.area() < 10.0;

    }
</code></pre>

There is only one snippet of code that needs changing. So if you frequently have to go back and make changes, or if let’s say you have many different types of shapes, taking advantage of inheritance and polymorphism can be extremely beneficial. 


<h1>Lesson Quiz</h1>

<h3>1. What is polymorphism?</h3>

<form>
    <div>
        <input type="radio" value="a" name="cc" onchange="check(this, 'a')">
        a. Each subclass having unique behavior while still being a part of the same parent class.
    </div>
    <div>
        <input type="radio" value="b" name="cc" onchange="check(this, 'a')">
        b. The ability for a class to change its method implementations during runtime. 
    </div>
    <div>
        <input type="radio" value="c" name="cc" onchange="check(this, 'a')">
        c. The act of one class extending or implementing a parent class. 
    </div>
</form>

<h3>2. Do casting errors result in a compiler error or runtime error?</h3>

<form>
    <div>
        <input type="radio" value="a" name="cc" onchange="check(this, 'b')">
        a. Compiler error
    </div>
    <div>
        <input type="radio" value="b" name="cc" onchange="check(this, 'b')">
        b. Runtime error
    </div>
</form>

<h3>3. A parent class has a method <code>method1()</code> and a subclass has a method <code>method2()</code>. Which of the following is true?</h3>

<form>
    <div>
        <input type="radio" value="a" name="cc" onchange="check(this, 'b')">
        a. The parent class automatically inherits <code>method2()</code> from the subclass. 
    </div>
    <div>
        <input type="radio" value="b" name="cc" onchange="check(this, 'b')">
        b. The subclass automatically inherits <code>method1()</code> from the parent class.
    </div>
    <div>
        <input type="radio" value="c" name="cc" onchange="check(this, 'b')">
        c. Both classes inherit each other’s methods. 
    </div>
</form>


{% endraw %}


