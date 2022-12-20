# Task

Tools used for Build and Run :<br/>
 * Jdk 11.0.15<br/>
 * IntellijIdea<br/>
 
 To execute :
 * Open this file in java environment and run it 
 * No dependencies needed

**Sample input 1**: 0,0,N 2,3,S<br/>
**Sample output** 1:<br/>
Source: 0 0 N, Destination: 2 3 S<br/>
Steps:<br/>
Move Forward:  0 1 N<br/>
Move Forward:  0 2 N<br/>
Move Forward:  0 3 N<br/>
Turn Left:  0 3 W<br/>
Turn Left:  0 3 S<br/>
Turn Left:  0 3 E<br/>
Move Forward:  1 3 E<br/>
Move Forward:  2 3 E<br/>
Turn Left:  2 3 N<br/>
Turn Left:  2 3 W<br/>
Turn Left:  2 3 S<br/>
Total Steps:  11<br/>
Move Forward:  5<br/>
Turn Left:  6<br/>

**Sample input 2**: 2,3,S 0,0,N<br/>
**Sample output 2**:<br/>
Source: 2 3 S, Destination: 0 0 N<br/>
Steps:<br/>
Move Forward:  2 2 S<br/>
Move Forward:  2 1 S<br/>
Move Forward:  2 0 S<br/>
Turn Left:  2 0 E<br/>
Turn Left:  2 0 N<br/>
Turn Left:  2 0 W<br/>
Move Forward:  1 0 W<br/>
Move Forward:  0 0 W<br/>
Turn Left:  0 0 S<br/>
Turn Left:  0 0 E<br/>
Turn Left:  0 0 N<br/>
Total Steps:  11<br/>
Move Forward:  5<br/>
Turn Left:  6<br/>

**Sample input 3:** 2,2,S 2,2,S<br/>
**Sample output 3**:<br/>
Source: 2 2 S, Destination: 2 2 S<br/>
Steps:<br/>
Total Steps:  0<br/>
Move Forward:  0<br/>
Turn Left:  0<br/>

**Sample input 4:** 2,-3,N 3,4,S<br/>
**Sample output 4**:<br/>
Invalid input
