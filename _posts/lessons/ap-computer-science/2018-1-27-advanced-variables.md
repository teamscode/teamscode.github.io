---
layout: post-lesson
permalink: /learn/ap-computer-science/advanced-variables/
lesson_title: Advanced Variables
lesson_desc: Learning the rules of Strings and more advanced variable manipulation.
author: Jason Zhang
---

<script src="/questions.js"></script>

{% raw %}

<table>
  <tr>
    <th colspan="2">Vocab Bar</th>
  </tr>
  <tr>
    <td>Casting</td>
    <td>A way to change the type of an expression</td>
  </tr>
  <tr>
    <td>Escape Characters</td>
    <td>Specific characters that allow special characters in Strings</td>
  </tr>
</table>

<br>

<table>
  <tr>
    <th colspan="2">Code Bar</th>
  </tr>
  <tr>
    <td><code>String</code></td>
    <td>A variable representing text.</td>
  </tr>
</table>


In a previous lesson we covered primitive variables. Now we will be reviewing **Advanced Variables**, specifically **Strings**. Strings are any line of text. They in technical terms are a sequence of ASCII characters.

	    String text = "helloWorld";

This String <code>helloWorld</code> is stored into the variable <code>text</code>. The <code>helloWorld</code>, or the actual value the variable is being set to, is the String literal. String literals must be enclosed with double quotes.

Inside the String, we have a special characters sequences, called escape characters to do specific tasks that usually cannot be done. For example, when defining a String, you use double quotes. So putting a double quote inside the String would mess up the program. To put double quotes inside a string, we use a backslashes.

	    System.out.println("\"four score and seven years ago\””);

The above line of code will produce:

	    "four score and seven years ago"

Often programmers need to print multiple lines. Instead of having multiple print lines, you can use <code>\n</code>. The <code>\n</code> will break the line. The code below will print first line, breaks the line, and repeats for the second and third line. 

	    System.out.println("first line\nsecond line\nthird line");

That will produce lines:

	    first line

	    second line

	    third line

The next, and debatably most important escape character, is the tab escape. The tab escape prints a space which rounds the length up to the next 4. For example, if you have a line with three characters, a <code>\t</code> will produce a tab length 1. But if you have a line with five characters, the tab will be length 3. Take a look at the code below.

        System.out.println("1\tend");

        System.out.println("12\tend");

        System.out.println("123\tend");

        System.out.println("1234\tend");

This code will produce a good example on the rounding of tab escapes:

        1   end

        12  end

        123 end

        1234    end

Since backslashes are used in writing the escape characters, backslashes cannot be printed stand alone. There is also the escape character <code>//</code>; this prints a backslash. The forward slash, or <code>/</code>, does not have an escape character, and therefore can be put normally in String literals.

        System.out.println("  /\\");

        System.out.println(" /  \\");

        System.out.println("/    \\");

        System.out.println("\\    /");

        System.out.println(" \\  /");

        System.out.println("  \\/");

The code above will the print a diamond:

          /\
         /  \
        /    \
        \    /
         \  /
          \/

The String, however, also has primitive-like characteristics. To define a String, you follow the primitive setup:

        String text = "This is a String Literal!";

You can redefine Strings in the same way and add to it as well.

        String text = "This is a String Literal!";

        text = "Now it has changed."

        text += " and again.";

Importantly, you cannot subtract from Strings. You can only add. To subtract from Strings, there is a method in the String class, called a substring. To invoke substring on a String, type the string name, place a dot afterward, and follow that with parenthesis and a semicolon. Inside the parenthesis you can put either 1 or 2 integers. If you only put one number, the text loses the first n characters (n being the number inputted). If you input two integers, then the String would be the characters with index above or equal to the first number, but below the second. The first character has index 0, not 1.

        String text = "Lorem Ipsum";

        System.out.println(text);

        text = text.substring(6);

        System.out.println(text);

        text += " and this";

        System.out.println(text);

        text = text.substring(6, 9);

        System.out.println(text);	

This code will first print "<code>Lorem Ipsum</code>". Then it will cut off the first 6 characters “<code>Lorem </code>”, leaving “<code>Ipsum</code>”, which will be printed out. Then it adds “<code>and this</code>” to “<code>Ipsum</code>”. So Java will print “<code>Ipsum and this</code>”. And finally the last substring returns everything above or equal index 6 and less than index 9, leaving “<code>and</code>”.

All advanced variables have aspects that differ from primitives. However, sometimes it is necessary to change an advanced variable or even a primitive into a different primitive. Programmers can do this by casting. Casting can only be applied on certain variables to certain variables. For instance, all numeric variables can be cast into other numeric variables: <code>floats</code> to <code>ints</code>, <code>doubles</code> to <code>longs</code>. Also, all variables can be cast into <code>Strings</code>. 
Additionally, Strings cannot be cast into numeric variables.

Whenever you change a number that has decimal places, into a variable that has no decimal places, it doesn’t round. If you were to cast the <code>double 1.5</code> into an <code>int</code>, it would have the value <code>1</code>. This is because instead of rounding the number, Java *truncates* the number. This means for negative numbers, it truncates upward.

To cast, you only need to add a parenthesis with the type inside.

        String text = (String) ((double) 5);

        System.out.println(text);

The code above prints <code>"5.0"</code> because the casting in inner parenthesis changes the <code>int 5</code> into a <code>double</code>. By changing it into a <code>double</code>, the value is changed to <code>5.0</code>. Than the outer casting changes the <code>double</code> into a <code>String</code> (the <code>String</code> being <code>"5.0"</code>). Normally, you wouldn’t need to cast the <code>double</code> into a <code>String</code>, because defining the double as a String it automatically casts the variable.

{% endraw %}