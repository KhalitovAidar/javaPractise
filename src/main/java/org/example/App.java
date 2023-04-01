package org.example;

import org.example.myclasses.MyStack;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Stack;


/**
 * Hello world!
 *
 */
public class App
{

    public static void main( String[] args )
    {
        LinkedList<MyStack> linkedList = new LinkedList<>();

        linkedList.add(new MyStack<>());
        linkedList.add(new MyStack<>());
        linkedList.add(new MyStack<>());
        linkedList.add(new MyStack<>());

        System.out.println(linkedList);

        // linkedList.add(2, new MyStack<>(new LinkedList<>()));

        System.out.println(linkedList);
    }
}