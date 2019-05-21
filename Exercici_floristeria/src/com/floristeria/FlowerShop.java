package com.floristeria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.floristeria.Material.PLASTIC;
import static com.floristeria.Material.WOOD;

public class FlowerShop {
    private String shopName;
    private List<Tree> trees = new ArrayList<>();
    private List<Flower> flowers = new ArrayList<>();
    private List<Decoration> decorations = new ArrayList<>();

    //constructors
    public FlowerShop(String shopName) {
        this.shopName = shopName;
    }

    public FlowerShop(String shopName, List<Tree> trees, List<Flower> flowers, List<Decoration> decorations) {
        this.shopName = shopName;
        this.trees = new ArrayList<>();
        this.flowers = new ArrayList<>();
        this.decorations = new ArrayList<>();
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Tree> getTrees() {
        return trees;
    }

    public void setTrees(List<Tree> trees) {
        this.trees = trees;
    }

    public List<Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(List<Flower> flowers) {
        this.flowers = flowers;
    }

    public List<Decoration> getDecorations() {
        return decorations;
    }

    public void setDecorations(List<Decoration> decorations) {
        this.decorations = decorations;
    }

    public void enterTree(Float treeHeight) {
        Tree tree = new Tree(treeHeight);
        trees.add(tree);
    }

    public void enterFlower(String flowerColour) {
        Flower flower = new Flower(flowerColour);
        flowers.add(flower);
    }

    public void enterDecoration(Material decorationMat) {
        Decoration decoration = new Decoration(decorationMat);
        decorations.add(decoration);
    }


    public void createTree(){
        Scanner b = new Scanner(System.in);
        System.out.println("Enter tree height: ");
        Float treeHeight = null;
        try {
            treeHeight = b.nextFloat();
        } catch (Exception e) {
            System.out.println("height must be numeric");;
        }
        try {
            enterTree(treeHeight);
        } catch (Exception e) {
            System.out.println("Error. Tree not entered");;
        }
    }

    public void createFlower(){
        System.out.println("Flower colour? ");
        Scanner c = new Scanner(System.in);
        String colour = c.nextLine();
        enterFlower(colour);
    }

    public void createDecoration(){
        System.out.println("Decoration material? " + "\n\t1-Wood" + "\n\t2-Plastic");
        Scanner d = new Scanner(System.in);
        int material = d.nextInt();
        if (material == 1){
            enterDecoration(WOOD);
        } else if (material == 2){
            enterDecoration(PLASTIC);
        } else {
            System.out.println("enter a valid material");
        }
    }

    @Override
    public String toString() {
        return shopName + " stock:" +
                "\n\tTREES:" + "\n\t\t" + getTrees().toString().replace("[", "").replace("]", "") +
                "\n\tFLOWERS:" + "\n\t\t" + getFlowers().toString().replace("[", "").replace("]", "") +
                "\n\tDECORATIONS:" + "\n\t\t" + getDecorations().toString().replace("[", "").replace("]", "");
    }
}
