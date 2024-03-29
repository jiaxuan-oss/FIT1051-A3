Assessment #3
Submission deadline:  12th December 2022 (5:00pm MYT) via Moodle

Instructions
Below are the coding tasks that you need to complete for assessment 3.  Your work and your submission should be independent. Please download the IntelliJ project folder below and unzip it. This will provide you with a partial code in which to program your answers.  Please complete each task in the appropriate section of the partial code, and submit upon completion. 

File
Assessment3.zip
This assessment is worth 15% of the unit total. It contains 100 marks and is comprised of the following components:

Code correctness is weighted at 100 and will be converted to 90 marks.

Task 1 is worth 15 marks

Task 2 is worth 6 marks

Task 3 is worth 12 marks

Task 4 is worth 22 marks

Task 5 is worth 20 marks

Task 6 is worth 11 marks

Task 7 is worth 14 marks

Code readability & documentation is worth 5 marks.

Code development is worth 5 marks.

Academic Integrity
Please be reminded of the academic integrity mentioned in Week 01. You should code alone and ask the unit staff for help if needed. Do not post your code in public forums or send your code to anyone.

HOW TO TEST YOUR ☕️ JAVA CODE YOU HAVE WRITTEN?

Task 1 (W5 - 15 marks)
Please implement your code in the method labelled task1() method in the Assessment3 class project. 

The aim of this task is for you to demonstrate side effects in methods. Throughout the task use inline comments to explain, step by step, how side effects can occur to reference types but not to value types.

Task1a: 

Code a method that declares an array of type double and initialises it with 5 sensible values. This method will be the calling method. In it please call the Task1b method (the called method) with a reference to the array as well as one of the five elements in the array by value (does not matter which element). Print your array to the screen before and after the call to prove that side effects have taken place for reference types but not for value types.

Task1b: 

Code a method that accepts two parameters; an array of type double as reference type and a double value.  In the method, manipulate the arguments by incrementing the value of certain parts of the array as well as the additional value such that you will be able to show that side effects have taken place for reference types but not for value types. 

Hint. Note that you are not required to manipulate the entire array, the key is deciding which elements to increment.

Task 2 (W5 - 6 marks)
Please implement your code in the method labelled task2() method in the Assessment3 class project. 

Using the String format method just once, display the integer values 1, 10, 100, 1000 each on its own line right justified (aligned to the right). The values must not be hard-coded. Example of the output as below.



Hints: Inserting the character sequence \n in a String embeds a ‘line feed’ (new line – similar to pressing ENTER when typing words in Notepad) in the string e.g. “line1\nline2“

Task 3 (W5 - 12 marks)
Please implement your code in the method labelled task3() method in the Assessment3 class project. 

Please implement the following code sequences using an ArrayList.

Declare an array list named myList which has the capacity of 10. 

Add the following elements: "one", "seven", "five", "three", "eight", "ten". 

Insert the value "eleven" in between "five" and "three". 

Print all the elements in myList 

Delete the second to last element in myList 

Print true if myList contains the element "seven"; false otherwise.

Note: Pay attention that you choose appropriate data types.

Task 4 (W6 - 22 marks)
Code a private method called gradeScale that accepts a parameter mark as a String. The mark should be converted to an appropriate data types using Java Class libraries and evaluated according to the grading scale below. The method should print the appropriate Grade to the screen and also return it as a return value. 

If the mark is not within the appropriate range the method should print an appropriate error message to the user and return that as the return value, instead of the Grade. The method code should use the appropriate selection control structure and the conditions must be mutually exclusive and collectively exhaustive. The method should only use one return statement.



Example:  

For the input "80" the method will return ""High Distinction" and print it to the terminal. 

Task 5 (W6 - 20 marks)
Code a private method called daysOfTheWeek that accepts, day, a number corresponding to a day of the week as a String. Based on the input parameter, the method should print the appropriate day  (eg. Monday, Tuesday...etc) and return it as a return value. The method should use a "switch case" control structure. If the day is not within the appropriate range, the method should print an appropriate error message to the terminal and return that instead. The code conditions should demonstrate mutually exclusive and collectively exhaustive. The method should only use one return statement.

Example of output: 

For the input "2" the method will return "Tuesday" and print it to the terminal. 

Task 6 (W7 - 11 marks)
Please implement your code in the method labelled task6() method in the Assessment3 class project. 


Formula:


Code a method that accepts no parameters and displays the radius (integer) and the ratio of area to circumference (perimeter of a circle) (double), for all circles with integer radii beginning with a radius of 1 and continuing while the ratio is less than 30 (exclusive). All variables should be declared with appropriate data types and initialised with sensible values. The code should use the appropriate repetition control structure.

Hint: The Math Class in Java Libraries has methods that provide the value of π and power.


Task 7 (W7 - 14 marks)
Please implement your code in the method labelled task7() method in the Assessment3 class project. 

Code a method that accepts one variable, size, and draws a cross ( X ), with its width (horizontal length) defined by the variable.

The shape should be dynamic (not hard-coded) whereby for different values of the size variable the method will draw different sized crosses. This shape should be drawn by printing *, using for loop, with the result shown on the terminal and no return value. All variables should be declared with appropriate data types and initialised with sensible values.

Example:

 for the input 5 the method should print this to the terminal:


 for the input 10 the method should print this to the terminal:



Code Readability (5 marks)
Overall code submission must be well organised and very easy to follow including, but not limited to, code indentation, code consistency, effective use of whitespace etc. 

Code Development & Documentation (5 marks)
Overall code submission should demonstrate correct syntax usage and meaningful naming conventions. Code documentations/inline comments should be thorough and detailed.

Submission Instruction
Please submit your IntelliJ project folder as a .zip file and submit to Moodle as shown below. If you are not sure how to zip your project, please refer to the video here.
