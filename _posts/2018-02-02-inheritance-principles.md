---
layout: post-lesson
permalink: /learn/ap-computer-science/object-oriented-programming/
lesson_title: Object-Oriented Programming
lesson_desc: An introduction to the definition of object oriented programming. 
author: James Richardson
---

<script src="/questions.js"></script>

{% raw %}

Object Oriented Programming (OOP) is the design process used in Java and many other programming languages. With OOP, programming is based on relationships and interactions between objects (classes). In OOP, classes define the properties and actions of an object and represents them as fields and methods. There are many other abilities used in OOP, but the concept of classes is the most basic and essential component of the subject.

Here is an example of a class Dog: 

        public class Dog {

            private Color c;

            private double weightLBS;

            private int age;

            private String name;

            

            public Dog() {

                ...

            }

            public static void bark() {

                ...

            }

        }

The benefits of this programming format are that with objects, once a library is built, every class’s information is kept and can be reused. OOP also is a much easier programming method for reusing information in both inheritance and class libraries. OOP is also easier to debug due to its modularity and easier to prevent errors with built in try-catch loops.

<h1>Lesson Quiz</h1>

<h3>1. Which is not a benefit of Object Oriented Programming?</h3>

<form>
    <div>
        <input type="radio" value="a" name="cc" onchange="check(this, 'd')">
        a. Object libraries
    </div>
    <div>
        <input type="radio" value="b" name="cc" onchange="check(this, 'd')">
        b. Modulation
    </div>
    <div>
        <input type="radio" value="c" name="cc" onchange="check(this, 'd')">
        c. Inheritance
    </div>
    <div>
        <input type="radio" value="d" name="cc" onchange="check(this, 'd')">
        d. All of the above are beneficial features of OOP. 
    </div>
</form>

{% endraw %}