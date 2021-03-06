package com.codegym.task.task18.task1810;

/* 
DownloadException

*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        byte[] buffer = new byte[1000];
        while (true) {
            FileInputStream inputStream = new FileInputStream(reader.readLine());
            int count = inputStream.read(buffer);
            if (count < 1000) {
                inputStream.close();
                throw new DownloadException();
            }
        }

    }

    public static class DownloadException extends Exception {

    }
}
