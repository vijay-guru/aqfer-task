# Task

Tools used for Build and Run :
 Jdk 11.0.15
 IntellijIdea
 
 To execute :
 * Open this file in java environment and run it 
 * No dependencies needed

**Sample input 1**: 0,0,N 2,3,S
**Sample output** 1:
Source: 0 0 N, Destination: 2 3 S
Steps:
Move Forward:  0 1 N
Move Forward:  0 2 N
Move Forward:  0 3 N
Turn Left:  0 3 W
Turn Left:  0 3 S
Turn Left:  0 3 E
Move Forward:  1 3 E
Move Forward:  2 3 E
Turn Left:  2 3 N
Turn Left:  2 3 W
Turn Left:  2 3 S
Total Steps:  11
Move Forward:  5
Turn Left:  6

**Sample input 2**: 2,3,S 0,0,N
**Sample output 2**:
Source: 2 3 S, Destination: 0 0 N
Steps:
Move Forward:  2 2 S
Move Forward:  2 1 S
Move Forward:  2 0 S
Turn Left:  2 0 E
Turn Left:  2 0 N
Turn Left:  2 0 W
Move Forward:  1 0 W
Move Forward:  0 0 W
Turn Left:  0 0 S
Turn Left:  0 0 E
Turn Left:  0 0 N
Total Steps:  11
Move Forward:  5
Turn Left:  6

**Sample input 3:** 2,2,S 2,2,S
**Sample output 3**:
Source: 2 2 S, Destination: 2 2 S
Steps:
Total Steps:  0
Move Forward:  0
Turn Left:  0

**Sample input 4:** 2,-3,N 3,4,S
**Sample output 4**:
Invalid input
