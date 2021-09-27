import java.util.ArrayList;

public class Room {
	public static ArrayList<Room> rooms = new ArrayList<Room>();
	public static ArrayList<Room> location = new ArrayList<Room>();
	public static ArrayList<Room> visited = new ArrayList<Room>();
	
	public static ArrayList<String> gardenPatioExits = new ArrayList<String>();
	public static ArrayList<String> cobbleSquareExits = new ArrayList<String>();
	public static ArrayList<String> teaRoomExits = new ArrayList<String>(); 
	public static ArrayList<String> sandExhibitExits = new ArrayList<String>(); 
	public static ArrayList<String> thatchedHutExits = new ArrayList<String>(); 
	public static ArrayList<String> gardenOverlookExits = new ArrayList<String>(); 
	public static ArrayList<String> loungeExits = new ArrayList<String>(); 
	public static ArrayList<String> cafeExits = new ArrayList<String>(); 
	public static ArrayList<String> wabeExits = new ArrayList<String>(); 
	public static ArrayList<String> shrineRoom1Exits = new ArrayList<String>(); 
	public static ArrayList<String> galleryExits = new ArrayList<String>(); 
	public static ArrayList<String> assemblyRoomExits = new ArrayList<String>(); 
	public static ArrayList<String> shrineRoom2Exits = new ArrayList<String>(); 
	public static ArrayList<String> livingRoomExits = new ArrayList<String>(); 
	public static ArrayList<String> pondExits = new ArrayList<String>(); 
	public static ArrayList<String> courtyardExits = new ArrayList<String>(); 
	public static ArrayList<String> landingExits = new ArrayList<String>(); 
	public static ArrayList<String> hallwayExits = new ArrayList<String>(); 
	public static ArrayList<String> sittingRoomExits = new ArrayList<String>(); 
	public static ArrayList<String> studyExits = new ArrayList<String>(); 
	public static ArrayList<String> masterBedroomExits = new ArrayList<String>(); 
	public static ArrayList<String> closetExits = new ArrayList<String>(); 
	public static ArrayList<String> darkPassagewayExits = new ArrayList<String>();
	public static ArrayList<String> mannequinRoomExits = new ArrayList<String>(); 
	public static ArrayList<String> theaterExits = new ArrayList<String>(); 
	public static ArrayList<String> forestExits = new ArrayList<String>();
	public static ArrayList<String> gateExits = new ArrayList<String>(); 
	public static ArrayList<String> islandExits = new ArrayList<String>(); 
	public static ArrayList<String> bottomOfMountainExits = new ArrayList<String>(); 
	public static ArrayList<String> halfwayUpMountainExits = new ArrayList<String>(); 
	public static ArrayList<String> topOfMountainExits = new ArrayList<String>(); 
	public static ArrayList<String> hamletExits = new ArrayList<String>(); 
	public static ArrayList<String> hondoExits = new ArrayList<String>(); 
	public static ArrayList<String> balconyExits = new ArrayList<String>(); 
	public static ArrayList<String> shrineRoom3Exits = new ArrayList<String>();
	public static ArrayList<String> trinketShopExits = new ArrayList<String>(); 
	public static ArrayList<String> creakyDeckExits = new ArrayList<String>(); 
	public static ArrayList<String> overlookExits = new ArrayList<String>(); 
	
	public static ArrayList<String> gardenPatioObjects = new ArrayList<String>();
	public static ArrayList<String> cobbleSquareObjects = new ArrayList<String>();
	public static ArrayList<String> teaRoomObjects = new ArrayList<String>(); 
	public static ArrayList<String> sandExhibitObjects = new ArrayList<String>(); 
	public static ArrayList<String> thatchedHutObjects = new ArrayList<String>(); 
	public static ArrayList<String> gardenOverlookObjects = new ArrayList<String>(); 
	public static ArrayList<String> loungeObjects = new ArrayList<String>(); 
	public static ArrayList<String> cafeObjects = new ArrayList<String>(); 
	public static ArrayList<String> wabeObjects = new ArrayList<String>(); 
	public static ArrayList<String> shrineRoom1Objects = new ArrayList<String>(); 
	public static ArrayList<String> galleryObjects = new ArrayList<String>(); 
	public static ArrayList<String> assemblyRoomObjects = new ArrayList<String>(); 
	public static ArrayList<String> shrineRoom2Objects = new ArrayList<String>(); 
	public static ArrayList<String> livingRoomObjects = new ArrayList<String>(); 
	public static ArrayList<String> pondObjects = new ArrayList<String>(); 
	public static ArrayList<String> courtyardObjects = new ArrayList<String>(); 
	public static ArrayList<String> landingObjects = new ArrayList<String>(); 
	public static ArrayList<String> hallwayObjects = new ArrayList<String>(); 
	public static ArrayList<String> sittingRoomObjects = new ArrayList<String>(); 
	public static ArrayList<String> studyObjects = new ArrayList<String>(); 
	public static ArrayList<String> masterBedroomObjects = new ArrayList<String>(); 
	public static ArrayList<String> closetObjects = new ArrayList<String>(); 
	public static ArrayList<String> darkPassagewayObjects = new ArrayList<String>();
	public static ArrayList<String> mannequinRoomObjects = new ArrayList<String>(); 
	public static ArrayList<String> theaterObjects = new ArrayList<String>(); 
	public static ArrayList<String> forestObjects = new ArrayList<String>();
	public static ArrayList<String> gateObjects = new ArrayList<String>(); 
	public static ArrayList<String> islandObjects = new ArrayList<String>(); 
	public static ArrayList<String> bottomOfMountainObjects = new ArrayList<String>(); 
	public static ArrayList<String> halfwayUpMountainObjects = new ArrayList<String>(); 
	public static ArrayList<String> topOfMountainObjects = new ArrayList<String>(); 
	public static ArrayList<String> hamletObjects = new ArrayList<String>(); 
	public static ArrayList<String> hisachiIchirosHouseObjects = new ArrayList<String>(); 
	public static ArrayList<String> hondoObjects = new ArrayList<String>(); 
	public static ArrayList<String> balconyObjects = new ArrayList<String>(); 
	public static ArrayList<String> shrineRoom3Objects = new ArrayList<String>();
	public static ArrayList<String> trinketShopObjects = new ArrayList<String>(); 
	public static ArrayList<String> creakyDeckObjects = new ArrayList<String>(); 
	public static ArrayList<String> overlookObjects = new ArrayList<String>();
	
	public static ArrayList<Room> roomsWithPanels = new ArrayList<Room>(); 
	
	public static String gardenPatioDesc = "The celebrated White Gravel and Pine Tree Garden expands before you. Part of you yearns to stroll through the sand, but you know better than to disturb the cherished landscape. To the south is the Adachi Museum of Art.";
	private static String cobbleSquareDesc = "Your sandals clack on the water-worn stone beneath you. This sunny space opens up in all four cardinal directions.";
	public static String teaRoomDesc = "You are standing inside a room designed for drinking tea, with only one exit at the east end.";
	public static String sandExhibitDesc = "This room displays an impressively combed sand exhibit. There is a door on the south wall with a metal panel bolted to it. Beside the door is a sign.";
	public static String thatchedHutDesc = "You are in a thatched hut. There is a Chippendale mirror standing here. To the southeast is a long hallway, and to the north is the cobble square.";
	public static String gardenOverlookDesc = "The Pond Garden of the Adachi Museum of Art expands to the south. The pruned trees and stone walkways are positioned in such a way that every angle of the landscape offers a unique aesthetic. From here you can also see a small room to the west, a long hallway to the northwest, and a path to the east through bamboo trees.";
	public static String loungeDesc = "A burgundy sofa lines the west wall of this room. Built into the wall above the sofa is an iron safe with a metal panel welded onto it. There is an exit to the east.";
	public static String cafeDesc = "You are standing in an outdoor cafe nestled in a sunny corner of the museum. From here you can see a gentle hill to the north, and a path leading west through bamboo trees. To the south, behind one of the museum's large glass windows, stands a masked woman dressed in a blue kimono. Her stare at you is unwavering.";
	public static String wabeDesc = "You reach the top of a grassy hill, overlooking the White Gravel and Pine Tree Garden to the north. There is an entrance to a gallery down to the east, and the cafe is down to the south.";
	public static String shrineRoom1Desc = "You are standing in a room that is dominated by a shrine decorated in red velvet. Centered on the shrine is an old television set. Built into the east wall is an iron safe with a panel welded onto it.";
	public static String galleryDesc = "This gallery is decorated with dozens of contemporary Japanese paintings, most of which seem to embody the spirit of springtime. There is a hallway leading south. An exit is west of here.";
	public static String assemblyRoomDesc = "You are standing in a long room flooded with light, with the only exit to the north. Three tall figures wearing black cloaks stand behind a golden chest.";
	public static String shrineRoom2Desc = "Recessed in the north wall of this quiet room is a beautifully gilded altar. Above it hangs a wooden carving. There is a door on the west wall, and beside it, a metal panel. You see a living room to the south.";
	public static String livingRoomDesc = "You are in what is presumably the living room, albeit completely unfurnished. A masked woman in a blue kimono is standing outside the west window. Her stare at you is unwavering. You see a gold altar in the room north of here. A gentle breeze flows in from the east, where you see the deck outside.";
	public static String pondDesc = "You are standing on a wooden deck that was built over the west side of a small pond. The soft trickling of water and the occasional splashing of koi fish offers a feeling of serenity. Walkways lead off to the north and west.";
	public static String courtyardDesc = "Rays of sunshine fill this lush courtyard. A small wooden door is seen to the east, and on the wall beside it, a metal panel. To the northeast you see a winding stone staircase leading up into the house. A hallway extends south.";
	public static String landingDesc1 = "You are halfway";
	public static String landingDesc2 = "the winding staircase, which ascends to the southeast and descends to the southwest. A plaque is nailed to the wall here at about eye level.";
	public static String hallwayDesc = "This hallway extends from the south to the northwest, where it descends into a staircase. Built into the west wall is what appears to be an old laundry chute, only somebody has installed a glass pane across the opening. Beside the chute is a lever, and beside that, a metal panel.";
	public static String sittingRoomDesc = "This is a quaint sitting area with rooms to the east and west, as well as a hallway to the north.";
	public static String studyDesc = "You are in a small study with an exit to the east. There is a Chippendale mirror standing here. Built into the wall is an iron safe. On the safe is a metal panel.";
	public static String masterBedroomDesc = "You are in the master bedroom, furnished with a four-poster bed, and across from it, an old television set. A window overlooks the outside, and a doorway leads to the west.";
	public static String closetDesc = "You are in a small closet, with one exit to the west. There is a medium-sized hole in the ceiling above.";
	public static String darkPassagewayDesc = "You are in a dark passageway, with paths leading north and east. On the south wall, a beam of light is shining through a small hole.";
	public static String mannequinRoomDesc = "You are standing in the middle of a dark room, surrounded by dozens of mannequins that are assembled in various positions. There are passageways to the east and south.";
	public static String theaterDesc = "This room looks like someone attempted to convert it into a home theater, but had abandoned the project halfway through. There is various junk covered in cobwebs scattered about. Nestled in the corner is an old television set. There is a passageway to the west.";
	public static String forestDesc = "You are in the middle of a vast forest, surrounded by tall pine trees in every direction. There is a stone path that leads north toward an enormous, open gate. Looming behind the gate in the distance is a huge, snowy mountain.";
	public static String gateDesc = "You are beneath the main gate that appears to be hundreds of years old. There is a memorial stone here with an inscription carved into the face of it. A stone path runs north and south, through the gate.";
	public static String islandDesc = "You are on a small man-made island in the center of a frozen pond, connected only by a bridge to the west. Built on the center of the island is a small hokura shrine.";
	public static String islandClosed = " Inside the hokura, behind a lattice barrier, is an old television set.";
	public static String islandOpen = " Inside the hokura is an old television set.";
	public static String bottomOfMountainDesc = "You are at the bottom of a long stone staircase leading north up the mountain. A stone path leads south. There is a slate here with an inscription carved into the face of it. To the east, a narrow stone bridge extends over a frozen pond, reaching a man-made island in the center.";
	public static String halfwayUpMountainDesc = "You are halfway up the snowy mountain. The stone path ascends to the north, and descends to the south. Peeking out of the snow on the ground is a wooden sign.";
	public static String topOfMountainDesc = "You are at the top of mountain path. A large, old temple stands just north of here. To the west you can see residents' quarters. A stone path descends the mountain to the south.";
	public static String hamletDesc = "There is a modest house at the west end of this hamlet. Beside its front door is a wooden post with a panel bolted to it. There is a pathway to the east.";
	public static String hisachiIchirosHouseDesc = "You are sitting on a cushion in a warm house. There's a cup of hot tea on a table in front of you. Hisachi Ichiro sits on the opposite side.";
	public static String hondoDesc = "You are in the main hall of the temple, which branches off in many directions. There is a balcony to the northwest, a storefront to the northeast, and a magnificent golden shrine to the north. In the center of the hondo rests a large basin.";
	public static String balconyDesc = "The balcony extends along the west edge of the temple, overlooking a vast forest. The deck continues to the north and southeast.";
	public static String shrineRoom3Desc = "You are standing in front of a magnificent golden shrine, decorated with candles and brown cloth. There is a banner hanging above. There is an exit to the south.";
	public static String trinketShopDesc = "This small trinket shop is very bare, and seems to be closed for the season. A Chippendale mirror is positioned in the corner of the shop. From here you can see the Hondo to the southwest.";
	public static String creakyDeckDesc = "The deck creaks beneath your feet, voicing its venerable age. The deck continues to the west and to the south. There is a tall wooden box here that resembles a cupboard, except that it has no door to speak of. On the front of the box is a button, and a metal panel.";
	public static String overlookDesc = "You are on the west end of the temple where the deck overlooks a vast forest, enveloped by falling snowflakes. Thousands of colorful oragami birds are strung here from the ceiling, forming a curtain of rainbow paper that veils the far end of the overlook. The deck extends to the east from here.";
	
	public String title;
	public String desc;
	public int scrollCount = 0;
	
	public Room(String title, String desc) {
		this.title = title;
		this.desc = desc;
	}
	
	public static Room gardenPatio = new Room("Garden Patio", gardenPatioDesc);
	public static Room cobbleSquare = new Room("Cobble Square", cobbleSquareDesc);
	public static Room teaRoom = new Room("Tea Room", teaRoomDesc); 
	public static Room sandExhibit = new Room("Sand Exhibit", sandExhibitDesc); 
	public static Room thatchedHut = new Room("Thatched Hut", thatchedHutDesc); 
	public static Room gardenOverlook = new Room("Garden Overlook", gardenOverlookDesc); 
	public static Room lounge = new Room("Lounge", loungeDesc); 
	public static Room cafe = new Room("Cafe", cafeDesc); 
	public static Room wabe = new Room("Wabe", wabeDesc); 
	public static Room shrineRoom1 = new Room("Avalokitesvara Shrine", shrineRoom1Desc); 
	public static Room gallery = new Room("Gallery", galleryDesc); 
	public static Room assemblyRoom = new Room("Assembly Room", assemblyRoomDesc); 
	public static Room shrineRoom2 = new Room("Altar of Samantabhadra", shrineRoom2Desc); 
	public static Room livingRoom = new Room("Living Room", livingRoomDesc); 
	public static Room pond = new Room("Pond", pondDesc); 
	public static Room courtyard = new Room("Courtyard", courtyardDesc); 
	public static Room landing = new Room("Landing", landingDesc1); 
	public static Room hallway = new Room("Hallway", hallwayDesc); 
	public static Room sittingRoom = new Room("Sitting Room", sittingRoomDesc); 
	public static Room study = new Room("Study", studyDesc); 
	public static Room masterBedroom = new Room("Master Bedroom", masterBedroomDesc); 
	public static Room closet = new Room("Closet", closetDesc); 
	public static Room darkPassageway = new Room("Dark Passageway", darkPassagewayDesc);
	public static Room mannequinRoom = new Room("Mannequin Room", mannequinRoomDesc); 
	public static Room theater = new Room("Theater", theaterDesc); 
	public static Room forest = new Room("Forest", forestDesc);
	public static Room gate = new Room("Gate", gateDesc); 
	public static Room island = new Room("Island", islandDesc); 
	public static Room bottomOfMountain = new Room("Bottom of Mountain", bottomOfMountainDesc); 
	public static Room halfwayUpMountain = new Room("Halfway up Mountain", halfwayUpMountainDesc); 
	public static Room topOfMountain = new Room("Top of Mountain", topOfMountainDesc); 
	public static Room hamlet = new Room("Hamlet", hamletDesc); 
	public static Room hisachiIchirosHouse = new Room("Hisachi Ichiro's House", hisachiIchirosHouseDesc); 
	public static Room hondo = new Room("Hondo", hondoDesc); 
	public static Room balcony = new Room("Balcony", balconyDesc); 
	public static Room shrineRoom3 = new Room("Butsudan of Kannon", shrineRoom3Desc);
	public static Room trinketShop = new Room("Trinket Shop", trinketShopDesc); 
	public static Room creakyDeck = new Room("Creaky Deck", creakyDeckDesc); 
	public static Room overlook = new Room("Overlook", overlookDesc); 

	public static void setRooms() {
		rooms.add(gardenPatio); 
		rooms.add(cobbleSquare); 
		rooms.add(teaRoom); 
		rooms.add(sandExhibit); 
		rooms.add(thatchedHut); 
		rooms.add(gardenOverlook); 
		rooms.add(lounge); 
		rooms.add(cafe); 
		rooms.add(wabe); 
		rooms.add(shrineRoom1); 
		rooms.add(gallery); 
		rooms.add(assemblyRoom); 
		rooms.add(shrineRoom2); 
		rooms.add(livingRoom); 
		rooms.add(pond); 
		rooms.add(courtyard); 
		rooms.add(landing); 
		rooms.add(hallway); 
		rooms.add(sittingRoom); 
		rooms.add(study); 
		rooms.add(masterBedroom); 
		rooms.add(closet); 
		rooms.add(darkPassageway);
		rooms.add(mannequinRoom); 
		rooms.add(theater); 
		rooms.add(forest);
		rooms.add(gate); 
		rooms.add(island); 
		rooms.add(bottomOfMountain); 
		rooms.add(halfwayUpMountain); 
		rooms.add(topOfMountain); 
		rooms.add(hamlet); 
		rooms.add(hisachiIchirosHouse); 
		rooms.add(hondo); 
		rooms.add(balcony); 
		rooms.add(shrineRoom3);
		rooms.add(trinketShop); 
		rooms.add(creakyDeck); 
		rooms.add(overlook); 
	}
	
	public static void setExits() {
		gardenPatioExits.add("S");
		cobbleSquareExits.add("N");
		cobbleSquareExits.add("S");
		cobbleSquareExits.add("E");
		cobbleSquareExits.add("W");
		teaRoomExits.add("E"); 
		sandExhibitExits.add("W"); 
		sandExhibitExits.add("S"); 
		thatchedHutExits.add("N"); 
		thatchedHutExits.add("SE"); 
		gardenOverlookExits.add("NW"); 
		gardenOverlookExits.add("W"); 
		gardenOverlookExits.add("E"); 
		loungeExits.add("E"); 
		cafeExits.add("N"); 
		cafeExits.add("W"); 
		wabeExits.add("E"); 
		wabeExits.add("S"); 
		wabeExits.add("D"); 
		shrineRoom1Exits.add("N"); 
		galleryExits.add("W"); 
		galleryExits.add("S"); 
		assemblyRoomExits.add("N"); 
		shrineRoom2Exits.add("W"); 
		shrineRoom2Exits.add("S"); 
		livingRoomExits.add("N"); 
		livingRoomExits.add("E"); 
		pondExits.add("N"); 
		pondExits.add("W"); 
		courtyardExits.add("E"); 
		courtyardExits.add("NE"); 
		courtyardExits.add("U"); 
		courtyardExits.add("S"); 
		landingExits.add("SW"); 
		landingExits.add("SE"); 
		landingExits.add("U"); 
		landingExits.add("D"); 
		hallwayExits.add("NW"); 
		hallwayExits.add("D"); 
		hallwayExits.add("S"); 
		sittingRoomExits.add("N"); 
		sittingRoomExits.add("E"); 
		sittingRoomExits.add("W"); 
		studyExits.add("E"); 
		masterBedroomExits.add("W"); 
		closetExits.add("W"); 
		darkPassagewayExits.add("N");
		darkPassagewayExits.add("E");
		mannequinRoomExits.add("E"); 
		mannequinRoomExits.add("S"); 
		theaterExits.add("W"); 
		forestExits.add("N");
		gateExits.add("N"); 
		gateExits.add("S"); 
		islandExits.add("W"); 
		bottomOfMountainExits.add("N"); 
		bottomOfMountainExits.add("S"); 
		bottomOfMountainExits.add("E"); 
		bottomOfMountainExits.add("U"); 
		halfwayUpMountainExits.add("N"); 
		halfwayUpMountainExits.add("S"); 
		halfwayUpMountainExits.add("U"); 
		halfwayUpMountainExits.add("D"); 
		topOfMountainExits.add("N"); 
		topOfMountainExits.add("W"); 
		topOfMountainExits.add("S"); 
		topOfMountainExits.add("D"); 
		hamletExits.add("E"); 
		hondoExits.add("N"); 
		hondoExits.add("NE"); 
		hondoExits.add("NW"); 
		hondoExits.add("S"); 
		balconyExits.add("N"); 
		balconyExits.add("SE"); 
		shrineRoom3Exits.add("S");
		trinketShopExits.add("SW"); 
		creakyDeckExits.add("S"); 
		creakyDeckExits.add("W"); 
		overlookExits.add("E"); 
	}
	
	public static void setGardenObjects() {
		teaRoomObjects.add(Item.Book.getTitle()); 
	}
	
	public static void setHouseObjects() {
		landingObjects.add(Item.Rod.getTitle()); 
		sittingRoomObjects.add(Item.Phone.getTitle()); 
		studyObjects.add(Item.Cryptogram.getTitle()); 
		closetObjects.add(Item.Corn.getTitle()); 
	}
	
	public static void setTempleObjects() {
		balconyObjects.add(Item.Card.getTitle()); 
		trinketShopObjects.add(Item.JewelledCase.getTitle()); 
	}
	
	public static void setRoomsWithPanels() {
		roomsWithPanels.add(sandExhibit);
		roomsWithPanels.add(lounge);
		roomsWithPanels.add(shrineRoom1);
		roomsWithPanels.add(assemblyRoom);
		roomsWithPanels.add(shrineRoom2);
		roomsWithPanels.add(courtyard);
		roomsWithPanels.add(hallway);
		roomsWithPanels.add(study);
		roomsWithPanels.add(hamlet);
		roomsWithPanels.add(creakyDeck);
	}
	
	public static ArrayList getExits() {
		switch (Player.getLocation().title) {
			case "Garden Patio":
				return gardenPatioExits;
			case "Cobble Square":
				return cobbleSquareExits;
			case "Tea Room":
				return teaRoomExits;
			case "Sand Exhibit":
				return sandExhibitExits;
			case "Thatched Hut":
				return thatchedHutExits;
			case "Garden Overlook":
				return gardenOverlookExits;
			case "Lounge":
				return loungeExits;
			case "Cafe":
				return cafeExits;
			case "Wabe":
				return wabeExits;
			case "Avalokitesvara Shrine":
				return shrineRoom1Exits;
			case "Gallery":
				return galleryExits;
			case "Assembly Room":
				return assemblyRoomExits;
			case "Altar of Samantabhadra":
				return shrineRoom2Exits;
			case "Living Room":
				return livingRoomExits;
			case "Pond":
				return pondExits;
			case "Courtyard":
				return courtyardExits;
			case "Landing":
				return landingExits;
			case "Hallway":
				return hallwayExits;
			case "Sitting Room":
				return sittingRoomExits;
			case "Study":
				return studyExits;
			case "Master Bedroom":
				return masterBedroomExits;
			case "Closet":
				return closetExits;
			case "Dark Passageway":
				return darkPassagewayExits;
			case "Mannequin Room":
				return mannequinRoomExits;
			case "Theater":
				return theaterExits;
			case "Forest":
				return forestExits;
			case "Gate":
				return gateExits;
			case "Island":
				return islandExits;
			case "Bottom of Mountain":
				return bottomOfMountainExits;
			case "Halfway up Mountain":
				return halfwayUpMountainExits;
			case "Top of Mountain":
				return topOfMountainExits;
			case "Hamlet":
				return hamletExits;
			case "Hondo":
				return hondoExits;
			case "Balcony":
				return balconyExits;
			case "Butsudan of Kannon":
				return shrineRoom3Exits;
			case "Trinket Shop":
				return trinketShopExits;
			case "Creaky Deck":
				return creakyDeckExits;
			case "Overlook":
				return overlookExits;
			default:
				System.out.println("Room.getExits() error");
				return null;
		}
	}
	
	public static ArrayList getObjects() {
		switch (Player.getLocation().title) {
			case "Garden Patio":
				return gardenPatioObjects;
			case "Cobble Square":
				return cobbleSquareObjects;
			case "Tea Room":
				return teaRoomObjects;
			case "Sand Exhibit":
				return sandExhibitObjects;
			case "Thatched Hut":
				return thatchedHutObjects;
			case "Garden Overlook":
				return gardenOverlookObjects;
			case "Lounge":
				return loungeObjects;
			case "Cafe":
				return cafeObjects;
			case "Wabe":
				return wabeObjects;
			case "Avalokitesvara Shrine":
				return shrineRoom1Objects;
			case "Gallery":
				return galleryObjects;
			case "Assembly Room":
				return assemblyRoomObjects;
			case "Altar of Samantabhadra":
				return shrineRoom2Objects;
			case "Living Room":
				return livingRoomObjects;
			case "Pond":
				return pondObjects;
			case "Courtyard":
				return courtyardObjects;
			case "Landing":
				return landingObjects;
			case "Hallway":
				return hallwayObjects;
			case "Sitting Room":
				return sittingRoomObjects;
			case "Study":
				return studyObjects;
			case "Master Bedroom":
				return masterBedroomObjects;
			case "Closet":
				return closetObjects;
			case "Dark Passageway":
				return darkPassagewayObjects;
			case "Mannequin Room":
				return mannequinRoomObjects;
			case "Theater":
				return theaterObjects;
			case "Forest":
				return forestObjects;
			case "Gate":
				return gateObjects;
			case "Island":
				return islandObjects;
			case "Bottom of Mountain":
				return bottomOfMountainObjects;
			case "Halfway up Mountain":
				return halfwayUpMountainObjects;
			case "Top of Mountain":
				return topOfMountainObjects;
			case "Hamlet":
				return hamletObjects;
			case "Hisachi Ichiro's House":
				return hisachiIchirosHouseObjects;
			case "Hondo":
				return hondoObjects;
			case "Balcony":
				return balconyObjects;
			case "Butsudan of Kannon":
				return shrineRoom3Objects;
			case "Trinket Shop":
				return trinketShopObjects;
			case "Creaky Deck":
				return creakyDeckObjects;
			case "Overlook":
				return overlookObjects;
			default:
				System.out.println("Room.getObjects() error");
				return null;
		}
	}
	
	public static String getTitleOfObjectInList(int i) {
		switch (Player.getLocation().title) {
			case "Garden Patio":
				return gardenPatioObjects.get(i);
			case "Cobble Square":
				return cobbleSquareObjects.get(i);
			case "Tea Room":
				return teaRoomObjects.get(i);
			case "Sand Exhibit":
				return sandExhibitObjects.get(i);
			case "Thatched Hut":
				return thatchedHutObjects.get(i);
			case "Garden Overlook":
				return gardenOverlookObjects.get(i);
			case "Lounge":
				return loungeObjects.get(i);
			case "Cafe":
				return cafeObjects.get(i);
			case "Wabe":
				return wabeObjects.get(i);
			case "Avalokitesvara Shrine":
				return shrineRoom1Objects.get(i);
			case "Gallery":
				return galleryObjects.get(i);
			case "Assembly Room":
				return assemblyRoomObjects.get(i);
			case "Altar of Samantabhadra":
				return shrineRoom2Objects.get(i);
			case "Living Room":
				return livingRoomObjects.get(i);
			case "Pond":
				return pondObjects.get(i);
			case "Courtyard":
				return courtyardObjects.get(i);
			case "Landing":
				return landingObjects.get(i);
			case "Hallway":
				return hallwayObjects.get(i);
			case "Sitting Room":
				return sittingRoomObjects.get(i);
			case "Study":
				return studyObjects.get(i);
			case "Master Bedroom":
				return masterBedroomObjects.get(i);
			case "Closet":
				return closetObjects.get(i);
			case "Dark Passageway":
				return darkPassagewayObjects.get(i);
			case "Mannequin Room":
				return mannequinRoomObjects.get(i);
			case "Theater":
				return theaterObjects.get(i);
			case "Forest":
				return forestObjects.get(i);
			case "Gate":
				return gateObjects.get(i);
			case "Island":
				return islandObjects.get(i);
			case "Bottom of Mountain":
				return bottomOfMountainObjects.get(i);
			case "Halfway up Mountain":
				return halfwayUpMountainObjects.get(i);
			case "Top of Mountain":
				return topOfMountainObjects.get(i);
			case "Hamlet":
				return hamletObjects.get(i);
			case "Hondo":
				return hondoObjects.get(i);
			case "Balcony":
				return balconyObjects.get(i);
			case "Butsudan of Kannon":
				return shrineRoom3Objects.get(i);
			case "Trinket Shop":
				return trinketShopObjects.get(i);
			case "Creaky Deck":
				return creakyDeckObjects.get(i);
			case "Overlook":
				return overlookObjects.get(i);
			default:
				System.out.println("getTitleOfObjectInList() error");
				return null;
		}
	}
	
	public static boolean hasSign() {
		if (Player.getLocation().title.equals("Sand Exhibit") 
		|| Player.getLocation().title.equals("Landing")
		|| Player.getLocation().title.equals("Altar of Samantabhadra")
		|| Player.getLocation().title.equals("Butsudan of Kannon")
		|| Player.getLocation().title.equals("Gate")
		|| Player.getLocation().title.equals("Bottom of Mountain")
		|| Player.getLocation().title.equals("Halfway up Mountain")) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean hasDoor() {
		if (Player.getLocation().title.equals("Sand Exhibit") 
			|| Player.getLocation().title.equals("Avalokitesvara Shrine")
			|| Player.getLocation().title.equals("Altar of Samantabhadra")
			|| Player.getLocation().title.equals("Dark Passageway")
			|| Player.getLocation().title.equals("Courtyard")
			|| Player.getLocation().title.equals("Closet")
			|| Player.getLocation().title.equals("Hamlet")) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean hasSafe() {
		if (Player.getLocation().title.equals("Avalokitesvara Shrine") 
			|| Player.getLocation().title.equals("Lounge")
			|| Player.getLocation().title.equals("Study")) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean hasWindow() {
		if (Player.getLocation().title.equals("Cafe") 
			|| Player.getLocation().title.equals("Master Bedroom")
			|| Player.getLocation().title.equals("Hallway")
			|| Player.getLocation().title.equals("Living Room")
			|| Player.getLocation().title.equals("Hamlet")) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean hasHallway() {
		switch (Player.getLocation().title) {
			case "Hallway":
			case "Thatched Hut":
			case "Garden Overlook":
			case "Gallery":
			case "Courtyard":
			case "Sitting Room":
				return true;
			default:
				return false;
		}
	}
	
	public static boolean hasPanel() {
		switch (Player.getLocation().title) {
			case "Sand Exhibit":
			case "Avalokitesvara Shrine":
			case "Lounge":
			case "Study":
			case "Hallway":
			case "Courtyard":
			case "Altar of Samantabhadra":
			case "Hamlet":
			case "Creaky Deck":
				return true;
			default:
				if (getObjects().contains(Item.jewelledCase.getTitle()) || Player.inventory.contains(Item.jewelledCase.getTitle())) {
					return true;
				} else {
					return false;
				}
		}
	}
	
	public static void checkPreviousLocation() {
		if (Player.previousLocation.equals("")) {
			Story.print("You've just begun!");
		} else if (previousLocationIsValid()) {
			Action.goBack();
		} else {
			Story.print("You can't go back there.");
		}
	}
	
	public static void enterRoom() {
		switch (Player.getLocation().title) {
			case "Cobble Square":
			case "Sand Exhibit":
			case "Gallery":
			case "Altar of Samantabhadra":
			case "Sitting Room":
			case "Dark Passageway":
			case "Mannequin Room":
			case "Hisachi Ichiro's House":
			case "Hondo":
				Story.printMoreSpecific();
				break;
			case "Tea Room":
				Action.goEast();
				break;
			case "Garden Overlook":
				Action.goWest();
				break;
			case "Wabe":
				Action.goEast();
				break;
			case "Avalokitesvara Shrine":
				Action.goNorth();
				break;
			case "Assembly Room":
				Action.goNorth();
				break;
			case "Living Room":
				Action.goNorth();
				break;
			case "Pond":
				Action.goWest();
				break;
			case "Courtyard":
				Action.goEast();
				break;
			case "Hallway":
				Action.goSouth();
				break;
			case "Study":
				Action.goEast();
				break;
			case "Master Bedroom":
				Action.goWest();
				break;
			case "Theater":
				Action.goWest();
				break;
			case "Hamlet":
				Action.goWest();
				break;
			case "Butsudan of Kannon":
				Action.goSouth();
				break;
			case "Trinket Shop":
				Action.goSouthWest();
				break;
			default:
				Story.printNotHere();
				break;
		}
	}
	
	private static boolean previousLocationIsValid() {
		if (Player.previousLocation.equals("Hisachi Ichiro's House")
		|| (Player.previousLocation.equals("Wabe") && Player.getLocation().title.equals("Master Bedroom"))
		|| (Player.previousLocation.equals("Living Room") && Player.getLocation().title.equals("Forest"))
		|| (Player.previousLocation.equals("Overlook") && Player.getLocation().title.equals("Garden Patio"))
		|| (Player.previousLocation.equals("Altar of Samantabhadra") && Player.getLocation().title.equals("Dark Passageway") && !World.shrineRoom2DoorOpen)
		|| (Player.previousLocation.equals("Dark Passageway") && Player.getLocation().title.equals("Altar of Samantabhadra") && !World.shrineRoom2DoorOpen)
		|| (Player.previousLocation.equals("Closet") && Player.getLocation().title.equals("Courtyard") && !World.courtyardDoorOpen)
		|| (Player.previousLocation.equals("Courtyard") && Player.getLocation().title.equals("Closet") && !World.courtyardDoorOpen)
		|| (Player.previousLocation.equals("Avalokitesvara Shrine") && Player.getLocation().title.equals("Sand Exhibit") && !World.sandExhibitDoorOpen)
		|| (Player.previousLocation.equals("Sand Exhibit") && Player.getLocation().title.equals("Avalokitesvara Shrine") && !World.sandExhibitDoorOpen)) {
			return false;
		} else {
			return true;
		}
	}
	
	public static void noExit(String d) {
		switch (Player.getLocation().title) {
			case "Tea Room":
			case "Sand Exhibit":
			case "Thatched Hut":
			case "Lounge":
			case "Cafe":
			case "Avalokitesvara Shrine":
			case "Gallery":
			case "Assembly Room":
			case "Altar of Samantabhadra":
			case "Living Room":
			case "Courtyard":
			case "Landing":
			case "Hallway":
			case "Sitting Room":
			case "Study":
			case "Master Bedroom":
			case "Closet":
			case "Dark Passageway":
			case "Mannequin Room":
			case "Theater":
			case "Gate":
			case "Hondo":
			case "Butsudan of Kannon":
			case "Trinket Shop":
			case "Creaky Deck":
				Story.printWall();
				break;
			case "Garden Patio":
				Story.print("Part of you yearns to stroll through the sand, but you know better than to disturb the cherished landscape.");
				break;
			case "Garden Overlook":
				if (d.equals("NORTH")) {
					Story.printWall();
				} else {
					Story.print("Part of you yearns to stroll through the grass, but you know better than to disturb the cherished landscape.");
				}
				break;
			case "Wabe":
				if (d.equals("NORTH")) {
					Story.print("Part of you yearns to stroll through the grass, but you know better than to disturb the cherished landscape.");
				} else {
					Story.printWall();
				}
				break;
			case "Pond":
				Story.print("I doubt the koi fish would appreciate the company.");
				break;
			case "Forest":
			case "Bottom of Mountain":
			case "Halfway up Mountain":
			case "Top of Mountain":
				Story.printLost();
				break;
			case "Island":
				Story.print("You'd fall right into the frozen pond!");
				break;
			case "Hamlet":
				if (d.equals("NORTH")) {
					Story.printWall();
				} else if (d.equals("WEST")) {
					Story.printDoorBlocking();
				} else {
					Story.printLost();
				}
				break;
			case "Balcony":
				if (d.equals("EAST")) {
					Story.printWall();
				} else {
					Story.printRailing();
				}
				break;
			case "Overlook":
				if (d.equals("WEST")) {
					Story.print("The curtain of oragami birds blocks your path.");
				} else {
					Story.printRailing();
				}
				break;
			default:
				Story.printNoExit();
				break;
		}
	}
	
	public static int getScrollCount() {
		int totalScrolls = 0;
		ArrayList<String> items = getObjects();
		
		for (String item : items) {
			if (Item.isScroll(item))
				totalScrolls++;
		}
		
		totalScrolls += Player.getInventoryScrollCount();
		
		if ((World.caseOpen && World.yuInCase) && (getObjects().contains(Item.JewelledCase.getTitle()) || Player.inventory.contains(Item.JewelledCase.getTitle())))
			totalScrolls++;
		
		return totalScrolls;
	}
	
	public static Room getRoomFromTitle(String t) {
		switch (t) {
			case "Garden Patio":
				return gardenPatio;
			case "Cobble Square":
				return cobbleSquare;
			case "Tea Room":
				return teaRoom;
			case "Sand Exhibit":
				return sandExhibit;
			case "Thatched Hut":
				return thatchedHut;
			case "Garden Overlook":
				return gardenOverlook;
			case "Lounge":
				return lounge;
			case "Cafe":
				return cafe;
			case "Wabe":
				return wabe;
			case "Avalokitesvara Shrine":
				return shrineRoom1;
			case "Gallery":
				return gallery;
			case "Assembly Room":
				return assemblyRoom;
			case "Altar of Samantabhadra":
				return shrineRoom2;
			case "Living Room":
				return livingRoom;
			case "Pond":
				return pond;
			case "Courtyard":
				return courtyard;
			case "Landing":
				return landing;
			case "Hallway":
				return hallway;
			case "Sitting Room":
				return sittingRoom;
			case "Study":
				return study;
			case "Master Bedroom":
				return masterBedroom;
			case "Closet":
				return closet;
			case "Dark Passageway":
				return darkPassageway;
			case "Mannequin Room":
				return mannequinRoom;
			case "Theater":
				return theater;
			case "Forest":
				return forest;
			case "Gate":
				return gate;
			case "Island":
				return island;
			case "Bottom of Mountain":
				return bottomOfMountain;
			case "Halfway up Mountain":
				return halfwayUpMountain;
			case "Top of Mountain":
				return topOfMountain;
			case "Hamlet":
				return hamlet;
			case "Hisachi Ichiro's House":
				return hisachiIchirosHouse;
			case "Hondo":
				return hondo;
			case "Balcony":
				return balcony;
			case "Butsudan of Kannon":
				return shrineRoom3;
			case "Trinket Shop":
				return trinketShop;
			case "Creaky Deck":
				return creakyDeck;
			case "Overlook":
				return overlook;
			default:
				System.out.println("Player.getArea() error");
				return null;
		}
	}
	
	public static void wipeRooms() {
		gardenPatioObjects.clear();
		cobbleSquareObjects.clear();
		teaRoomObjects.clear(); 
		sandExhibitObjects.clear(); 
		thatchedHutObjects.clear(); 
		gardenOverlookObjects.clear(); 
		loungeObjects.clear(); 
		cafeObjects.clear(); 
		wabeObjects.clear(); 
		shrineRoom1Objects.clear(); 
		galleryObjects.clear(); 
		assemblyRoomObjects.clear(); 
		shrineRoom2Objects.clear(); 
		livingRoomObjects.clear(); 
		pondObjects.clear(); 
		courtyardObjects.clear(); 
		landingObjects.clear(); 
		hallwayObjects.clear(); 
		sittingRoomObjects.clear(); 
		studyObjects.clear(); 
		masterBedroomObjects.clear(); 
		closetObjects.clear(); 
		darkPassagewayObjects.clear();
		mannequinRoomObjects.clear(); 
		theaterObjects.clear(); 
		forestObjects.clear();
		gateObjects.clear(); 
		islandObjects.clear(); 
		bottomOfMountainObjects.clear(); 
		halfwayUpMountainObjects.clear(); 
		topOfMountainObjects.clear(); 
		hamletObjects.clear(); 
		hisachiIchirosHouseObjects.clear(); 
		hondoObjects.clear(); 
		balconyObjects.clear(); 
		shrineRoom3Objects.clear();
		trinketShopObjects.clear(); 
		creakyDeckObjects.clear(); 
		overlookObjects.clear();
	}
	
	public static void placeItem(String item, String room) {
		if (!room.equals("null")) {
			roomTitleToRoomObjects(room).add(item);
		}
	}
	
	public static ArrayList roomTitleToRoomObjects(String s) {
		switch (s) {
			case "Garden Patio":
				return gardenPatioObjects;
			case "Cobble Square":
				return cobbleSquareObjects;
			case "Tea Room":
				return teaRoomObjects;
			case "Sand Exhibit":
				return sandExhibitObjects;
			case "Thatched Hut":
				return thatchedHutObjects;
			case "Garden Overlook":
				return gardenOverlookObjects;
			case "Lounge":
				return loungeObjects;
			case "Cafe":
				return cafeObjects;
			case "Wabe":
				return wabeObjects;
			case "Avalokitesvara Shrine":
				return shrineRoom1Objects;
			case "Gallery":
				return galleryObjects;
			case "Assembly Room":
				return assemblyRoomObjects;
			case "Altar of Samantabhadra":
				return shrineRoom2Objects;
			case "Living Room":
				return livingRoomObjects;
			case "Pond":
				return pondObjects;
			case "Courtyard":
				return courtyardObjects;
			case "Landing":
				return landingObjects;
			case "Hallway":
				return hallwayObjects;
			case "Sitting Room":
				return sittingRoomObjects;
			case "Study":
				return studyObjects;
			case "Master Bedroom":
				return masterBedroomObjects;
			case "Closet":
				return closetObjects;
			case "Dark Passageway":
				return darkPassagewayObjects;
			case "Mannequin Room":
				return mannequinRoomObjects;
			case "Theater":
				return theaterObjects;
			case "Forest":
				return forestObjects;
			case "Gate":
				return gateObjects;
			case "Island":
				return islandObjects;
			case "Bottom of Mountain":
				return bottomOfMountainObjects;
			case "Halfway up Mountain":
				return halfwayUpMountainObjects;
			case "Top of Mountain":
				return topOfMountainObjects;
			case "Hamlet":
				return hamletObjects;
			case "Hisachi Ichiro's House":
				return hisachiIchirosHouseObjects;
			case "Hondo":
				return hondoObjects;
			case "Balcony":
				return balconyObjects;
			case "Butsudan of Kannon":
				return shrineRoom3Objects;
			case "Trinket Shop":
				return trinketShopObjects;
			case "Creaky Deck":
				return creakyDeckObjects;
			case "Overlook":
				return overlookObjects;
			default:
				System.out.println("Room.roomTitleToRoomObjects() error");
				return null;
		}
	}
}