---
layout: post-lesson
permalink: /learn/ap-computer-science/arithmetic-operators/
lesson_title: Arithmetic Operators
lesson_desc: An introduction to arithmetic operators, including modulo, and casting. 
author: James Richardson
---

<script src="/questions.js"></script>

{% raw %}

<table>
  <tr>
    <th colspan="2">Code Bar</th>
  </tr>
  <tr>
    <td>()</td>
    <td>Parentheses</td>
  </tr>
  <tr>
    <td>%</td>
    <td>Modulo</td>
  </tr>
  <tr>
    <td>*</td>
    <td>Multiply</td>
  </tr>
  <tr>
    <td>/</td>
    <td>Divide</td>
  </tr>
  <tr>
    <td>+</td>
    <td>Add</td>
  </tr>
  <tr>
    <td>-</td>
    <td>Subtract</td>
  </tr>
  <tr>
    <td>(<code>int</code>)</td>
    <td>Casts number to int</td>
  </tr>
  <tr>
    <td>(<code>double</code>)</td>
    <td>Casts number to double</td>
  </tr>
</table>

In computer programming, understanding order of operations is essential to having correct mathematical operations. The order of operations used in computers is very similar to our mathematical order of operations. Math operations are read from left to right, parentheses are first completed, then multiplication, division, and modulo, then addition and subtraction.

Modulo is a math operation which finds the remainder of a number in division operations. Here are some examples:


        5 % 3 = 2
        15 % 7 = 1
        45 % 9 = 0


Modulo is useful for many mathematical applications. One of which is determining if a number is even or odd.

        int num;
        num % 2;        // equals 0 if num is even or equals 1 if num is odd

When using Java to calculate values, the variable type of each variable becomes vital to the final value. Here are three important rules which need to be known when working with int and double calculations:

Operations which combine ints and doubles will produce a double as a result. Here is an example:

        int a = 3;
        double b = 1.0;
        // a * b = 3.0
        // 3 (a + 2) - b = 14.0

Int operations which do not result in an integer will round the result to the next smallest integer; this is called truncating. Here is an example:

        int k = 1;
        //  k / 2 = 0

Values can be converted to another variable type - such as double, int, long, float, etc -  by using a tool known as casting. 

Casting with numerical types like ints will change the storage size and the precision of value (decimals). Casting is often used as a tool to prevent mathematical errors or correcting parameters. Here is the syntax:

        (TYPE) #

By using casting, the result of a mathematical relationship will vary dramatically depending on the placement of the action. Here is an example:

        int j = 3;
        double k = 2.5;

        j - k;          // = 0.5
        j - (int) k;    // = 3 - 2 = 1
        (int) (j - k);  // = (int) 0.5 =  0 

Casting changes the type of the value, not the type of the variable. Therefore, if a variable is initialized to a type different from its own, complications can occur. 


<h1>Lesson Quiz</h1>

<h3>1. What is the value of the below statement?</h3>

        178 % 2

<form>
    <div>
        <input type="radio" value="a" name="cc" onchange="check(this, 'b')">
        a. 1
    </div>
    <div>
        <input type="radio" value="b" name="cc" onchange="check(this, 'b')">
        b. 0
    </div>
    <div>
        <input type="radio" value="c" name="cc" onchange="check(this, 'b')">
        c. 2
    </div>
    <div>
        <input type="radio" value="d" name="cc" onchange="check(this, 'b')">
        d. 3
    </div>
</form>

<h3>2. What is the proper format for casting the int variable k to type double?</h3>

<form>
    <div>
        <input type="radio" value="a" name="cc" onchange="check(this, 'd')">
        a. <code>k (int : double)</code>
    </div>
    <div>
        <input type="radio" value="b" name="cc" onchange="check(this, 'd')">
        b. <code>(int : double) k</code>
    </div>
    <div>
        <input type="radio" value="c" name="cc" onchange="check(this, 'd')">
        c. <code>double k</code>
    </div>
    <div>
        <input type="radio" value="d" name="cc" onchange="check(this, 'd')">
        d. <code>(double) k</code>
    </div>
</form>

<h3>3. What is the correct result of the below mathematical operation?</h3>
 
        int o = 4;
        double y = 5.5;
        (int) (o + y) - y;

<form>
    <div>
        <input type="radio" value="a" name="cc" onchange="check(this, 'b')">
        a. 4
    </div>
    <div>
        <input type="radio" value="b" name="cc" onchange="check(this, 'b')">
        b. 3.5
    </div>
    <div>
        <input type="radio" value="c" name="cc" onchange="check(this, 'b')">
        c. 5
    </div>
    <div>
        <input type="radio" value="d" name="cc" onchange="check(this, 'b')">
        d. 4.5
    </div>
</form>

{% endraw %}