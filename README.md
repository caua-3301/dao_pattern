## CRUD with MySQL and Java, using the DAO pattern

### DAO Pattern
>The DAO (Data Access Object) design pattern is an approach used in software programming to separate the data access logic from the business logic of the application. It allows the application to interact with a database or any other data source in an abstract and decoupled manner. Here are the main points about the DAO:
>><h4>Data Access Abstraction:</h4> The DAO provides an abstract interface to perform CRUD (Create, Read, Update, Delete) operations on a data source, hiding the specific implementation details. <br>
>><h4>Encapsulation:</h4> It encapsulates the complexity and particulars of data access, offering simple and intuitive methods for the application to use. <br>
>><h4>Decoupling:</h4> The separation between business logic and data access logic facilitates system maintenance and evolution, as changes in how data is accessed do not affect business logic. <br>
>><h4>Testing Facilitation:</h4> With the DAO, it is easier to create unit tests, as the data access logic can be easily mocked or replaced with test implementations. <br>
>><h4>Code Reusability:</h4> It promotes code reuse by centralizing data access operations in one place. <br><br>

<h4>UML diagram</h4>

![UML - model](https://github.com/user-attachments/assets/02b8bd23-4b44-43b1-a8a6-2b110575f8c2)
