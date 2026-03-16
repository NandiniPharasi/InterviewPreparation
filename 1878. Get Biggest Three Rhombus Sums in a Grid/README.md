**A rhombus sum is the sum of the elements that form the border of a regular rhombus shape in grid​​​. The rhombus must have the shape of a square rotated 45 degrees with each of the corners centered in a grid cell. Below is an image of four valid rhombus shapes with the corresponding colored cells that should be included in each rhombus sum:**


Return the biggest three distinct rhombus sums in the grid in descending order. If there are less than three distinct values, return all of them.


  For a given "size" s, the distance from the top vertex to the left, right, and bottom vertices follows a fixed geometric pattern.

To find the "Biggest Three" sums, we need to iterate through every possible center/top point in the grid and expand rhombuses of all valid sizes. We use a TreeSet to automatically handle two things:

Uniqueness: Only distinct sums are stored.
Ordering: We can easily extract the three largest values.
