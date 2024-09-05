package org.example;

import java.util.Scanner;

public class VietnameseAccentCounter {
    public static int countVietnameseAccentedLetters(String text) {
        String[] patterns = TelexPattern.getTelexPatterns();
        int totalCount = 0;

        for (String pattern : patterns) {
            totalCount += BoyerMoore.boyerMooreSearch(text, pattern);
        }

        return totalCount;
    }

    // Hàm main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chuỗi để kiểm tra các ký tự có dấu Tiếng Việt: ");
        String input = scanner.nextLine();

        int result = countVietnameseAccentedLetters(input);

        System.out.println("Số lượng chữ cái có dấu Tiếng Việt có thể được tạo thành: " + result);

        scanner.close();
    }
}
