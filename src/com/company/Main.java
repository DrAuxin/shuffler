package com.company;
import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
Scanner reader = new Scanner(new File("class.txt"));
        ArrayList<String> b = new ArrayList<>();
        int x = 0;
        while (reader.hasNext())
        {
            b.add(reader.next());
        }
        while (b.size()>0)
        {
            x = (int)(Math.random() * b.size());
            System.out.println(b.get(x));
            b.remove(x);

        }
    }
}
