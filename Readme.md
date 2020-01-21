Encapsulation
==============
Encapsulation is to hide the implementation details from the users.
If a data member is private it means it can only be accessed within the same class.
How to implement encapsulation in java:
:one: Make the instance variables private so that they cannot be accessed directly from outside the class. You can only set and get values of these variables through the methods of the class.
2) Have getter and setter methods in the class to set and get the values of the fields.
```
OUTPUT:
Employee Name: Gautam
Employee SSN: 112233
Employee Age: 20
```

Abstraction
===========
Abstraction  is the quality of dealing with ideas rather than events. For example, when you consider the case of e-mail, complex details such as what happens as soon as you send an e-mail, the protocol your e-mail server uses are hidden from the user. Therefore, to send an e-mail you just need to type the content, mention the address of the receiver, and click send.
`Interface` and `Abstract classes` are used to get Abstraction.
```
OUTPUT:
Constructing an Employee
Constructing an Employee
Call mailCheck using Salary reference --
Within mailCheck of Salary class 
Mailing check to Gautam with salary 3600.0

 Call mailCheck using Employee reference--
Within mailCheck of Salary class 
Mailing check to John Adams with salary 2400.0
```
Constructor
===========
Types of constructor:
```Default | No-Args | Parameterized  ```
### Default Constructor:
If you do not implement any constructor in your class, Java compiler inserts a default constructor into your code on your behalf.
### No-args:
Constructor with no arguments is known as no-arg constructor. The signature is same as default constructor, however body can have any code unlike default constructor where the body of the constructor is empty.
### Parameterized Constructor:
Constructor with arguments(or you can say parameters) is known as Parameterized constructor.
### Private Constructor:
The use of private constructor is to serve singleton classes. A singleton class is one which limits the number of objects creation to one. Using private constructor we can ensure that no more than one object can be created at a time.By providing a private constructor you prevent class instances from being created in any place other than this very class. 
