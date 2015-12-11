package com.redrock.msi.student;

/**
 * Created by MSI on 2015/12/10.
 */
public class Item {
    private String text;
    private int imageId;
    public Item(String text, int imageId){
        this.text=text;
        this.imageId=imageId;
    }
    public  String getText(){
        return text;
    }
    public  int getImageId(){
        return imageId;
    }
}
