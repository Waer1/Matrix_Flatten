# Matrix_Flatten

<img src="./imgs/task3.jpg">

* Flattening formula: oneD(i * secondDim * thirdDim) + (j * thirdDim) + k = threeD[i][j][k]
* i is the variable used to traverse columns (FirstDimension)
* j is the variable used to traverse rows (SecondDimension)
* k is the variable used to traverse (ThridDimension)

# Algorithm
this formula treats the 3D matrix as layers of 2D matrices and uses the same way as treaversing the 2D matrices 
except that now we have a third dimension that we will refer to as if it's the number of layers represented by the depth
and traverse through the variable k in the algorithm so it starts traversing the 3D matrix starting from the first element 
in every 2D layer then the second element in the same column in every 2D layer then the third element and so on till the end of 
the column and then moves to the next column and repeats the process till the end of the 3D matrix.

* indexing: offset = (i * secondDim * thirdDim) + (j * thirdDim) + k

 # Description
 Traveses a 3D array and converts the 3D indexing to 1D indexing
 
 # Input
 3D array
 
 # Output
 1D vector