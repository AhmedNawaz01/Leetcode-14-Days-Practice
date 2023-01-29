class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var returnValue = -1
        for(number in nums){
            if(number==target){
                returnValue = nums.indexOf(number)
            }
        }
        return returnValue
    }
}
