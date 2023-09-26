package com.Exercise;

public class GoalParser {
    public static void main(String[] args) {
        String command = "G()()()()(al)";
        String ans = interpret(command);
        System.out.println(ans);
    }
    static String interpret(String command) {
        command = command.replace("()", "o");
        command = command.replace("(al)", "al");
        return command;
    }
}
