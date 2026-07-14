class NumMatrix {
    List<List<Integer>>rowPrefix = new ArrayList<>();

    public NumMatrix(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            rowPrefix.add(new ArrayList<Integer>());
            int sum =0;
            for(int j = 0; j < matrix[i].length; j++){
                sum+=matrix[i][j];
                rowPrefix.get(i).add(sum);
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int ans =0;
        int size = rowPrefix.get(0).size();

        for(int i=row1;i<=row2;i++){
           ans += rowPrefix.get(i).get(col2);
           if(0<=col1-1){
            ans -= rowPrefix.get(i).get(col1-1);
           }
        }
        return ans;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */