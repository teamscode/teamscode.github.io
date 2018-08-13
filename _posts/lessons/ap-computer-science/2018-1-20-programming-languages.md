---
layout: post-lesson
permalink: /learn/ap-computer-science/programming-languages/
lesson_title: Programming Languages
lesson_desc: What are programming languages and why does TeamsCode teach Java?
author: Chris Elliott
---

<script src="/questions.js"></script>

{% raw %}

<table>
  <tr>
    <th colspan="2">Vocab Bar</th>
  </tr>
  <tr>
    <td>Programming Language</td>
    <td>A set of rules that are used to create code. There are many different programming languages.</td>
  </tr>
  <tr>
    <td>Syntax</td>
    <td>The set of rules that defines the grammar/structure of the code. Each programming language has a different syntax.</td>
  </tr>
</table>


Programmers use many different **programming languages**, and different languages have different uses, such as web development, data storage, and video game creation. Although there are many different programming languages (such as C++, Python, and JavaScript), TeamsCode teaches Java because Java is the main programming language for most high schools across the nation and Java serves as a solid basis for learning object-oriented programming. Additionally, the AP Computer Science A exam uses Java, so these lessons can serve as preparation for this test. Overall, however, the proficiency of the programmer is much more highly valued than the different languages he/she knows.

Every language has a different **syntax**, and Java has countless very important syntax rules. Below is the same segment of code shown in <a href="../what-is-programming">**lesson #1 (What is Programming?)**</a>, with some of the important syntactical elements highlighted.

<img src="/assets/lesson_images/method_example.png" width="600">

Over the course of the TeamsCode lessons, you will learn what these different elements mean in order to construct your own programs. There are 46 total lessons, including 5 **Overview** lessons which test your understanding of the content you’ve learned thus far. Each lesson contains a short quiz, and some lessons have **Coding Challenges**, which are optional tasks you can complete to demonstrate what you’ve learned.

In order to create Java programs, you need to install the Java SDK and an IDE (Integrated Development Environment). If you have not already done this, you should follow the steps illustrated below.

**Install Java SDK**

1. Go to [http://www.oracle.com/technetwork/java/javase/downloads/index.html](http://www.oracle.com/technetwork/java/javase/downloads/index.html).

2. Click on the *"Java Platform (JDK) 8u144"* button on the left under *“Java SE Downloads”*.

3. Go to the table with the title *"Java SE Development Kit 8u144"* and click the button *“Accept License Agreement”*.

4. Depending on your operating system (if you have Mac/Linux/Windows), you will choose the *"Mac OS X"*, *“Windows x64”*, or *“Linux x64”* download.

5. Open the download and follow the installation instructions shown.

**Install IntelliJ**

*<u>Note:</u> There are many different IDE’s you could use that would work fine, but TeamsCode chose IntelliJ because of its clean layout and style. Other IDE’s include <a href="https://netbeans.org/">NetBeans</a> and <a href="http://www.eclipse.org/">Eclipse.</a>*

1. Go to [https://www.jetbrains.com/idea/download/](https://www.jetbrains.com/idea/download/).

2. Select *"Windows"*, *“Mac”*, or *“Linux”* based on your operating system.

3.  Click on the "*Download"* button below *“Community”*.

4. Open the download and follow the installation instructions shown, setting up an account as necessary.

5. Once you reach the menu shown below, click *"Create New Project".*

    <img src="/assets/lesson_images/intellij_home.png" width="400">

6. Next, make sure *"Java"* is selected on the left. Select the *“New”* button next to *“Project SDK”*, and search for *“jdk”*, and select the file shown. Select *“Next”*.

7. **Do not** *"Create project from template"* on the next window, just select *“Next”*.

8. Name the project **TeamsCodeSandbox**, and you can change the project location to wherever you’d like.

9. After closing the tip, if the project tab on the left does not appear, go to the left corner, click the rectangle icon, and select project.

10. Click the arrow next to **TeamsCodeSandbox** and right-click *"src"*. Go to *“New”* then *“Java Class”*, and name it **Sandbox** (and press *“OK”*).

11. Copy all the text exactly as shown in the below program. You don’t need to understand what this code means right now. Make sure not to forget any brackets, parentheses, semicolons, or quotations. Also, CAPITALS MATTER!

    <img src="/assets/lesson_images/intellij_basic_class.png" width="650">

12. The last step is right-click the code, and select *"Run ‘Sandbox.main()’"*. If you have set everything up correctly, *“I have installed IntelliJ IDEA!”* should be printed below, followed by *“Process finished with exit code 0”*. Congratulations!

<h1>Lesson Quiz</h1>

<h3>1. What programming language does TeamsCode teach in this course?</h3>

<form>
	<div>
		<input type="radio" value="a" name="cc" onchange="check(this, 'c')">
		a. C++
	</div>
	<div>
		<input type="radio" value="b" name="cc" onchange="check(this, 'c')">
		b. JavaScript
	</div>
	<div>
		<input type="radio" value="c" name="cc" onchange="check(this, 'c')">
		c. Java
	</div>
    <div>
		<input type="radio" value="d" name="cc" onchange="check(this, 'c')">
		d. IDE
	</div>
</form>

<h3>2. What is the definition of syntax?</h3>

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

{% endraw %}

