# Complete-Java
Complete Java for Automation Testers from Scratch

 ## Chapter 2: Understanding classes, Objects and their usage in Java

 Method:  
 Method is a block in our java class.  
 ```java
 public void getData()  
	{  
		System.out.println("I am in a method");  
	}  
```
  void: not returning anything.  
  Int: returning integer.
  String: returning strings.  

  Why methods?
  Methods helps to reduce the lines of code and reduce duplicates. We can write lines of codes which runing in multiple places in a one block. This block is called a method. Then this block can be reuse by calling the name of the block(Method name).  

  Methods are return outside the main method and inside the class. So this method is not calling if you run the code now. There is no way the main can see the method outside of the main. We need a way to call this methods. So  you can create a object and call this method.  

 ### Importance of classes and objects in java
 
 * Object
   
   Objects are the instance/reference of a class. We can call the methods/variables present in a class with the help of objects. There is no way that main method will come to know about the methods/variables which are present out of the main method.  
   
 ```java
 Syntax:
 ClassName ObjectName=New ClassName();
 ```  
   New: allocating the memory.
 
 How to access the method of class using created object,
 ```java
 Syntax:
 
 ObjectName.MethodinClass;
 ```
 
 ## Chapter 3: Handling Strings and its functions in Java
 
 
 ### 0.1. Two ways of defining string object - Imp in Interview point of view
 
 * String
 
 String is a one of pre-build class in Java. You can create objects of this class if you want to use strings.
 
 
 There are two ways of defining a string,
 
 1. String Literal
 2. By creating an object of string.
 
 ```java
 String a="Hello"; >> This is String Literal
   
 String ab=new String("Hello"); >> This is creating an object
```
 1. String Literal
   
 Java compiler will create a string as 2. from the backend when user define string as Literal.
 This is the direct way of creating string rather than using the 2.
 
 The difference between 1. and 2, is
 
Java will reffering to existing object without creating a new object if you want to define an object and if its already define as a object.

Example: 
```java
String a ="Hello";
String b ="Hello";
```
Java will not create new string as 'b'. it will point to value of a variable,

```java
String a =new string("Hello");
String b =new string("Hello");
```
This will create separate object as a and b.

## 0.2 String class and their methods  
```java
String a="hello";
sout(a.charAt(2));
```
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
```java
Syntax:  
		for(initialization; condition; increment)
```
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
```java
Syntax;
Do
{

} While()  
```
## Explanation on Nested for loop  

nested for loop means, one for loop within another for loop.

# Chapter 6

What is interface?

Example: Traffic light  

Common rules:
Green: Move  
Red: Stop  
Yellow: Wait  

Those are common rules that should follow all countries when implement the traffic light system.

Australia is going to implement a traffic light system.  They should implement above rules in their system.  So Rules are equal to Interfaces and Australia equals to class.  

```java  
Interface
{
  Green  
  Red  
  Yellow
}

Australia
{
  Grean();
}
```
Clases should present methods mentioned in interface.  
  
How to link a interface and class?  
Create a Interface under package.
Define methods inside the interface.
Create a class.
Change the class name section to,  
public class AustraliaTraffic implements CentralTraffic
Now class name an error will display for the class name.  
mouse hoven and select Add unimplemented methods.  
Now all the methods will automatically display inside the class.  
  
```java
public interface CentralTraffic {
	
	public void GreenGo();
	public void RedStop();
	public void YellowFlash();

}
```
```java
public class AustraliaTraffic implements CentralTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Calling methods of the interface CentralTraffic
		CentralTraffic a=new AustraliaTraffic();
		a.GreenGo();
		a.RedStop();
    a.YellowFlash();

  }
  @Override
	public void GreenGo() {
		// TODO Auto-generated method stub
		
		System.out.println("GreenGo implementation");
		
	}

	@Override
	public void RedStop() {
		// TODO Auto-generated method stub
		
		System.out.println("Red Stop implementation");
		
	}

	@Override
	public void YellowFlash() {
		// TODO Auto-generated method stub
		
		System.out.println("YellowFlash implementation");
	}

  ```

One class can implement more than one interface.  

# Chapter 7  

## Usage of inheritance in java  
Vehicle is a existing class. We can consider this as a parent. Vehical already has implementation for their methods. 
Create a new vehicle called  NewVehicle. This new vehical has same method as Vehicle. So we don't need to write again and we can use methods in Vehicle class.

Vehicle:  
Colour
Gear  
Engine  
Breaks  
  
NewVehicle:  
EnginePower


```java
public class ParentClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void Break()
	{
		System.out.println("Break is implemented");
	}
	```

  ```java
  public class ChildDemo extends ParentClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildDemo c=new ChildDemo();
				c.Break();

 ```
# Chapter 8: Polymophisam in java with overriding and overloading examples 
## What is function overloading?   
If the class have multiple methods with the same name, it is call fuctional overloading.  
That methods are same by name but differ by arguments passing to function.  

rules of overloading;  
1. either argument cunt should be different  
2. enther argument data type should be different.  

How different function overriding from overloading?
1. Overriding has same name methods.
2. Same name.
3. Same parameters.  
Overriding means replacing.  

# Chapter 9: Learn Arrays  

