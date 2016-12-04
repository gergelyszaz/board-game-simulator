# board-game-simulator
The goal is to create a DSL capable of describing the mechanics of simple board games (like "Mills", "Snakes and Ladders") and sample applications to run the language.

###Software needed to build
JDK 1.8
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

###Syntax

###Built-in variables
####GLOBAL
currentplayer
distancefromselectedtoken
null
this

####PLAYER


####CARD
deck
owner

####FIELD


####TOKEN
field
owner

####DECK
top
cardcount



###BGS
Core simulator project for running the board games.

###State
Represents a snapshot of a game.

###Server
Contains server communication logic using WebSockets.

###Client
Contains logic communication logic using WebSockets.

###Application
Graphic (Swing) client application. Depends on BGS.Server project.
