//package LongestConsecutiveSequence;
//
//import java.util.*;
//
//public class LongestConsecutiveSequence {
//
////    Given an array of integers nums, return the length of
////    the longest consecutive sequence of elements that can be formed.
////    A consecutive sequence is a sequence of elements in
////    which each element is exactly 1 greater than the previous element.
////    The elements do not have to be consecutive in the original array.
//
//    //    Input: nums = [2,20,4,10,3,4,5]
////    Output: 4
//    public static void main(String[] args) {
//
//    }
//
//    private static int longestConsecutive(int[] a) {
//        int longestConsecutive = 0;
//        Set<Integer> set = new TreeSet<>();
//        for (int i = 0; i < a.length; i++) {
//            set.add(a[i]);
//        }
//        Arrays.sort(a);
//        for (int x : set) {
//            if (set.contains(x-1)) {
//                longestConsecutive++;
//            }
//        }
//    }
//}
