/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patient;

/**
 *
 * @author David
 */
public class NoShowTracker {

    String displayNoShows() {// used netbeans built in feature here to fix my code form the gui
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     private class Node {
        Patient patient;
        Node prev, next;

        public Node(Patient patient) {
            this.patient = patient;
        }
    }

    private Node head, tail;
    private int size;

    public NoShowTracker() {
        head = tail = null;
        size = 0;
    }

    public void addNoShow(Patient patient) {
        Node newNode = new Node(patient);
        if (size == 5) {
            // Remove the oldest node
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            size--;
        }

        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public String getNoShows() {
        StringBuilder result = new StringBuilder();
        Node current = head;
        while (current != null) {
            result.append(current.patient.toString()).append("\n");
            current = current.next;
        }
        return result.toString();
    }
    
}
