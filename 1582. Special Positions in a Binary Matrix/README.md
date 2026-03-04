A position (i, j) is called special if mat[i][j] == 1 and all other elements in row i and column j are 0 (rows and columns are 0-indexed).

 

Example 1:


Input: mat = [[1,0,0],[0,0,1],[1,0,0]]
Output: 1
<img width="244" height="245" alt="image" src="https://github.com/user-attachments/assets/d1370ce2-2c4c-483f-8dd7-cbc32448360d" />

Explanation: (1, 2) is a special position because mat[1][2] == 1 and all other elements in row 1 and column 2 are 0.

Example 2:
<img width="244" height="245" alt="image" src="https://github.com/user-attachments/assets/bffb2a2e-1cb4-406d-bb58-96105bf32dc1" />


Input: mat = [[1,0,0],[0,1,0],[0,0,1]]
Output: 3
Explanation: (0, 0), (1, 1) and (2, 2) are special positions.
 
