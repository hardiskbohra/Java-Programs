
// Print the given matrix into the spiral form. The matrix could be any size given by the user.

// we are maintaining four pointers - left, right, top and bottom and print the element accordingly.

import java.io.*;
class Circular_Matrix
    {
        public static void main(String args[])throws IOException
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the number of rows : ");
            int rr=sc.nextInt();
            System.out.print("Enter the number of columns : ");
            int cc=sc.nextInt();

            int A[][]=new int[rr][cc];

            for(int i=0;i<rr;i++)
            {
              for(int j=0;j<cc;j++)
              {
                A[i][j] = sc.nextInt();
              }
            }

            int t=0, l=0, b=n-1, r=n-1, k;

            while(t<b && l<r)
                {
                  //print first row
                  for(k=l; k<r; k++)
                    System.out.println(A[t][k]);
                  t++;
                  //print last column
                  for(k=t; k<b; k++)
                    System.out.println(A[k][r]);
                  r--;
                  //print last row
                  for(k=r; k>l; k--)
                    System.out.println(A[b][k]);
                  b--;
                  //print first column
                  for(k=b; k>t; k--)
                    System.out.println(A[k][l]);
                  l++;

                }

        }
    }
