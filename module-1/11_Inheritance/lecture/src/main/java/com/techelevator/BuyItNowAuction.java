package com.techelevator;

import java.sql.BatchUpdateException;
import java.time.LocalDateTime;

public class BuyItNowAuction extends Auction {

    private final int buyItNowPrice;



    public BuyItNowAuction (int buyItNowPrice, String auctionItem) {
        super(auctionItem);

        this.buyItNowPrice = buyItNowPrice;
    }

    public BuyItNowAuction(int buyItNowPrice, String auctionItem, LocalDateTime endDateTime) {

        super(auctionItem, endDateTime);

        this.buyItNowPrice = buyItNowPrice;
    }

    public int getBuyItNowPrice() {
        return buyItNowPrice;
    }

    public boolean hasAuctionEnded() {
        // the same as the parent OR current winning bid meets buyItNowPrice
        if (getCurrentWinningBid().getAmount() >= buyItNowPrice || super.hasAuctionEnded()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean placeBid(Bid attemptedBid) {
        if (attemptedBid.getAmount() > buyItNowPrice) {
            Bid updatedBid = new Bid(attemptedBid.getBidder(), buyItNowPrice);
            return super.placeBid(updatedBid);
        }

        return super.placeBid(attemptedBid);
    }
    public void buyItNowPrice(String bidder) {
        Bid newBid = new Bid(bidder, buyItNowPrice);

        placeBid(newBid);
    }

    @Override
    public String toString() {
        return "Item for sale: " + getAuctionItem() + ", Buy it now for: $" + buyItNowPrice;
    }

}
