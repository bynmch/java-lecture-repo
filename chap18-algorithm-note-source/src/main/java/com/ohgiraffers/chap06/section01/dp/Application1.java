package com.ohgiraffers.chap06.section01.dp;

import java.util.Arrays;

public class Application1 {
    public static Integer solution(Integer input) {
        int[] dp = new int[input + 1];

        for (int i = 1; i <= input; i++) {
            dp[i] = -1;
        }
        
        dp[0] = 0;
        for (int i = 3; i <= input; i++) {
            if(dp[i-3] != -1) {                 //-1이 아니라는 것은 존재한다는 것
                dp[i] = dp[i-3] + 1;            //i번째에서 3킬로짜리 봉지 추가했을 경우
            }
            if(i >= 5 && dp[i-5] != -1) {
                if(dp[i] == -1) {               //3킬로짜리로는 해당하지 않는 경우
                    dp[i] = dp[i-5] + 1;        //i번째에서 5킬로짜리 봉지를 사용함.
                } else {                        //3킬로와 5킬로가 모두 해당되는 경우
                    dp[i] = Math.min(dp[i], dp[i-5] + 1);
                }
            }
        }
        System.out.println(Arrays.toString(dp));
        return dp[input] == -1 ? -1 : dp[input];
    }
}
