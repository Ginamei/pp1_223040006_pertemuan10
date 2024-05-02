/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas10;

/**
 *
 * @author Gina Meirina
 */
public class StrukturStack {
    private int[] array;
    private int capacity;
    int top; // Renamed from TOP to follow Java naming conventions

    public final int MIN = -1;

    public StrukturStack(int capacity) {
        this.capacity = capacity;
        array = new int[capacity];
        top = MIN;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack penuh");
        } else {
            top++;
            array[top] = data;
        }
    }

    public boolean isEmpty() {
        return (top == MIN);
    }

    boolean isFull() {
        return (top == capacity - 1);
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong");
            return -1;
        } else {
            int poppedElement = array[top];
            top--;
            return poppedElement;
        }
    }
}
