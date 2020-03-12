---
layout: post-lesson
permalink: /learn/ap-computer-science/coding-challenge-3/
lesson_title: "Coding Challenge #3"
author: Alan Bi
---


<script src="/questions.js"></script>

{% raw %}

In this coding challenge, the goal is for you to gain experience designing classes and interfaces. To do so, your task is to design a class and an interface that you have recently just learned about: List and ArrayList. For simplicity, you can assume that your implementation of List and ArrayList is to always be used specifically for integers (you don’t need to worry about including <Integer> when creating an instance of your ArrayList). 

To do this challenge, first you need to have some more information about how an ArrayList actually works. Recall that an ArrayList stores data similarly to an array but can grow to fit more data as needed. It is able to do this because each instance of an ArrayList contains a private array that has a large capacity and automatically resizes when it becomes close to full. 

When you create the ArrayList class, you need to implement this behavior. The way to do have this done is every time you call the add method on the ArrayList, it should first check if there is enough room in its internal array to store another element. If not, it calls a private method that creates a new array twice the size of the original, copies the elements from the old array into the new array, and then changes the ArrayList’s private instance variable to point to the new array. Finally, the add method proceeds as normal and adds the element at the end of the list. 

The other thing is that in order to keep track of how many elements are in the ArrayList, you can’t simply use .length on the array because the array is created to have more capacity than needed to allow for the growing capabilities. Instead, you have to have a private integer instance variable that’s initially set to 0. Every time you add an element into the ArrayList, this size variable is incremented by one, and every time you remove an element, the size is decreased by one. Then, once the size variable becomes equal to the array’s actual length, you know that you will need to resize the array again.

In your List interface, the following methods must be specified: 

        boolean add(int val);
        void add(int index, int val);
        boolean contains(int val);
        int get(int index);
        int indexOf(int val);
        boolean isEmpty();
        int remove(int index);
        int set(int index, int val);
        int size();

The ArrayList class, which should implement the List interface, must meet the following requirements for each method (keep in mind that any mentions of the size of the list refers to the number of elements in the list rather than the length of the internal array):

<pre><code>
    <b>boolean add(int val)</b> - Adds value to the end of the list. Returns true. 

    <b>void add(int index, int val)</b> - Adds value to the list at the given index, shifting 
    elements located at or to the right of that index one over in order to make room. 
    Throws an IndexOutOfBoundsException if index < 0 or index > size of list. 

    <b>boolean contains(int val)</b> - Returns true if the list contains the given value and 
    false otherwise. 

    <b>int get(int index)</b> - Returns the value at the given index. Throws an 
    IndexOutOfBoundsException if index < 0 or index >= size of list. 

    <b>int indexOf(int val)</b> - Returns the index of the first occurrence of the given value 
    in this list, or -1 if the value is not found. 

    <b>boolean isEmpty()</b> - Returns true if the the size of the list is 0, and false otherwise. 

    <b>int remove(int index)</b> - Removes the value at the given index, shifts the elements to 
    the right of that index one over in order to fill the gap, and returns the value removed. 
    Throws an IndexOutOfBoundsException if index < 0 or index >= size. 

    <b>int set(int index, int val)</b> - Replaces the element at the given index with the new value. 
    Throws an IndexOutOfBoundsException if index < 0 or index >= size. 

    <b>int size()</b> - Returns the size of the list. 
</code></pre>

In addition to these methods, your ArrayList should also override the toString method. A call to this method will return a string with the elements in the list in order, with each value separated by commas and spaces. The whole string will be surrounded by square brackets. For example, if the ArrayList contained the values 5, 8, and 3, in that order, the call to toString() would return the following string: [5, 8, 3]. 

The ArrayList should have two constructors. The first constructor requires no parameters and creates the internal array with a default capacity of 10. The second constructor accepts an integer parameter and creates the internal array with the given integer as its default capacity. Both constructors will of course set the size variable initially to 0. 

It also might be useful to have other methods, such as a method that checks if the internal array needs resizing and doubles its size if it does. However, since these methods are part of the inner workings of the ArrayList class, the users of the class won’t ever need to use them. In fact, they probably shouldn’t have access to them. For this reason, if you decide to create any “helper” methods, you should make them private. 

If you are having difficulty with this assignment or are simply just interested in seeing the solution to this challenge, click on [this link](https://courses.cs.washington.edu/courses/cse143/11wi/lectures/01-14/programs/ArrayIntList.java) (created by Marty Stepp) to view the code for the ArrayIntList class. Despite the slight difference in name, the code is still correct and can be easily used as a solution to this challenge. 


{% endraw %}

