package com.company;

import com.company.Car;
import java.util.Date;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

       Car car= new Car();
       car.setMarka("Ferrari");
       car.setModel("Ferrari F8");
       car.setColor("Red");
       Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Input Marka (starting with UpperCase Letter): ");
            car.setMarka(scanner.nextLine());
        }while (car.getMarka()==null);
        do{
            System.out.println("Input Model (starting with UpperCase Letter): ");
            car.setModel(scanner.nextLine());
        }while(car.getModel()==null);
        do{
            System.out.println("Input Color (RGB): ");
            car.setColor(scanner.nextLine());
        }while(car.getColor()==null);
        do{
            System.out.println("Input your height: ");
            car.setProbeg(scanner.nextInt());
        }while(car.getProbeg()==-1);

       System.out.println(car.getMarka());
      System.out.println(car.getModel());
       System.out.println(car.getColor());
                car.setGod_vypuska(new Date(2019-1900, 9, 18));
                System.out.println(car);
            }
        }


