# Employee Hub
A Java application that imports data from an Xlsx File, creates Tables and Relationships and shows data on JSP pages

# Technologies
This application was created thanks to several Frameworks:
  - **Hibernate**:  
  Hibernate is an ORM Framework.  
  It allows to map the Database Tables to the Java Classes.  
  With Hibernate we can remove a lot of spaghetti code when interacting with the database as we can use the Hibernate APIs to perform CRUD operations, instead of SQL.
  - **Spring Boot**:  
  Spring Boot is one of the widest used JEE Frameworks and it provides many advantages.  
  The reasons behind the choice of using Spring are:
    - Dipendency Injection, which allows to remove the hard-coded dependencies.  
    - Spring Boot integrates with Hibernate, it provides even easier utility methods to use, the mapping is simpler, and the tables are automaticaly created (No need of any 'CREATE TABLE' SQL Query).
    - Integrations with JSP and Servelts.
  - **Apache POI**:  
  A Java library to read data from XLSX files.
  - **MySQL**:  
  A classic RDBMS.
  - **JUnit**:  
  A easy annotation-library to write Unit tests.

## Getting started
To get this Application running locally:

  - Clone/Download the Java project
  - Either use your IDE (e.g. Eclipse) to:
    - Run the project as Maven install 
    - Run the EmployeeHubManagerApplication.java as Java Application
  - or:
    ```
    mvn install
    java -jar target/employee-hub-manager-0.0.1-SNAPSHOT.jar
    ```
  - Also have MySQL running locally and create a Database called 'EmployeeHubDB'
