package MergeIntervals;

/**
 * Created by sitesh on 3/5/14.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Definition for an interval.
 */
class Interval {
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
}

public class Solution {
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval interval1, Interval interval2) {
                return interval1.start - interval2.start;
            }
        });

        for (int i = 0; i + 1 < intervals.size(); i++) {
            while (i + 1 < intervals.size() && intervals.get(i).end >= intervals.get(i + 1).start) {
                Interval currentInterval = intervals.get(i);
                Interval nextInterval = intervals.get(i + 1);
                if (currentInterval.end >= nextInterval.start) {
                    currentInterval.start = Math.min(currentInterval.start, nextInterval.start);
                    currentInterval.end = Math.max(currentInterval.end, nextInterval.end);
                    intervals.remove(nextInterval);
                }
            }
        }

        return intervals;
    }
}
