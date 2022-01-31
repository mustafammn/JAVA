package com.syntax.class23.task2;

public class FileTester {
    public static void main(String[] args) {
        File[] files={new JavaFile(),new WordFile(),new PdfFile()};
        for(File file:files){
            file.open();
            file.edit();
            file.close();
        }
    }
}
