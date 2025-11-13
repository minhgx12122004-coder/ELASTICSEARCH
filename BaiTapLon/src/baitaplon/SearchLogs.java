/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitaplon;

/**
 *
 * @author Admin
 */
import java.io.*;

public class SearchLogs {
    public static void main(String[] args) {
        String folderPath = "logs"; // Thư mục chứa file log
        String keyword = "login by 99";
        String resultFile = "ketqua.txt";

        File folder = new File(folderPath);
        File[] logFiles = folder.listFiles((dir, name) -> name.endsWith(".txt"));

        if (logFiles == null) {
            System.out.println("Không tìm thấy file log trong thư mục " + folderPath);
            return;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(resultFile))) {
            for (File file : logFiles) {
                try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                    String line;
                    int lineNumber = 0;
                    while ((line = reader.readLine()) != null) {
                        lineNumber++;
                        if (line.contains(keyword)) {
                            writer.write("File: " + file.getName() + ", Line: " + lineNumber + " -> " + line);
                            writer.newLine();
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Hoàn tất tìm kiếm. Kết quả ghi vào: " + resultFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

