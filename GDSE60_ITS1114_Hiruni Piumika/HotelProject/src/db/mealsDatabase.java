package db;

import model.Meals;

import java.util.ArrayList;

public class mealsDatabase {
    public static ArrayList<Meals>mList=new ArrayList<Meals>();
   static  {
       mList.add(
               new Meals("Hell"," sdf")
       );
    }
}
