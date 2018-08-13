---
layout: post-lesson
permalink: /learn/ap-computer-science/overview-lesson-2/
lesson_title: "Overview Lesson #2"
author: James Richardson
---

<script src="/questions.js"></script>

{% raw %}

Below is a list of all the lessons this overview lesson will cover. 

1. The Scanner Class
2. Arrays
3. Foreach Loops
4. The Math Class
5. Errors/Exceptions
6. Methods
7. Advanced Methods


<h1>Lesson Quiz</h1>

_Each question in this quiz corresponds to that lesson, so if you miss a specific problem, go back to that problem’s lesson to review._


<h3>1. What is the correct syntax of creating a variable s of type Scanner, reading input from the console?</h3>

<form>
    <div>
        <input type="radio" value="a" name="cc" onchange="check(this, 'b')">
        a. <code>new Scanner s = Scanner(new File(“user.txt”));</code>
    </div>
    <div>
        <input type="radio" value="b" name="cc" onchange="check(this, 'b')">
        b. <code>Scanner s = new Scanner(System.in);</code>
    </div>
    <div>
        <input type="radio" value="c" name="cc" onchange="check(this, 'b')">
        c. <code>new Scanner(new File(“user.txt”)) = Scanner s;</code>
    </div>
    <div>
        <input type="radio" value="d" name="cc" onchange="check(this, 'b')">
        d. <code>Scanner s = new Scanner(new File(“user.txt”));</code>
    </div>
</form>


<h3>2. Which signature line is for a method with three int parameters( a, b, c ), returns a String, has a name “method1”, and should not be accessed outside of the class.</h3>

<form>
    <div>
        <input type="radio" value="a" name="cc" onchange="check(this, 'd')">
        a. <code>public (int a, int b, int c) method1 String {...}</code>
    </div>
    <div>
        <input type="radio" value="b" name="cc" onchange="check(this, 'd')">
        b. <code>private method1 String (int a, int b, int c) {...}</code>
    </div>
    <div>
        <input type="radio" value="c" name="cc" onchange="check(this, 'd')">
        c. <code>private String (int a, int b, int c) method1 {...}</code>
    </div>
    <div>
        <input type="radio" value="d" name="cc" onchange="check(this, 'd')">
        d. <code>private String method1(int a, int b, int c) {...}</code>
    </div>
</form>

<h3>3. Which is the proper way of declaring a three dimensional int array of dimensions 5x5x5?</h3>

<form>
    <div>
        <input type="radio" value="a" name="cc" onchange="check(this, 'b')">
        a. <code>int[[[]]] arr = new int[ 5 [ 5 [5] ] ];</code>
    </div>
    <div>
        <input type="radio" value="b" name="cc" onchange="check(this, 'b')">
        b. <code>int[][][] arr = new int[5][5][5];</code>
    </div>
    <div>
        <input type="radio" value="c" name="cc" onchange="check(this, 'b')">
        c. <code>int{} arr = new int{ { {5} } };</code>
    </div>
    <div>
        <input type="radio" value="d" name="cc" onchange="check(this, 'b')">
        d. <code>int[] arr = new int[5]int[5]int[5];</code>
    </div>
</form>

<h3>4. What is the syntax of a foreach loop which traverses a one dimensional String array, “ar”, of length 7?</h3>

<form>
    <div>
        <input type="radio" value="a" name="cc" onchange="check(this, 'c')">
        a. <code>for (ar : String s) {...}</code>
    </div>
    <div>
        <input type="radio" value="b" name="cc" onchange="check(this, 'c')">
        b. <code>for (String[7] ar : String s) {...}</code>
    </div>
    <div>
        <input type="radio" value="c" name="cc" onchange="check(this, 'c')">
        c. <code>for (String s : ar) {...}</code>
    </div>
    <div>
        <input type="radio" value="d" name="cc" onchange="check(this, 'c')">
        d. <code>for (String s : String[7] ar) {...}</code>
    </div>
</form>

<h3>5. What is the result of the below statement?</h3>

        Math.abs(-1 * Math.sqrt(3 * Math.pow(3, 3)))

<form>
    <div>
        <input type="radio" value="a" name="cc" onchange="check(this, 'b')">
        a. 9
    </div>
    <div>
        <input type="radio" value="b" name="cc" onchange="check(this, 'b')">
        b. 9.0
    </div>
    <div>
        <input type="radio" value="c" name="cc" onchange="check(this, 'b')">
        c. 3
    </div>
    <div>
        <input type="radio" value="d" name="cc" onchange="check(this, 'b')">
        d. -81.0
    </div>
</form>

<h3>6. What will occur from the following code?</h3>

        int a = 1;
        while (a != 0) {
            a *= 4;
        }


<form>
    <div>
        <input type="radio" value="a" name="cc" onchange="check(this, 'a')">
        a. An infinite loop will occur. 
    </div>
    <div>
        <input type="radio" value="b" name="cc" onchange="check(this, 'a')">
        b. ArrayIndexOutOfBoundsException will be thrown.
    </div>
    <div>
        <input type="radio" value="c" name="cc" onchange="check(this, 'a')">
        c. ClassCastException will be thrown.
    </div>
    <div>
        <input type="radio" value="d" name="cc" onchange="check(this, 'a')">
        d. NullPointerException will be thrown. 
    </div>
</form>

<h3>7. Will an exception be thrown from the following method declarations?</h3>

        public void method1() {...}
        public void method1(int a) {...}

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

{% endraw %}

