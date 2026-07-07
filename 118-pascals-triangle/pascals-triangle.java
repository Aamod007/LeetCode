class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int row = 0; row < numRows; row++) {
            List<Integer> newRow = new ArrayList<>();

            newRow.add(1);

            for (int i = 1; i < row; i++) {
                newRow.add(result.get(row - 1).get(i - 1) + result.get(row - 1).get(i));
            }

            if (row > 0) {
                newRow.add(1);
            }

            result.add(newRow);
        }

        return result;
    }
}