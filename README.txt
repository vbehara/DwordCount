

CS542 Design Patterns
Spring 2015
ASSIGNMENT <1> README FILE

Due Date: <PROJECT DUE DATE, IN FORMAT: Wednesday, April 22, 2015>
Submission Date: <DATE YOU SUBMIT, IN FORMAT: Wednesday, April 22, 2015>
Grace Period Used This Project: N/A
Grace Period Remaining: N/A
Author(s): < Venkata Ramana Murthy Behara > 
e-mail(s): < vbehara1@binghamton.edu > 


PURPOSE:

Purpose of this assignment is to implement Visitor Pattern with element as Data Structure. Single ton pattern is used in this project, Which is used where we need only one instance. In MyLogger.class 
patterns used:
visitor pattern
singleton pattern. 
Design principle1: "Design to an interface not implementation".
Design principle2: Composition

DeBug Levels :

0 output should be printed and only error messages will be printed from catch blocks.
1 output from the Visit and accept methods will be printed
2 messages from constructors will be printed to console
3 messages from all remaining methods will be printed to console

PERCENT COMPLETE:

100 percent of the project is completed. Covered all of the requirements up to date till.

PARTS THAT ARE NOT COMPLETE:

I have covered all requirements.

BUGS:

No Bugs code is Running successfully.

FILES:

Necessary files so that code will run successfully are

 behara_VenkataRamanaMurthy_assign4
 ---wordCount
	---run.sh
	---README.txt
	---src
	   ---wordCount
	   ---build.xml
	   	   ---driver
			---Driver.java [the main function is here]
		   ---treesForStrings
			---WordNode.java
		   	---TreeElement.java
	 	   ---visitors
	   	     ---PopulateTreeVisitor.java
	   	     ---Visitor.java    [interface]
		     ---WordCountVisitor.java
		   ---util           
	   	     ---FileProcessor.java
	   	     ---MyLogger.java

steps to extract:

1 Download behara_VenkataRamanaMurthy_assign4.tar file
2 Extract it using command 
"tar -xcvf behara_VenkataRamanaMurthy_assign4.tar.gz"

SAMPLE OUTPUT:
"./run.sh input10K.txt output10K.txt 5 0
output in console:
Time taken:19
output written to filename in arg[1]-output file is
No of Char Counts: 81915
No of Word Counts: 10000
No of Unique Word Counts: 9353


TO RUN:
do run at this directory path behara_VenkataRamanaMurthy_assign4/wordCount
use commands
"ant -buildfile src/build.xml clean" to clean 
"ant -buildfile src/build.xml all" to compile
"./run.sh input10K.txt output10K.txt 5 0" to run


My inputs at commandline:
input10K.txt output10K.txt 5 0

clean guidelines:
use file names for arg[1] as output1K.txt,output10K.txt,output1M.txt,output10M.txt,output40M.txt,output100M.txt. Cleans the files as I have coded those file names to delete in build.xml.



Output: 

Why TreeMap:
TreeMap is used as it uses Red Black Tree in background implementation in java.
A red–black tree is a binary search tree with an extra bit of data per node, its color, which can be either red or black.[1] The extra bit of storage ensures an approximately balanced tree by constraining how nodes are colored from any path from the root to the leaf.[1] Thus, it is a data structure which is a type of self-balancing binary search tree. 
As it is balancing searching time for WordCountVisitor is less comparing to BST.


EXTRA CREDIT:

N/A

BIBLIOGRAPHY:

TreeMap www.javatpoint.com

ACKNOWLEDGEMENT:

cs542 LISTSERV

