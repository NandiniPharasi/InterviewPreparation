There is a robot starting at the position (0, 0), the origin, on a 2D plane. Given a sequence of its moves, judge if this robot ends up at (0, 0) after it completes its moves.

You are given a string moves that represents the move sequence of the robot where moves[i] represents its ith move. Valid moves are 'R' (right), 'L' (left), 'U' (up), and 'D' (down).

Return true if the robot returns to the origin after it finishes all of its moves, or false otherwise.

Note: The way that the robot is "facing" is irrelevant. 'R' will always make the robot move to the right once, 'L' will always make it move left, etc. Also, assume that the magnitude of the robot's movement is the same for each move.
TO DO:
Two equivalent approaches:

1. Simulate: maintain x and y, update per move, return x==0 and y==0.

2. Count: return L==R and U==D — left/right cancel and up/down cancel. This is cleaner and avoids tracking coordinates entirely.
<img width="688" height="1000" alt="image" src="https://github.com/user-attachments/assets/a48a6c05-6d6e-44a0-ba41-487c21959e15" />
