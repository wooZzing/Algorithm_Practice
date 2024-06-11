package com.baekjoon.basicone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2156 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N+1];

        for(int i = 1; i <= N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        if(N == 1){
            System.out.println(arr[N]);
            return;
        }

        int[] dp = new int[N+1];

        dp[0] = 0;
        dp[1] = arr[1];
        dp[2] = dp[1] + arr[2];

        for(int i = 3; i <= N; i++){
            dp[i] = Math.max(dp[i-1], Math.max(dp[i-2] + arr[i], dp[i-3] + arr[i-1] + arr[i]));
        }

        System.out.println(dp[N]);

        br.close();
    }
}