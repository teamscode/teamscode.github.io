---
layout: post-lesson
permalink: /learn/ap-computer-science/interfaces/
lesson_title: Interfaces
lesson_desc: What are interfaces and when to use them. 
author: Alan Bi
---

<script src="/questions.js"></script>

{% raw %}

Interfaces, similar to abstract classes, contain a collection of abstract methods. With abstract classes, you are able to create incomplete classes and rely on subclasses to implement the rest. Essentially, abstract classes are just normal classes with at least one abstract method. Interfaces are similar to abstract classes, but the difference is that interfaces have only unimplemented methods and nothing else, whereas abstract classes have a mix of implemented and abstract methods. Interfaces help guarantee that all subclasses have at the bare minimum the methods specified in the interface. Declaring variables as an interface type also helps your code stay flexible by allowing you to easily change the subclasses the variables are instantiated with. 

Interfaces are very useful for very abstract ideas, and although you might not have seen them yet, they are very commonly used in programming. For example, let’s say you want to create an <code>Animal</code> class. However, just having an <code>Animal</code> object probably wouldn’t be sufficient. What kind of animal is it? Does it live on land or sea? Does it walk or fly? Because you can’t answer any of these questions with an <code>Animal</code> class alone, you should make <code>Animal</code> an interface with a few methods that all animals should be able to perform, but without the method implementations (as these depend on the type of animal). With interfaces, creating unimplemented methods is similar to how you would do it in an abstract method, except you simply leave out the access level modifiers and don’t include abstract: 

        public interface Animal {

            void makeNoise();

            void eat();

            ...

        }

Like with abstract classes, the following call will not compile because you cannot directly instantiate an <code>Animal</code> object: 

        Animal a = new Animal();

Now you can have more specific classes, like <code>Dog</code> and <code>Fish</code>, extend this interface and each provide its own implementation details for the methods listed in the interface. However, with interfaces, you don’t extend them, you implement them: 

        public class Dog implements Animal {

            /* field variables */

            public Dog() {

                /* implementation details */

            }

            public void makeNoise() {

                System.out.println("Bark");

            }

            public void eat() {

                System.out.println("Dog eats bone");

            }

            /* optional other methods */

        }

Since interfaces are such abstract ideas, they often include a very large hierarchy of classes, abstract classes, and even other interfaces extending and implementing each other, getting more and more concrete as you go further down the hierarchy. For example, you could easily change the <code>Dog</code> and <code>Fish</code> classes to be abstract, and then have other classes like <code>Husky</code>, <code>Poodle</code> and <code>Goldfish</code> extend from them. And, taking it even further, you could introduce two new interfaces, <code>LandAnimal</code> and <code>SeaAnimal</code>, that lie in between the <code>Animal</code> interface and the <code>Dog</code> and <code>Fish</code> abstract classes. As you can see, there are endless possibilities when it comes to interfaces. 

The added benefit of having this kind of hierarchy is that you can choose the amount of flexibility you have. For example, take a look at the following two variables: 

        Animal a = new Poodle();

        Dog d = new Poodle(); 

Both variables now hold a <code>Poodle</code> object. However, the first variable <code>a</code> is classified as an animal whereas the second <code>d</code> is classified as a dog. Both are valid code examples, although each offers its own benefits. One benefit of the first one is that variable <code>a</code> is more generally classified and therefore gives you a greater variety of animals to choose from, like a husky and even a goldfish, whereas since <code>d</code> is defined more specifically as a <code>Dog</code>, you can only change it to be a husky or another type of <code>Dog</code>. However, since <code>a</code> can be any type of animal, this also means there are more restrictions to what methods are available to it. 

Variable <code>d</code> can call all the methods listed in the <code>Animal</code> interface as well as any new methods provided in the <code>Dog</code> class (such as <code>performTrick</code> or <code>chaseMailman</code>) because it’s guaranteed to hold a dog. However, only methods included in the <code>Animal</code> interface (as well as the default methods included in the <code>Object</code> class, like <code>toString</code>) can be used by the variable <code>a</code> because it can be any type of animal, and animals like goldfish would not be able to perform a method in the <code>Dog</code> class, such as chasing a mailman. 

To get even more methods, such as the methods defined specifically in the <code>Poodle</code> class, you could create a variable like this: <code>Poodle p = new Poodle()</code>. However, in some cases, it is better practice to define <code>p</code> as a <code>Dog</code> rather than a <code>Poodle</code> to give yourself a bit more flexibility in the future. If you needed to use a method defined in the <code>Poodle</code> class that isn’t defined in the <code>Dog</code> class, you could cast your <code>Dog p</code> into a <code>Poodle</code> each time you want to use one of those methods (if you don’t remember casting, it will be revisited in the next lesson about polymorphism). Of course, if you find yourself requiring a lot of the methods in the <code>Poodle</code> class, it is most likely better to define your variable as <code>Poodle p = new Poodle()</code>. 

In an upcoming lesson, you will be taking your first look at the Collection interface hierarchy, which defines several classes and interfaces that act as data structures. More specifically, you will be working with <code>Lists</code> and <code>ArrayLists</code>: 

<img src="/assets/lesson_images/collections_interface.png" alt="Collections Interface" width="600px"/>

Source: [Neemeekaa Consulting](http://www.neemeekaa.com/java-collections-framework/)

Notice how in this hierarchy some classes can implement multiple interfaces (e.g. <code>public class LinkedList implements List, Queue, Deque</code>). Also important to pay attention to are the different types of arrows. The filled arrows represent the <code>extends</code> keyword whereas the empty arrows represent the <code>implements</code> keyword. For example, you can see that <code>ArrayList</code> implements <code>List</code>, an interface, and <code>LinkedHashSet</code> extends HashSet, a class. If you pay close attention, you’ll also notice that the interfaces here extend the other interfaces rather than implementing them. This is a small detail but important to know if you ever go on to write your own hierarchy of classes and interfaces.  


<h1>Lesson Quiz</h1>

<h3>1. Assume that A is an interface, B is an abstract class, and C is a class. Which of the following headers would result in an error?</h3>        

        I. public class C extends B

        II. public class B implements A

        III. public class C extends A

<form>
    <div>
        <input type="radio" value="a" name="cc" onchange="check(this, 'd')">
        a. I only
    </div>
    <div>
        <input type="radio" value="b" name="cc" onchange="check(this, 'd')">
        b. III only
    </div>
    <div>
        <input type="radio" value="c" name="cc" onchange="check(this, 'd')">
        c. I and II
    </div>
    <div>
        <input type="radio" value="d" name="cc" onchange="check(this, 'd')">
        d. II and III
    </div>
</form>

<h3>2. Order classes, abstract classes, and interfaces in order from most concrete to most abstract.</h3>

<form>
    <div>
        <input type="radio" value="a" name="cc" onchange="check(this, 'd')">
        a. Interfaces, classes, abstract classes
    </div>
    <div>
        <input type="radio" value="b" name="cc" onchange="check(this, 'd')">
        b. Classes, interfaces, abstract classes
    </div>
    <div>
        <input type="radio" value="c" name="cc" onchange="check(this, 'd')">
        c. Abstract classes, interfaces, classes
    </div>
    <div>
        <input type="radio" value="d" name="cc" onchange="check(this, 'd')">
        d. Classes, abstract classes, interfaces
    </div>
</form>


{% endraw %}


