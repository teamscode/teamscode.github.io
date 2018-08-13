---
layout: post-lesson
permalink: /learn/ap-computer-science/errors-exceptions/
lesson_title: Errors/Exceptions
lesson_desc: What are errors and exceptions and what are different examples?
author: Jason Zhang
---

<script src="/questions.js"></script>

{% raw %}

<table>
  <tr>
    <th colspan="2">Code Bar</th>
  </tr>
  <tr>
    <td><code>throw</code></td>
    <td>Throw Keyword</td>
  </tr>
  <tr>
    <td><code>try {} catch() {}</code></td>
    <td>Try-Catch Structure</td>
  </tr>
  <tr>
    <td><code>ArithmeticException</code></td>
    <td>The exception thrown when mathematical rules are broken.</td>
  </tr>
  <tr>
    <td><code>IndexOutOfBoundsException</code></td>
    <td>The exception thrown when someone tries to access an index out of bound.</td>
  </tr>
  <tr>
    <td><code>NullPointerException</code></td>
    <td>The exception thrown when someone tries to call a undefined variable.</td>
  </tr>
  <tr>
    <td><code>Exception</code></td>
    <td>The super-class to all exceptions.</td>
  </tr>
</table>


Many things can go wrong while your code is running. So the developers added exceptions to handle the such problems. Above is a list of the most often occurring exceptions, but you only need to remember the basic <code>Exception</code>.

As you can clearly see, the first two terms in the code bar are not exceptions. The first vocab word is <code>throw</code>. <code>Throws</code> is a keyword that can be inserted after the parameters of a method to basically allow the computer to run the risky code. For example the main method below would not compile, if you didn’t add the <code>FileNotFoundException</code>.

		public static void main(String[] args) throws FileNotFoundException {

			Scanner input = new Scanner(new File(""));

		}

The <code>throw</code> keyword can also be used to end a program and print an <code>exception</code>. For example, look at the code below.

		public static int divide(int a, int b) {

			Return a / b;

		}

If you inputed <code>0</code> as <code>b</code>, your code would break down, because anything divided by 0 is undefined. In fact, an <code>ArithmeticException</code> would be thrown. So to improve the code, you should check whether <code>b</code> is <code>0</code>, and if it is <code>throw</code> an <code>exception</code>. Instead of the computer throwing the exception, we are, and by throwing the exception we can gain more debugging information.

		public static int divide(int a, int b) {

			if (b == 0) {

				throw new IllegalArgumentException();

			}

			return a / b;

		}

Now anytime <code>b</code> is entered in as <code>0</code>, the program catches it and prints out the <code>IllegalArgumentException</code>. <code>Throw</code>, however, can be used to throw any exception; even ones not pertaining to the code. The code below would’ve worked just as well.

		public static int divide(int a, int b) {

			if (b == 0) {

				throw new FileNotFoundException();

			} else {

				return a / b;

			}

		}

The second item in the code bar is the <code>try-catch</code> structure. The <code>try-catch</code> structure becomes more important the further you delve into computer science. Like the <code>throw</code> keyword, it allows you to run risky code; however, the <code>try-catch</code> structure has two more bodies.

		try {

			// code

		}

This is the first and most important part of the <code>try-catch</code> structure. You would put your risky code inside those brackets, and the computer will "try" to run it. It will proceed normally until, if at all, it reaches an error. Once it does reach an error, Java will stop the code and jump the <code>catch</code> block.

		catch (Exception e) {

			e.printStackTrace();

		}

The next part is the <code>catch</code> block. The <code>catch</code> block is executed if and only if the exception specified in the parenthesis was thrown in the <code>try</code> block; by only delegating to catch blocks the specified exception, the developers allowed multiple <code>catch</code> blocks in a <code>try-catch</code> structure. Importantly every <code>try-catch</code> structure needs at least one. As you may have noticed, I put <code>e.printStackTrace()</code> in the <code>catch</code> block; This method is called on when the exception is thrown, and it prints debugging data.

		catch (FileNotFoundException e) {

			e.printStackTrace();

		}
		
		catch (ArithmeticException e) {

			e.printStackTrace();

		}
		
		catch (IndexOutOfBoundException e) {

			e.printStackTrace();

		}

The remaining topics you need to learn are the exceptions. There are many exceptions in Java and most of them are rarely used. I have added a list of the most useful and common exceptions; and I will explain what the exceptions mean. But first you need to know the division of exceptions: checked and unchecked exceptions.

Checked exceptions are usually thrown when your code is compiled. In general checked exceptions are not found errors. For example if you misspell a word and cause an error, that is likely a checked exception.

The important checked exceptions are: <code>ClassNotFoundException</code>, <code>NoSuchFieldException</code>, and <code>NoSuchMethodException</code> - these are called when you try to access a nonexistent thing. They are not included in my list, because any good IDE will highlight them for you.

Unchecked exceptions are exceptions thrown will the code is running. They constitute a much wider range of exceptions and they occur much more often. Good examples are the <code>ArithmeticException</code>, <code>IndexOutofBoundsException</code>, and <code>NullPointerException</code>.

<code>Exception</code>:

The basic exception is the superclass to all exceptions. Therefore when you don’t know what exception should be thrown, you can simply just throw the basic exception. Commonly it will be added as the last catch block, as a just in case.

<code>ArithemeticException</code>:

This exception is only thrown when you try to break mathematical rules. For example, dividing by 0 or taking the square root of a negative number will throw this exception.

<code>IndexOutOfBoundsException</code>:

This exception is thrown when you try to retrieve or set a value outside of the bounds of the object you’re calling from. For example, if you try to get the object at index -1 or if you try to get the object after the last object in an list. There are two additional exceptions which function similarly: <code>StringIndexOutOfBoundsException</code> and <code>ArrayIndexOutOfBoundsException</code>. The only difference is the object from which the data is being accessed.

<code>NullPointerException</code>:

This exception is one of the most common. It is thrown when you try to access the value of a <code>null</code> object (such as an uninitialized variable).

{% endraw %}

