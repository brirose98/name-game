# name-game
a simulation of a game commonly referred to as the Name Game or Mrs. Butterworth.
#Overview
this repository is meant to simulate one of my favorite party games.
## how it's done
in reality the game is played by having a group of people sit in a circle. Each person(minus one) is given a slip of paper and asked to write down a name that will be thier secret identity for the remainder of the game. All of the names are added to the bowl which is shaken up. One previously designated person, who did not put in a name, is designated as the speaker. The speaker then goes through each name in the bowl and reads them outloud twice. If the speaker does not pronounce the name in the way the writer intended, it does not matter; this new pronounciation will be the correct one. Once all names are recited twice, they are placed back into the bowl. The goal of the game from that point forward is to discover each person's secret identity while keeping yours hidden. Thus is done by each player, starting clockwise from the speaker(who does not guess), taking a turn asking other Player's if there name is one of the names from the bowl. the player in question will respond yes or no. If the answer is no, that player's turn ends and the next player's turn begins. If the answer is yes, the discovered player becomes the player who guessed correctly's "slave" and must go sit next to them in the circle and help them win the game by discovering the remaining player's secret identities. if the disocvered player had slaves of their own, they all become slaves to the player who guessed correctly. The player who guessed correctly can continue to guess remaining player's secret identites until they guess incorrectly. The winner is the last person to still have thier secret identity.

There are some Rules to this process. A player's name may not contain any numbers, special characters, or be longer than five words. If on a player's turn they are unable to think of a remaining name or just because, they can ask the speaker to pull a random name from the bowl of names.  The trick is that names ar never removed from the bowl, so as the game continues it is more and more likely that the name drawn will be the secret identity of a player who ahs already been guessed. They may pull one name for each time they are about to guess a player's identity(i.e. only draw once unless they guess corectly). If when asking another player if thier secret identity is a name, if the guesser pronounces the name incorrectly the player being asked may say no. It is the speaker's job to ensure that names are pronounces correctly.

## the simulation
There are five classes that combine to simulate the game described above: Game, Bowl, Player, Name, and Rule. I hope this repository helps share this fun party game with others and they enjoy playing it as much as I have with my friends and family.
## Todo
### not implemented
Turn class to simulate a Player's turn in the game, enforcing the order of the player's turns, a player may only draw from the bowl once unless they guess correctly, a player's turn ends after an incorrect guess.
