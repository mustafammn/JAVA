package com.syntax.class25.task5;

public interface WebDriver {
    void open();
    void close();
    String getTitle();
}
interface TakeScreenshot{
    void getScreenshot();
}
interface RemoteWebDriver extends TakeScreenshot,WebDriver{
    void navigate();
}

class ChromeDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Opening Google Chrome Browser");
    }

    @Override
    public void close() {
        System.out.println("Closing Google Chrome Browser");
    }

    @Override
    public String getTitle() {
        return "Title from Google Chrome";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Taking screenshot from Google Chrome");
    }

    @Override
    public void navigate() {
        System.out.println("Navigating in Google Chrome");
    }
}
class FireFoxDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Opening FireFox Browser");
    }

    @Override
    public void close() {
        System.out.println("Closing FireFox Browser");
    }

    @Override
    public String getTitle() {
        return "Title from FireFox";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Taking screenshot from FireFox");
    }

    @Override
    public void navigate() {
        System.out.println("Navigating in FireFox");
    }
}
class SafariDriver implements RemoteWebDriver{
    @Override
    public void open() {
        System.out.println("Opening Safari Browser");
    }

    @Override
    public void close() {
        System.out.println("Closing Safari Browser");
    }

    @Override
    public String getTitle() {
        return "Title from Safari";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Taking screenshot from Safari");
    }

    @Override
    public void navigate() {
        System.out.println("Navigating in Safari");
    }
}