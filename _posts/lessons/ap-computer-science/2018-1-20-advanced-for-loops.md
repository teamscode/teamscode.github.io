---
layout: post-lesson
permalink: /learn/ap-computer-science/advanced-for-loops/
lesson_title: Advanced For Loops
lesson_desc: Beyond the basic uses of for loops. 
author: Alan Bi
---

<script src="/questions.js"></script>

{% raw %}

Now, you’ve learned that the general format of creating a for loop looks something like this:

        for (int i = 0; i < n; i++) {

            // Do something

        }

In this lesson, we are going to cover using the for loop in more advanced ways to solve problems efficiently. Starting off with an easy example, let’s say we want to print out all the odd numbers up to a random number, represented by n. With your knowledge of for loops, you probably should have been able to come up with a solution like this: 

        for (int i = 0; i < n; i++) {

            if (i % 2 == 1) {

                System.out.println(i);

            }

        }

However, by changing some of the values in the parentheses, we can simplify this into only three lines of code: 

        for (int i = 1; i < n; i += 2) {

            System.out.println(i);

        }

Now what if you wanted to do something such as print out a 10x10 grid of numbers representing a multiplication table? For example: 

![Example of nested for loop traversal](/assets/lesson_images/for_loop_times_table.jpg)

Source: [Vaughn’s Summaries](https://www.vaughns-1-pagers.com/computer/multiplication-tables.htm#t10)

This might be very hard to do with a single for loop, or even with ten for loops in a row. You could do something like this: 

        for (int i = 1; i <= 10; i++) {

            System.out.print(1 * i + " ");

        }

        System.out.println();

        for (int i = 1; i <= 10; i++) {

            System.out.print(2 * i + " ");

        }

        System.out.println();

        // And so on with 3 * i, 4 * i...

But it would be many lines of code and a pain to write. Luckily, we can easily solve this issue by using a concept known as **nested for loops**. Nested for loops are basically for loops inside other for loops, so that the inside for loop executes once every time the outer for loop repeats. To print out a multiplication table, the code is simple: 

        for (int i = 1; i <= 10; i++) {

            for (int j = 0; j <= 10; j++) {

                System.out.print(i * j + " ");

            }

            System.out.println();

        }

Nested for loops are very important in coding and can be used in a variety of ways. They can be used to print out grids of numbers, traverse through two-dimensional data, solve simple mazes, and much more. One important thing to note is that when you have a nested for loop, the variables of each loop must be different to avoid one loop affecting another. If you notice in the example above, the outer for loop declares a variable <code>int i</code> and the inner for loop declares a variable <code>int j</code>. 

The last thing in this lesson is the **break** statement. Often times, you might have a for loop that computes something multiple times, but once a certain conditions is satisfied, you want it to stop running. For example, let’s say you want to find the sum of all the numbers from 1 to 100 but want to stop once the sum gets past 2000. You can have a for loop that runs from 1 ≤ i ≤ 100 and an if statement saying that if the sum is greater than 2000, break out of the loop. To break out of the loop, simply write the following code: 

        break; 

This will immediately stop the current for loop. Note that if the <code>break</code> is inside a nested for loop, the inner for loop will stop executing, but the outer for loop will continue unless it too is broken out of. To see this in action: 

        int sum = 0;

        for (int i = 1; i <= 100; i++) {

            sum += i;

            if (sum > 2000) {

                break;

            }

        }

The moment sum gets past 2000, the condition in the if statement will become true and the for loop will stop executing. 


<h1>Lesson Quiz</h1>

<h3>1. What is the value of i?</h3>

        int i;

        for (i = 0; i < 1000000; i *= 2) {

            if (i > 3000) {

                break;
            }

        }


<form>
    <div>
        <input type="radio" value="a" name="cc" onchange="check(this, 'c')">
        a. <code>3001</code>
    </div>
    <div>
        <input type="radio" value="b" name="cc" onchange="check(this, 'c')">
        b. <code>1000000</code>
    </div>
    <div>
        <input type="radio" value="c" name="cc" onchange="check(this, 'c')">
        c. <code>4096</code>
    </div>
</form>

<h3>2. What is the output to the console?</h3>

        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(j + " ");

            }

        }

<form>
    <div>
        <input type="radio" value="a" name="cc" onchange="check(this, 'b')">
        a. <code>1 2 3 1 2 3 1 2 3</code>
    </div>
    <div>
        <input type="radio" value="b" name="cc" onchange="check(this, 'b')">
        b. <code>1 1 2 1 2 3</code>
    </div>
    <div>
        <input type="radio" value="c" name="cc" onchange="check(this, 'b')">
        c. <code>1 2 3</code>
    </div>
</form>


{% endraw %}


