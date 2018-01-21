---
layout: post-lesson
permalink: /learn/ap-computer-science/while-loops/
lesson_title: While Loops
lesson_desc: While loops and a comparison of their performance to for loops. 
author: Alan Bi
---

<script src="/questions.js"></script>

{% raw %}

The **while loop** is another type of loop that can be used instead of a for loop. The syntax for a while loop is as follows: 

        while (/* some boolean */) {

            // Do something

        }

As you can see, compared to a for loop, where you there are three different statements that you must fill in (init; boolean; increment), a while loop has few restrictions, making it more flexible in certain situations. 

Here is an example of how the for loop compares to the while loop when printing out all of the numbers from 1 to 10:

        for (int i = 1; i <= 10; i++) {     |    int k = 1;

            System.out.println(i);          |    while (k <= 10) {

        }                                   |        System.out.println(k);

                                            |        k++;

                                            |    }

Both accomplish the same thing. Now, in this case, the for loop would make more sense to use since it is more structured, which is good when we know exactly what we want to do (print the numbers from 1 to 10). However, what if you were given a random integer and needed to find out how many digits it has? 

The trick to solving this problem is to keep dividing the number by 10, keeping track of how many times you do this. Every time you divide by 10, the number loses its rightmost digit, until eventually it becomes 0 and you can break out of the loop. For example, let’s say you have the number 345: 

        345 / 10 = 34       digit count: 1

        34 / 10 = 3     digit count: 2

        3 / 10 = 0      digit count: 3

        The number is now 0, so break out of the loop. The digit count is 3. 

It might be hard to use a for loop to solve this problem because you don’t know how many times you want to loop through (that depends on how many digits there are in the number). However, this can easily be implemented with a while loop. 

        int num = 58243; // some random number

        int digits = 0; 

        while (num != 0) {

            digits++; 

            num /= 10;

        }

        System.out.println("The answer is: " + digits); // ‘The answer is: 5’

One thing about while loops is that it’s easy to get stuck in an infinite loop. In the example below, the programmer attempts to print out all the numbers between 1 and 10, but makes a big mistake: 

        int k = 1;

        while (k <= 10) {

            System.out.println(k);

        }

The programmer has forgotten to increment k in the body of the loop. This means that k is always 1 and the condition k ≤ 10 will always be true, so the program will keep printing out 1 over and over until you manually terminate the process. Of course, if for some reason you wanted a loop to go on infinitely until you decide to quit the program yourself, a while loop could be the way to go (this can be useful for creating games, where you go on infinitely loading new frames until a player pauses or quits the game): 

        while (true) {

            // Do something

        }

In general though, it is best to avoid this type of code where there isn't a termination condition unless you have a very good reason to do so. 

To sum up the while loop, it has both advantages and disadvantages compared to the for loop. The for loop is very useful when you know how many times you need to loop, and the while loop is useful for when you need to continue looping until a certain condition is finally met. 

<h1>Lesson Quiz</h1>

<h3>1. What is the output to the console?</h3>

        String s = "ab";

        while (s.length() < 10) {

            s += s + "c";

        }

        System.out.println(s);

<form>
    <div>
        <input type="radio" value="a" name="cc" onchange="check(this, 'c')">
        a. <code>ababcabcabc</code>
    </div>
    <div>
        <input type="radio" value="b" name="cc" onchange="check(this, 'c')">
        b. <code>abcabccabcabcc</code>
    </div>
    <div>
        <input type="radio" value="c" name="cc" onchange="check(this, 'c')">
        c. <code>ababcababcc</code>
    </div>
</form>

<h3>2. What is the output to the console?</h3>

        int num = 21;

        String s = "";

        while (num > 0) {

            s = num % 2 + s;

            num /= 2;

        }

        System.out.println(s);

<form>
    <div>
        <input type="radio" value="a" name="cc" onchange="check(this, 'b')">
        a. <code>01110</code>
    </div>
    <div>
        <input type="radio" value="b" name="cc" onchange="check(this, 'b')">
        b. <code>10101</code>
    </div>
    <div>
        <input type="radio" value="c" name="cc" onchange="check(this, 'b')">
        c. <code>10011</code>
    </div>
</form>


{% endraw %}


