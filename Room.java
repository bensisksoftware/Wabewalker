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
	public static ArrayList<String> outsideGalleryExits = new ArrayList<String>(); 
	public static ArrayList<String> shrineRoom1Exits = new ArrayList<String>(); 
	public static ArrayList<String> insideGalleryExits = new ArrayList<String>(); 
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
	public static ArrayList<String> outsideGateExits = new ArrayList<String>();
	public static ArrayList<String> insideGateExits = new ArrayList<String>(); 
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
	
	public static ArrayList<Item> gardenPatioObjects = new ArrayList<Item>();
	public static ArrayList<Item> cobbleSquareObjects = new ArrayList<Item>();
	public static ArrayList<Item> teaRoomObjects = new ArrayList<Item>(); 
	public static ArrayList<Item> sandExhibitObjects = new ArrayList<Item>(); 
	public static ArrayList<Item> thatchedHutObjects = new ArrayList<Item>(); 
	public static ArrayList<Item> gardenOverlookObjects = new ArrayList<Item>(); 
	public static ArrayList<Item> loungeObjects = new ArrayList<Item>(); 
	public static ArrayList<Item> cafeObjects = new ArrayList<Item>(); 
	public static ArrayList<Item> outsideGalleryObjects = new ArrayList<Item>(); 
	public static ArrayList<Item> shrineRoom1Objects = new ArrayList<Item>(); 
	public static ArrayList<Item> insideGalleryObjects = new ArrayList<Item>(); 
	public static ArrayList<Item> assemblyRoomObjects = new ArrayList<Item>(); 
	public static ArrayList<Item> shrineRoom2Objects = new ArrayList<Item>(); 
	public static ArrayList<Item> livingRoomObjects = new ArrayList<Item>(); 
	public static ArrayList<Item> pondObjects = new ArrayList<Item>(); 
	public static ArrayList<Item> courtyardObjects = new ArrayList<Item>(); 
	public static ArrayList<Item> landingObjects = new ArrayList<Item>(); 
	public static ArrayList<Item> hallwayObjects = new ArrayList<Item>(); 
	public static ArrayList<Item> sittingRoomObjects = new ArrayList<Item>(); 
	public static ArrayList<Item> studyObjects = new ArrayList<Item>(); 
	public static ArrayList<Item> masterBedroomObjects = new ArrayList<Item>(); 
	public static ArrayList<Item> closetObjects = new ArrayList<Item>(); 
	public static ArrayList<Item> darkPassagewayObjects = new ArrayList<Item>();
	public static ArrayList<Item> mannequinRoomObjects = new ArrayList<Item>(); 
	public static ArrayList<Item> theaterObjects = new ArrayList<Item>(); 
	public static ArrayList<Item> outsideGateObjects = new ArrayList<Item>();
	public static ArrayList<Item> insideGateObjects = new ArrayList<Item>(); 
	public static ArrayList<Item> islandObjects = new ArrayList<Item>(); 
	public static ArrayList<Item> bottomOfMountainObjects = new ArrayList<Item>(); 
	public static ArrayList<Item> halfwayUpMountainObjects = new ArrayList<Item>(); 
	public static ArrayList<Item> topOfMountainObjects = new ArrayList<Item>(); 
	public static ArrayList<Item> hamletObjects = new ArrayList<Item>(); 
	public static ArrayList<Item> todsHouseObjects = new ArrayList<Item>(); 
	public static ArrayList<Item> hondoObjects = new ArrayList<Item>(); 
	public static ArrayList<Item> balconyObjects = new ArrayList<Item>(); 
	public static ArrayList<Item> shrineRoom3Objects = new ArrayList<Item>();
	public static ArrayList<Item> trinketShopObjects = new ArrayList<Item>(); 
	public static ArrayList<Item> creakyDeckObjects = new ArrayList<Item>(); 
	public static ArrayList<Item> overlookObjects = new ArrayList<Item>();
	
	public static ArrayList<Room> roomsWithPlaques = new ArrayList<Room>(); 
	
	public static String intro = "You wake up in the Adachi Museum of Art.\n\nThis is the introduction.\n\nBUNRAKU\n\nCopyright (C) 2021 by Benjamin, Inc. All rights reserved.\n\nBUNRAKU is a trademark of Benjamin, Inc.\n\nRelease 1\n\n";
	public static String gardenPatioDesc = "The celebrated White Gravel and Pine Tree Garden of the Adachi Museum expands before you. Part of you yearns to stroll through the sand, but you know better than to disturb the cherished landscape. To the south is the Adachi Museum of Art.";
	private static String cobbleSquareDesc = "Your sandles clack on the cobblestone tiles. The garden expands to the north. There are rooms to the east and west of you. To the south is a hut.";
	public static String teaRoomDesc = "You are standing in a room designed for drinking tea. There is an exit to the east.";
	public static String sandExhibitDesc = "This room displays a sand exhibit. To the south lies a door. Mounted on the door is a plaque. Beside the door is a sign.";
	public static String thatchedHutDesc = "You are in a thatched hut. There is a Chippendale mirror standing here. To the southeast is a lovely hallway. The cobble square is to the north.";
	public static String gardenOverlookDesc = "The White Gravel and Pine Tree Garden of the Adachi Museum expands to the south. Part of you yearns to stroll through the sand, but you know better than to disturb the cherished landscape. To the west is a small room. To the east is a path bordered with bamboo trees. The thatched hut is to the northwest.";
	public static String loungeDesc = "A red sofa lines the west wall. Above it, built into the wall, is an iron safe. On the safe is a metal plaque. There is an exit to the east.";
	public static String cafeDesc = "The cafe nestled in a sunny corner of the outdoor complex. To the south, behind one of the museum's large glass windows, stands a masked woman dressed in a blue kimono. Her stare at you is unwavering. From here, there are paths to the west and to the north.";
	public static String outsideGalleryDesc = "The entrance to the gallery is here to the east. The cafe is to the south.";
	public static String shrineRoom1Desc = "Beautiful shrine. There's a TV here. There's a safe with a plaque here.";
	public static String insideGalleryDesc = "This gallery is decorated with dozens of contemporary Japanese paintings, most of which seem to embody the spirit of springtime. There is a hallway leading south. An exit is west of here.";
	public static String assemblyRoomDesc = "Three hooded figures stand behind a gold chest. There is an exit to the north.";
	public static String shrineRoom2Desc = "Recessed in the north wall of this quiet room is a beautifully gilded altar. Above it hangs a wooden carving. There is a door on the west wall, and beside it, a plaque. You see a living room to the south.";
	public static String livingRoomDesc = "A masked woman in a blue kimono is standing outside the west window. You see a gold altar in the room north of here. To the east, a gentle breeze flows in, and you see a deck area.";
	public static String pondDesc = "You're standing on a wooden deck that stands over the west side of a small pond. The soft trickling of water and the occasional splashing of koi fish offers a feeling of serenity. Walkways lead off to the north and west.";
	public static String courtyardDesc = "Rays of sunshine fill this lush courtyard. A small wooden door is seen to the east, and on the wall beside it, a plaque. To the northeast you see a winding stone staircase leading up into the house. A hallway extends south.";
	public static String landingDesc = "You're halfway up the steep, winding staircase, which ascends to the southeast and descends to the southwest.";
	public static String hallwayDesc = "This hallway extends from the south to the northwest, where it descends into a staircase. Built into the west wall is what appears to be an old laundry chute, only somebody has installed a glass pane across the opening. Beside the chute is a lever, and beside that, a plaque.";
	public static String sittingRoomDesc = "This is a quaint sitting area with rooms to the east and west, as well as a hallway to the north.";
	public static String studyDesc = "You are in a small study with an exit to the east. There is a Chippendale mirror standing here. Built into the wall is an iron safe. On the safe is a metal plaque.";
	public static String masterBedroomDesc = "You are in the master bedroom, furnished with a four-poster bed, and across from it, a television set. A window overlooks the outside, and a doorway leads to the west.";
	public static String closetDesc = "You are in a small closet. There is a medium-sized hole in the ceiling above.";
	public static String darkPassagewayDesc = "You are in a dark passageway, with paths leading north and east. On the south wall, a beam of light is shining through a small hole.";
	public static String mannequinRoomDesc = "This is a dark room. Assembled in various positions are a dozen mannequins that crowd the room. There are passageways to the east and south.";
	public static String theaterDesc = "This room looks like someone attempted to convert it into a home theater, but had abandoned the project halfway through. There is various junk covered in cobwebs scattered about. Nestled in the corner is an old television set. There is a passageway to the west.";
	public static String outsideGateDesc = "A huge, snowy mountain looms before you. You see a path through the gate to the north.";
	public static String insideGateDesc = "The path up the mountain leads north. Beside the path is a stone monument with an inscription carved into it. To the east is a bridge extending over a frozen pond. In the middle of the pond is a small man-made island. There is also a path leading south.";
	public static String islandDesc = "There is a thing here with a gate. Through the gate you see a TV. The bridge extends west over the frozen pond.";
	public static String bottomOfMountainDesc = "You are at the bottom of a large stair. Stone carving here. To the north, you can just make out a temple. There is a path to the south.";
	public static String halfwayUpMountainDesc = "You are halfway up the snowy mountain. There is a wooden sign here. Paths leading north and south.";
	public static String topOfMountainDesc = "You are at the top of mountain path. To the north is a large temple. To the west you can see residents' quarters.";
	public static String hamletDesc = "There is a house here. In the front, is a wooden post with a plaque on it. There is a path to the east.";
	public static String todsHouseDesc = "You are sitting on a cushion in a warm house. There's a cup of hot tea on a table in front of you. Hisachi Ichiro sits on the opposite side.";
	public static String hondoDesc = "This is the main area of the temple. Basin here. To the northeast you see a balcony. To the north you can see a magnificent golden shrine. A trinket shop is to the northwest.";
	public static String balconyDesc = "The balcony extends along the edge of the temple. The deck continues to the north and southeast.";
	public static String shrineRoom3Desc = "This is a magnificent golden shrine. Banner above. There is an exit to the south.";
	public static String trinketShopDesc = "There is an exit to the southwest.";
	public static String creakyDeckDesc = "The deck creaks beneath your feet. There is a wooden box here with a button and a plaque. There are walkways to the west and south.";
	public static String overlookDesc = "There is a mirror here, and hanging oragami cranes. There is a way to the east.";
	
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
	public static Room outsideGallery = new Room("Outside Gallery", outsideGalleryDesc); 
	public static Room shrineRoom1 = new Room("Shrine Room 1", shrineRoom1Desc); 
	public static Room insideGallery = new Room("Inside Gallery", insideGalleryDesc); 
	public static Room assemblyRoom = new Room("Assembly Room", assemblyRoomDesc); 
	public static Room shrineRoom2 = new Room("Shrine Room 2", shrineRoom2Desc); 
	public static Room livingRoom = new Room("Living Room", livingRoomDesc); 
	public static Room pond = new Room("Pond", pondDesc); 
	public static Room courtyard = new Room("Courtyard", courtyardDesc); 
	public static Room landing = new Room("Landing", landingDesc); 
	public static Room hallway = new Room("Hallway", hallwayDesc); 
	public static Room sittingRoom = new Room("Sitting Room", sittingRoomDesc); 
	public static Room study = new Room("Study", studyDesc); 
	public static Room masterBedroom = new Room("Master Bedroom", masterBedroomDesc); 
	public static Room closet = new Room("Closet", closetDesc); 
	public static Room darkPassageway = new Room("Dark Passageway", darkPassagewayDesc);
	public static Room mannequinRoom = new Room("Mannequin Room", mannequinRoomDesc); 
	public static Room theater = new Room("Theater", theaterDesc); 
	public static Room outsideGate = new Room("Outside Gate", outsideGateDesc);
	public static Room insideGate = new Room("Inside Gate", insideGateDesc); 
	public static Room island = new Room("Island", islandDesc); 
	public static Room bottomOfMountain = new Room("Bottom of Mountain", bottomOfMountainDesc); 
	public static Room halfwayUpMountain = new Room("Halfway Up Mountain", halfwayUpMountainDesc); 
	public static Room topOfMountain = new Room("Top of Mountain", topOfMountainDesc); 
	public static Room hamlet = new Room("Hamlet", hamletDesc); 
	public static Room todsHouse = new Room("Hisachi Ichiro's House", todsHouseDesc); 
	public static Room hondo = new Room("Hondo", hondoDesc); 
	public static Room balcony = new Room("Balcony", balconyDesc); 
	public static Room shrineRoom3 = new Room("Shrine Room 3", shrineRoom3Desc);
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
		rooms.add(outsideGallery); 
		rooms.add(shrineRoom1); 
		rooms.add(insideGallery); 
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
		rooms.add(outsideGate);
		rooms.add(insideGate); 
		rooms.add(island); 
		rooms.add(bottomOfMountain); 
		rooms.add(halfwayUpMountain); 
		rooms.add(topOfMountain); 
		rooms.add(hamlet); 
		rooms.add(todsHouse); 
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
		outsideGalleryExits.add("E"); 
		outsideGalleryExits.add("S"); 
		shrineRoom1Exits.add("N"); 
		insideGalleryExits.add("W"); 
		insideGalleryExits.add("S"); 
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
		outsideGateExits.add("N");
		insideGateExits.add("N"); 
		insideGateExits.add("E"); 
		insideGateExits.add("S"); 
		islandExits.add("W"); 
		bottomOfMountainExits.add("N"); 
		bottomOfMountainExits.add("S"); 
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
		teaRoomObjects.add(Item.book); 
	}
	
	public static void setHouseObjects() {
		landingObjects.add(Item.rod); 
		sittingRoomObjects.add(Item.phone); 
		studyObjects.add(Item.cryptogram); 
		closetObjects.add(Item.corn); 
	}
	
	public static void setTempleObjects() {
		balconyObjects.add(Item.card); 
		trinketShopObjects.add(Item.box); 
	}
	
	public static void setRoomsWithPlaques() {
		roomsWithPlaques.add(sandExhibit);
		roomsWithPlaques.add(lounge);
		roomsWithPlaques.add(shrineRoom1);
		roomsWithPlaques.add(assemblyRoom);
		roomsWithPlaques.add(shrineRoom2);
		roomsWithPlaques.add(courtyard);
		roomsWithPlaques.add(hallway);
		roomsWithPlaques.add(study);
		roomsWithPlaques.add(hamlet);
		roomsWithPlaques.add(creakyDeck);
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
			case "Outside Gallery":
				return outsideGalleryExits;
			case "Shrine Room 1":
				return shrineRoom1Exits;
			case "Inside Gallery":
				return insideGalleryExits;
			case "Assembly Room":
				return assemblyRoomExits;
			case "Shrine Room 2":
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
			case "Outside Gate":
				return outsideGateExits;
			case "Inside Gate":
				return insideGateExits;
			case "Island":
				return islandExits;
			case "Bottom of Mountain":
				return bottomOfMountainExits;
			case "Top of Mountain":
				return topOfMountainExits;
			case "Hamlet":
				return hamletExits;
			case "Hondo":
				return hondoExits;
			case "Balcony":
				return balconyExits;
			case "Shrine Room 3":
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
			case "Outside Gallery":
				return outsideGalleryObjects;
			case "Shrine Room 1":
				return shrineRoom1Objects;
			case "Inside Gallery":
				return insideGalleryObjects;
			case "Assembly Room":
				return assemblyRoomObjects;
			case "Shrine Room 2":
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
			case "Outside Gate":
				return outsideGateObjects;
			case "Inside Gate":
				return insideGateObjects;
			case "Island":
				return islandObjects;
			case "Bottom of Mountain":
				return bottomOfMountainObjects;
			case "Top of Mountain":
				return topOfMountainObjects;
			case "Hamlet":
				return hamletObjects;
			case "Hisachi Ichiro's House":
				return todsHouseObjects;
			case "Hondo":
				return hondoObjects;
			case "Balcony":
				return balconyObjects;
			case "Shrine Room 3":
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
	
	public static void addScroll() {
		location.get(0).scrollCount++;
	}
	
	public static void removeScroll() {
		location.get(0).scrollCount--;
	}
	
	public static boolean hasSign() {
		if (Player.getLocation().title.equals("Sand Exhibit") || Player.getLocation().title.equals("Top of Mountain")) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean hasDoor() {
		if (Player.getLocation().title.equals("Sand Exhibit") 
			|| Player.getLocation().title.equals("Shrine Room 1")
			|| Player.getLocation().title.equals("Shrine Room 2")
			|| Player.getLocation().title.equals("Dark Passageway")
			|| Player.getLocation().title.equals("Courtyard")
			|| Player.getLocation().title.equals("Closet")) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean hasSafe() {
		if (Player.getLocation().title.equals("Shrine Room 1") 
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
			|| Player.getLocation().title.equals("Living Room")) {
			return true;
		} else {
			return false;
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
	
	private static boolean previousLocationIsValid() {
		if (Player.previousLocation.equals("Hisachi Ichiro's House")
		|| (Player.previousLocation.equals("Outside Gallery") && Player.getLocation().title.equals("Master Bedroom"))
		|| (Player.previousLocation.equals("Living Room") && Player.getLocation().title.equals("Outside Gate"))
		|| (Player.previousLocation.equals("Overlook") && Player.getLocation().title.equals("Garden Patio"))
		|| (Player.previousLocation.equals("Shrine Room 2") && Player.getLocation().title.equals("Dark Passageway") && !World.shrineRoom2DoorOpen)
		|| (Player.previousLocation.equals("Dark Passageway") && Player.getLocation().title.equals("Shrine Room 2") && !World.shrineRoom2DoorOpen)
		|| (Player.previousLocation.equals("Closet") && Player.getLocation().title.equals("Courtyard") && !World.courtyardDoorOpen)
		|| (Player.previousLocation.equals("Courtyard") && Player.getLocation().title.equals("Closet") && !World.courtyardDoorOpen)
		|| (Player.previousLocation.equals("Shrine Room 1") && Player.getLocation().title.equals("Sand Exhibit") && !World.sandExhibitDoorOpen)
		|| (Player.previousLocation.equals("Sand Exhibit") && Player.getLocation().title.equals("Shrine Room 1") && !World.sandExhibitDoorOpen)) {
			return false;
		} else {
			return true;
		}
	}
}