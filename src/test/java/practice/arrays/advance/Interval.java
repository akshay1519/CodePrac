package practice.arrays.advance;

import java.util.ArrayList;

public class Interval {
    int start;
    int end;

    Interval() {
        start = 0;
        end = 0;
    }

    Interval(int s, int e) {
        start = s;
        end = e;
    }

    public static void main(String[] args) {

    }
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        int n = intervals.size();
        ArrayList<Interval> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            int st = intervals.get(i).start;
            int en = intervals.get(i).end;

        }
        return ans;
    }
}
