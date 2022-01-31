package com.syntax.class24.task1;

public interface WebDriver {
    void openBrowser();
    void closeBrowser();
    void maximizeBrowser();
    void findElement();
}

class ChromeDriver implements WebDriver{


    @Override
    public void openBrowser() {
        System.out.println("Opening the Google chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing the Google chrome");
    }

    @Override
    public void maximizeBrowser() {
        System.out.println("Maximizing the Google chrome");
    }

    @Override
    public void findElement() {
        System.out.println("finding the Element on Google chrome");
    }
}
class FireFoxDriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("Opening the FireFox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing the FireFox");
    }

    @Override
    public void maximizeBrowser() {
        System.out.println("Maximizing the FireFox");
    }

    @Override
    public void findElement() {
        System.out.println("finding the Element on FireFox");
    }
}
