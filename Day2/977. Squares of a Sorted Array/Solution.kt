class Solution {
    fun sortedSquares(nums: IntArray): IntArray {
        val n = nums.size
        var sortedSquareArr : IntArray = IntArray(n)
        if(n==0){
            return sortedSquareArr
        }
        for(i in 0 until n){
            sortedSquareArr[i] = nums[i] * nums[i]
        }
        //to Perform Ascending Order Sorting on integer Array
        var temp:Int
        for (i in sortedSquareArr.indices) {
            for (j in i + 1 until sortedSquareArr.size) {
                if (sortedSquareArr[i] > sortedSquareArr[j]) {
                    temp = sortedSquareArr[i]
                    sortedSquareArr[i] = sortedSquareArr[j]
                    sortedSquareArr[j] = temp
                }
            }
        }

        return sortedSquareArr
    }
}
