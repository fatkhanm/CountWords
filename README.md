# Documentation
### Problem Solutioning
#### Problem
Write a program called Count Words that processes a List of Strings and applies the following rules:
1. counts and return number of words that start with M or m
2. return all the words longer that 5 characters

Hints:
1. Make sure you implement this test like you would all your prodcution code
2. Business rules change and new one pop up all the time
3. please don't input words from standard input

#### Solution
##### 1. problm 1 : Make sure you implement this test like you would all your prodcution code
```
solutions:
1. Create this project as maven so we can easily make this project as package and we can call this project to other project by input the artifectory version
2. Create main class to run this project so the project can run independ also
3. Create unit test to make sure there is no bug when release 
```
##### 2. Business rules change and new one pop up all the time
```
solutions:
1. create modularity rule by encapsulated within its own WordRule class. This approach makes the code modular and easier to maintain
2. create class extenable, so if need to add new rules we just need to create new class rule without changing the old rule and the if we want to remove any rules just remove rule that we want to remove
```
##### 3. please don't input words from standard input
```
solution:
1. create helper class to read file from path
```
### How to Run
#### Run Directly to the project
```
1. clone this repository
2. go to the main.java
3. run main.java
```
#### Run From JAR
```
1. clone this repository
2. type `mvn clean pacage` on your terminal or mvn project
3. go to target file
4. run `java -jar CountWords-1.0-SNAPSHOT.jar`
```

### Project Dependencies
#### JUnit
JUnit framework is foundation for developr side testing on JVM.
In this project JVM used for testing the implementation of rule to makes sure the rule works properly

#### Maven Plugin
A package contains Maven Plugins developed by Apache Maven Project to provide additional functionality to Maven during the build process.
In this project, this package used to created JAR file.

### Colaborator
```
@fatkhanmasruri as current github account
@fatkhanm as second account
susan.pang@csgi.com 
michael.hanrahan@csgi.com
```
