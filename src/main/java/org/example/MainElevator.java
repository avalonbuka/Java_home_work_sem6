package org.example;

import java.util.Scanner;

public class MainElevator {
    public static void main(String[] args) {
        Elevator elevator = new Elevator(2,7);
        while (true) {
            System.out.print("Введите номер этажа: ");
            int floor = new Scanner(System.in).nextInt();
            elevator.move(floor);
        }
    }
}