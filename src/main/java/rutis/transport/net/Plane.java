package rutis.transport.net;

import rutis.transport.City;
import rutis.transport.Passenger;
import rutis.transport.TransportAction;

public class Plane implements TransportAction {

    private int boardNumber;

    public void move(City cityFrom, City cityTo, Passenger passenger) {
        System.out.println(passenger + " moved by Plane from "
                + cityFrom + " to " + cityTo);
    }

    public int getBoardNumber() {
        return boardNumber;
    }

    public void setBoardNumber(int boardNumber) {
        this.boardNumber = boardNumber;
    }
}