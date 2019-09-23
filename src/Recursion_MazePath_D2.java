/*
 MazePath_D2(Count,Print)
 
  Take as input N. N is the number of rows and columns on a square board. 
  Our player starts in top-left corner of the board and must reach bottom-right corner. 
  In one move the player can move 1 step horizontally (right) or 1 step vertically (down) or 1 step diagonally (south-east).
  But the diagonal step is allowed only when the player is currently on one of the diagonals (there are two diagonals)

      a. Write a recursive function which returns the count of different ways the player can travel across the board. Print the value returned.
      b. Write a recursive function which prints moves for all valid paths across the board (void is the return type for function).

       Input Format
          Enter the number N.

            Constraints
               None

       Output Format
          Display the total number of paths and display all the possible paths in a space separated manner.

            Sample Input
              3
            Sample Output
              VVHH VHVH VHHV VHD HVVH HVHV HVD HHVV DVH DHV DD 
              11
 
 */
