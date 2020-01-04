# Complete-Java
Complete Java for Automation Testers from Scratch

 ## Chapter 2: Understanding classes, Objects and their usage in Java

 Method:  
 Method is a block in our java class.  
 public void getData()  
	{  
		System.out.println("I am in a method");  
	}  

  void: not returning anything.  
  Int: returning integer.
  String: returning strings.  

  Why methods?
  Methods helps to reduce the lines of code and reduce duplicates. We can write lines of codes which runing in multiple places in a one block. This block is called a method. Then this block can be reuse by calling the name of the block(Method name).  

  Methods are return outside the main method and inside the class. So this method is not calling if you run the code now. There is no way the main can see the method outside of the main. We need a way to call this methods. So  you can create a object and call this method.  

 ### Importance of classes and objects in java
 
 * Object
   
   Objects are the instance/reference of a class. We can call the methods/variables present in a class with the help of objects. There is no way that main method will come to know about the methods/variables which are present out of the main method.  
   
 
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
String a="hello";
sout(a.charAt(2));

User can see all the methods of string class by entring a.

Methods of string class

* CharAt method:
You can get the characters present in the indexes using this method. you can pass the index. 
sout(a.charAt(1));
Output: e
* IndexOf(); 
  method can use the fnd the index of given character.
  sout(a.indexOf("e"));
  Output: 1


* SubString(beginIndex,EndString) method:
  Pulling the strings between one index to another string.
 
* Substring(beginIndex):
  pulling from the start of mentioned string.

## 0.3 Practise Exercise: reverse String logic-Palindrome

String s="Udani";

This string is in a array. if sout(arr[0]) then it will print U.  
# Chapter 4
## How for loops works-with example demonstration  

Syntax:  
		for(initialization; condition; increment)

## When should I use While loop?  

While loop will run unill the con dition gets true.
```java
Syntax:  
while(booleanExpression)  
{  
  
  Operation;
}  
```
Do While loop,

Syntax;
Do
{

} While()  

## Explanation on Nested for loop  

nested for loop means, one for loop within another for loop.

