package people;

import behaviours.IReviewed;
import org.omg.CORBA.IRObject;
import stalls.Stall;

import java.util.ArrayList;

public class Visitor {

    private int age;
    private double height;
    private double money;
    private ArrayList<IReviewed> visitedAttractions;


    public Visitor(int age, double height, double money) {
            this.age = age;
            this.height = height;
            this.money = money;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getMoney() {
        return money;
    }

    public ArrayList getVisitedAttractions() {
        return visitedAttractions;
    }

    public void addAttractionToList(IReviewed attraction){
        visitedAttractions.add(attraction);
    }
}
