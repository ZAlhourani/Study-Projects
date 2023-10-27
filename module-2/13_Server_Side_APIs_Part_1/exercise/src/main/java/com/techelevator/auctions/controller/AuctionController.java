package com.techelevator.auctions.controller;

import com.techelevator.auctions.dao.AuctionDao;
import com.techelevator.auctions.dao.MemoryAuctionDao;
import com.techelevator.auctions.model.Auction;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auctions")
public class AuctionController {

    private AuctionDao auctionDao;

    public AuctionController() {
        this.auctionDao = new MemoryAuctionDao();
    }
    @RequestMapping
    public List<Auction> list(@RequestParam(defaultValue = "", name = "title_like") String title,
                              @RequestParam(defaultValue = "0", name = "currentBid_lte") double price) {

        if (!title.equals("") & price > 0) {
            return auctionDao.getAuctionsByTitleAndMaxBid(title, price);
        }else if (!title.equals("")) {
            return auctionDao.getAuctionsByTitle(title);
        }else if (price > 0) {
            return auctionDao.getAuctionsByMaxBid(price);
        }
        return auctionDao.getAuctions();
    }
    @RequestMapping(path = "/{id}")
    public Auction get(@PathVariable int id) {
        return auctionDao.getAuctionById(id);
    }
    @RequestMapping(method = RequestMethod.POST)
    public Auction createAuction (@RequestBody Auction auctionToCreate) {
        return auctionDao.createAuction(auctionToCreate);
    }
}
