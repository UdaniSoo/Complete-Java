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
  
```java
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Overloading
		PolymoDemo p=new PolymoDemo();
		p.getdata(2);
		p.getdata("Udani");

	}
	
	//overloading
	public void getdata(int a)
	{
		System.out.println(a);
	}
	
	public void getdata(String a)
	{
		System.out.println(a);
	}
```  

How different function overriding from overloading?
1. Overriding has same name methods.
2. Same name.
3. Same parameters.  
Overriding means replacing.  

```java
public class ParentClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void sendData()
	{
		System.out.println("Data sending by parent");
	}

}
```

```java
public class PolymoDemo extends ParentClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolymoDemo p=new PolymoDemo();
			//Overriding
    p.sendData();

	}
	//Overriding
	public void sendData()
	{
		System.out.println("Data sending by child");
	}

}
```
# Chapter 9: Learn Arrays  
## What are Arrays and their usage in Java programmes  
what is a multidimension array?  
      C0 C1 C2
Row0: 2  3  5  
Row1: 6  4  1  
Row2: 7  9  8  

each argument takes X axis and Y axis. 2 is 0th row oth column. This is called multidimension array. We are viewing this array from multi perspective.  
To diclar a multidimension array you need to declare x and y;  

```java
Syntax:
int a[][]=new int[3][3];

a[raw] [column]
```

What is the simple way of defining multidenmension array?   

```java
 int b[][]= {{2,4,5},{3,4,7}};
```  
# Chapter 15: Java Collections
## What are java collection?  
The java collection is a collection of classes and interfaces which helps in storing and processing the data efficiently. This framework has several usefull classes which has tons of useful functions which makes progamming easier.  

Collections:
1. List  
2. Set
3. Map

## List
A list is and ordered collection(sometimes called a sequence),lists may contains duplicate elements. Below are classes implement list interfaces, 
- ArrayList  
- LinkedList  
- Vector  

Above are the 3 classes which implements "List" interface. List provides some setup methods. where above 3 classes use list methods in their classes.  
All the classses hich implements list interface can duplicate values.  
Arraylist and Array dif
Arraylist has a dinamic size where you can increase and remove at any time. But Array is a fixed size one and you have to use defined size. 
You can access to any value any index in a arraylist.
Arraylist is accepting duplicate values.
  
```java
Syntax: 
ArrayList<String> a=new ArrayList<String>();
```
## Implementation of Set interface  

Below 3 classes implements the List interface
- HasSet
- TreeSet
- LinkedHashSet

Diff between List and Set,  
Set interface doesn't accept the duplicate values.  
There is no guarantee elements stored in sequential order. They may stored in random order.  

```java
HashSet<String> hs=new HashSet<String>();
```  

Iterator:
```java
Iterator<String> i=hs.iterator(); //traverse though all elements of hs.
```

hasNext();
if iterator has something go inside.  

# Chapter 16: Hash map and hash tables in java  
 Each key an value will store as an Set index.

 Map.Entry:  
 This is helping to separate values from map. This will get the key and the value from the hash map.

## Difference between HashMap and HashTable
1. Synchronization or Thread Safe:  
HasMap: is non synchronized and thread safe.   
if 5 diffrent programes accessing the hashmap. it wil be accessible one at a time.  
HashTable: One programe has to wait until the other program releases the hashmap resources.  
When to use HashMap?  
if your application do not require any multi-threading task, in other words hashmap is better for non-threading applications. Hash table shouldbe used in multithreading applications.  
2. Null keys and null values.  
Hashmap allows one null key and any number of null values. while hashtable do not allow null keys and null values in tne hashtable object.  
3. Iterating the values:
Hashmp object values are iterated by using iterator.  
HashTable is the onlyclass other than vector which uses enumerator to iterate the values of HashTable object.  

# Chapter 18: Encapsulation with practical examples.  

## Importance of access modifiers

Types of access modifiers,
1. Public  
2. Private  
3. Projected  
4. Default  

### Public  
If variable/methods are public, then you will have access across all the packages.  

### Private  
if the method/variavle define as private, You can't access those outside the class of same package as well.  

### Projected  
If the method/variables defined as projected, you can access those in subclasses only. Only child classes which extended parent class can only access protected methods/variables(When you inherit). This applies to other packages. Protected can access whithin the same package as public.

### Default  
Your java class will think access modifier is the "default" if you did't mention the access modifier type. If it is default, you can access that from anywhere in your package.  
Example:  
```java
void abc()
{
	System.out.println("Hello");
}  
```
Summary:
Default: Access same package of classes
Protected: Access same package of classes + sub classess can access.  

