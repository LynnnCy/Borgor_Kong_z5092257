package com.example.assignment2_z5092257;

public class Food {

    // unique identifier of an article
    private int foodID;

    // Title of the article
    private String foodname;

    // Short text to be displayed on main page
    private String summary;
    // Full text of the article
    private String description;
    // Resource ID of associated image (e.g. R.drawable.my_image)
    private int imageDrawableId;

    private double costs;


    public Food (int foodID, String foodname, String summary, double costs,String description) {
        this.foodID = foodID;
        this.foodname = foodname;
        this.summary = summary;
        this.description = description;
        this.costs=costs;
    }

    public int getfoodID() {
        return foodID;
    }

    public void setFoodID(int foodID) {
        this.foodID = foodID;
    }


    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummmary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImageDrawableId() {
        return imageDrawableId;
    }

    public void setImageDrawableId(int imageDrawableId) {
        this.imageDrawableId = imageDrawableId;
    }

    public double getCosts(){
        return costs;
    }

    public void setCosts (double costs){
        this.costs=costs;
    }



}
