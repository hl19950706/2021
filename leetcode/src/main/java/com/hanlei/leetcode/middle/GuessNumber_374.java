package com.hanlei.leetcode.middle;

/**
 * @author hanlei
 */
public class GuessNumber_374 {

    public static void main(String[] args) {
        GuessNumber_374 guess = new GuessNumber_374();
        guess.pick = 1;
        int i = guess.guessNumber(1);
        System.out.println(i);
    }
    public int guessNumber(int n) {
        int l = 1, r = n;
        int mid = 0;
        while (l < r) {
            mid = l + (r-l)/2;
            if (guess(mid) <= 0) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    int pick = 1;

    private int guess(int mid) {
        return pick > mid ? 1 : pick == mid ? 0 : -1;
    }


}
