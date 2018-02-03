---
layout: post-lesson
permalink: /learn/ap-computer-science/method-types/
lesson_title: Method Types
lesson_desc: Learning about access modifiers for methods and the static keyword.  
author: James Richardson
---

<script src="/questions.js"></script>

{% raw %}

Methods come in many different forms. This is possible due to the options in a method’s signature line. In the [Methods](https://teamscode.com/learn/ap-computer-science/methods/) lesson, these components of the signature line were highlighted. However, the access modifiers public, private, protected, and static were ignored.

<table>
  <tr>
    <th colspan="2">Code Bar</th>
  </tr>
  <tr>
    <td>public</td>
    <td>The associated method or variable has access by all classes.</td>
  </tr>
  <tr>
    <td>protected</td>
    <td>The associated method or variable has access only by inheriting classes or those in the same package.</td>
  </tr>
  <tr>
    <td>private</td>
    <td>The associated method or variable has no outside access.</td>
  </tr>
  <tr>
    <td>static</td>
    <td>The associated method or variable is shared amongst all iterations of the class. </td>
  </tr>
</table>


The keywords: <code>public</code>, <code>private</code>, and <code>protected</code> specify the visibility of a method or variable. These keywords have varying ranges of access restriction for calls from outside classes. It is important to note that if a method is unstated to be <code>public</code>, <code>private</code>, or <code>protected</code>, it is automatically made package-private (only accessible by classes in the same package). 

        public class Example {

            public Example() { }

            public void ex1() { }

            private void ex2() { }

            protected void ex3() { }

        }

        public class Example2 { // located in a different package from the Example class

            public static void user() {

                Example e = new Example();

                e.ex1();    //this is the only method which can be called

            }

        }

        public class Example3 extends Example { 

            public static void user() {

                Example e = new Example();

                e.ex1();    

                e.ex3();    //Both methods are able to be called 

            }

        }   //The method ex2 is not able to be called from outside the class Example

<code>static</code> is another keyword which is useful and important to method and variable declarations. When the <code>static</code> keyword is attached, it causes the associated field to belong to the class. This means that only a single copy of the field or method will exist, and will be shared with every instance of the class. 

Here is an example of a class which uses static and non-static methods and fields:

        public class Example {

            private static String g = "g";

            private String h = "h";

            public static String staticMethod() {

                Example ie = new Example();

                return g + ie.h;

            }

            public String nonStaticMethod() {

                return g + h;

            }

            public void nonStaticUser() {

                System.out.print(staticMethod());

                System.out.print(nonStaticMethod());

            }

            public static void staticUser() {

                Example e = new Example();

                System.out.print(staticMethod());

                System.out.print(e.nonStaticMethod());

            }

        }

By belonging to the class, the information stored in a static field or method will be the same for every class iteration. This does, however, limit the use of non-static variables and methods because the non-static information belongs to the iteration, and is not universal. Static is used to store information which is true for all iterations of the class, or information which does not need to be unique to the iteration. 

Accessing static and non-static information is possible from both a static and non-static method. Refer to the table below:

<table>
  <tr>
    <th colspan="3">Calling Static and Non-Static Information from Static and Non-Static Methods</th>
  </tr>
  <tr>
    <td></td>
    <td>Static Method</td>
    <td>Non-Static Method</td>
  </tr>
  <tr>
    <td>Static Information</td>
    <td>CLASSNAME.METHODNAME()
or
METHODNAME()</td>
    <td>CLASSNAME.METHODNAME()
or 
METHODNAME()</td>
  </tr>
  <tr>
    <td>Non-Static Information</td>
    <td>CLASSNAME NAME = new CLASSNAME()
NAME.METHODNAME()</td>
    <td>CLASSNAME.METHODNAME()
or 
METHODNAME()</td>
  </tr>
</table>


When calling static information, the information can be referred to as the class’s method or simply by the method name. This does not matter whether it is being called from a static or non-static method.

When calling non-static information, it does matter whether it is being called from a static or non-static method. In a non-static method, the technique is the same as calling static information. However, within a static method, the information must be attached to a local object of the same class. This makes the information unchanging and essentially static.

Using access modifiers streamlines the process, making a program more efficient.

<h1>Lesson Quiz</h1>

<h3>1. In a static method, which of the below is a correct call to a non-static method?</h3>

<form>
    <div>
        <input type="radio" value="a" name="cc" onchange="check(this, 'a')">
        a. <code>CLASSNAME NAME = new CLASSNAME();
                NAME.METHODNAME();</code>
    </div>
    <div>
        <input type="radio" value="b" name="cc" onchange="check(this, 'a')">
        b. <code>METHODNAME();</code>
    </div>
    <div>
        <input type="radio" value="c" name="cc" onchange="check(this, 'a')">
        c. <code>CLASSNAME.METHODNAME();</code>
    </div>
</form>

<h3>2. What kind of method is accessible to all outside classes?</h3>

<form>
    <div>
        <input type="radio" value="a" name="cc" onchange="check(this, 'a')">
        a. <code>public</code>
    </div>
    <div>
        <input type="radio" value="b" name="cc" onchange="check(this, 'a')">
        b. <code>private</code>
    </div>
    <div>
        <input type="radio" value="c" name="cc" onchange="check(this, 'a')">
        c. <code>protected</code>
    </div>
    <div>
        <input type="radio" value="d" name="cc" onchange="check(this, 'a')">
        d. No access modifier
    </div>
</form>


{% endraw %}