/**
 *
 */
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int line = matrix.length;
        int column = matrix[0].length;
        int length = line * column;
        int left = 0;
        int right = length - 1;

        while(left < right){
            int mid = left + (right - left) / 2;
            int line_index = mid / column;
            int column_index = mid % column;
            if(matrix[line_index][column_index] == target){
                return true;
            }else if(matrix[line_index][column_index] < target){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        int line_index = left / column;
        int column_index = left % column;

        return matrix[line_index][column_index] == target;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix = {{1,3}};
        int target = 3;
        Boolean res = solution.searchMatrix(matrix, target);
    }
}
