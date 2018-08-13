---
layout: post-lesson
permalink: /learn/ap-computer-science/arraylists/
lesson_title: Lists and ArrayLists
lesson_desc: In this lesson, we will go over the List interface, a new type of data structure. 
author: James Richardson
---

<script src="/questions.js"></script>

{% raw %}

Lists are an alternative way of storing information in respect to arrays. The List interface has many benefits which can make it preferable to arrays. Here are some of its features: 

1. Lists do not have a fixed size, and shrink and grow to meet the number of elements

2. The last element’s index will always be n-1

3. Lists can easily switch, add, and remove elements

List is an interface, and therefore needs to be initialized as one of List’s subclasses. ArrayList is a commonly used subclass of the List. Here is the implementation syntax:

        List<E> NAME = new ArrayList<E>()

Besides being an interface, List also has an unusual attribute known as a **generic**, <E>. To be simple, generics allow an undefined class type variable to be used in the class or interface. In this situation, the generic refers to the type of value which is stored in the list.

Here is an example of ArrayList being used:

        import java.util.List;

        import java.util.ArrayList;

        // Put import statements at top of file

        List<Integer> a = new ArrayList<Integer>();   

        List<Integer> b = new ArrayList<>();

Both lists, a and b, store values of type Integer. When initializing the two, repeating the contents disclosed in the second generic is not required.

<table>
  <tr>
    <th colspan="2">ArrayList Methods</th>
  </tr>
  <tr>
    <td>.get(int index)</td>
    <td>Returns element at the specified index</td>
  </tr>
  <tr>
    <td>.size()</td>
    <td>Returns number of elements in the arraylist</td>
  </tr>
  <tr>
    <td>.add(E element)</td>
    <td>Adds element to the end of the arraylist</td>
  </tr>
  <tr>
    <td>.add(int index, E element)</td>
    <td>Adds element to the specified index in the arraylist</td>
  </tr>
  <tr>
    <td>.indexOf(E element)</td>
    <td>Returns the index of first occurance of the specified element </td>
  </tr>
  <tr>
    <td>.isEmpty()</td>
    <td>Returns True if the arraylist is empty</td>
  </tr>
  <tr>
    <td>.remove(int index)</td>
    <td>Removes the element at the specified index</td>
  </tr>
  <tr>
    <td>.set(int index, E element)</td>
    <td>replaces element at index with E
Also Returns replaced value</td>
  </tr>
</table>


Here is an example of a method which uses List and ArrayList:

        public void Example() {

            List<Integer> l = new ArrayList<>();

            l.add(3);               // l = {3}

            l.add(2);               // l = {3, 2}

            l.get(0);               // Returns 3, the value at index 0

            l.get(l.indexOf(3));    // Returns 3

            l.add(1, 1);            // l = {3, 1, 2} Adds the value 1 at index 1

            l.set(l.indexOf(2), 4); // l = {3, 1, 4} 

            l.remove(l.indexOf(3)); // l = {1, 4} Remove the value 3 from the List

            l.remove(l.size() - 1); // l = {1} Remove last element from the List

            l.remove(0);            // l = {}

            l.isEmpty();            // Returns true

        }

        

A major difference between arrays and Lists is that ArrayLists and Lists can only store classes and not primitives. In order to store primitives, wrapper classes are used to convert the primitives into objects in the process of boxing/wrapping. Some common wrapper classes are Integer and Double which both act as ints and doubles within an object form.

Luckily, with ArrayLists and many other similar classes, these primitives are wrapped to the correct type automatically in a process called auto-boxing when stored, and unboxing when being retrieved. However, it is important to understand manual boxing. Here are some examples:

        int a = 3

        Integer i = new Integer(a);             // boxing

        Integer i2 = a;                         // also valid

        i.intValue();                           // unboxing

        double b = 3.0;

        Double d = new Double(b);               // boxing

        Double d2 = b;                          // also valid

        d.doubleValue();                        // unboxing

        // makes object i with int value 3

        // returns int value 3

Overall, Lists are an essential part of programming that you must know well if you want to pursue a career in computer science. Lists, along with other classes/interfaces such as sets, maps, stacks, and queues, are important data structures that make up Java’s Collection interface. Once you finish the AP Computer Science course material, it is recommended that you explore these data structures next.  


<h1>Lesson Quiz</h1>

<h3>1. Which is an incorrect creation of an ArrayList object?</h3>

<form>
    <div>
        <input type="radio" value="a" name="cc" onchange="check(this, 'b')">
        a. <code>ArrayList&lt;Integer&gt; a = new ArrayList&lt;Integer&gt;();</code>
    </div>
    <div>
        <input type="radio" value="b" name="cc" onchange="check(this, 'b')">
        b. <code>ArrayList&lt;&gt; a = new ArrayList&lt;Integer&gt;();</code>
    </div>
    <div>
        <input type="radio" value="c" name="cc" onchange="check(this, 'b')">
        c. <code>List&lt;Integer&gt; a = new ArrayList&lt;&gt;();</code>
    </div>
    <div>
        <input type="radio" value="d" name="cc" onchange="check(this, 'b')">
        d. <code>List&lt;Integer&gt; a = new ArrayList&lt;Integer&gt;();</code>
    </div>
</form>

<h3>2. What is the purpose of a wrapper class?</h3>

<form>
    <div>
        <input type="radio" value="a" name="cc" onchange="check(this, 'd')">
        a. Wrapper classes allow classes to have a parameter of an undeclared type.
    </div>
    <div>
        <input type="radio" value="b" name="cc" onchange="check(this, 'd')">
        b. Wrapper classes act as primitives with methods which perform mathematical operations.
    </div>
    <div>
        <input type="radio" value="c" name="cc" onchange="check(this, 'd')">
        c. Wrapper classes are basic classes which are used manipulate primitive values.
    </div>
    <div>
        <input type="radio" value="d" name="cc" onchange="check(this, 'd')">
        d. Wrapper classes allow primitive values to be manipulated in an object format.
    </div>
</form>


{% endraw %}