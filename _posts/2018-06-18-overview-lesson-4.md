---
layout: post-lesson
permalink: /learn/ap-computer-science/overview-lesson-4/
lesson_title: "Overview Lesson #4"
author: Chris Elliott
---

<script src="/questions.js"></script>

{% raw %}

Below is a list of all the lessons this overview lesson will cover. 

1. Objects
2. Object-Oriented Programming
3. Inheritance
4. Inheritance Principles
5. Abstract Classes
6. Interfaces
7. Polymorphism

<h1>Lesson Quiz</h1>

_Each question in this quiz corresponds to that lesson, so if you miss a specific problem, go back to that problem’s lesson to review._


<h3>1. What is one main difference between objects and primitives?</h3>

<form>
    <div>
        <input type="radio" value="a" name="cc" onchange="check(this, 'b')">
        a. Objects don’t use variable assignment.
    </div>
    <div>
        <input type="radio" value="b" name="cc" onchange="check(this, 'b')">
        b. Programmers can create new objects from custom-defined classes but cannot create new primitives.
    </div>
    <div>
        <input type="radio" value="c" name="cc" onchange="check(this, 'b')">
        c. All objects are mutable while all primitives are immutable.
    </div>
    <div>
        <input type="radio" value="d" name="cc" onchange="check(this, 'b')">
        d. Casting works on primitives but not on objects.
    </div>
</form>


<h3>2. Which of the following is not a benefit of object-oriented programming?</h3>

<form>
    <div>
        <input type="radio" value="a" name="cc" onchange="check(this, 'c')">
        a. Classes created in other programs can easily be reused for other uses.
    </div>
    <div>
        <input type="radio" value="b" name="cc" onchange="check(this, 'c')">
        b. Knowledge of an object’s implementation is not necessary for its usage.
    </div>
    <div>
        <input type="radio" value="c" name="cc" onchange="check(this, 'c')">
        c. Object-oriented programming projects are typically much smaller and take less time to create.
    </div>
    <div>
        <input type="radio" value="d" name="cc" onchange="check(this, 'c')">
        d. Programmers can create objects that hide certain aspects in order to avoid others from changing values necessary to the object.
    </div>
</form>

<h3>3. What is a superclass?</h3>

<form>
    <div>
        <input type="radio" value="a" name="cc" onchange="check(this, 'a')">
        a. A class that has a subclass which inherits some of its methods/fields.
    </div>
    <div>
        <input type="radio" value="b" name="cc" onchange="check(this, 'a')">
        b. A class that hides information from the user.
    </div>
    <div>
        <input type="radio" value="c" name="cc" onchange="check(this, 'a')">
        c. A class that inherits methods/fields from another class.
    </div>
    <div>
        <input type="radio" value="d" name="cc" onchange="check(this, 'a')">
        d. A class that can be accessed without creating an instance of that class.
    </div>
</form>

<h3>4. If the <code>GoldenRetriever</code> class extends the <code>Dog</code> class, which of the following code segments would cause a error?</h3>

<form>
    <div>
        <input type="radio" value="a" name="cc" onchange="check(this, 'a')">
        a. <code>GoldenRetriever goldenRetriever = new Dog();</code>
    </div>
    <div>
        <input type="radio" value="b" name="cc" onchange="check(this, 'a')">
        b. <code>Dog goldenRetriever = new GoldenRetriever();</code>
    </div>
    <div>
        <input type="radio" value="c" name="cc" onchange="check(this, 'a')">
        c. Both a. and b. would cause an error. 
    </div>
</form>

<h3>5. Is the following line of code valid?</h3>

        BankAccount myAccount = new BankAccount(); // BankAccount is an abstract class

<form>
    <div>
        <input type="radio" value="a" name="cc" onchange="check(this, 'b')">
        a. Yes
    </div>
    <div>
        <input type="radio" value="b" name="cc" onchange="check(this, 'b')">
        b. No
    </div>
</form>

<h3>6. Which of the following is true about interfaces?</h3>

<form>
    <div>
        <input type="radio" value="a" name="cc" onchange="check(this, 'd')">
        a. An interface extending another interface is responsible for implementing all of its methods.
    </div>
    <div>
        <input type="radio" value="b" name="cc" onchange="check(this, 'd')">
        b. Interface methods can have access modifiers such as public, private, and protected.
    </div>
    <div>
        <input type="radio" value="c" name="cc" onchange="check(this, 'd')">
        c. Interfaces are the same as abstract classes.
    </div>
    <div>
        <input type="radio" value="d" name="cc" onchange="check(this, 'd')">
        d. Interfaces do not have constructors.
    </div>
</form>

<h3>7. What is polymorphism?</h3>

<form>
    <div>
        <input type="radio" value="a" name="cc" onchange="check(this, 'a')">
        a. The mechanism of the correct method being selected for a specific object out of a class hierarchy.
    </div>
    <div>
        <input type="radio" value="b" name="cc" onchange="check(this, 'a')">
        b. The process of making a decision during compile-time.
    </div>
    <div>
        <input type="radio" value="c" name="cc" onchange="check(this, 'a')">
        c. The process of creating a class hierarchy which can be used to more easily share code among classes.
    </div>
    <div>
        <input type="radio" value="d" name="cc" onchange="check(this, 'a')">
        d. Creating a class that represents an abstract concept by not fully implementing all of the methods.
    </div>
</form>

{% endraw %}

