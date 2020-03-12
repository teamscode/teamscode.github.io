---
layout: post-lesson
permalink: /learn/ap-computer-science/coding-challenge-4/
lesson_title: "Coding Challenge #4"
author: Chris Elliott
---


<script src="/questions.js"></script>

{% raw %}

Welcome to your last coding challenge! In this challenge, you will create a program to solve any 8x8 maze! This problem was used in TeamsCode’s Spring 2017 MIHS Programming Contest, and is a great conclusion to the TeamsCode Java course!

Solving a maze with a computer program is a popular challenge, and effectively tests your understanding of Java. For this challenge, you will need to use recursion, multiple methods, and 2d arrays, as well as reading in the input text file with a Scanner. Below are the input/output explanations for this problem:

**Input:**

The first line of the text file contains an integer N, representing the number of mazes to follow, followed by mazes with an ‘S’ representing the starting position, an ‘X’ representing the ending position, a ‘#’ representing a wall, and a ‘.’ at every place you are allowed to move to. 

**Output:**

The maze with a space replacing each ‘.’ you must pass in order to get from start to finish. The ‘S’ should be replaced with a space and the ‘X’ should be replaced with the ‘S’. If the maze does not have a solution, print “NO SOLUTION.”


**Example Input:**

<pre><code>2
########  
#S.....#   
######.#  
##X###.#   
##.#...#  
##.###.#  
#......#  
########  

########  
#.....S#  
###.####   
#...#..#  
#.##...#   
#.#..#.#   
#....#X#  
########
</code></pre>

**Example Output:**

<pre><code>########  
#      #  
###### #  
##S### #   
## #.. #  
## ### #    
#.     #  
########  
 
########  
#..    #  
### ####    
#   #..#  
# ##   #  
# #. # #  
#    #S#  
########  
</code></pre>


<a class="a" href="/assets/problem_pdfs/underground_maze.pdf">Here</a> is a link to the problem pdf. If you would like to download the input files for this problem, you can find them <a class="a" href="/assets/problem_pdfs/all_problems.zip">here. </a>

Good luck!

{% endraw %}
