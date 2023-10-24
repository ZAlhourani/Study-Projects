package com.techelevator.auctions.services;

import org.springframework.web.client.RestTemplate;

import com.techelevator.auctions.model.Auction;

public class AuctionService {

    public static String API_BASE_URL = "http://localhost:3000/auctions";
    private RestTemplate restTemplate = new RestTemplate();


    public Auction[] getAllAuctions() {

        String url = API_BASE_URL;

        Auction[] auctionList = restTemplate.getForObject(url, Auction[].class);

        return auctionList;
    }

    public Auction getAuction(int id) {

        String url = API_BASE_URL + "/" + id;

        Auction auctionId = restTemplate.getForObject(url, Auction.class);

        return auctionId;
    }

    public Auction[] getAuctionsMatchingTitle(String title) {

        String url = API_BASE_URL + "?title_like=" + title;

        Auction[] auctionMatchingTitle = restTemplate.getForObject(url, Auction[].class);

        return auctionMatchingTitle;
    }

    public Auction[] getAuctionsAtOrBelowPrice(double price) {

        String url = API_BASE_URL + "?currentBid_lte=" + price;

        Auction[] auctionByPrice = restTemplate.getForObject(url, Auction[].class);

        return auctionByPrice;
    }

}
