---
layout: post-lesson
permalink: /learn/ap-computer-science/if-statements/
lesson_title: If Statements
lesson_desc: Using if statements to perform different tasks based on current conditions. 
author: James Richardson
---

<script src="/questions.js"></script>

{% raw %}

**If statements** are tools which complete different actions based on the state of a boolean. **Else statements** and **else-if statements** are optional follow-ups to if statements. If statements are actions which only occur if their boolean is true. If the boolean is false, then the code in the brackets is ignored. Here is the if statement syntax:

        if (BOOLEAN) { 

            ...

        } 

If statements are very useful because they serve to make situational decisions. Here is an example:

        if (a % 2 == 0) {

            System.out.print("even");

        }

This if statement will print "even" if the number a is even, but it will do nothing otherwise.

Else and else-if statements are actions which must follow an if statement and will only have an effect if the previous if statement’s boolean is false. Else-if statements have a secondary boolean which must be true for the content to enact while else statements will enact whenever the previous if statement’s boolean is false. Here are else-if and else statement syntaxes:

        else if (BOOLEAN) {

            ...

        } else {

            ...

        } 

Else-if and else statements are useful because they make situational actions according to different booleans and whether or not the first boolean was true. Here is an example:

        if (a > 0) {

            System.out.print("a is positive");

        } else if (a < 0) {

            System.out.print("a is negative");

        } else {

            System.out.print("a equals 0");

        }

This series of statements will print "a is positive" if a > 0, “a is negative” if a < 0, **or** “a equals 0” if neither.

If, else-if, and else statements can make large chains of situational actions. Within these chains, there can be an infinite number of else-if statements; however, at least one original if statement is needed to head the chain and only one optional else statement is allowed to finish the chain. Here is an example of such a chain:

        if (a == 0) {

            System.out.print("a equals 0");     

        } else if (a == 1) {  

            System.out.print("a equals 1");

        } else if (a == 2) {

            System.out.print("a equals 2");

        } else if (a == 3) {

            System.out.print("a equals 3");

        } else {

            System.out.print("a does not equal 0, 1, 2, or 3");

        }   

The program will exit the chain once any of the statements activates or all statements fail to do so.

If statements can also nest, so that multiple situations with multiple booleans can be tested. Here is an example:

        if (a > 0) {

            if (b > 0) {

                ...

            }

            if (b <= 0) {

                ...

            }

        }

Nested if statements greatly increase the functionality of if statements, and allows large amounts of conditional information to be dealt with quickly.

<h1>Lesson Quiz</h1>

<h3>1. What will the below code print if a is 2?</h3>

        if (a == 3) {

            System.out.print("3");

        } else {

            System.out.print("else");

        }

<form>
    <div>
        <input type="radio" value="a" name="cc" onchange="check(this, 'b')">
        a. <code>3</code>
    </div>
    <div>
        <input type="radio" value="b" name="cc" onchange="check(this, 'b')">
        b. <code>else</code>
    </div>
    <div>
        <input type="radio" value="c" name="cc" onchange="check(this, 'b')">
        c. Nothing
    </div>
    <div>
        <input type="radio" value="d" name="cc" onchange="check(this, 'b')">
        d. <code>3else</code>
    </div>
</form>

<h3>2. What will the above code print if b > 0 and z < 9?</h3>

        if (b < 0) {

            if (z > 9) {

                System.out.print("A");

            } else if (z < 9) {

                System.out.print("B");

            } else {

                System.out.print("C");

            }

        }

<form>
    <div>
        <input type="radio" value="a" name="cc" onchange="check(this, 'd')">
        a. <code>A</code>
    </div>
    <div>
        <input type="radio" value="b" name="cc" onchange="check(this, 'd')">
        b. <code>B</code>
    </div>
    <div>
        <input type="radio" value="c" name="cc" onchange="check(this, 'd')">
        c. <code>C</code>
    </div>
    <div>
        <input type="radio" value="d" name="cc" onchange="check(this, 'd')">
        d. Nothing
    </div>
</form>

{% endraw %}