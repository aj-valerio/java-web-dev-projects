package org.launchcode;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
    }

    public static float Divide(int x, int y) {

        float i = 0;
        if (y == 0) {
            try {
                throw new ArithmeticException("Cannot divide by 0");
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        } else {
            i = (float) x / y;
        }
        return i;
    }

    public static int CheckFileExtension(String fileName)
    {
        if (fileName == null || fileName == "") {
            try {
                throw new FileNameException("File name must end in '.java'");
            } catch (FileNameException e) {
                return -1;
            }
        }
        else if (fileName.endsWith(".java")){
            return 1;
        } else {
            return 0;
        }
    }
}