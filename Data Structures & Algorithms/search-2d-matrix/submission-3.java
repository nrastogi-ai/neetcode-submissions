class Solution {
    public boolean searchMatrix(int[][] matrix, int target) 
    {
        int n = matrix[0].length;//column
        int m = matrix.length;//row
        int l = 0;
        int r = n-1;
        int row=0;
        boolean flag= false;
        for (int i = 0 ; i<m;i++)
        {
            if (target>=matrix[i][0] && target <= matrix[i][n-1])
            {
                row = i;
                break;
            }
        } 
        while(l<=r)
        {
            int mid = l+(r-l)/2;
            if (matrix[row][mid]==target)
            {
                flag = true;
                break;
            }
            else if (matrix [row][mid]<target)
            {
                l= mid+1;
            }
            else
            {
                r=mid-1;
            }
        }
        return flag;
    }
}
