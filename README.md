# board-game-simulator
The goal is to create a DSL capable of describing the mechanics of simple board games (like "Mills", "Snakes and Ladders") and sample applications to write and run the language.
The project contains 3 main parts:
* language and editor
* simulator and server application
* client application

###Softwares used for developement:
* Eclipse Mars
* Xtext, EMF
* Xtend
* Maven

###Fixing project setup
* Read the errors, start with parent projects. 
* Dependencies with absolute paths may need to be replaced.
* If there are *.xtend files in the project, deleting the generated files (xtend-gen folder) is needed. If the xtend-gen folder is not generated, one has to be created manually.

##Language and editor
The BGL project contains the board game language, made in Eclipse Xtext. The BGL.* subprojects are needed for the editor Eclipse plugin.

##Simulator and server application
###BGS
Core simulator project for running the board games. Includes:
* Game - represents a board game instance
* ModelManager - reads and manages the languages
* GameManager - manages the lifecycle of Game objects

###BGS.Server
Contains server and client commucation logic using WebSockets.

##Client application

###BGS.Application

