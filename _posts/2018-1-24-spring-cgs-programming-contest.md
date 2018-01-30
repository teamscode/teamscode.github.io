---
layout: post-lesson
permalink: /learn/ap-computer-science/more-number-bases/
lesson_title: More Number Bases
lesson_desc: Learning about octal and hexadecimal number bases.
author: Jason Zhang
---

<script src="/questions.js"></script>

{% raw %}

<table>
  <tr>
    <th colspan="2">Vocab Bar</th>
  </tr>
  <tr>
    <td>Hexadecimal</td>
    <td>The numeral system of base 16</td>
  </tr>
  <tr>
    <td>Octal</td>
    <td>The numeral system of base 8</td>
  </tr>
</table>


In the last chapter, we covered binary. However, there are also higher numbering base systems.

**Hexadecimal** is the numeral system of base 16. Its first ten digits are 0-9 and the next six digits are A-F. The Hexadecimal system is calculated the same was a binary and decimal, except with base 16 instead. It is used mainly to represent color and data location.

This table shows the first 16 hexadecimal numbers converted to base 10. The conversion protocol is the same as binary. Once a position reaches a value greater than 15, then you add 1 to the next position and restart at 0. You can see this between 15 and 16. 15 is equal to 15 multiplied by 16 to the 0th power. However 16 is equal to 1 multiplied by 16 to the first power. So the ones position is reset to 0, and the tens position increments by 1:

<table>
  <tr>
    <th>Base Ten</th>
    <th>Hexadecimal</th>
  </tr>
  <tr>
    <td>0</td>
    <td>0</td>
  </tr>
  <tr>
    <td>1</td>
    <td>1</td>
  </tr>
  <tr>
    <td>2</td>
    <td>2</td>
  </tr>
  <tr>
    <td>3</td>
    <td>3</td>
  </tr>
  <tr>
    <td>4</td>
    <td>4</td>
  </tr>
  <tr>
    <td>5</td>
    <td>5</td>
  </tr>
  <tr>
    <td>6</td>
    <td>6</td>
  </tr>
  <tr>
    <td>7</td>
    <td>7</td>
  </tr>
  <tr>
    <td>8</td>
    <td>8</td>
  </tr>
  <tr>
    <td>9</td>
    <td>9</td>
  </tr>
  <tr>
    <td>10</td>
    <td>A</td>
  </tr>
  <tr>
    <td>11</td>
    <td>B</td>
  </tr>
  <tr>
    <td>12</td>
    <td>C</td>
  </tr>
  <tr>
    <td>13</td>
    <td>D</td>
  </tr>
  <tr>
    <td>14</td>
    <td>E</td>
  </tr>
  <tr>
    <td>15</td>
    <td>F</td>
  </tr>
  <tr>
    <td>16</td>
    <td>10</td>
  </tr>
  <tr>
    <td>17</td>
    <td>11</td>
  </tr>
  <tr>
    <td>18</td>
    <td>12</td>
  </tr>
  <tr>
    <td>...</td>
    <td>...</td>
  </tr>
  <tr>
  </tr>
</table>


The **Octal** numeral system is the base 8 system. It uses 0-7 as its set of digits, and it’s calculated in the exact same way as the hexadecimal, decimal, and binary system, except with base 8. For instance, once the value of a certain position reaches the maximum value (in this case 8), it overflows into the next position. Take 4 multiplied by 2, in the chart below. 4 multiplied by 2 is eight, eight can be represented as 1 multiplied by 8 to the power of 1. The Octal numbering system was used widely to transcribe data locations and instruction, but as the data became larger, those uses fell to hexadecimal.

This table shows the octal multiplication chart:

<table>
  <tr>
    <th>x</th>
    <th>1</th>
    <th>2</th>
    <th>3</th>
    <th>4</th>
    <th>5</th>
    <th>6</th>
    <th>7</th>
    <th>10</th>
  </tr>
  <tr>
    <th>1</th>
    <td>1</td>
    <td>2</td>
    <td>3</td>
    <td>4</td>
    <td>5</td>
    <td>6</td>
    <td>7</td>
    <td>10</td>
  </tr>
  <tr>
    <th>2</th>
    <td>2</td>
    <td>4</td>
    <td>6</td>
    <td>10</td>
    <td>12</td>
    <td>14</td>
    <td>16</td>
    <td>20</td>
  </tr>
  <tr>
    <th>3</th>
    <td>3</td>
    <td>6</td>
    <td>11</td>
    <td>14</td>
    <td>17</td>
    <td>22</td>
    <td>25</td>
    <td>30</td>
  </tr>
  <tr>
    <th>4</th>
    <td>4</td>
    <td>10</td>
    <td>14</td>
    <td>20</td>
    <td>24</td>
    <td>30</td>
    <td>34</td>
    <td>40</td>
  </tr>
  <tr>
    <th>5</th>
    <td>5</td>
    <td>12</td>
    <td>17</td>
    <td>24</td>
    <td>31</td>
    <td>36</td>
    <td>43</td>
    <td>50</td>
  </tr>
  <tr>
    <th>6</th>
    <td>6</td>
    <td>14</td>
    <td>22</td>
    <td>30</td>
    <td>36</td>
    <td>44</td>
    <td>52</td>
    <td>60</td>
  </tr>
  <tr>
    <th>7</th>
    <td>7</td>
    <td>16</td>
    <td>25</td>
    <td>34</td>
    <td>43</td>
    <td>52</td>
    <td>61</td>
    <td>70</td>
  </tr>
  <tr>
    <th>10</th>
    <td>10</td>
    <td>20</td>
    <td>30</td>
    <td>40</td>
    <td>50</td>
    <td>60</td>
    <td>70</td>
    <td>100</td>
  </tr>
</table>

<h1>Lesson Quiz</h1>

<h2><u>Convert the following numbers to base 10.</u></h2>

<h3>1. Oct: 76</h3>

<form>
    <div>
        <input type="radio" value="a" name="cc" onchange="check(this, 'b')">
        a. 54
    </div>
    <div>
        <input type="radio" value="b" name="cc" onchange="check(this, 'b')">
        b. 62
    </div>
    <div>
        <input type="radio" value="c" name="cc" onchange="check(this, 'b')">
        c. 68
    </div>
    <div>
        <input type="radio" value="d" name="cc" onchange="check(this, 'b')">
        d. 76
    </div>
</form>

<h3>2. Oct: 135</h3>

<form>
    <div>
        <input type="radio" value="a" name="cc" onchange="check(this, 'd')">
        a. 89
    </div>
    <div>
        <input type="radio" value="b" name="cc" onchange="check(this, 'd')">
        b. 90
    </div>
    <div>
        <input type="radio" value="c" name="cc" onchange="check(this, 'd')">
        c. 92
    </div>
    <div>
        <input type="radio" value="d" name="cc" onchange="check(this, 'd')">
        d. 93
    </div>
</form>

<h3>3. Oct: 427</h3>

<form>
    <div>
        <input type="radio" value="a" name="cc" onchange="check(this, 'a')">
        a. 279
    </div>
    <div>
        <input type="radio" value="b" name="cc" onchange="check(this, 'a')">
        b. 283
    </div>
    <div>
        <input type="radio" value="c" name="cc" onchange="check(this, 'a')">
        c. 284
    </div>
    <div>
        <input type="radio" value="d" name="cc" onchange="check(this, 'a')">
        d. 285
    </div>
</form>

<h3>4. Hex: 8f</h3>

<form>
    <div>
        <input type="radio" value="a" name="cc" onchange="check(this, 'a')">
        a. 143
    </div>
    <div>
        <input type="radio" value="b" name="cc" onchange="check(this, 'a')">
        b. 144
    </div>
    <div>
        <input type="radio" value="c" name="cc" onchange="check(this, 'a')">
        c. 145
    </div>
    <div>
        <input type="radio" value="d" name="cc" onchange="check(this, 'a')">
        d. 146
    </div>
</form>

<h3>5. Hex: 7a</h3>

<form>
    <div>
        <input type="radio" value="a" name="cc" onchange="check(this, 'c')">
        a. 120
    </div>
    <div>
        <input type="radio" value="b" name="cc" onchange="check(this, 'c')">
        b. 121
    </div>
    <div>
        <input type="radio" value="c" name="cc" onchange="check(this, 'c')">
        c. 122
    </div>
    <div>
        <input type="radio" value="d" name="cc" onchange="check(this, 'c')">
        d. 123
    </div>
</form>

{% endraw %}