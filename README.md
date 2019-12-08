# Complete-Java
Complete Java for Automation Testers from Scratch

## This is second title.
hfh
### This is third title.

This is once sentence.  
This is sentence after enter.

* ONe bullet.
* Two bullet.
 * Bullet in bullet.
 
 ## Chapter 2: Understanding classes, Objects and their usage in Java
 
 ### Importance of classes and objects in java
 
 * Object
   
   Objects are the instance/reference of a class. We can call the methods/variables present in a class with the help of objects.
 
 Syntax:
 ClassName ObjectName=New ClassName();
   
   New: allocating the memory.
 
 How to access the method of class using created object,
 
 Syntax:
 
 ObjectName.MethodinClass;
 
 
 ## Chapter 3: Handling Strings and its functions in Java
 
 
 ### 0.1. Two ways of defining string object - Imp in Interview point of view
 
 * String
 
 String is a one of pre-build class in Java. You can create objects of this class if you want to use strings.
 
 
 There are two ways of defining a string,
 
 1. String Literal
 2. By creating an object of string.
 
 
 String a="Hello"; >> This is String Literal
   
   String ab=new String("Hello"); >> This is creating an object

 1. String Literal
   
 Java compiler will create a string as 2. from the backend when user define string as Literal.
 This is the direct way of creating string rather than using the 2.
 
 The difference between 1. and 2, is
 
Java will reffering to existing object without creating a new object if you want to define an object and if its already define as a object.

Example: 

String a ="Hello";
String b ="Hello";

Java will not create new string as 'b'. it will point to value of a variable,


String a =new string("Hello");
String b =new string("Hello");

This will create separate object as a and b.

## 0.2 String class and their methods

Methods of string class

* CharAt method:
You can get the characters present in the indexes using this method. you can pass the index. 

* IndexOf(); 
  method can use the fnd the index of given character.


* SubString(beginIndex,EndString) method:
  Pulling the strings between one index to another string.
 
* Substring(beginIndex):
  pulling from the start of mentioned string.

