---
layout: post-lesson
permalink: /learn/ap-computer-science/abstract-classes/
lesson_title: Abstract Classes
lesson_desc: The definition and usage of abstract classes.
author: Chris Elliott
---

<script src="/questions.js"></script>

{% raw %}

<table>
  <tr>
    <th colspan="2">Vocab Bar</th>
  </tr>
  <tr>
    <td>Abstract Class</td>
    <td>A class that represents an abstract concept, and is therefore only partially implemented.</td>
  </tr>
  <tr>
    <td>Abstract Method</td>
    <td>A method that has no implementation code, just a header (essentially a placeholder).</td>
  </tr>
</table>


**Abstract classes** are classes that are not fully implemented because some of their methods represent abstract concepts. For example, if I had a <code>Geometry</code> class that calculated the area and perimeter of different shapes, the methods would be specific to each different shape (calculating the area of a circle is different than calculating the area of a square). Therefore, the <code>Geometry</code> class would be an abstract class that had subclasses representing the different shapes (circles, triangles, squares, etc). Below is an example:

        public abstract class Geometry {

            private String shape;

            public Geometry(String shape) {

                this.shape = shape;

            }

            // not all methods in abstract classes must be abstract

            public String getShapeName() {

                return shape;

            }

            // abstract methods have no implementation code

            public abstract double perimeter();

            public abstract double area();

        }

        /* classes which extend abstract classes must implement all of their abstract methods */

        public class Square extends Geometry {

            public double sideLength;

            public Square(double sideLength, String name) {

                super(name);

                this.sideLength = sideLength;

            }

            

            public double perimeter() {

                return 4 * sideLength;

            }

            public double area() {

                return Math.pow(side, 2);

            }

        }

Abstract classes have a key few rules:

1. If a class has any **abstract methods**, it must be declared an **abstract class** (by using the **abstract** keyword).

2. Any subclass of an abstract class must implement <u>all</u> of the superclass’s abstract methods.

3. Instances of abstract classes <u>cannot</u> be created (because they are incomplete).

4. Constructors are optional in abstract classes.

In order to avoid rule #3, create an object with the type of the abstract class and assign it to an instance of the subclass, as shown below:

        Geometry squareProperties = new Square(5, "square");

Overall, abstract classes are very useful when creating classes/methods that cannot be fully defined without more specific information.

<h1>Lesson Quiz</h1>

<h3>1. Which of the following is not a feature of abstract classes?</h3>

<form>
	<div>
		<input type="radio" value="a" name="cc" onchange="check(this, 'c')">
		a. An abstract class can have both abstract and non-abstract methods.
	</div>
	<div>
		<input type="radio" value="b" name="cc" onchange="check(this, 'c')">
		b. A class must be an abstract class if it has any abstract methods.
	</div>
	<div>
		<input type="radio" value="c" name="cc" onchange="check(this, 'c')">
		c. An abstract subclass can choose which abstract methods to implement.
	</div>
    <div>
		<input type="radio" value="d" name="cc" onchange="check(this, 'c')">
		d. An abstract class or method must have the abstract keyword in its header.
	</div>
</form>

<h3>2. If Car is an abstract class, what must be wrong with the below code?</h3>

        Car myCar; // variable declaration, line 1

        myCar = new Car("Toyota"); // variable assignment, line 2

<form>
	<div>
		<input type="radio" value="a" name="cc" onchange="check(this, 'c')">
		a. It should not have any parameters in its instantiation.
	</div>
	<div>
		<input type="radio" value="b" name="cc" onchange="check(this, 'c')">
		b. <code>myCar</code> cannot be an object of type <code>Car</code> (line 1 is wrong).
	</div>
	<div>
		<input type="radio" value="c" name="cc" onchange="check(this, 'c')">
		c. <code>myCar</code> cannot equal an instance of the abstract class <code>Car</code> (line 2 is wrong).
	</div>
    <div>
		<input type="radio" value="d" name="cc" onchange="check(this, 'c')">
		d. The syntax of the code is incorrect.
	</div>
</form>

{% endraw %}

