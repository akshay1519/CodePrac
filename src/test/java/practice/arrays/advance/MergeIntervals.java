package practice.arrays.advance;

import java.util.*;

public class MergeIntervals {

 public static class Interval {
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

 public static void main(String[] args) {
     Interval i1 = new Interval(6037774, 6198243);
     Interval i2 = new Interval(6726550, 7004541);
     Interval i3 = new Interval(8842554, 10866536);
     Interval i4 = new Interval(11027721, 11341296);
     Interval i5 = new Interval(11972532, 14746848);
     Interval i6 = new Interval(16374805, 16706396);
     Interval i7 = new Interval(17557262, 20518214);
     Interval i8 = new Interval(22139780, 22379559);
     Interval i9 = new Interval(27212352, 28404611);
     Interval i10 = new Interval(28921768, 29621583);
     Interval i11 = new Interval(29823256, 32060921);
     Interval i12 = new Interval(33950165, 36418956);
     Interval i13 = new Interval(37225039, 37785557);
     Interval i14 = new Interval(40087908, 41184444);
     Interval i15= new Interval(41922814, 45297414);
     Interval i16= new Interval(48142402, 48244133);
     Interval i17 = new Interval(48622983, 50443163);
     Interval i18 = new Interval(50898369, 55612831);
     Interval i19 = new Interval(57030757, 58120901);
     Interval i20 = new Interval(59772759, 59943999);
     Interval i21 = new Interval(61141939, 64859907);
     Interval i22 = new Interval(65277782, 65296274);
     Interval i23 = new Interval(67497842, 68386607);
     Interval i24 = new Interval(70414085, 73339545);
     Interval i25 = new Interval(73896106, 75605861);
     Interval i26 = new Interval(79672668, 84539434);
     Interval i27 = new Interval(84821550, 86558001);
     Interval i28 = new Interval(91116470, 92198054);
     Interval i29 = new Interval(96147808, 98979097);
       ArrayList<Interval> intervals = new ArrayList<>();
     intervals.add(i1);
     intervals.add(i2);
     intervals.add(i3);
     intervals.add(i4);
     intervals.add(i5);
     intervals.add(i6);
     intervals.add(i7);
     intervals.add(i8);
     intervals.add(i9);
     intervals.add(i10);
     intervals.add(i11);
     intervals.add(i12);
     intervals.add(i13);
     intervals.add(i14);
     intervals.add(i15);
     intervals.add(i16);
     intervals.add(i17);
     intervals.add(i18);
     intervals.add(i19);
     intervals.add(i21);
     intervals.add(i22);
     intervals.add(i23);
     intervals.add(i24);
     intervals.add(i25);
     intervals.add(i26);
     intervals.add(i27);
     intervals.add(i28);
     intervals.add(i29);


//       intervals.add(i3);
       System.out.println(intervals);
     Interval newInterval = new Interval(36210193, 61984219);
       Collections.sort(intervals, new Comparator<Interval>() {
            public int compare(Interval i1, Interval i2) {
            return i1.start - i2.start;
        }
       });
       ArrayList<Interval> mergedArr = new ArrayList<>();

       int temp1 = newInterval.start;
       int temp2 = newInterval.end;
       newInterval.start = Math.min(temp1,temp2);
       newInterval.end = Math.max(temp1,temp2);
       if(newInterval.start<=intervals.get(0).start && newInterval.end<=intervals.get(intervals.size()-1).end){
           Interval temp = new Interval(intervals.get(0).start,intervals.get(intervals.size()-1).end);
           mergedArr.add(temp);
       }else {
           for (Interval i : intervals) {
               if (newInterval.start <= i.start && i.end <= newInterval.end) {
                   mergedArr.add(newInterval);
               } else if (newInterval.start >= i.start && i.end >= newInterval.end) {
                   mergedArr.add(i);
               } else if (i.start <= newInterval.end && newInterval.start <= i.end) {
                   Interval temp = new Interval(newInterval.start, i.end);
                   mergedArr.add(temp);
               } else if (i.end >= newInterval.start) {
                   Interval temp = new Interval(i.start, newInterval.end);
                   mergedArr.add(temp);
               }
           }
       }
     if(newInterval.start>=intervals.get(0).start){
         mergedArr.addAll(intervals);
         mergedArr.add(newInterval);
     }
     Collections.sort(mergedArr, new Comparator<Interval>() {
         public int compare(Interval i1, Interval i2) {
             return i1.start - i2.start;
         }
     });
       for (Interval j:mergedArr){
           System.out.println(j.start + " $$ " +j.end);
       }

 }

}
