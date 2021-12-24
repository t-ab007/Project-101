package com;

import java.util.Stack;

public class Question2 {



    static String textFromEditor = "";

    static Stack<String> undoStack = new Stack<String>();
    static Stack<String> redoStack = new Stack<String>();

    public static void main(String[] args) {

        String input = "My name is ABC";
        processInput(input);

        printText();
        undo();
        printText();
        undo();
        printText();
        redo();
        printText();
        redo();
        printText();
        redo();
        printText();
        redo();
        printText();
//        System.out.println(input);

    }

    static void processInput(String str)
    {
        String[] splited = str.split(" ");

        for(String s : splited)
        {
            undoStack.push(s);
        }
    }

    static void undo()
    {
        if(undoStack.isEmpty()){return;}
        String temp = undoStack.peek();
        undoStack.pop();
        redoStack.push(temp);
    }

    static void redo()
    {
        if(redoStack.isEmpty()){return;}
        String temp = redoStack.peek();
        redoStack.pop();
        undoStack.push(temp);
    }

    static void printText()
    {
        for(String s : undoStack)
        {
            System.out.print(s);
        }
        System.out.println();
    }

}
