import attractions.*;
import behaviours.IReviewed;
import people.Visitor;
import stalls.CandyflossStall;
import stalls.IceCreamStall;
import stalls.ParkingSpot;

import java.util.ArrayList;

public class ThemePark {

//    private Dodgems dodgems;
//    private Park park;
//    private Playground playground;
//    private RollerCoaster rollerCoaster;
//    private CandyflossStall candyflossStall;
//    private IceCreamStall iceCreamStall;
//    private ParkingSpot parkingSpot;
//    private ThemePark themePark;
//
//    public ThemePark(Dodgems dodgems, Park park, Playground playground, RollerCoaster rollerCoaster, CandyflossStall candyflossStall, IceCreamStall iceCreamStall, ParkingSpot parkingSpot, ThemePark themePark) {
//        this.dodgems = dodgems;
//        this.park = park;
//        this.playground = playground;
//        this.rollerCoaster = rollerCoaster;
//        this.candyflossStall = candyflossStall;
//        this.iceCreamStall = iceCreamStall;
//        this.parkingSpot = parkingSpot;
//        this.themePark = themePark;

    private ArrayList<IReviewed> reviewed;

    public ThemePark(){
        this.reviewed = new ArrayList<IReviewed>();
    }

    public ArrayList getReviewed() {
        return reviewed;
    }

    public void visit(Visitor visitor, Attraction attraction) {

        attraction.increaseVisitCountByOne();
        visitor.addAttractionToList(attraction);

    }

//    ThemePark has a method visit(Visitor, Attraction) calls for the attraction to increment its visitCount by 1 and adds the attraction to the visitors visitedAttractions list.

}




