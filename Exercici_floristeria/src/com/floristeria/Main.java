package com.floristeria;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Crear floristeria
        Scanner a = new Scanner(System.in);
        System.out.println("FlowerShop name? ");
        String name = a.nextLine();
        FlowerShop shopName = new FlowerShop(name);

        //afegir arbre
        boolean moreTrees = true;
        while (moreTrees = true){
            System.out.println("Do you want to enter a tree? Y or N?");
            Scanner e = new Scanner(System.in);
            String mt = e.nextLine();

            if (mt.equalsIgnoreCase("y")){
                moreTrees = true;
                shopName.createTree();
            } else {
                moreTrees = false;
                System.out.println("let's enter some flowers");
                break;
            }
        }


        //afegir flor
        boolean moreFlowers = true;
        while (moreFlowers = true){
            System.out.println("Do you want to enter a flower? Y or N?");
            Scanner e = new Scanner(System.in);
            String mf = e.nextLine();

            if (mf.equalsIgnoreCase("y")){
                moreFlowers = true;
                shopName.createFlower();
            } else {
                moreFlowers = false;
                System.out.println("let's enter some decorations");
                break;
            }
        }


        //afegir decoration
        boolean moreDecorations = true;
        while (moreDecorations = true){
            System.out.println("Do you want to enter a decoration? Y or N?");
            Scanner e = new Scanner(System.in);
            String md = e.nextLine();

            if (md.equalsIgnoreCase("y")){
                moreDecorations = true;
                shopName.createDecoration();
            } else {
                moreDecorations = false;
                break;
            }
        }

        //print stock
        System.out.println(
                shopName.toString().replaceAll("\\[\\]", ""));
    }


}
