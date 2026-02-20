Intuition
Calculate the total sum
To find the exact number whose left side sum is equal to the right side sum.

Approach
Put totalsum = 0
Then calculate the sum by using for loop
Intialize the left sum as zero
Use another for loop for finding the pivot index
we have to calculate the right sum of the element by using the formula
rightsum = total - leftsum - num[i]
if rightsum is equal to the leftsum then returh the index it is the pivot index
otherwise add the leftsum with that index.
