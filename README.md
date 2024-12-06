# ParserProject
Python parser for 4450

# Project Description

In this project I implemented a parser for the Python language using Context-free Grammar and ANTLR. This supports features like arithmetic operators, assignment operators, if/elif/else blocks, conditional statements, while and for loops, nested structures, and comments. 

# Team Members

- Bryson Bourisaw

# Requirements for the Parser and Set-up

- ANTLR
- Java Development Kit
- IntelliJ IDEA

Steps for the project setup

1. First, download IntelliJ IDEA with this link https://www.jetbrains.com/idea/download/?section=mac
2. Second, if not already installed, download the Java Devleopment Kit (JDK 23.0.1) with this link https://www.oracle.com/java/technologies/downloads/?er=221886
3. Third, download ANTLR with this link https://www.antlr.org/download.html (antlr-4.13.1-complete.jar)
4. Create a new project in Intellij IDEA.
5. From the cloned repo, copy the src folder into your new project.
6. Next, go to File->Project Structure->Dependencies and add the path to of your antlr-4.13.1-complete.jar
7. If need be, to generate the antlr files, go inside the antlr folder in your termianl and enter "antlr4 Parser.g4"
8. Optionally, you can install the ANTLR plugin by going to Preferences->Plugins->Marketpalce->Search for "ANTLR"->Install

# How to use/run the parser

1. Go inside the Main.java and change the filepath to whatever file you want to parse. Or you can choose to change the string input and uncomment the 'CharStream cs = fromString(input);' line (comment out the filepath and fromFileName(filepath) line.
2. Run the Main.java file and you should be able to view the outputted parse tree.

# Project Demo 

https://youtu.be/AnzYkEqItH8 
