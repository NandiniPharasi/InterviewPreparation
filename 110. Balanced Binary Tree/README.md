Example 1:
Input: root = [3,9,20,null,null,15,7]
Output: true

Example 2:
Input: root = [1,2,2,3,3,null,null,4,4]
Output: false

Example 3:
Input: root = []
Output: true
 
Helper Function (dfs): Create a recursive function that returns the height of the current subtree.
Base Case: If the node is NULL, the height is 0.
Recursive Step:
Recursively call dfs on the left child to get leftheight.
Recursively call dfs on the right child to get rightheight.
Short-Circuit Check:
If leftheight is -1 (meaning the left subtree is unbalanced), return -1 immediately.
If rightheight is -1 (meaning the right subtree is unbalanced), return -1 immediately.
If the absolute difference abs(leftheight - rightheight) is greater than 1, the current node is unbalanced. Return -1.
Return Height: If the node is balanced, return the actual height:
1 + max(leftheight, rightheight).
Main Function: If the helper function returns -1, the tree is not balanced (false). Otherwise, it is balanced (true).
Complexity
Time complexity: O(N)
We visit every node exactly once in a post-order traversal.
