---
layout: post-lesson
permalink: /learn/ap-computer-science/sample-lesson/
lesson_title: Sample lesson
lesson_desc: Little blurb about what the lesson is about.
---

# Cool lesson huh?

Inconsolata: <code style="font-family: Inconsolata;">Hello, typing random sentences.</code> Inline code.  
Normal text: Hello, typing random sentences. Inline code.  
Normal code: <code>Hello, typing random sentences.</code> Inline code.  

Note: the spaces are much larger within the code tags so when you have inline code make the spaces outside of the code tags to make it look better. 


Code block with Jekyll highlight thing:

{% highlight java %}

System.out.println("HI");

public class fjids {
    public void fdjisf(int fd) {
    System.out.println("HFd");
      return;
    }
}

{% endhighlight %}

Code block with code and pre tags:

For long lines of code, use the code tag but with pre tags wrapping around it:
<pre style="tab-size: 4;"><code style="font-family: Inconsolata;">	System.out.println("HI");

	public class fjids {
		public void fdjisf(int fd) {
			System.out.println("HFd");
			return;
		}
	}
</code></pre>

A tab is too large by default, like eight spaces. Though you can fix it with setting tab size of the pre tag. 
Also there's normally a large gap between the start of your code block and the previous sentences, so to fix that, the first line inside your code block needs to be on the same line as the opening pre and code tags. 

Another weird thing with markdown is that if you want to make a single line break between paragraphs, you need to have two spaces at the end of the line and then click return to move down a line (without it when the page is loaded the two lines are not separated by a line break despite what it shows in the .md file. However if you separate them by two line breaks (having a gap between the paragraphs) it works perfectly fine and you dont have to worry about that. 



