Encapsulation
==============
Encapsulation is to hide the implementation details from the users.
If a data member is private it means it can only be accessed within the same class.
How to implement encapsulation in java:
1) Make the instance variables private so that they cannot be accessed directly from outside the class. You can only set and get values of these variables through the methods of the class.
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
