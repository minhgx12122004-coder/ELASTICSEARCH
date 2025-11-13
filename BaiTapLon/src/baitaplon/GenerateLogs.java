/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitaplon;

/**
 *
 * @author Admin
 */
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class GenerateLogs {
    public static void main(String[] args) {
        int numFiles = 3000;
        int linesPerFile = 20000;
        String folderPath = "logs"; // Thư mục chứa các file log

        File folder = new File(folderPath);
        if (!folder.exists()) {
            folder.mkdir();
        }

        Random random = new Random();

        for (int i = 1; i <= numFiles; i++) {
            // Tạo tên file theo format log_dd_MM_yy.txt
            String dateStr = new SimpleDateFormat("dd_MM_yy").format(new Date());
            String fileName = folderPath + File.separator + "log_" + dateStr + "_" + i + ".txt";

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
                for (int line = 1; line <= linesPerFile; line++) {
                    String logLine = generateRandomLogLine(random, line);
                    writer.write(logLine);
                    writer.newLine();
                }
                System.out.println("Đã tạo file: " + fileName);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Hoàn tất tạo " + numFiles + " file log.");
    }

    // Hàm tạo nội dung log giả lập
    private static String generateRandomLogLine(Random random, int lineNumber) {
        String[] actions = {
            "login by 99", "logout", "connection lost", "error occurred", "file updated",
            "user registered", "password changed", "session timeout", "data saved", "server restart"
        };

        // Tỉ lệ xuất hiện từ khóa "login by 99" nhỏ để có log cần tìm
        String action = random.nextInt(10000) < 3 ? "login by 99" : actions[random.nextInt(actions.length)];
        String timestamp = new SimpleDateFormat("HH:mm:ss").format(new Date());
        return timestamp + " - " + action + " (line " + lineNumber + ")";
    }
}

