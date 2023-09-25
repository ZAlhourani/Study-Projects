package com.techelevator;

public class Airplane {

    private String planeNumber;
    private int totalFirstClassSeats;
    private int bookedFirstClassSeats;
    private int totalCoachSeats;
    private int bookedCoachSeats;
    private int availableFirstClassSeats;
    private int availableCoachSeats;

    public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats){
        this.planeNumber = planeNumber;
        this.totalFirstClassSeats = totalFirstClassSeats;
        this.totalCoachSeats = totalCoachSeats;

        availableFirstClassSeats=totalFirstClassSeats;
        availableCoachSeats=totalCoachSeats;


    }

    public String getPlaneNumber() {
        return planeNumber;
    }

    public int getTotalFirstClassSeats() {
        return totalFirstClassSeats;
    }

    public int getBookedFirstClassSeats() {
        return bookedFirstClassSeats;
    }

    public int getTotalCoachSeats() {
        return totalCoachSeats;
    }

    public int getBookedCoachSeats() {
        return bookedCoachSeats;
    }

    public int getAvailableFirstClassSeats() {
        int availableFirstClassSeats = totalFirstClassSeats - bookedFirstClassSeats;
     return availableFirstClassSeats;
    }

    public int getAvailableCoachSeats() {
        int availableCoachSeats =  totalCoachSeats - bookedCoachSeats;
        return availableCoachSeats;
    }

    public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats) {

        if(forFirstClass && getAvailableFirstClassSeats()>=totalNumberOfSeats)
        {
            bookedFirstClassSeats+=totalNumberOfSeats;
            availableFirstClassSeats=totalFirstClassSeats-bookedFirstClassSeats;
            return true;
        }
        else if(!forFirstClass && getAvailableCoachSeats()>=totalNumberOfSeats){
            bookedCoachSeats+=totalNumberOfSeats;
            availableCoachSeats=totalCoachSeats-bookedCoachSeats;
            return true;
        }

        else
            return false;

    }
}
