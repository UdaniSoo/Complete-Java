#### Inheritance

* Inheritance is defined as the process where one class acquires the methods and properties of another class.
* It describes classes using IS-A relationship.

``` java
public class Animal {
}

public class Mammal extends Animal {
}

public class Reptile extends Animal {
}

public class Dog extends Mammal {
}
```

#### Polymorphism

* Polymorphism is the ability of an object to take on many forms.
* The most common use of polymorphism in OOP occurs when a parent class reference is used to refer to a child class object.
* Parent class methods can be overridden at the child class.

#### Abstraction
* Abstraction is hiding implementation details of a class from the user. 
* The user will know what the object does but not how it does it.
* In Java, abstraction is achieved using Abstract classes and interfaces.

#### Encapsulation
* In encapsulation the data of a class is hidden from the user and can only be accessed or changed by methods.
* To achieve encapsulation in Java −
  * Declare the variables of a class as private.
  * Provide public setter and getter methods to modify and view the variables values.
  
  #### Difference between a class and an interface
  * Is kind of contract that will be followed by the class that is gone a implement that interface
