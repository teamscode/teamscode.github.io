---
layout: post-lesson
permalink: /learn/ap-computer-science/inheritance-principles/
lesson_title: Inheritance Principles
lesson_desc: Delving deeper into the rules of inheritance. 
author: James Richardson
---

<script src="/questions.js"></script>

{% raw %}

A possible application of this hierarchy is a database of mammals. Then information such as weight and <code>walk()</code> would be passed from Mammal to Cat, Dog, etc. Rather than writing the traits in the code for each class, it is simpler to use an inheritance hierarchy. Inheritance hierarchies have several benefits which other techniques, such as copy-pasting, do not have. By using an inheritance hierarchy, any changes to shared methods made in the superclass are passed dow to the subclasses and do not need to be manually changed in each subclass. 

![Animal interface](/assets/lesson_images/animal_interface.png)

Source: [https://www.developerdotstar.com/mag/articles/pugh_interface_oriented.html](https://www.developerdotstar.com/mag/articles/pugh_interface_oriented.html)

Sometimes when a superclass passes on a method, it does not complete the full use desired by a subclass. To fix this, the subclass can, partially or fully, **override** the method. To override a method is to change the subclass’s version of the method.

The user cannot partially subtract from the information in the inherited method, but instead rewrite it fully. This is a design concept which should be taken into consideration when using inheritance hierarchies. When designing a hierarchy, pass as much shared information as possible, but do not give information which is detrimental. 

Here is the partial override syntax:

        public void m1() {              // Located in subclass

            System.out.println(...);    // new information

            super.m1();                 // call the method in the superclass

            System.out.println(...);    // new information

        }

When overriding a method, the signature line should be the same as the original. No changes can be made to the signature line, new parameters are not allowed.

The content of the code for a partially overridden method should include a call to the superclass’s method and new code surrounding it.

Here is the full override syntax:

        public void m1() {

            System.out.println(""); // new information

        }

The content of the code for a fully overridden method does not have a call to the superclass’s method, and therefore have no code from it. A fully overridden method merely hosts new information.

Now that inherited methods are clarified, we will cover declaring objects with inheritance principles. In client classes - classes which use iterations of a specific class - you are able to declare objects using the <code>class NAME = new class()</code> format. However, there is another way to declare a class which declares the class as its superclass while initializing it as a class further down the hierarchy. Here is an example:

        Mammal m = new Dog();    

This process generalizes what the object d is. Instead of declaring it as its most specific form, Dog, it has been declared as Mammal. However, if a second class iteration m was declared as Dog, it could not be initialized to be Mammal. Here is an incorrect example:

        Dog d = new Mammal();

This is because logically, a Dog is a Mammal, but a Mammal is not always a Dog. The object cannot be specified more than its initialization.

The class iterations can later be specified to a class lower on the hierarchy by using casting, this is known as **downcasting**. If the iteration d needed to be declared as a Dog rather than a Mammal, then it could be done. Here is an example:

        (Dog) m;

Why though, would an object be declared as its superclass and initialized as its class? This is because, the functionality of the object increases; the object has access to the original and the overridden methods. 

When an object which has been declared as its superclass calls a method, the called method will be determined by **static binding** and **dynamic binding**. Static binding, is when the method is chosen at compile time, and dynamic is when the method is chosen at run time. 

The details are not important, but it is key to note that static binding affects methods which are unable to be overridden. Examples of these kinds of methods are private, static, final. Dynamic binding affects methods which are able to be overridden.

Manipulating downcasting and understanding static and dynamic binding is essential to calling the correct method. Refer to the below example:

        public class Super {

            public static void sbm() {

                System.out.print("A");

            }

            public void dbm() {

                System.out.print("B");

            }

        }

        public class Sub extends Super {

            public static void sbm() {

                System.out.print("C");

            }

            public void dbm() {

                System.out.print("D");

            }

            public void usm() {

                System.out.print("E");

            }

        }

        public class User {

            public void userMethod() {

                Super i = new Super();

                Super j = new Sub();

                Sub k = new Sub();

                

                i.sbm();                    //prints "A"

                j.sbm();                    //prints "A"

                k.sbm();                    //prints "C"

                ((Inheritance2) j).sbm();   //prints "C"

                i.dbm();                    //prints "B"

                j.dbm();                    //prints "D"

                k.dbm();                    //prints "D"

                ((Inheritance) j).dbm();    //prints "D", redundant

                i.usm()                     // does not compile

                j.usm()                     // does not compile

                k.usm();                    //prints "E"

                ((Inheritance2) j).usm();   //prints "E"

            }

        }

If you observe the method calls used in <code>userMethod</code>, you will observe that j has the capabilities of its initialized class and its super class. Normally, j will only call the static bound methods belonging to Super, but, when downcast, j has the abilities to call all static bound methods as well as all other methods in Sub. All dynamic bound methods will call Sub’s iteration. This is represented with the table below:

<table>
  <tr>
    <th></th>
    <th>Super s = new Super()</th>
    <th>Super t = new Sub()</th>
    <th>Sub u = new Sub()</th>
  </tr>
  <tr>
    <td>Static 
Bound Methods
(sbm)</td>
    <td>Calls Super.sbm()</td>
    <td>Calls Super.sbm()

Calls Sub.sbm()
when downcast</td>
    <td>Calls Sub.sbm()</td>
  </tr>
  <tr>
    <td>Dynamic Bound Methods
(dbm)</td>
    <td>Calls Super.dbm</td>
    <td>Calls Sub.dbm()

Calls Sub.dbm()
when downcast</td>
    <td>Calls Sub.dbm()</td>
  </tr>
  <tr>
    <td>Methods Unique to Subclass
(usm)</td>
    <td>Does not compile</td>
    <td>Does not compile

Calls Sub.usm()
when downcast</td>
    <td>Calls Sub.usm()</td>
  </tr>
</table>


It is important to note that if an object is declared incorrectly, casting issues can insue. When objects are cast to improper types, they throw a <code>ClassCastException</code>. Here is an example:

        List<Integer> i = new ArrayList<>();

        // ((Scanner) i) will throw a ClassCastException

If used properly, inheritance will simplify and aid in computer programming. 

<h1>Lesson Quiz</h1>

<h3>1. True or false, when overriding a method, it is possible to partially subtract from the superclass’s method. </h3>

<form>
    <div>
        <input type="radio" value="a" name="cc" onchange="check(this, 'b')">
        a. True
    </div>
    <div>
        <input type="radio" value="b" name="cc" onchange="check(this, 'b')">
        b. False
    </div>
</form>

<h3>2. True or false, the below object instantiation is valid.</h3>

        public class A { }

        public class B extends A { }

        A obj = new B();

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

<h3>3. What is the main benefit of downcasting?</h3>

<form>
    <div>
        <input type="radio" value="a" name="cc" onchange="check(this, 'c')">
        a. It allows the object to use the superclass’s statically bound methods
    </div>
    <div>
        <input type="radio" value="b" name="cc" onchange="check(this, 'c')">
        b. It allows the object to use the subclass’s dynamically bound methods
    </div>
    <div>
        <input type="radio" value="c" name="cc" onchange="check(this, 'c')">
        c. It allows the object to use the subclass’s statically bound methods 
    </div>
    <div>
        <input type="radio" value="d" name="cc" onchange="check(this, 'c')">
        d. It allows the object to use the superclass’s dynamically bound methods
    </div>
</form>

{% endraw %}