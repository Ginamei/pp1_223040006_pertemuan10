/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas10;

/**
 *
 * @author Gina Meirina
 */
public class TestStrukturStack {
    public static void main(String[] args) {
        // Membuat objek stack dengan kapasitas 3
        StrukturStack stack = new StrukturStack(3);

        // Sebelum push
        System.out.println("#sebelum push");
        System.out.println("isEmpty: " + stack.isEmpty());
        System.out.println("isFull: " + stack.isFull());
        System.out.println("top: " + stack.top);
        System.out.println("size: " + (stack.isEmpty() ? 0 : stack.top - stack.MIN + 1));
        System.out.println("elemen from TOP:");

        // Melakukan push 3x
        System.out.println("#melakukan push 3x:");
        stack.push(2);
        stack.push(4);
        stack.push(1);

        // Setelah push
        System.out.println("isEmpty: " + stack.isEmpty());
        System.out.println("isFull: " + stack.isFull());
        System.out.println("top: " + stack.top);
        System.out.println("size: " + (stack.isEmpty() ? 0 : stack.top - stack.MIN + 1));

        // Melakukan pop
        System.out.println("#melakukan pop:");
        int poppedElement = stack.pop();
        System.out.println("Pop: " + poppedElement);

        // Setelah pop
        System.out.println("isEmpty: " + stack.isEmpty());
        System.out.println("isFull: " + stack.isFull());
        System.out.println("top: " + stack.top);
        System.out.println("size: " + (stack.isEmpty() ? 0 : stack.top - stack.MIN + 1));
    }
}
