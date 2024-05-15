package com.baekjoon.basicone;

import java.io.*;

public class Problem1699 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int[] dp = new int[num + 1];

        for (int i = 1; i <= num; i++) {
            dp[i] = Integer.MAX_VALUE;
        }

        for(int i = 1; i <= num; i++){
            for(int j = 1; j * j <= i; j++){
                dp[i] = Math.min(dp[i], dp[i-j*j] + 1);
            }
        }

        System.out.println(dp[num]);

        br.close();
    }
}