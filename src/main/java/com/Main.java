package com;

public class Main {

    public static void main(String[] args) {
       Staff[]staffers =
           {new Staff("Вася","middle",400,40),
            new Staff("Вова","senior",4000,45)};
       for(int i=0;i<staffers.length;i++){
           System.out.println(staffers[i].toString());
       }

    }

}
