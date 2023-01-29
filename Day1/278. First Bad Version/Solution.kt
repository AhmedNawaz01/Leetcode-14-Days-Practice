/* The isBadVersion API is defined in the parent class VersionControl.
      fun isBadVersion(version: Int) : Boolean {} */

class Solution: VersionControl() {
    override fun firstBadVersion(n: Int) : Int {
      var left  = 1
      var right = n
      while(left < right){
          var mid = left + (right-left)/2 //to avoid overflow
          if (!isBadVersion(mid)){
            left = mid + 1;
          } 
          else right = mid;  
      }
      return left
    }
}
