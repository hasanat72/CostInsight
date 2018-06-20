/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming.assignment2;

import java.util.Scanner;

/**
 *
 * @author Hasanat
 */
public class ProgrammingAssignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float price_appleJuice=(float) 4.50;
        float price_appleCider=(float) 5.50;
        
        Scanner in = new Scanner(System.in);
        System.out.print("How many people ordered?");
        int num=in.nextInt();
        String [] names = new String[num];
        Integer [] appleCider = new Integer[num];
        Integer [] appleJuice = new Integer[num];
        
        readarray(in,names,appleCider,appleJuice);
        writearray(names,appleCider,appleJuice,price_appleCider,price_appleJuice);
        writeTotal(appleCider,appleJuice,price_appleCider,price_appleJuice);
    }

    private static void readarray(Scanner in, String[] names, Integer[] appleCider, Integer[] appleJuice) {
        for(int i=0;i<names.length;i++){
            System.out.println("Enter the name of the person "+"#"+(i+1)+":");
            names[i]=in.next();
            System.out.println("How many order of cider did "+names[i]+" have? ");
            appleCider[i]=in.nextInt();
            System.out.println("How many order of Juice did "+names[i]+" have? ");
            appleJuice[i]=in.nextInt();
        }
    }

    private static void writearray(String[] names, Integer[] appleCider, Integer[] appleJuice,float price_appleCider,float price_appleJuice) {
        System.out.println("\tNames\t\tcider\t\tjuice\t\tsubtotal(cider)\t\tsubtotal(juice)\t\tTotal");
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        for(int i=0;i<names.length;i++){
            float subtotalCider=(appleCider[i]*price_appleCider);
            float subtotalJuice=(appleJuice[i]*price_appleJuice);
            float total= subtotalCider+subtotalJuice;
            System.out.println("\t"+names[i]+"\t\t"+appleCider[i]+"\t\t"+appleJuice[i]+"\t\t"+"$"+subtotalCider+"\t\t\t\t"+"$"+subtotalJuice+"\t\t"+"$"+total);
        } 
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        
    }

    private static void writeTotal(Integer[] appleCider, Integer[] appleJuice,float price_appleCider,float price_appleJuice) {
        float totalCider=0,totalJuice=0,subtotalCider=0,subtotalJuice=0,total=0;
        for(int i=0;i<appleCider.length;i++){
            totalCider=totalCider+appleCider[i];
            totalJuice=totalJuice+appleJuice[i];
            subtotalCider=subtotalCider+(appleCider[i]*price_appleCider);
            subtotalJuice=subtotalJuice+(appleJuice[i]*price_appleJuice);
            total=total+subtotalCider+subtotalJuice;
        }
        System.out.println("\t"+"Total"+"\t\t"+totalCider+"\t\t"+totalJuice+"\t\t"+"$"+subtotalCider+"\t\t\t\t"+"$"+subtotalJuice+"\t\t"+"$"+total);
        System.out.println("\t"+"Average"+"\t\t"+(totalCider/appleCider.length)+"\t\t"+(totalJuice/appleJuice.length)+"\t\t"+"$"+(subtotalCider/appleCider.length)+"\t\t\t\t"+"$"+(subtotalJuice/appleJuice.length)+"\t\t"+"$"+(total/appleJuice.length));
    
    }
    
}
