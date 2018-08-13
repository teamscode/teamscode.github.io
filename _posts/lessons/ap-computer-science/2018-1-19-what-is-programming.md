---
layout: post-lesson
permalink: /learn/ap-computer-science/what-is-programming/
lesson_title: What is Programming?
lesson_desc: Learning what programming actually does.
author: Chris Elliott
---

<script src="/questions.js"></script>

{% raw %}

**Programming** is the process of writing **code**, which is essentially a special form of instructions used to tell the computer to complete a specific task. Programming can be used for basic things like simple addition to complex goals such as making self-driving cars. Essentially, programming powers almost all of the technology around us. It is up to the programmer to use computers to innovate and create new technology. Here is an example of some code:

        public static String toBaseN(int num, int base) {

            String newNum = "";

            while (num > 0) {

                int result = num % base;

                newNum = result + newNum;

                num /= base;

            }

            return newNum;

        }

This specific code snippet converts a number into a different base (you will learn what this means in <a href="../more-number-bases">**lesson #4, Number Bases**</a>). By the end of TeamsCode’s lessons, you will be able to understand, evaluate, and create this code by yourself.

<h1>Lesson Quiz</h1>

<h3>Which of the following is false?</h3>

<form>
	<div>
		<input type="radio" value="a" name="cc" onchange="check(this, 'b')">
		a. Code is similar to a set of instructions for the computer to interpret and execute.
	</div>
	<div>
		<input type="radio" value="b" name="cc" onchange="check(this, 'b')">
		b. Programming does not use any words in the English language.
	</div>
	<div>
		<input type="radio" value="c" name="cc" onchange="check(this, 'b')">
		c. Programming can be used to do simple or complex tasks.
	</div>
</form>

{% endraw %}

