package com.company;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class Car {
        private String Marka;
        private String Model;
        private String Color;
        private Date God_vypuska;
        private int probeg;

        public Date getGod_vypuska() {
            return God_vypuska;
        }

        public void setGod_vypuska(Date god_vypuska) {
            System.out.println((new Date().getMonth()));
            System.out.println((god_vypuska.getMonth()));
            if (god_vypuska.getYear()<=(new Date().getYear())&& (god_vypuska.getMonth()<=(new Date().getMonth()))&&(god_vypuska.getDay()<=(new Date().getDay())))
                this.God_vypuska = god_vypuska;
            else
                this.God_vypuska = new Date();
        }

        public int getProbeg() {
            return probeg;
        }

        public void setProbeg(int probeg) {
            if (probeg >= 100000 && probeg <= 250000){
                System.out.println("Many kilometers!!!");
                this.probeg = probeg;
            }
            else{
                this.probeg = -1;
            }
        }

        public void setMarka(String Marka)
        {
            if(Character.isUpperCase(Marka.charAt(0))){
                this.Marka = Marka;
            }
            else{
                System.out.println("Incorrect name");
            }

        }
        public String getMarka(){
            return this.Marka;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + Marka + '\'' +
                    ", login='" + Model + '\'' +
                    ", password='" + Color + '\'' +
                    ", birthday=" + God_vypuska.toLocaleString() +
                    ", height=" + probeg +
                    '}';
        }

       /* public void generatePassword(int length)
        {
            Random random = new Random();
            char[] password=new char[length];
            Arrays.fill(password,' ');
            for(int i = 0;i <= 100;i++){
                password[random.nextInt(password.length)] = ((char)(random.nextInt(27)+65));
                password[random.nextInt(password.length)] = ((char)(random.nextInt(27)+97));
                password[random.nextInt(password.length)] = ((char)(random.nextInt(11)+48));
                password[random.nextInt(password.length)] = ((char)(random.nextInt(15)+33));
                password[random.nextInt(password.length)] = ((char)(random.nextInt(7)+58));
                password[random.nextInt(password.length)] = ((char)(random.nextInt(6)+91));
                password[random.nextInt(password.length)] = ((char)(random.nextInt(5)+123));
            }

            String str ="";
            for (char c: password) {
                str+=c;
            }
            this.setPassword(str);
        }
        */
    }

