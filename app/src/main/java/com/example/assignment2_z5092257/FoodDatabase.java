package com.example.assignment2_z5092257;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FoodDatabase {


    /***
     * Retrieves an Article object using the provided id.
     */
    public static Food getFoodById(int foodID) {
        return food.get(foodID);
    }

    /***
     * Return an ArrayList containing all the articles in the database.
     */
    public static ArrayList<Food> getAllFood() {
        return new ArrayList<Food>((List) Arrays.asList(food.values().toArray()));
    }


    // You can ignore everything below this for now.
    private static final HashMap<Integer, Food> food = new HashMap<>();

    static {


        food.put(1, new Food(
                1,
                "Kong Burger",
                "Beef Pattie, Cheese, Lettuce, Pickles, Vegemitte Mayo and Fries",
                18.20,
                "After meddling in the 2016 American election, Russia is using similar tactics in the Central African Republic. But as it sows political chaos, this time it is also seeking diamonds."

        ));
        food.put(2, new Food(
                2,
                "Cheese Burger",
                "Beef Pattie, Double Cheese, Pickles, Onions, Ketchup, Mustard and Fries",
                20.50,
                "In a race where many voters are following politics online, Mr. Biden’s pullback is a striking and potentially worrisome sign about his appeal among the digitally active."

        ));

        food.put(3, new Food(
                3,
                "Chicken Burger",
                "Buttermilk Fried Chicken, Cheese, Pickles, Slaw, Cajun Mayo and Fries",
                21.50,
                "PARIS — World leaders and dignitaries gathered in Paris on Monday as France marked a national day of mourning for Jacques Chirac, the former French president who died last week."

        ));

        food.put(4, new Food(
                4,
                "Chicken Burger",
                "Neil Vigdor",
                21.50,
                "The escapees had help from at least one individual on the outside, the authorities said."

        ));

        food.put(5, new Food(
                5,
                "Mushroom Burger",
                "Field Mushroom, Lettuce, Onion Rings, Aioli and Fries",
                20.50,
                "Inspired by her own journey to the Arctic Circle, Himali Singh Soin upends traditional stories of exploration in her new commission for Frieze."
                ));
        food.put(6, new Food(
                        6,
                        "B.W.A",
                        "Double Beef, Double Cheese, Steaky Bacon, Onion Rings, Hot Sauce and Fries",
                        24.50,
                "With happiness harder to come by these days, people are grasping at any moment of joy they can get."

                        ));
        food.put(7, new Food(
                7,
                "Big Pun",
                "Buttermilk Fried Chicken, Melted Cheese, Poutine Waffle Fries, Maple Bacon, Maple Mayo, Jalapenos with Fries",
                18.00,
                "With happiness harder to come by these days, people are grasping at any moment of joy they can get."

        ));

        food.put(8, new Food(
                8,
                "Original Chicken Wings",
                "Eight pieces of original flavoured fried chicken wings",
                16.90,
                "With happiness harder to come by these days, people are grasping at any moment of joy they can get."

        ));

        food.put(9, new Food(
                9, "Chicken Soy Wings",
                "Eight pieces of Sweet Soy Flavoured Fried chicken wings",
                16.90,
                "With happiness harder to come by these days, people are grasping at any moment of joy they can get."

        ));
        food.put(10, new Food(
                10,
                "Shoestring Fries",
                " ",
                5.90,
                "With happiness harder to come by these days, people are grasping at any moment of joy they can get."

        ));

        food.put(11, new Food(
                11,
                "Tater Tots",
                " ",
                6.90,
                "With happiness harder to come by these days, people are grasping at any moment of joy they can get."

        ));

        food.put(12, new Food(
                12,
                "Sweet Potato Wedges",
                "Sweet Potato Wedges Served w Aioli",
                9.90,
                "With happiness harder to come by these days, people are grasping at any moment of joy they can get."

        ));

        food.put(13, new Food(
                13,
                "Street Salad",
                "Mixed Slaw, Fried Haloumi Cheese, Fresh Herbs, Tomato/Corn Salsa, House Dressing.",
                12.00,
                "With happiness harder to come by these days, people are grasping at any moment of joy they can get."

        ));

        food.put(14, new Food(
                14,
                "Kid's Burger Meal",
                "Beef Pattie, Cheese, Ketchup Served w/ Fries and Apple Juice.",
                16.50,
                "With happiness harder to come by these days, people are grasping at any moment of joy they can get."

        ));

        food.put(15, new Food(
                15,
                "Kid's Wings Meal",
                "Three original fried chicken wings served with fries and Apple Juice.",
                16.50,
                "With happiness harder to come by these days, people are grasping at any moment of joy they can get."

        ));

        food.put(16, new Food(
                16,
                "Frozen Coke",
                " ",
                3.50,
                "With happiness harder to come by these days, people are grasping at any moment of joy they can get."

        ));


    }
}
