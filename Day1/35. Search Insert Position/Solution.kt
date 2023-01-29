class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var numberTofind = 0
        for(index in nums.indices){
            if(nums[index] == target)
            {
                numberTofind =  index
            }else if(target > nums.last()) // if number is greater than last index value
            {
                numberTofind = nums.lastIndex + 1
            }else if(target > nums[index] && target < nums[index+1])
            {
                 numberTofind =  index + 1
            }
        }
        return numberTofind
    }
}
