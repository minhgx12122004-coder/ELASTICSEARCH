ELASTICSEARCH – Detailed User Guide
1. Purpose

ELASTICSEARCH is a Java GUI program designed to help users search for keywords across multiple .txt files in a specified folder. It displays results immediately in a table, including file name, line number, and content, and allows exporting the results to a file ketqua.txt for further analysis.

This program is particularly useful for:

System administrators managing server logs.

HR or business personnel searching through documents.

Anyone needing to locate relevant information efficiently across many text files.

2. Features

Keyword Search: Enter a word or phrase to search in all .txt files within a folder.

Folder Selection: Specify the folder where the files are stored.

Whole Word Search: Optionally match only complete words.

Case Sensitivity: Optionally distinguish between uppercase and lowercase letters.

Results Table: Shows three columns:

File Name

Line Number

Line Content

Export to File: Save all search results to ketqua.txt in a readable table format.

UTF-8 Support: Handles files with non-English characters, including Vietnamese.

3. How to Use ELASTICSEARCH
Step 1: Run the Program

Open ELASTICSEARCH.java in a Java IDE (NetBeans, Eclipse, IntelliJ, etc.) and run the program.

A GUI window will appear with input fields, checkboxes, buttons, and a results table.

Step 2: Enter Search Information

Find Keyword: Type the word or phrase you want to search for.

Folder: Enter the folder path containing .txt files (e.g., D:\Document\CV - Tax).

Whole Word Search: Check this if you want the search to match complete words only.

Case Sensitive: Check this if you want the search to distinguish uppercase and lowercase letters.

Step 3: Start Searching

Click the “Search” button.

The program scans all .txt files in the folder.

Any matching line is displayed immediately in the table, including:

File Name

Line Number

Line Content

Step 4: Export Results

Click the “Export to File” button to save results.

A file named ketqua.txt will be created in the program’s directory.

The exported file contains a formatted table for easy reading and further analysis:

File Name                 | Line Number | Line Content
----------------------------------------------------------
file1.txt                 | 12          | This line contains the keyword
file2.txt                 | 45          | Another line with the keyword

Step 5: Review Results

You can view results directly in the table within the GUI.

You can also open ketqua.txt with any text editor or spreadsheet software.

4. Example Use Case

Assume you have a folder with the following files:

file1.txt:

Nguyen Van A submitted personal income tax for 2023
Company ABC provides consulting services
Nguyen Van A logged into the system


file2.txt:

XYZ Enterprise registered for tax
Nguyen Van B submitted tax in 2022
Company revenue increased by 15%


file3.txt:

User login successful
New enterprise established


Search Scenario:

Keyword: Enterprise

Folder: D:\Document\CV - Tax

Whole Word: Checked

Case Sensitive: Unchecked

Result Table in GUI:

File Name	Line Number	Line Content
file2.txt	1	XYZ Enterprise registered for tax
file3.txt	2	New enterprise established

Exported ketqua.txt:

File Name                 | Line Number | Line Content
----------------------------------------------------------
file2.txt                 | 1           | XYZ Enterprise registered for tax
file3.txt                 | 2           | New enterprise established

5. Notes and Tips

Ensure the folder exists and contains .txt files.

Searching large folders may take some seconds.

For “Whole Word Search,” only complete words separated by non-alphanumeric characters are matched.

UTF-8 encoding ensures compatibility with non-English text.

The program is ideal for quickly locating relevant information without manually opening multiple files.

6. Here is my demo video:
https://youtu.be/d_x6IKQ435A
