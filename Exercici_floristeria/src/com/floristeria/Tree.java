package com.floristeria;

public class Tree {
    private float treeHeight;

    public Tree(float treeHeight) {
        this.treeHeight = treeHeight;
    }

    public float getTreeHeight() {
        return treeHeight;
    }

    public void setTreeHeight(float treeHeight) {
        this.treeHeight = treeHeight;
    }

    @Override
    public String toString() {
        String treeHeightS = String.valueOf(treeHeight);
        return treeHeightS;
    }
}

