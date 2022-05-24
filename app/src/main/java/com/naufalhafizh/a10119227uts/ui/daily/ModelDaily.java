package com.naufalhafizh.a10119227uts.ui.daily;


//Naufal Hafizh 10119227 IF5 Rabu 4 Mei 2022
public class ModelDaily {

    int image;
    String title;
    String desc;

    public ModelDaily(int image, String title, String desc) {
        this.image = image;
        this.title = title;
        this.desc = desc;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
