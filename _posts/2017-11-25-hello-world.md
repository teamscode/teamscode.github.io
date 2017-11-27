---
layout: post-lesson
permalink: /learn/ap-computer-science/hello-world/
lesson_title: Hello World
lesson_desc: The very basic syntax of programming in Java. 
author: Alan Bi
---

<script src="/questions.js"></script>

{% raw %}

<br>
The very first program that new programmers run is the Hello World class. Create a new class called <code>HelloWorld</code>. At the top of the page, you should see <code>public class HelloWorld {</code> and at the very bottom you should see another <code>}</code>. Type the following code anywhere between the two curly brackets (capitalization matters):

		public static void main(String[] args) {

			System.out.println("Hello, world!");

		}

**Note:** Be careful about copying and pasting. If you are using IntelliJ, for example, the compiler won’t be able to recognize the quote “ “ symbols but will recognize these quotes: <code>" "</code>

If you run the program, notice that the statement <code>‘Hello, world!’</code> is printed to the screen as a result of you running the <code>System.out.println("Hello, world!");</code> code. This line of code is the most basic Java syntax that you learn and you use it very frequently. You can type other things inside the quotes as well, to print different messages. However, notice that if you try to type something outside of the quotes, IntelliJ highlights it in red and gives you an error. Without the quotes, the computer treats what you wrote as code, and <code>Hello, world</code> isn’t a statement that Java recognizes. 

Now, let’s break down what is happening in this example code. 

The first thing you’ll notice is the statement <code>public static void main(String[] args) { }</code>. At this stage, all you need to know is that all of your code should be written in between the two curly brackets that follow this header. However, if you want to read more about this, click on [this link](https://docs.oracle.com/javase/tutorial/getStarted/application/), which explains the main method very well. 

Next, <code>System</code> refers to the System class, which is a built-in class that serves as the core of every Java program. The following <code>.out</code> means that you want to write something to the screen, or output something, hence the "out." The <code>.println()</code> is the command that you type in order to finally output something to the console. Within quotations, you can put whatever you want to print out. If you want to better understand the <code>System.out.println()</code> statement, take a look at [this link](https://stackoverflow.com/questions/12002170/what-is-system-out-println-in-system-out-println-in-java). 

Finally, the statement is ended by a semicolon, which tells the compiler that the command is finished. At the end of every statement you make, you **must** add a semicolon or else the compiler will give you an error. In most cases, the only time you wouldn’t have a semicolon at the end of a line is when the line is followed by code surrounded with curly brackets <code>{ }</code>, just as how the code you’ve written is wrapped between the pair of brackets following the <code>public static void main(String[] args)</code> line. Right now, you do not need to pay attention to these brackets. 

You can also replace <code>println()</code> with <code>print()</code>. Shown below is the difference between the two. On the left, two <code>println</code> statements are made, and on the right, two <code>print</code> statements.

		System.out.println("Hello");		System.out.print(“Hello”);

		System.out.println("World");		System.out.print(“World”);

Output:

		Hello						HelloWorld

		World

Each <code>println</code> command moves on to the next line once it is finished executing, whereas the <code>print</code> command does not. Each of these has its own uses, and it’s up to you to decide which one fits the situation best. 

An important part of programming is having good documentation of your code. A comment is a message that you can write in the code that doesn’t affect how the code runs at all, but rather allows you to write something down to help you understand the code or leave a note to yourself in the future. Here is an example of a comment: 

		// This is a comment. Everything written after two slashes on a line is

		// ignored by the compiler and is purely for the sake of the programmers. 

Notice that everything that follows the two slashes is "commented out." There are two other ways to leave comments:

		/* This is another way to write a comment. This way is useful for 

		commenting out large portions of code that you might not need or 

		small snippets of code in the middle of a line. */

		/**

		 * This type of comment is used at the beginning of large portions of

		 * code to provide details about what what the program is doing. 

		 */

Most of the time, you will be using the first and second methods of commenting. 

The last thing we will be covering in this lesson is basic programming style. You will have noticed that in your compiler, everything is neatly indented (everything that’s inside a pair of brackets is indented), and in our examples, each statement is put on a new line. These tabs, lines, and spaces are primarily to make the code easy to read and are part of the [Java Code Conventions](http://www.oracle.com/technetwork/java/codeconvtoc-136057.html). In reality, all of this is totally optional. For example, the following code:

		public static void main(String[] args) {

			System.out.println("Hello");

			System.out.println("Hi");

			System.out.println(); 	// Note: this prints an empty new line and is 

						// the equivalent of System.out.println("");

		}

Can be written as: 

		public      static

			void main    ( String  

			[] args ) {System   .out. 

		println  ( "Hello"); System  .  out.println(“Hi”) ;System.out.println (  )  ;}

And it would work the same. Of course, you should never write anything like in this second example because you want people to be able to easily decipher and debug your code.

<h1>Lesson Quiz</h1>

<h3>1. What is the output to the console?</h3>

		System.out.print("Hello there");

		/* hi Hey */  System.out.print("hi");

		/* System.out.println("Hey"); */

<form>
	<div>
		<input type="radio" value="a" name="cc" onchange="check(this, 'a')">
		a. <code>Hello therehi</code>
	</div>
	<div>
		<input type="radio" value="b" name="cc" onchange="check(this, 'a')">
		b. <code>"Hello there"“hi”</code>
	</div>
	<div>
		<input type="radio" value="c" name="cc" onchange="check(this, 'a')">
		c. <code>Hello there</code>
	</div>
	<div>
		<input type="radio" value="d" name="cc" onchange="check(this, 'a')">
		d. <code>Hello therehiHey</code>
	</div>
</form>

<h3>2. Which of the following code will compile?</h3>

<form>
	<div>
		<input type="radio" value="a" name="cc" onchange="check(this, 'c')">
		a. <code>Syste  m.out  .print  ln("Hi");</code>
	</div>
	<div>
		<input type="radio" value="b" name="cc" onchange="check(this, 'c')">
		b. <code>system.out.print("hello");</code>
	</div>
	<div>
		<input type="radio" value="c" name="cc" onchange="check(this, 'c')">
		c. <code>System . out . println ( " " ) ;</code>
	</div>
	<div>
		<input type="radio" value="d" name="cc" onchange="check(this, 'c')">
		d. <code>System.out  .print(  hey  );</code>
	</div>
</form>

{% endraw %}