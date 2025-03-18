/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patient;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 *
 * @author David
 */
public class BloodTestScheduler {
     private PriorityQueue<Patient> queue; 
     public BloodTestScheduler() {
        queue = new PriorityQueue<>(new Comparator<Patient>() {
            @Override
            public int compare(Patient p1, Patient p2) {
                // Priority logic: hospital status > urgency > age
                if (p1.isFromHospital() && !p2.isFromHospital()) return -1;
                if (!p1.isFromHospital() && p2.isFromHospital()) return 1;

                // For the same hospital status, prioritize by urgency
                if (p1.getPriority().equals("urgent") && !p2.getPriority().equals("urgent")) return -1;
                if (!p1.getPriority().equals("urgent") && p2.getPriority().equals("urgent")) return 1;

                // If priority is the same, prioritize by age
                return Integer.compare(p2.getAge(), p1.getAge());
            }
        });
    }
       public void enqueue(Patient patient) {
        queue.offer(patient);
    }

    public Patient dequeue() { // used to de-queue
        return queue.poll();
    }

    public boolean isEmpty() {// is used to see if the queue is empty
        return queue.isEmpty();
    }

    public Patient peek() {
        return queue.peek();
    }

    public String displayQueue() {
        StringBuilder result = new StringBuilder();
        for (Patient patient : queue) {
            result.append(patient).append("\n");
        }
        return result.toString();
    }
    
}
