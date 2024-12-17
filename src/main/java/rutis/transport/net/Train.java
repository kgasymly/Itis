package rutis.transport.net;

import rutis.transport.City;
import rutis.transport.Passenger;
import rutis.transport.TransportAction;

public class Train implements TransportAction {

    private String category;

    public void move(City cityFrom, City cityTo, Passenger passenger) {
        System.out.println(passenger + " moved by Train from "
                + cityFrom + " to " + cityTo);
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}