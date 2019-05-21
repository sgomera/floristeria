package com.floristeria;

public class Decoration {
    private Material decorationMat;

 /*   per donar valors:
    decorationMat = Material.WOOD;*/

    public Decoration(Material decorationMat) {
        this.decorationMat = decorationMat;
    }

    public Material getDecorationMat() {
        return decorationMat;
    }

    public void setDecorationMat(Material decorationMat) {
        this.decorationMat = decorationMat;
    }

    @Override
    public String toString() {
        String result;
        if (decorationMat.equals("WOOD")){
            result = "Wood";
        } else {
            result = "Plastic";
        }
        return result;
    }
}
