package org.example;

public class App {
    public static void main(String[] args) {
        System.out.println("    stdout.encoding = " + System.getProperty("stdout.encoding"));
        System.out.println("    stderr.encoding = " + System.getProperty("stderr.encoding"));
        System.out.println("sun.stdout.encoding = " + System.getProperty("sun.stdout.encoding"));
        System.out.println("sun.stderr.encoding = " + System.getProperty("sun.stderr.encoding"));
        System.out.println("    native.encoding = " + System.getProperty("native.encoding"));
        System.out.println("こんにちは");
    }
}
