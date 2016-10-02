# board-game-simulator
The goal is to create a DSL capable of describing the mechanics of simple board games (like "Mills", "Snakes and Ladders") and sample applications to run the language.
The project contains 4 main parts:
* language
* simulator
* server and client
* graphic application

###Software needed to build
Java 8
Maven 3

###Build
From the root folder run in command line: "mvn install".

###Running the server
Go to the Server folder and run: "mvn exec:java"

###Running the Application
Go to the Application folder and run: "mvn exec:java"

##Projects
###BGL
The language written in Xtext.

###BGS
Core simulator project for running the board games. Includes:
* Game - represents a board game instance
* ModelManager - reads and manages the languages
* GameManager - manages the lifecycle of Game objects

###BGS.Server
Contains server and client communication logic using WebSockets. Depends on BGS project.

###BGS.Application
Graphic (Swing) client application. Depends on BGS.Server project.
