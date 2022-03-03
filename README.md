# java-games

This Java project implements a simple games system with points and a leaderboard. It has a
main menu that allows the user to choose to start as a new player or quit. If the user chooses to
start as a new player, the program prompts the user to enter a name for the player who is the
user here, and then allow the player to choose which game to play. 
My project has two java games in total, they are Coin toss and rock-paper-scissors. There are in
total four java files Games is the main file which drives the rest three out of which coin toss and
rockpaperscissors are games. The last file Player is for storing player attributes like score and
name. 
The Game class behaves as the superclass and others are subclasses of it. It contains the
initial prompt of asking the user to start as a new player or quit the game menu. Later it registers
the player’s name who wish to play further. Once the name input is read it ask the player to
choose one game amongst two. For every possible input care has been taken regarding bad
user input and error message is released to the player as Invalid. Again, with the help of using
switch cases the game can be directed towards the specific game class such as 1. Coin toss
and 2. Rock paper scissor. All the player details in the game class are linked to the main class
of each small games class. The details captured while running this program is stored in an array
call Player in game class. This invokes points and name of the player wherever set in the java
files. All this code is placed in a while true loop for infinite iteration until the condition set is met
according to functional requirement. A Boolean flag is used for while loop to check the condition
for user input initially set to true, once the flag is set to false the whole loop breaks.
In CoinToss class the code is written to ask the user for input whether they choose heads or
tails. Then a random function will generate a random value either heads or tails and relate with
input given by user. Function tosscoin() will generate random output that is compared with
user’s input stream. If both strings match player gets (+1) points if not losses point (-1). This
point system is implemented to decide whether the player has won or lost against the opponent.
Also, they will be shown current points while playing the game. Points variable is storing the
cumulative total of wins and losses in the entire game till the user wants to quit. The input is
case insensitive so upper as well as lower case is acceptable. There is a class called
startgame() in main class which is linked to superclass this makes the navigation possible
between both of the java files. 
Further we have the rock-paper-scissors game, Here the logic is to type in a user input string
which can only be rock/paper/scissor else program shoots an Invalid input error. Even here a
random class generates an output which is taken as opponents move for the game to work. A 
while true loop contains user inputs and points system for tracking players activities and storing
them in an array. Points are set in the end of every game. Using random number between 0-3 it
generates a value for rock paper or scissors. In each case the data structures acceptable as in
input or conversion at any place are taken care of. To keep the functionality as expected
according to the class files all the access modifiers are being set in this project such as private
access modifier is accessible only within the class and public can be accessed from within the
class, outside the class, within the package and outside the package. Each game has a defined
input to quit from the class that is -1, which brings the user to previous page or stage.  Lastly the
Player class which uses the getter and setter method to fetch and retrieve names and points of
the players who participated in these games. Name is taken as a string whereas points are
stored as an integer. This is linked to the main Game class which displays the leaderboard of all
the player with their total points against them. 
Below shown is the UML Class Diagram for this project. 

The above UML class diagram describes the overall usage of classes and functions. Also, how 
every class is linked with each other and their roles in this project. These all classes fall under
one project that’s mainProject package. Because the player has attributes like score and name
which is to be derived from each subclass it is described as parent class. Other than this each
games rockpaperscissor and cointoss are linked to Games class with help of object pointers
where functions are called and executed according to invokes. Player class represents the
Parent here where Games, Rockpaperscissor and Cointoss appear to be child classes. Coin
Toss has coin() as enumerated function. As explained above main class from player is called in
both the games class. Games() is the start point for the two games. 
