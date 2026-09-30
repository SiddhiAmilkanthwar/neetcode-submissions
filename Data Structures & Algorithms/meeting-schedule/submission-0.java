/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        int n = intervals.size();
        for(int i =0;i<n;i++){
            for(int j=i+1;j<n;j++){
                Interval first = intervals.get(i);
                Interval second = intervals.get(j);
                if(first.start<second.end && second.start<first.end){
                    return false;
                }
            }
        }
        return true;
    }
}
