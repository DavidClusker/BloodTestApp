/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patient;

import java.util.Stack;

/**
 *
 * @author David
 */
public class ActionStack {
     private Stack<String> stack;

    public ActionStack() {
        stack = new Stack<>();
    }

    public void pushAction(String action) {
        stack.push(action);
    }

    public String popAction() {
        return stack.isEmpty() ? "No actions to undo" : stack.pop();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
    
}
