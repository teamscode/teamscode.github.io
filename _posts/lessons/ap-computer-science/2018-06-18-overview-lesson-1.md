---
layout: post-lesson
permalink: /learn/ap-computer-science/overview-lesson-1/
lesson_title: "Overview Lesson #1"
author: Chris Elliott
---

<script src="/questions.js"></script>

{% raw %}

Below is a list of all the lessons you have learned thus far. 

1. What Is Programming?
2. Programming Languages
3. Binary
4. Number Bases
5. The Print Statement – (Hello World), Basic Syntax, and Comments
6. Primitive Variables
7. Advanced Variables
8. Assignment Operators
9. Arithmetic Operators
10. Relational Operators
11. Logical Operators
12. Special Operations
13. If Statement
14. For Loop
15. Advanced For Loop
16. While Loops

<h1>Lesson Quiz</h1>

_Each question in this quiz corresponds to that lesson, so if you miss a specific problem, go back to that problem’s lesson to review._


<h3>1. Programming can be used to complete simple or complex tasks.</h3>

<form>
    <div>
        <input type="radio" value="a" name="cc" onchange="check(this, 'a')">
        a. True
    </div>
    <div>
        <input type="radio" value="b" name="cc" onchange="check(this, 'a')">
        b. False
    </div>
</form>


<h3>2. Syntax is...</h3>

<form>
    <div>
        <input type="radio" value="a" name="cc" onchange="check(this, 'c')">
        a. The pronunciations of different important words.
    </div>
    <div>
        <input type="radio" value="b" name="cc" onchange="check(this, 'c')">
        b. The act of debugging one’s code.
    </div>
    <div>
        <input type="radio" value="c" name="cc" onchange="check(this, 'c')">
        c. The set of rules that governs the grammar/structure of the code.
    </div>
</form>

<h3>3. What is 55 (base 10) converted to binary?</h3>

<form>
    <div>
        <input type="radio" value="a" name="cc" onchange="check(this, 'a')">
        a. 110111
    </div>
    <div>
        <input type="radio" value="b" name="cc" onchange="check(this, 'a')">
        b. 101010
    </div>
    <div>
        <input type="radio" value="c" name="cc" onchange="check(this, 'a')">
        c. 111000
    </div>
    <div>
        <input type="radio" value="d" name="cc" onchange="check(this, 'a')">
        d. 111111
    </div>
</form>

<h3>4. How many bits are in a byte?</h3>

<form>
    <div>
        <input type="radio" value="a" name="cc" onchange="check(this, 'c')">
        a. 2
    </div>
    <div>
        <input type="radio" value="b" name="cc" onchange="check(this, 'c')">
        b. 4
    </div>
    <div>
        <input type="radio" value="c" name="cc" onchange="check(this, 'c')">
        c. 8
    </div>
    <div>
        <input type="radio" value="d" name="cc" onchange="check(this, 'c')">
        d. 10
    </div>
</form>

<h3>5. Which of the following statements will NOT produce an error?</h3>

<form>
    <div>
        <input type="radio" value="a" name="cc" onchange="check(this, 'c')">
        a. <code>system.out.println(“Hello World”);</code>
    </div>
    <div>
        <input type="radio" value="b" name="cc" onchange="check(this, 'c')">
        b. <code>System.Out.Println(‘Hello World’);</code>
    </div>
    <div>
        <input type="radio" value="c" name="cc" onchange="check(this, 'c')">
        c. <code>System.out.println(“Hello World”);</code>
    </div>
    <div>
        <input type="radio" value="d" name="cc" onchange="check(this, 'c')">
        d. <code>System.out.println{ “Hello World” };</code>
    </div>
</form>

<h3>6. Which of the following statements will produce an error?</h3>

<form>
    <div>
        <input type="radio" value="a" name="cc" onchange="check(this, 'a')">
        a. <code>Int x = 5;</code>
    </div>
    <div>
        <input type="radio" value="b" name="cc" onchange="check(this, 'a')">
        b. <code>boolean y = false;</code>
    </div>
    <div>
        <input type="radio" value="c" name="cc" onchange="check(this, 'a')">
        c. <code>char c = ‘c’;</code>
    </div>
    <div>
        <input type="radio" value="d" name="cc" onchange="check(this, 'a')">
        d. <code>double decimal = 10.0;</code>
    </div>
</form>

<h3>7. Is a String a primitive variable?</h3>

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

<h3>8. What is output by the code below?</h3>

        int number = 13;
        number *= 5;
        System.out.println(number);

<form>
    <div>
        <input type="radio" value="a" name="cc" onchange="check(this, 'c')">
        a. <code>*513</code>
    </div>
    <div>
        <input type="radio" value="b" name="cc" onchange="check(this, 'c')">
        b. <code>135</code>
    </div>
    <div>
        <input type="radio" value="c" name="cc" onchange="check(this, 'c')">
        c. <code>65</code>
    </div>
    <div>
        <input type="radio" value="d" name="cc" onchange="check(this, 'c')">
        d. <code>13.5</code>
    </div>
</form>

<h3>9. What is output by the code below?</h3>

        int value = 16;
        int value2 = 5;
        value = value % value2;
        System.out.println(value);

<form>
    <div>
        <input type="radio" value="a" name="cc" onchange="check(this, 'b')">
        a. <code>3</code>
    </div>
    <div>
        <input type="radio" value="b" name="cc" onchange="check(this, 'b')">
        b. <code>1</code>
    </div>
    <div>
        <input type="radio" value="c" name="cc" onchange="check(this, 'b')">
        c. <code>80</code>
    </div>
    <div>
        <input type="radio" value="d" name="cc" onchange="check(this, 'b')">
        d. <code>3.1</code>
    </div>
</form>

<h3>10. Which of the following means “not equal to” in Java?</h3>

<form>
    <div>
        <input type="radio" value="a" name="cc" onchange="check(this, 'd')">
        a. <code>-=</code>
    </div>
    <div>
        <input type="radio" value="b" name="cc" onchange="check(this, 'd')">
        b. <code>/==</code>
    </div>
    <div>
        <input type="radio" value="c" name="cc" onchange="check(this, 'd')">
        c. <code>\==</code>
    </div>
    <div>
        <input type="radio" value="d" name="cc" onchange="check(this, 'd')">
        d. <code>!=</code>
    </div>
</form>

<h3>11. What is value of the statement below?</h3>

        (!(true && false) || !false) && (5+3 >= 7)

<form>
    <div>
        <input type="radio" value="a" name="cc" onchange="check(this, 'a')">
        a. <code>true</code>
    </div>
    <div>
        <input type="radio" value="b" name="cc" onchange="check(this, 'a')">
        b. <code>false</code>
    </div>
    <div>
        <input type="radio" value="c" name="cc" onchange="check(this, 'a')">
        c. <code>ERROR (code not valid)</code>
    </div>
</form>

<h3>12. Which of the following outputs 3 to the console?</h3>

<form>
    <div>
        <input type="radio" value="a" name="cc" onchange="check(this, 'd')">
        a. <code>System.out.println(1 + “” + 2);</code>
    </div>
    <div>
        <input type="radio" value="b" name="cc" onchange="check(this, 'd')">
        b. <code>System.out.println(1 + (2 + “ ”));</code>
    </div>
    <div>
        <input type="radio" value="c" name="cc" onchange="check(this, 'd')">
        c. <code>System.out.println(“” + 1 + 2);</code>
    </div>
    <div>
        <input type="radio" value="d" name="cc" onchange="check(this, 'd')">
        d. <code>System.out.println(“” + (1 + 2));</code>
    </div>
</form>

<h3>13. How many errors are in the code below?</h3>

        If (6 < 10) (
            System.out.println(“Yay”);
        }

<form>
    <div>
        <input type="radio" value="a" name="cc" onchange="check(this, 'c')">
        a. <code>0</code>
    </div>
    <div>
        <input type="radio" value="b" name="cc" onchange="check(this, 'c')">
        b. <code>1</code>
    </div>
    <div>
        <input type="radio" value="c" name="cc" onchange="check(this, 'c')">
        c. <code>2</code>
    </div>
    <div>
        <input type="radio" value="d" name="cc" onchange="check(this, 'c')">
        d. <code>3</code>
    </div>
</form>

<h3>14. What is output by the code below?</h3>

        for (int i = 10; i >= 0; i--) {
            if (i % 2 == 0) {
                System.out.println(i + 2);
            }
        }

<form>
    <div>
        <input type="radio" value="a" name="cc" onchange="check(this, 'b')">
        a. <code>13 11 9 7 5 3</code>
    </div>
    <div>
        <input type="radio" value="b" name="cc" onchange="check(this, 'b')">
        b. <code>12 10 8 6 4 2</code>
    </div>
    <div>
        <input type="radio" value="c" name="cc" onchange="check(this, 'b')">
        c. <code>10 8 6 4 2</code>
    </div>
    <div>
        <input type="radio" value="d" name="cc" onchange="check(this, 'b')">
        d. <code>10 9 8 7 6 5</code>
    </div>
</form>

<h3>15. Does the break command exit all loops if inside a nested for loop?</h3>

<form>
    <div>
        <input type="radio" value="a" name="cc" onchange="check(this, 'b')">
        a. Yes
    </div>
    <div>
        <input type="radio" value="b" name="cc" onchange="check(this, 'b')">
        b. No
    </div>
    <div>
        <input type="radio" value="c" name="cc" onchange="check(this, 'b')">
        c. Sometimes (50/50 chance every time)
    </div>
</form>

<h3>16. Which of the following is false?</h3>

<form>
    <div>
        <input type="radio" value="a" name="cc" onchange="check(this, 'c')">
        a. The while loop uses a boolean to decide whether or not to continue to execute its body statement.
    </div>
    <div>
        <input type="radio" value="b" name="cc" onchange="check(this, 'c')">
        b. While loops are usually more useful than for loops when testing for whether or not a case is true/false.
    </div>
    <div>
        <input type="radio" value="c" name="cc" onchange="check(this, 'c')">
        c. While loops will always run once.
    </div>
</form>

{% endraw %}

