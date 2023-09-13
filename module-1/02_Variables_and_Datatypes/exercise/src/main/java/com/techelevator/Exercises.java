package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /* Exercise 1
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */
		// ### EXAMPLE:
		int birdsOnABranch = 4;
		int birdsThatFlyAway = 1;
		int birdsRemaining = birdsOnABranch - birdsThatFlyAway;


        /* Exercise 2
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */
		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;

        /* Exercise 3
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
		int racoonStillPlaying = 3 - 2;


        /* Exercise 4
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
		int numberOfFlowers = 5;
		int numberOfBees = 3;
		int lessBeesThanFlower = numberOfFlowers - numberOfBees;


        /* Exercise 5
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
		int numberOfPigeon = 1;
		int numberOfPigeonEating = numberOfPigeon + 1;


        /* Exercise 6
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
		int numberOfOwlsSittingOnFence = 3;
		int totalNumberOfOwlsSittingOnFence = numberOfOwlsSittingOnFence + 2;


        /* Exercise 7
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
		int numberOfBeavers = 2;
		int numberOfBeaversStillOnTheirHome = numberOfBeavers - 1;


        /* Exercise 8
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
		int numberOfToucans = 2;
		int totalNumberOfToucans = numberOfToucans + 1;


        /* Exercise 9
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		int numberOfSquirrels = 4;
		int numberOfNuts = 2;
		int totalNumberOfSquirrelsThanNuts = numberOfSquirrels - numberOfNuts;


        /* Exercise 10
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
		double numberOfQuarter = 0.25;
		double numberOfDime = 0.1;
		double numberOfNickels = 0.05;
		double totalMoney = numberOfQuarter + numberOfDime + (numberOfNickels * 2);


        /* Exercise 11
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
		int numberOfMuffinsMrsBrier = 18;
		int numberOfMuffinsMrsMacAdams = 20;
		int numberOfMuffinsMrsFlannery = 17;
		int totalNumberOfMuffins = numberOfMuffinsMrsBrier + numberOfMuffinsMrsFlannery + numberOfMuffinsMrsMacAdams;


        /* Exercise 12
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		double priceOfYoyo = 0.24;
		double priceOfWhistle = 0.14;
		double totalMoneySheSpent =  priceOfYoyo + priceOfWhistle;


        /* Exercise 13
        13. Mrs. Hilt made 5 Rice Krispies Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
		int totalNumberOfKrispies = 5;
		int totalNumberOfLargeMarshmallows = 8;
		int totalNumberOfMiniMarshmallows = 10;
		int totalNumberOfMarshmallows = totalNumberOfLargeMarshmallows + totalNumberOfMiniMarshmallows;



        /* Exercise 14
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		int snowAmountHiltHouse = 29;
		int snowAmountBrecknockHouse = 17;
		int snowAmountDifference = snowAmountHiltHouse - snowAmountBrecknockHouse;


        /* Exercise 15
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2.50 on a pencil
        case. How much money does she have left?
        */
		double mrsHiltsTotalMoney = 10.0;
		double toyTruckPrice = 3.0;
		double pencilCasePrice = 2.5;
		double moneyLeftWithMrsHilt = mrsHiltsTotalMoney - (toyTruckPrice + pencilCasePrice);


        /* Exercise 16
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
		int joshTotalMarbles = 16;
		int totalLostMarbles = 7;
		int totalMarblesJoshHasNow = joshTotalMarbles - totalLostMarbles;


        /* Exercise 17
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		int meganSeashellsNow = 19;
		int meganSeashellsTotalWanted = 25;
		int seashellsNeeded = meganSeashellsTotalWanted - meganSeashellsNow;


        /* Exercise 18
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
		int bradTotalBalloons = 17;
		int totalRedBalloons = 8;
		int totalGreenBalloons = bradTotalBalloons - totalRedBalloons;


        /* Exercise 19
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
		int bookOnShelfAlready = 38;
		int booksAddedOnShelf = 10;
		int bookOnShelfNow = bookOnShelfAlready + booksAddedOnShelf;


        /* Exercise 20
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
		int totalOfBeeLegs = 6;
		int totalOfBees = 8;
		int totalLegsOfAllBees = totalOfBees * totalOfBeeLegs;


        /* Exercise 21
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
		double oneIcecreamPrice = 0.99;
		double twoIcecreamPrice = oneIcecreamPrice * 2;


        /* Exercise 22
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
		int totalOfRocksSheHasNow = 64;
		int totalOfRocksNeededForTheProject = 125;
		int totalOfRocksNeededToCompleteProject = totalOfRocksNeededForTheProject - totalOfRocksSheHasNow;


        /* Exercise 23
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
		int totalOFMrsHiltMarbles = 38;
		int totalOfMarblesLost = 15;
		int totalOfMarblesLeft = totalOFMrsHiltMarbles - totalOfMarblesLost;


        /* Exercise 24
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
		int totalMilesToConcert = 78;
		int totalMilesTheyDrove = 32;
		int totalMilesLeftToDrive = totalMilesToConcert - totalMilesTheyDrove;


        /* Exercise 25
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time (in minutes) did she spend shoveling snow?
        */
		int timeForMorningShoveling = 90;
		int timeForAfternoonShoveling = 45;
		int totalShovelingTime = timeForMorningShoveling + timeForAfternoonShoveling;


        /* Exercise 26
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
		double oneHotdogCost = 0.5;
		double sixHotdogcost = oneHotdogCost * 6;


        /* Exercise 27
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
		int mrsHiltTotalMoney = 50;
		int onePencilCost = 7;
		int totalPencilsSheCanBuy = mrsHiltTotalMoney / onePencilCost;


        /* Exercise 28
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
		int totalButterflies = 33;
		int totalOrangeButterflies = 20;
		int totalRedButterflies = totalButterflies - totalOrangeButterflies;


        /* Exercise 29
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
		double totalOfWhatKateGaveClerk = 1.00;
		double candyCost = 0.54;
		double totalChange = totalOfWhatKateGaveClerk - candyCost;


        /* Exercise 30
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
		int treesAlreadyInBackyard = 13;
		int totalOfTreesPlanted = 12;
		int totalOfAllTrees = treesAlreadyInBackyard + totalOfTreesPlanted;


        /* Exercise 31
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
		int numbersOfDays = 2;
		int hoursInADay = 24;
		int totalHoursUntillSeeGrandma = numbersOfDays * hoursInADay;


        /* Exercise 32
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
		int numberOfCousins = 4;
		int numberOfGumPieceForEachCousin = 5;
		int numberOfGumNeeded = numberOfCousins * numberOfGumPieceForEachCousin;


        /* Exercise 33
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
		double totalDollars = 3.00;
		double candyPrice = 1.00;
		double moneyLeft= totalDollars - candyPrice;


        /* Exercise 34
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
		int numberOfBoats = 5;
		int numberOfPeopleInEachBoat = 3;
		int totalNumberOfPeople = numberOfPeopleInEachBoat * numberOfBoats;


        /* Exercise 35
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
		int totalOfEllensLegos = 380;
		int totalOfLegosLost = 57;
		int totalOfLegosLeft = totalOfEllensLegos - totalOfLegosLost;


        /* Exercise 36
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
		int numberOfMuffinsBakedAlready = 35;
		int totalNumberOfMuffinsNeeded = 83;
		int totalOfMuffinsArtherHasToBake = totalNumberOfMuffinsNeeded - numberOfMuffinsBakedAlready;


        /* Exercise 37
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
		int totalOfWillysCrayons = 1400;
		int totalOfLucysCrayons = 290;
		int totalOfTheDifference = totalOfWillysCrayons  - totalOfLucysCrayons;


        /* Exercise 38
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
		int numberOfStickerOnPage = 10;
		int numberOfPages = 22;
		int numberOfStickersOnAllPages = numberOfStickerOnPage * numberOfPages;


        /* Exercise 39
        39. There are 100 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
		double numberOfCupcakes = 100.0;
		double numberOfChildren = 8.0;
		double numberOfCubcakesShared = numberOfCupcakes / numberOfChildren;

        /* Exercise 40
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies, how many
        cookies will not be placed in a jar?
        */
		int numberOfCookies = 47;
		int jarsCapacity = 6;
		int numberOfJarsNeeded = numberOfCookies / jarsCapacity;
		int numberOfCookiesWillNotPlacedInJar = numberOfCookies - (jarsCapacity * numberOfJarsNeeded);



        /* Exercise 41
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received an equal number of croissants,
        how many will be left with Marian?
        */
		int numberOfCroissants = 59;
		int numberOfNeighbors = 8;
		int numberOfCroissantsSharedEachNeighbor = numberOfCroissants / numberOfNeighbors;
		int numberOfCroissantsLeft = numberOfCroissants - (numberOfNeighbors * numberOfCroissantsSharedEachNeighbor);


        /* Exercise 42
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
		int capacityOfTray = 12;
		int totalOatmealCookies = 276;
		int numberOfTraysNeeded = totalOatmealCookies / capacityOfTray;


        /* Exercise 43
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
		int totalOfPretzelsMade = 480;
		int capacityOfOneServing = 12;
		int totalOfServingsPrepared = totalOfPretzelsMade / capacityOfOneServing;


        /* Exercise 44
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
		int totalLemonCupcakes = 53;
		int capacityOfABox = 3;
		int totalLemonCupcakesLeft = totalLemonCupcakes - 2;
		int totalOfBoxesGivingAway = totalLemonCupcakesLeft / capacityOfABox;


        /* Exercise 45
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
		int numberOfCarrotSticks = 74;
		int numberOfPeople = 12;
		int numberOfCarrotSticksServed = numberOfCarrotSticks / numberOfPeople;
		int numberOfCarrotSticksLeft = numberOfCarrotSticks - (numberOfPeople * numberOfCarrotSticksServed);



        /* Exercise 46
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
		int totalNumberOfBears = 98;
		int shelfCapacity = 7;
		int numberOfShelvesNeeded = totalNumberOfBears / shelfCapacity;


        /* Exercise 47
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
		int totalNumberOfPics = 480;
		int albumCapacity = 20;
		int numberOfAlbumsNeeded = totalNumberOfPics / albumCapacity;


        /* Exercise 48
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
		int numberOfCards = 94;
		int boxCapacity = 8;
		int numberOfBoxesFilled = numberOfCards / boxCapacity;
		int numberOfCardsUnfilled = numberOfCards - (boxCapacity * numberOfBoxesFilled);


        /* Exercise 49
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
		int totalOfBooks = 210;
		int numberOfShelves = 10;
		int numberOfBooksEachShelfContain = totalOfBooks / numberOfShelves;


        /* Exercise 50
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
		double totalNumberOfCroissants = 17.0;
		double numberOfGuests = 7.0;
		double numberOfCroissantsForEachGuest = totalNumberOfCroissants / numberOfGuests;




	    /* Exercise 51
	    51. Bill and Jill are house painters. Bill can paint a standard room in 2.15 hours, while Jill averages
	    1.90 hours. How long will it take the two painters working together to paint 5 standard rooms?
	    Hint: Calculate the rate at which each painter can complete a room (rooms / hour), combine those rates, 
	    and then divide the total number of rooms to be painted by the combined rate.
	    */
		double billPaintingTime = 2.15;
		double jillPaintingTime = 1.90;
		double numberOfRoom = 5.0;
		double billPaintingRate = numberOfRoom / (billPaintingTime * 5);
		double jillPaintingRate = numberOfRoom / (jillPaintingTime * 5);
		double timeToPaintFiveRooms = numberOfRoom / (billPaintingRate + jillPaintingRate);
     

	    /* Exercise 52
	    52. Create and assign variables to hold a first name, last name, and middle initial. Using concatenation,
		build an additional variable to hold the full name in the order of last name, first name, middle initial. The
		last and first names should be separated by a comma followed by a space, and the middle initial must end
		with a period. Use "Grace", "Hopper, and "B" for the first name, last name, and middle initial.
		Example: "John", "Smith, "D" —> "Smith, John D."
	    */
		String firstName = "Grace";
		String lastName = "Hopper";
		String middleInitial = "B";
		String fullName = lastName + ", " + firstName + " " + middleInitial + ".";


	    /* Exercise 53
	    53. The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
	    What percentage of the trip as a whole number has been completed?
	    */
		double theTotalDistance = 800;
		double distanceAlreadyTravelled = 537;
		int percentageOfWholeTripCompleted = (int) ((distanceAlreadyTravelled / theTotalDistance) * 100);


	}

}
