import java.util.ArrayList;

public interface Item {
	Om om = new Om();
	Ni ni = new Ni();
	Go go = new Go();
	Yu yu = new Yu();
	Ji ji = new Ji();
	Ra ra = new Ra();
	Shi shi = new Shi();
	Book book = new Book();
	Cryptogram cryptogram = new Cryptogram();
	Rod rod = new Rod();
	Corn corn = new Corn();
	Parchment parchment = new Parchment();
	Card card = new Card();
	Phone phone = new Phone();
	JewelledCase jewelledCase = new JewelledCase();
	Sword sword = new Sword();
	Scroll scroll = new Scroll();
	Mirror mirror = new Mirror();
	Panel panel = new Panel();
	Woman woman = new Woman();
	Sign sign = new Sign();
	Basin basin = new Basin();
	Samue samue = new Samue();
	Pond pond = new Pond();
	Fish fish = new Fish();
	Bridge bridge = new Bridge();
	TV tv = new TV();
	Door door = new Door();
	Safe safe = new Safe();
	Gate gate = new Gate();
	Box box = new Box();
	Compartment compartment = new Compartment();
	Birds birds = new Birds();
	Memory memory = new Memory();
	Shrine shrine = new Shrine();
	Tassel tassel = new Tassel();
	Tea tea = new Tea();
	Tree tree = new Tree();
	Chest chest = new Chest();
	Figure figure = new Figure();
	Button button = new Button();
	Hole hole = new Hole();
	Window window = new Window();
	Chute chute = new Chute();
	Sofa sofa = new Sofa();
	Exhibit exhibit = new Exhibit();
	Lever lever = new Lever();
	Bed bed = new Bed();
	Mannequin mannequin = new Mannequin();
	Lattice lattice = new Lattice();
	Snow snow = new Snow();
	Sandals sandals = new Sandals();
	House house = new House();
	Roof roof = new Roof();
	Deck deck = new Deck();
	Hisachi hisachi = new Hisachi();
	Painting painting = new Painting();
	Hallway hallway = new Hallway();
	Blood blood = new Blood();
	Cloak cloak = new Cloak();
	Picture picture = new Picture();
	Wall wall = new Wall();
	Mask mask = new Mask();
	Museum museum = new Museum();
	Hut hut = new Hut();
	Junk junk = new Junk();
	Path path = new Path();
	Stairs stairs = new Stairs();
	Stone stone = new Stone();
	Temple temple = new Temple();
	Shop shop = new Shop();
	Mountain mountain = new Mountain();
	
	public void examine();
	
	public void take();
	
	public static boolean isScroll(String i) {
		if (i.equals(Om.getTitle()) 
		|| i.equals(Ni.getTitle())
		|| i.equals(Go.getTitle())
		|| i.equals(Yu.getTitle())
		|| i.equals(Ji.getTitle())
		|| i.equals(Ra.getTitle())
		|| i.equals(Shi.getTitle())) {
			return true;
		} else {
			return false;
		}
	}
	
	public static String getLocation(String i) {
		if (Room.gardenPatioObjects.contains(i)) {
			return Room.gardenPatio.title;
		} else if (Room.cobbleSquareObjects.contains(i)) {
			return Room.cobbleSquare.title;
		} else if (Room.teaRoomObjects.contains(i)) {
			return Room.teaRoom.title; 
		} else if (Room.sandExhibitObjects.contains(i)) {
			return Room.sandExhibit.title; 
		} else if (Room.thatchedHutObjects.contains(i)) {
			return Room.thatchedHut.title; 
		} else if (Room.gardenOverlookObjects.contains(i)) {
			return Room.gardenOverlook.title; 
		} else if (Room.loungeObjects.contains(i)) {
			return Room.lounge.title; 
		} else if (Room.cafeObjects.contains(i)) {
			return Room.cafe.title; 
		} else if (Room.wabeObjects.contains(i)) {
			return Room.wabe.title; 
		} else if (Room.shrineRoom1Objects.contains(i)) {
			return Room.shrineRoom1.title; 
		} else if (Room.galleryObjects.contains(i)) {
			return Room.gallery.title; 
		} else if (Room.assemblyRoomObjects.contains(i)) {
			return Room.assemblyRoom.title; 
		} else if (Room.shrineRoom2Objects.contains(i)) {
			return Room.shrineRoom2.title; 
		} else if (Room.livingRoomObjects.contains(i)) {
			return Room.livingRoom.title; 
		} else if (Room.pondObjects.contains(i)) {
			return Room.pond.title; 
		} else if (Room.courtyardObjects.contains(i)) {
			return Room.courtyard.title; 
		} else if (Room.landingObjects.contains(i)) {
			return Room.landing.title; 
		} else if (Room.hallwayObjects.contains(i)) {
			return Room.hallway.title; 
		} else if (Room.sittingRoomObjects.contains(i)) {
			return Room.sittingRoom.title; 
		} else if (Room.studyObjects.contains(i)) {
			return Room.study.title; 
		} else if (Room.masterBedroomObjects.contains(i)) {
			return Room.masterBedroom.title; 
		} else if (Room.closetObjects.contains(i)) {
			return Room.closet.title; 
		} else if (Room.darkPassagewayObjects.contains(i)) {
			return Room.darkPassageway.title;
		} else if (Room.mannequinRoomObjects.contains(i)) {
			return Room.mannequinRoom.title; 
		} else if (Room.theaterObjects.contains(i)) {
			return Room.theater.title; 
		} else if (Room.forestObjects.contains(i)) {
			return Room.forest.title;
		} else if (Room.gateObjects.contains(i)) {
			return Room.gate.title; 
		} else if (Room.islandObjects.contains(i)) {
			return Room.island.title; 
		} else if (Room.bottomOfMountainObjects.contains(i)) {
			return Room.bottomOfMountain.title; 
		} else if (Room.halfwayUpMountainObjects.contains(i)) {
			return Room.halfwayUpMountain.title; 
		} else if (Room.topOfMountainObjects.contains(i)) {
			return Room.topOfMountain.title; 
		} else if (Room.hamletObjects.contains(i)) {
			return Room.hamlet.title; 
		} else if (Room.hisachiIchirosHouseObjects.contains(i)) {
			return Room.hisachiIchirosHouse.title; 
		} else if (Room.hondoObjects.contains(i)) {
			return Room.hondo.title; 
		} else if (Room.balconyObjects.contains(i)) {
			return Room.balcony.title; 
		} else if (Room.shrineRoom3Objects.contains(i)) {
			return Room.shrineRoom3.title;
		} else if (Room.trinketShopObjects.contains(i)) {
			return Room.trinketShop.title; 
		} else if (Room.creakyDeckObjects.contains(i)) {
			return Room.creakyDeck.title; 
		} else if (Room.overlookObjects.contains(i)) {
			return Room.overlook.title;
		} else {
			return "null";
		}
	}
	
	public class Om implements Item {
		private static String title = "faded scroll"; 
		private static String desc = "Inscribed on the faded scroll is the sacred word \"Om.\" The sacred word is commited to memory and available to chant while meditating! Near the bottom, someone drew a picture of a human eye."; 
		
		public void examine() {
			if (Room.getObjects().contains(title) || Player.inventory.contains(title) || (Player.getLocation().title.equals("Lounge") && World.loungeSafeOpen && World.omInSafe)) {
				Story.print(desc);
				
				if (!Player.memory.contains("om")) {
					Player.memory.add("om");
					Data.updateScore(10);
				}
			} else {
				Story.printNotHere();
			}
		}
		
		public void take(){
			if (Room.getObjects().contains(title) || (Player.getLocation().title.equals("Lounge") && World.loungeSafeOpen && World.omInSafe)) {
				Story.printTake(title);
				Player.inventory.add(title);
				Room.getObjects().remove(title);
				
				if (World.omInSafe) {
					World.omInSafe = false;
				} else {
					
				}
			} else if (Player.inventory.contains(title)) {
				Story.printAlreadyHave();
			} else {
				Story.printNotHere();
			}
		}
		
		public static String getTitle() {
			return title;
		}
	}
	
	public class Ni implements Item {
		private static String title = "fancy scroll"; 
		private static String desc = "Inscribed on the fancy scroll is the sacred word \"Ni.\" The sacred word is commited to memory and available to chant while meditating! Near the bottom, someone drew a picture of a human mouth."; 
	
		public void examine() {
			if (Room.getObjects().contains(title) || Player.inventory.contains(title) || (Player.getLocation().title.equals("Study") && World.studySafeOpen && World.niInSafe)) {
				Story.print(desc);
			
				if (!Player.memory.contains("ni")) {
					Player.memory.add("ni");
					Data.updateScore(10);
				}
			} else {
				Story.printNotHere();
			}
		}
		
		public void take(){
			if (Room.getObjects().contains(title) || (Player.getLocation().title.equals("Study") && World.studySafeOpen && World.niInSafe)) {
				Story.printTake(title);
				Player.inventory.add(title);
				Room.getObjects().remove(title);
				
				if (World.niInSafe) {
					World.niInSafe = false;
				} else {
					
				}
			} else if (Player.inventory.contains(title)) {
				Story.printAlreadyHave();
			} else {
				Story.printNotHere();
			}
		}
		
		public static String getTitle() {
			return title;
		}
	}
	
	public class Go implements Item {
		private static String title = "frosty scroll"; 
		private static String desc = "Inscribed on the frosty scroll is the sacred word \"Go.\" The sacred word is commited to memory and available to chant while meditating! Near the bottom, someone drew a picture of a human ear."; 
		
		public void examine() {
			if (Room.getObjects().contains(title) || Player.inventory.contains(title) || (Player.getLocation().title.equals("Creaky Deck") && World.creakyDeckOpen && World.goInBox)) {
				Story.print(desc);
			
				if (!Player.memory.contains("go")) {
					Player.memory.add("go");
					Data.updateScore(10);
				}
			} else {
				Story.printNotHere();
			}
		}
		
		public void take(){
			if (Room.getObjects().contains(title) || (Player.getLocation().title.equals("Creaky Deck") && World.creakyDeckOpen && World.goInBox)) {
				Story.printTake(title);
				Player.inventory.add(title);
				Room.getObjects().remove(title);
			
				if (World.goInBox) {
					World.goInBox = false;
				} else {
					
				}
			} else if (Player.inventory.contains(title)) {
				Story.printAlreadyHave();
			} else {
				Story.printNotHere();
			}
		}
		
		public static String getTitle() {
			return title;
		}
	}
	
	public class Yu implements Item {
		private static String title = "crumpled scroll"; 
		private static String desc = "Inscribed on the crumpled scroll is the sacred word \"Yu.\" The sacred word is commited to memory and available to chant while meditating! Near the bottom, someone drew a picture of a human heart."; 
	
		public void examine() {
			if (Room.getObjects().contains(title) || Player.inventory.contains(title) || (World.yuInCase && World.caseOpen && (Player.inventory.contains(JewelledCase.getTitle()) || Room.getObjects().contains(JewelledCase.getTitle())))){
				Story.print(desc);
			
				if (!Player.memory.contains("yu")) {
					Player.memory.add("yu");
					Data.updateScore(10);
				}
			} else{
				Story.printNotHere();
			}
		}
		
		public void take(){
			if (Room.getObjects().contains(title) || (World.yuInCase && World.caseOpen && (Player.inventory.contains(Item.JewelledCase.getTitle()) || Room.getObjects().contains(JewelledCase.getTitle())))){
				Story.printTake(title);
				Player.inventory.add(title);
				Room.getObjects().remove(title);
				World.yuInCase = false;
			} else if (Player.inventory.contains(title)) {
				Story.printAlreadyHave();
			} else{
				Story.printNotHere();
			}
		}
		
		public static String getTitle() {
			return title;
		}
	}
	
	public class Ji implements Item {
		private static String title = "smooth scroll"; 
		private static String desc = "Inscribed on the smooth scroll is the sacred word \"Ji.\" The sacred word is commited to memory and available to chant while meditating! Near the bottom, someone drew a picture of a human foot."; 
	
		public void examine() {
			if (Room.getObjects().contains(title) || Player.inventory.contains(title) || (World.jiInSafe && World.shrineRoom1SafeOpen && Player.getLocation().title.equals("Avalokitesvara Shrine"))) {
				Story.print(desc);
			
				if (!Player.memory.contains("ji")) {
					Player.memory.add("ji");
					Data.updateScore(10);
				}
			} else {
				Story.printNotHere();
			}
		}
		
		public void take(){
			if (Room.getObjects().contains(title) || (World.jiInSafe && World.shrineRoom1SafeOpen && Player.getLocation().title.equals("Avalokitesvara Shrine"))) {
				Story.printTake(title);
				Player.inventory.add(title);
				Room.getObjects().remove(title);
				World.jiInSafe = false;
			} else if (Player.inventory.contains(title)) {
				Story.printAlreadyHave();
			} else {
				Story.printNotHere();
			}
		}
		
		public static String getTitle() {
			return title;
		}
	}
	
	public class Ra implements Item {
		private static String title = "dusty scroll"; 
		private static String desc = "Inscribed on the dusty scroll is the sacred word \"Ra.\" The sacred word is commited to memory and available to chant while meditating! Near the bottom, someone drew a picture of a human hand."; 
	
		public void examine() {
			if (Room.getObjects().contains(title) || Player.inventory.contains(title)) {
				Story.print(desc);
			
				if (!Player.memory.contains("ra")) {
					Player.memory.add("ra");
					Data.updateScore(10);
				}
			} else {
				Story.printNotHere();
			}
		}
		
		public void take(){
			if (Room.getObjects().contains(title)) {
				Story.printTake(title);
				Player.inventory.add(title);
				Room.getObjects().remove(title);
				
			} else if (Player.inventory.contains(title)) {
				Story.printAlreadyHave();
			} else {
				Story.printNotHere();
			}
		}
		
		public static String getTitle() {
			return title;
		}
	}
	
	public class Shi implements Item {
		private static String title = "stained scroll"; 
		private static String desc = "Inscribed on the stained scroll is the sacred word \"Shi.\" The sacred word is commited to memory and available to chant while meditating! Near the bottom, someone drew a picture of a human nose."; 
	
		public void examine() {
			if (Room.getObjects().contains(title) || Player.inventory.contains(title)) {
				Story.print(desc);
			
				if (!Player.memory.contains("shi")) {
					Player.memory.add("shi");
					Data.updateScore(10);
				}
			} else {
				Story.printNotHere();
			}
		}
		
		public void take(){
			if (Room.getObjects().contains(title)) {
				Story.printTake(title);
				Player.inventory.add(title);
				Room.getObjects().remove(title);
				
			} else if (Player.inventory.contains(title)) {
				Story.printAlreadyHave();
			} else {
				Story.printNotHere();
			}
		}
		
		public static String getTitle() {
			return title;
		}
	}
	
	public class Scroll implements Item {
		public void examine() {
			if (Room.getObjects().contains(Om.getTitle()) || Player.inventory.contains(Om.getTitle()) || (Player.getLocation().title.equals("Lounge") && World.loungeSafeOpen && World.omInSafe))
				om.examine();
			
			if (Room.getObjects().contains(Ni.getTitle()) || Player.inventory.contains(Ni.getTitle()) || (Player.getLocation().title.equals("Study") && World.studySafeOpen && World.niInSafe))
				ni.examine();
			
			if (Room.getObjects().contains(Go.getTitle()) || Player.inventory.contains(Go.getTitle()) || (Player.getLocation().title.equals("Creaky Deck") && World.creakyDeckOpen && World.goInBox))
				go.examine();
			
			if (Room.getObjects().contains(Yu.getTitle()) || Player.inventory.contains(Yu.getTitle()) || (World.yuInCase && World.caseOpen && (Player.inventory.contains(JewelledCase.getTitle()) || Room.getObjects().contains(JewelledCase.getTitle()))))
				yu.examine();
			
			if (Room.getObjects().contains(Ji.getTitle()) || Player.inventory.contains(Ji.getTitle()) 
			|| (Player.getLocation().title.equals("Avalokitesvara Shrine") && World.jiInSafe && World.shrineRoom1SafeOpen))
				ji.examine();
			
			if (Room.getObjects().contains(Ra.getTitle()) || Player.inventory.contains(Ra.getTitle()))
				ra.examine();
			
			if (Room.getObjects().contains(Shi.getTitle()) || Player.inventory.contains(Shi.getTitle()))
				shi.examine();
		}
		
		public void take(){
			if (Player.getLocation().equals(Room.hallway)) {
				if (Room.getScrollCount() == 0) {
					Story.printGlassObstructs();
				} else {
					Story.print("Which one?");
				}
			} else {
				if (Room.getScrollCount() > 1) {
					Story.print("Which one?");
				} else if (Room.getScrollCount() == 1) {
					getScroll();
				} else {
					Story.printNotHere();
				}
			}
		}
		
		public void attemptToExamineScroll() {
			if (Player.getLocation().equals(Room.hallway)) {
				// Hallway is the only location where a scroll can be seen but not accessible. For this reason, this condition is necessary
				if (Room.getScrollCount() == 0) {
					if (World.raDropped) {
						Story.printNotHere();
					} else {
						Story.print("The scroll is resting on a shelf behind the glass in the laundry chute.");
					}
				} else {
					Story.print("Which one?");
				}
			} else {
				if (Room.getScrollCount() == 0) {
					Story.printNotHere();
				} else if (Room.getScrollCount() > 1) {
					Story.print("Which one?");
				} else {
					examine();
				}
			}
		}
		
		public void getScroll() {
			if (Room.getObjects().contains(Om.getTitle()) || (Player.getLocation().title.equals("Lounge") && World.loungeSafeOpen && World.omInSafe))
				om.take();
			
			if (Room.getObjects().contains(Ni.getTitle()) || (Player.getLocation().title.equals("Study") && World.studySafeOpen && World.niInSafe))
				ni.take();
			
			if (Room.getObjects().contains(Go.getTitle()) || (Player.getLocation().title.equals("Creaky Deck") && World.creakyDeckOpen && World.goInBox))
				go.take();
			
			if (Room.getObjects().contains(Yu.getTitle()) || (World.yuInCase && World.caseOpen && (Player.inventory.contains(JewelledCase.getTitle()) || Room.getObjects().contains(JewelledCase.getTitle()))))
				yu.take();
			
			if (Room.getObjects().contains(Ji.getTitle()) || (World.jiInSafe && World.shrineRoom1SafeOpen && (Player.inventory.contains(Ji.getTitle()))))
				ji.take();
			
			if (Room.getObjects().contains(Ra.getTitle()))
				ra.take();
			
			if (Room.getObjects().contains(Shi.getTitle()))
				shi.take();
		}
		
		public void dropScroll() {
			if (Player.inventory.contains(Om.getTitle())) {
				Player.inventory.remove(Om.getTitle());
				Room.getObjects().add(Om.getTitle());
				Story.printDropped();
			} else {
				Story.printNotInInventory();
			}

			if (Player.inventory.contains(Ni.getTitle())) {
				Player.inventory.remove(Ni.getTitle());
				Room.getObjects().add(Ni.getTitle());
				Story.printDropped();
			} else {
				Story.printNotInInventory();
			}

			if (Player.inventory.contains(Go.getTitle())) {
				Player.inventory.remove(Go.getTitle());
				Room.getObjects().add(Go.getTitle());
				Story.printDropped();
			} else {
				Story.printNotInInventory();
			}

			if (Player.inventory.contains(Yu.getTitle())) {
				Player.inventory.remove(Yu.getTitle());
				Room.getObjects().add(Yu.getTitle());
				Story.printDropped();
			} else {
				Story.printNotInInventory();
			}

			if (Player.inventory.contains(Ji.getTitle())) {
				Player.inventory.remove(Ji.getTitle());
				Room.getObjects().add(Ji.getTitle());
				Story.printDropped();
			} else {
				Story.printNotInInventory();
			}

			if (Player.inventory.contains(Ra.getTitle())) {
				Player.inventory.remove(Ra.getTitle());
				Room.getObjects().add(Ra.getTitle());
				Story.printDropped();
			} else {
				Story.printNotInInventory();
			}

			if (Player.inventory.contains(Shi.getTitle())) {
				Player.inventory.remove(Shi.getTitle());
				Room.getObjects().add(Shi.getTitle());
				Story.printDropped();
			} else {
				Story.printNotInInventory();
			}
		}
	}
	
	public class Book implements Item {
		private static String title = "book"; 
		private static String desc = "   BUNRAKU, by Wabewalker\n   Bunraku is a form of Japanese puppet theater that blends elements of music and storytelling to create a powerful performance that has been revered in Japanese culture for hundreds of years.\n   Three puppeteers will manipulate a single ningyo (puppet): the one with the most experience will control the head and right hand, the second will move the left hand, and the third operates the legs. Great care was crafted into the puppet's facial mechanics to best emulate the emotions of humans.\n   The puppeteers perform in full view of the audience, generally wearing black, hooded cloaks. Over time, the audience begins to ignore the visible puppeteers for the purpose of deepening their immersion.";
	
		public void examine() {
			if (Player.inventory.contains(Book.getTitle()) || Room.getObjects().contains(Book.getTitle())) {
				Story.print(desc);
				// Story.setScrollStop(Story.scrollStopBook);
				
				if (!Player.readBook) {
					Player.readBook = true;
					Data.updateScore(5);
				}
			} else {
				Story.printNotHere();
			}
		}
		
		public void take(){
			if (Room.getObjects().contains(title)) {
				Story.printTake(title);
				Player.inventory.add(title);
				Room.getObjects().remove(title);
			} else if (Player.inventory.contains(title)) {
				Story.printAlreadyHave();
			} else {
				Story.printNotHere();
			}
		}
		
		public static String getTitle() {
			return title;
		}
	}
	
	public class Cryptogram implements Item {
		private static String title = "cryptogram"; 
		private static String desc = "   Emei Mantra: eye, ear, hand, foot, heart, heart, mouth, foot, ear, ear, heart, mouth, hand, foot.\n   Gohogo Mantra: mouth, heart, foot, eye, eye, nose, nose, foot, nose, hand, eye, ear, nose, nose.\n   Heart Sutra: ear, foot, ear, foot, heart, hand, nose, eye, foot, ear, foot, mouth, hand, nose.\n   Luminous Sutra: heart, nose, ear, mouth, mouth, foot, eye, foot, nose, hand, ear, mouth, ear, heart.\n   Mantra of Harmony: eye, foot, ear, foot, mouth, hand, nose, ear, heart, ear, foot, heart, hand, nose.\n   Mantra of Light: eye, hand, heart, mouth, nose, heart, hand, ear, mouth, heart, foot, nose, heart, hand.\n   Mantra of Radiance: ear, heart, foot, hand, nose, eye, mouth, ear, heart, foot, hand, nose, ear, mouth.\n   Sutra of Peace: hand, ear, mouth, heart, foot, nose, heart, hand, heart, hand, heart, mouth, nose, heart.\n   Sutra of Shadow: ear, ear, hand, heart, eye, nose, ear, mouth, heart, eye, hand, mouth, nose, ear.";
	
		public void examine() {
			if (Player.inventory.contains(title) || Room.getObjects().contains(title)) {
				Story.print(desc);
				// Story.setScrollStop(Story.scrollStopCryptogram);
				
				if (!Player.readCryptogram) {
					Player.readCryptogram = true;
					Data.updateScore(5);
				}
			} else {
				Story.printNotHere();
			}
		}
		
		public void take(){
			if (Room.getObjects().contains(title)) {
				Story.printTake(title);
				Player.inventory.add(title);
				Room.getObjects().remove(title);
			} else if (Player.inventory.contains(title)) {
				Story.printAlreadyHave();
			} else {
				Story.printNotHere();
			}
		}
		
		public static String getTitle() {
			return title;
		}
	}
	
	public class Rod implements Item {
		private static String title = "fishing pole"; 
		private static String desc = "It is made of wood with a sharp hook tied to the line."; 
	
		public void examine() {
			if (Player.inventory.contains(Rod.getTitle()) || Room.getObjects().contains(Rod.getTitle())) {
				Story.print(desc);
				
				if (World.cornOnRod)
					Story.print(" A kernel of corn is on the hook.");
			} else {
				Story.printNotHere();
			}
		}
		
		public void take(){
			if (Room.getObjects().contains(title)) {
				Story.printTake(title);
				Player.inventory.add(title);
				Room.getObjects().remove(title);
			} else if (Player.inventory.contains(title)) {
				Story.printAlreadyHave();
			} else {
				Story.printNotHere();
			}
		}
		
		public static String getTitle() {
			return title;
		}
	}
	
	public class Corn implements Item {
		private static String title = "kernel of corn"; 
		private static String desc = "The kernel of corn gives off a sweet smell."; 
	
		public void examine() {
			if ((Player.inventory.contains(title) || Room.getObjects().contains(title)) || (World.cornOnRod && (Player.inventory.contains(rod.getTitle()) || Room.getObjects().contains(rod.getTitle())))) {
				Story.print(desc);
			} else {
				Story.printNotHere();
			}
		}
		
		public void take(){
			if (Room.getObjects().contains(title)) {
				Story.printTake(title);
				Player.inventory.add(title);
				Room.getObjects().remove(title);
			} else if (Player.inventory.contains(title)) {
				Story.printAlreadyHave();
			} else {
				Story.printNotHere();
			}
		}
		
		public void put() {
			switch (Parser.sentence.get(2)) {
				case "":
					Story.printMissingNoun();
					break;
				case "ROD":
					if (Player.inventory.contains(Rod.getTitle()) && Player.inventory.contains(title)) {
						Story.printBait();
						World.cornOnRod = true;
						Player.inventory.remove(title);
						
						if (!Player.baitedRod) {
							Player.baitedRod = true;
							Data.updateScore(5);
						}
					} else {
						if (Player.inventory.contains(Rod.getTitle()) && !Player.inventory.contains(title)) {
							Story.print("You aren't carrying a kernel of corn!");
						} else if (!Player.inventory.contains(Rod.getTitle()) && Player.inventory.contains(title)) {
							Story.print("You aren't carrying a fishing pole!");
						} else {
							Story.print("You aren't carrying that!");
						}
					}
					break;
				case "Pond":
					if (Player.getLocation().title.equals("Pond") && Player.inventory.contains(Corn.getTitle())) {
						Story.print("The corn lands in the pond with a \"plop.\" You see a koi fish gobble it up.");
						Player.inventory.remove(title);
					} else {
						Story.printNotHere();
					}
					break;
				default:
					Story.invalid();
					break;
			}
		}
		
		public static void eat() {
			if (Player.inventory.contains(title) || Room.getObjects().contains(title)) {
				Story.print("You eat the kernel of corn. It tasted very sweet.");
			
				Player.inventory.remove(title);
				Room.getObjects().remove(title);
			} else {
				Story.printNotHere();
			}
		}
		
		public static String getTitle() {
			return title;
		}
	}
	
	public class Parchment implements Item {
		private static String title = "parchment"; 
		private static String desc = "Inscribed on the parchment is the sacred symbol of the Lotus."; 
	
		public void examine() {
			if (Player.inventory.contains(title) || Room.getObjects().contains(title)) {
				Story.print(desc);
				
				if (!Player.memory.contains("lotus")) {
					Story.printMemorizeSymbol();
					Player.memory.add("lotus");
					Data.updateScore(10);
				}
			} else {
				Story.printNotHere();
			}
		}
		
		public void take(){
			if (Room.getObjects().contains(Parchment.getTitle())) {
				Story.printTake(title);
				Player.inventory.add(title);
				Room.getObjects().remove(title);
				Player.tookParchment = true;
			} else if (Player.inventory.contains(title)) {
				Story.printAlreadyHave();
			} else {
				Story.printNotHere();
			}
		}
		
		public static String getTitle() {
			return title;
		}
	}
	
	public class Card implements Item {
		private static String title = "business card"; 
		private static String desc = "Dance, Narrative, and Reiki Therapy.\nMeditation Instruction.\nCall Kimi!\nBusiness Contact: ";
	
		public void examine() {
			if (Player.inventory.contains(Card.getTitle()) || Room.getObjects().contains(Card.getTitle())) {
				Story.print(desc);
				Story.print("19670064");
				
				if (!Player.examinedCard) {
					Player.examinedCard = true;
					Data.updateScore(5);
				}
			} else {
				Story.printNotHere();
			}
		}
		
		public void take(){
			if (Room.getObjects().contains(title)) {
				Story.printTake(title);
				Player.inventory.add(title);
				Room.getObjects().remove(title);
			} else if (Player.inventory.contains(title)) {
				Story.printAlreadyHave();
			} else {
				Story.printNotHere();
			}
		}
		
		public static String getTitle() {
			return title;
		}
	}
	
	public class Sword implements Item {
		private static String title = "long sword"; 
		private static String desc = "It's really sharp.";
	
		public void examine() {
			if (Player.inventory.contains(title) || Room.getObjects().contains(title)) {
				Story.print(desc);
			} else {
				Story.printNotHere();
			}
		}
		
		public void take(){
			if (Player.inventory.contains(title)) {
				Story.printAlreadyHave();
			} else if (Room.getObjects().contains(title)) {
				Player.inventory.add(title);
				Story.print("Taken.");
			} else {
				Story.printNotHere();
			}
		}
		
		public void drop() {
			if (Player.inventory.contains(title)) {
				Player.inventory.remove(title);
				Room.getObjects().add(title);
				Story.printDropped();
			} else {
				Story.printNotInInventory();
			}
		}
		
		public static String getTitle() {
			return title;
		}
	}
	
	public class Phone implements Item {
		private static String title = "corded landline telephone"; 
		private static String desc = "The beige landline phone has a dialpad.";
	
		public void examine() {
			if (Player.inventory.contains(title) || Room.getObjects().contains(title)) {
				Story.print(desc);
			} else {
				Story.printNotHere();
			}
		}
		
		public void take(){
			if (Room.getObjects().contains(title)) {
				Story.printTake(title);
				Player.inventory.add(title);
				Room.getObjects().remove(title);
			} else if (Player.inventory.contains(title)) {
				Story.printAlreadyHave();
			} else {
				Story.printNotHere();
			}
		}
		
		public static String getTitle() {
			return title;
		}
	}
	
	public class JewelledCase implements Item {
		private static String title = "jewelled case"; 
		private static String desc = "The jewelled case is truly beautiful, decorated with rubies, emeralds, and sapphire. There is a metal panel attached to the top of the case.";
	
		public void examine() {
			if (Player.inventory.contains(title) || Room.getObjects().contains(title)) {
				Story.print(desc);
				
				if (World.caseOpen) {
					Story.print(" The jewelled case is open.");
					
					if (World.yuInCase) {
						Story.print(" There is a crumpled scroll inside.");
					} else {
						Story.print(" It's empty.");
					}
				} else {
					Story.print( " The jewelled case is closed.");
				}
			} else {
				Story.printNotHere();
			}
		}
		
		public void take(){
			if (Room.getObjects().contains(title)) {
				Story.printTake(title);
				Player.inventory.add(title);
				Room.getObjects().remove(title);
			} else if (Player.inventory.contains(title)) {
				Story.printAlreadyHave();
			} else{
				Story.printNotHere();
			}
		}
		
		public void open() {
			if (Player.inventory.contains(title) || Room.getObjects().contains(title)) {
				if (World.caseOpen) {
					Story.printAlreadyOpen();
				} else if (World.OOO) {
					Story.print("The jewelled case opens with a satisfying click.");
					World.caseOpen = true;
					
					if (World.yuInCase) {
						Story.print(" There's a crumpled scroll inside.");
					} else {
						Story.print(" It's empty.");
					}
				} else {
					Story.printLocked();
				}
			} else {
				Story.printNotHere();
			}
		}
		
		public void shut() {
			Story.printShutCase();
			World.caseOpen = false;
		}
		
		public static String getTitle() {
			return title;
		}
	}
	
	public class Mirror implements Item {
		public void examine() {
			switch (Player.getLocation().title) {
				case "Thatched Hut":
					if (Player.dreaming) {
						Story.print("The Chippendale mirror casts your reflection back at you. You are wearing a black, hooded cloak.");
					} else {
						Story.print("The Chippendale mirror casts your reflection back at you. Your loosely kept hair goes well with your faded orange samue.");
					}
					break;
				case "Study":
					Story.print("The Chippendale mirror casts your reflection back at you. Your loosely kept hair goes well with your faded green samue.");
					break;
				case "Trinket Shop":
					Story.print("The Chippendale mirror casts your reflection back at you. Your loosely kept hair goes well with your faded purple samue.");
					break;
				default:
					Story.printNotHere();
					break;
			}
		}
		
		public void take(){
			if (Player.getLocation().title.equals("Thatched Hut") || Player.getLocation().title.equals("Study") || Player.getLocation().title.equals("Trinket Shop")) {
				Story.printTooHeavy();
			} else {
				Story.printNotHere();
			}
		}
	}
	
	public class Panel implements Item {
		public void examine() {
			Story.printPanel();
		}
		
		public void take(){
			if (Room.roomsWithPanels.contains(Player.getLocation()) || (Player.inventory.contains(JewelledCase.getTitle()) || Room.getObjects().contains(JewelledCase.getTitle()))) {
				Story.printCantTake();
			} else {
				Story.printNotHere();
			}
		}
	}
	
	public class Woman implements Item {
		public void examine() {
			switch (Player.getLocation().title) {
				case "Cafe":
				case "Living Room":
				case "Dark Passageway":
					Story.printWoman();
					break;
				default:
					Story.printNotHere();
					break;
			}
		}
		
		public void take(){
			switch (Player.getLocation().title) {
				case "Cafe":
				case "Living Room":
					Story.printGlassObstructs();
					break;
				case "Dark Passageway":
					Story.printCantTake();
					break;
				default:
					Story.printNotHere();
					break;
			}
		}
	}
	
	public class Mask implements Item {
		public void examine() {
			switch (Player.getLocation().title) {
				case "Cafe":
				case "Living Room":
				case "Dark Passageway":
					Story.print("The porcelain Noh mask depicts a lady's smiling face with traditional makeup.");
					break;
				default:
					Story.printNotHere();
					break;
			}
		}
		
		public void take(){
			switch (Player.getLocation().title) {
				case "Cafe":
				case "Living Room":
					Story.printGlassObstructs();
					break;
				case "Dark Passageway":
					Story.printCantTake();
					break;
				default:
					Story.printNotHere();
					break;
			}
		}
	}
	
	public class Sign implements Item {
		public void examine() {
			switch (Player.getLocation().title) {
				case "Sand Exhibit":
					Story.print(Story.sandExhibitSign);
					break;
				case "Landing":
					Story.print("The plaque reads:\nNomura Clan Samurai House\nCirca 1818");
					break;
				case "Altar of Samantabhadra":
					Story.print(Story.shrineRoom2Sign);
					break;
				case "Gate":
					Story.print(Story.gateSign);
					break;
				case "Bottom of Mountain":
					Story.print(Story.bottomOfMountainSign);
					break;
				case "Halfway up Mountain":
					Story.printReadKnot();
					
					if (!Player.memory.contains("knot")) {
						Story.printMemorizeSymbol();
						Player.memory.add("knot");
						Data.updateScore(10);
					}
					break;
				case "Hondo":
					Story.print(Story.hondoSign);
					break;
				case "Butsudan of Kannon":
					Story.print(Story.shrineRoom3Sign);
					break;
				default:
					Story.printNotHere();
					break;
			}
		}
		
		public void take(){
			if (Room.hasSign()) {
				Story.printCantTake();
			} else {
				Story.printNotHere();
			}
		}
	}
	
	public class Stone implements Item {
		public void examine() {
			switch (Player.getLocation().title) {
				case "Cobble Square":
				case "Thatched Hut":
					// stone = sign
					Story.printNothingSpecial();
					break;
				case "Forest":
				case "Gate":
				case "Island":
				case "Bottom of Mountain":
				case "Halfway up Mountain":
				case "Top of Mountain":
					Story.printMoreSpecific();
					break;
				default:
					Story.printNotHere();
					break;
			}
		}
		
		public void take(){
			switch (Player.getLocation().title) {
				case "Cobble Square":
				case "Thatched Hut":
				case "Forest":
				case "Gate":
				case "Island":
				case "Bottom of Mountain":
				case "Halfway up Mountain":
				case "Top of Mountain":
					Story.printCantTake();
					break;
				default:
					Story.printNotHere();
					break;
			}
		}
	}
	
	public class Basin implements Item {
		public void examine() {
			if (Player.getLocation().title.equals("Hondo")) {
				Story.print(Story.hondoSign);
			} else {
				Story.printNotHere();
			}
		}
		
		public void take(){
			if (Player.getLocation().title.equals("Hondo")) {
				Story.printTooHeavy();
			} else {
				Story.printNotHere();
			}
		}
	}
	
	public class Samue implements Item {
		public void examine() {
			if (Player.dreaming) {
				Story.printNotHere();
			} else {
				Story.print("You are wearing a loosely-fit, faded " + Player.getSamue() + " samue.");
			}
		}
		
		public void take(){
			Story.printAlreadyHave();
		}
	}
	
	public class Cloak implements Item {
		public void examine() {
			if (Player.dreaming) {
				Story.print("You are wearing a black, hooded cloak.");
			} else {
				Story.printNotHere();
			}
		}
		
		public void take(){
			Story.printAlreadyHave();
		}
	}
	
	public class Pond implements Item {
		public void examine() {
			switch (Player.getLocation().title) {
				case "Garden Overlook":
					Story.print("Small ripples roll across the pond from the gentle breeze.");
					break;
				case "Pond":
				case "Master Bedroom":
					Story.print("Small ripples roll across the pond. You can see a red koi fish exploring idly underwater.");
					break;
				case "Bottom of Mountain":
				case "Island":
					Story.print("The pond is completely frozen over.");
					break;
				default:
					Story.printNotHere();
					break;
			}
		}
		
		public void take(){
			switch (Player.getLocation().title) {
				case "Pond":
				case "Master Bedroom":
				case "Garden Overlook":
				case "Bottom of Mountain":
				case "Island":
					Story.printInteresting();
					break;
				default:
					Story.printNotHere();
					break;
			}
		}
	}
	
	public class Fish implements Item {
		public void examine() {
			switch (Player.getLocation().title) {
				case "Pond":
				case "Garden Overlook":
				case "Master Bedroom":
					Story.print("The red koi fish is exploring idly underwater. It's too far away to adequately examine.");
					break;
				default:
					Story.printNotHere();
					break;
			}
		}
		
		public void take(){
			switch (Player.getLocation().title) {
				case "Pond":
					if (Player.fishing) {
						Action.reelIn();
					} else {
						Story.print("The koi fish is just out of reach.");
					}
					break;
				case "Garden Overlook":
				case "Master Bedroom":
					Story.print("The koi fish is too far away.");
					break;
				default:
					Story.printNotHere();
					break;
			}
		}
	}
	
	public class Bridge implements Item {
		public void examine() {
			if (Player.getLocation().title.equals("Bottom of Mountain") || Player.getLocation().title.equals("Island")) {
				Story.print("The narrow stone bridge extends over a frozen pond, connecting the stone path to the man-made island.");
			} else {
				Story.printNotHere();
			}
		}
		
		public void take(){
			if (Player.getLocation().title.equals("Bottom of Mountain") || Player.getLocation().title.equals("Island")) {
				Story.printHow();
			} else {
				Story.printNotHere();
			}
		}
	}
	
	public class TV implements Item {
		public void examine() {
			switch (Player.getLocation().title) {
				case "Avalokitesvara Shrine":
					Story.print("The black and red television is a 14\" 14C-C2F model of the C2, manufactured by Wabewalker Inc. It looks several decades old. The screen ");
					
					if (Player.purpleAlive) {
						Story.print("displays a colorful array of oragami birds.");
					} else {
						Story.print("displays a person on a snowy overlook, lying in a pool of blood.");
					}
					
					Story.print(" There is a rewind button, a fastforward button, and a play button.");
					break;
				case "Master Bedroom":
					Story.print("The black and red television is a 14\" 14C-C2F model of the C2, manufactured by Wabewalker Inc. It looks several decades old. The screen ");
					
					if (Player.orangeAlive) {
						Story.print("displays an empty cafe with a grassy hill in the distance.");
					} else {
						Story.print("displays a cafe with a person in the distance lying atop a hill in a pool of blood.");
					}
					
					Story.print(" There is a rewind button, a fastforward button, and a play button.");
					break;
				case "Island":
					Story.print("The black and red television is a 14\" 14C-C2F model of the C2, manufactured by Wabewalker Inc. It looks several decades old. The screen ");
					
					if (Player.greenAlive) {
						Story.print("displays an empty living room.");
					} else {
						Story.print("displays a person lying in a pool of blood in the middle of a living room.");
					}
					
					Story.print(" There is a rewind button, a fastforward button, and a play button.");
					break;
				case "Theater":
					Story.print("The black and red television is a 14\" 14C-C2F model of the C2, manufactured by Wabewalker Inc. It looks several decades old. The screen ");
					
					Story.print("is black."); 
					
					Story.print(" There is a rewind button, a fastforward button, and a play button.");
					break;
				default:
					Story.printNotHere();
					break;
			}
		}
		
		public void take(){
			switch (Player.getLocation().title) {
				case "Avalokitesvara Shrine":
				case "Master Bedroom":
				case "Island":
				case "Theater":
					Story.print("The television is heavier than meets the eye. It won't budge!");
					break;
				default:
					Story.printNotHere();
					break;
			}
		}
		
		public static void playTheater() {
			if (World.theaterTVAtBeginning) {
				Story.printTheaterTV();
				World.theaterTVAtBeginning = false;
				
				if (!Player.playedTheaterTV) {
					Player.playedTheaterTV = true;
					Data.updateScore(5);
				}
			} else {
				Story.print("You push the play button, but nothing happens. It looks like the tape is at the end.");
			}
		}
	}
	
	public class Door implements Item {
		public void examine() {
			switch (Player.getLocation().title) {
				case "Sand Exhibit":
					Story.print("The door has a metal panel bolted on it.");
					break;
				case "Avalokitesvara Shrine":
					Story.print("The door has a metal panel bolted on it.");
					break;
				case "Altar of Samantabhadra":
					Story.print("It's a wooden sliding door on the west wall.");
					break;
				case "Dark Passageway":
					Story.print("It's a wooden sliding door on the east wall.");
					break;
				case "Courtyard":
				case "Closet":
				case "Hamlet":
				case "Master Bedroom":
					Story.printNothingSpecial();
					break;
				default:
					Story.printNotHere();
					break;
			}
		}
		
		public void take(){
			if (Room.hasDoor()) {
				Story.printCantTake();
			} else {
				Story.printNotHere();
			}
		}
		
		public void open() {
			switch (Player.getLocation().title) {
				case "Sand Exhibit":
					if (World.sandExhibitDoorOpen) {
						Story.printAlreadyOpen();
					} else {
						if (World.OOX) {
							Story.print("The door opens, revealing a shrine room.");
							World.sandExhibitDoorOpen = true;
							
							if (!Player.openedSandExhibitDoor) {
								Player.openedSandExhibitDoor = true;
								Data.updateScore(5);
							}
						} else {
							Story.printLocked();
						}
					}
					break;
				case "Avalokitesvara Shrine":
					if (World.sandExhibitDoorOpen) {
						Story.printAlreadyOpen();
					} else {
						Story.print("The door opens, revealing a sand exhibit.");
						World.sandExhibitDoorOpen = true;
					}
					break;
				case "Altar of Samantabhadra":
					if (World.shrineRoom2DoorOpen) {
						Story.printAlreadyOpen();
					} else {
						if (World.XOX) {
							Story.print("With some effort, the door slides opens, revealing a dark passageway.");
							World.shrineRoom2DoorOpen = true;
							
							if (!Player.openedShrineRoom2Door) {
								Player.openedShrineRoom2Door = true;
								Data.updateScore(5);
							}
						} else {
							Story.printLocked();
						}
					}
					break;
				case "Dark Passageway":
					if (World.shrineRoom2DoorOpen) {
						Story.printAlreadyOpen();
					} else {
						Story.print("The door opens, revealing a shrine room.");
						World.shrineRoom2DoorOpen = true;
					}
					break;
				case "Courtyard":
					if (World.courtyardDoorOpen) {
						Story.printAlreadyOpen();
					} else {
						if (World.XOO) {
							Story.print("The door opens, revealing a small closet.");
							World.courtyardDoorOpen = true;
							
							if (!Player.openedCloset) {
								Player.openedCloset = true;
								Data.updateScore(5);
							}
						} else {
							Story.printLocked();
						}
					}
					break;
				case "Closet":
					if (World.courtyardDoorOpen) {
						Story.printAlreadyOpen();
					} else {
						Story.print("The door opens, revealing a courtyard.");
						World.courtyardDoorOpen = true;
					}
					break;
				case "Hamlet":
					Story.printLocked();
					break;
				default:
					Story.printNotHere();
					break;
			}
		}
		
		public void shut() {
			switch (Player.getLocation().title) {
				case "Sand Exhibit":
					if (!World.sandExhibitDoorOpen) {
						Story.printAlreadyShut();
					} else {
						Story.printShutDoor();
						World.sandExhibitDoorOpen = false;
					}
					break;
				case "Avalokitesvara Shrine":
					if (!World.sandExhibitDoorOpen) {
						Story.printAlreadyShut();
					} else {
						Story.printShutDoor();
						World.sandExhibitDoorOpen = false;
					}
					break;
				case "Altar of Samantabhadra":
					if (!World.shrineRoom2DoorOpen) {
						Story.printAlreadyShut();
					} else {
						Story.printShutDoor();
						World.shrineRoom2DoorOpen = false;
					}
					break;
				case "Dark Passageway":
					if (!World.shrineRoom2DoorOpen) {
						Story.printAlreadyShut();
					} else {
						Story.printShutDoor();
						World.shrineRoom2DoorOpen = false;
					}
					break;
				case "Courtyard":
					if (!World.courtyardDoorOpen) {
						Story.printAlreadyShut();
					} else {
						Story.printShutDoor();
						World.courtyardDoorOpen = false;
					}
					break;
				case "Closet":
					if (!World.courtyardDoorOpen) {
						Story.printAlreadyShut();
					} else {
						Story.printShutDoor();
						World.courtyardDoorOpen = false;
					}
					break;
				default:
					Story.printNotHere();
					break;
			}
		}
		
		public static void knock() {
			if (Room.hasDoor()) {
				Story.print("You knock on the door. There is no answer.");
			} else {
				Story.printNotHere();
			}
		}
	}
	
	public class Safe implements Item {
		public void examine() {
			switch (Player.getLocation().title) {
				case "Avalokitesvara Shrine":
					Story.print("The iron safe has a metal panel welded onto it.");
					
					if (World.shrineRoom1SafeOpen) {
						Story.print(" The safe is open.");
						
						if (World.jiInSafe) {
							Story.print(" There is a smooth scroll inside.");
						} else {
							Story.print(" It's empty.");
						}
					} else {
						Story.print(" The safe is closed.");
					}
					break;
				case "Lounge":
					Story.print("The iron safe has a metal panel welded onto it.");
					
					if (World.loungeSafeOpen) {
						Story.print(" The safe is open.");
						
						if (World.niInSafe) {
							Story.print(" There is a faded scroll inside.");
						} else {
							Story.print(" It's empty.");
						}
					} else {
						Story.print(" The safe is closed.");
					}
					break;
				case "Study":
					Story.print("The iron safe has a metal panel welded onto it.");
					
					if (World.studySafeOpen) {
						Story.print(" The safe is open.");
						
						if (World.jiInSafe) {
							Story.print(" There is a fancy scroll inside.");
						} else {
							Story.print(" It's empty.");
						}
					} else {
						Story.print(" The safe is closed.");
					}
					break;
				default:
					Story.printNotHere();
					break;
			}
		}
		
		public void take(){
			if (Room.hasSafe()) {
				Story.printCantTake();
			} else {
				Story.printNotHere();
			}
		}
		
		public void open() {
			switch (Player.getLocation().title) {
				case "Lounge":
					if (World.loungeSafeOpen) {
						Story.printAlreadyOpen();
					} else {
						if (World.OOX) {
							Story.print("The safe swings open, revealing a faded scroll.");
							World.loungeSafeOpen = true;
							Room.loungeObjects.add(Om.getTitle());
						} else {
							Story.printLocked();
						}
					}
					break;
				case "Avalokitesvara Shrine":
					if (World.shrineRoom1SafeOpen) {
						Story.printAlreadyOpen();
					} else {
						if (World.OXO) {
							Story.print("The safe swings open, revealing a smooth scroll.");
							World.shrineRoom1SafeOpen = true;
							Room.shrineRoom1Objects.add(Ji.getTitle());
						} else {
							Story.printLocked();
						}
					}
					break;
				case "Study":
					if (World.studySafeOpen) {
						Story.printAlreadyOpen();
					} else {
						if (World.OOX) {
							Story.print("The safe swings open, revealing a fancy scroll.");
							World.studySafeOpen = true;
							Room.studyObjects.add(Ni.getTitle());
						} else {
							Story.printLocked();
						}
					}
					break;
				default:
					Story.printNotHere();
					break;
			}
		}
		
		public void shut() {
			switch (Player.getLocation().title) {
				case "Lounge":
					if (World.loungeSafeOpen) {
						Story.print("The safe slams shut.");
						World.loungeSafeOpen = false;
						
						if (World.omInSafe)
							Room.loungeObjects.remove(Om.getTitle());
						
					} else {
						Story.printAlreadyOpen();
					}
					break;
				case "Avalokitesvara Shrine":
					if (World.shrineRoom1SafeOpen) {
						Story.print("The safe slams shut.");
						World.shrineRoom1SafeOpen = false;
						
						if (World.jiInSafe)
							Room.shrineRoom1Objects.add(Ji.getTitle());
					} else {
						Story.printAlreadyOpen();
					}
					break;
				case "Study":
					if (World.studySafeOpen) {
						Story.print("The safe slams shut.");
						World.studySafeOpen = false;
						
						if (World.niInSafe)
							Room.studyObjects.add(Ni.getTitle());
					} else {
						Story.printAlreadyOpen();
					}
					break;
				default:
					Story.printNotHere();
					break;
			}
		}
	}
	
	public class Gate implements Item {
		public void examine() {
			switch (Player.getLocation().title) {
				case "Forest":
				case "Gate":
				case "Island":
				case "Bottom of Mountain":
					Story.print(Story.gate);
					break;
				default:
					Story.printNotHere();
					break;
			}
		}
		
		public void take(){
			switch (Player.getLocation().title) {
				case "Gate":
					Story.printCantTake();
					break;
				default:
					Story.printNotHere();
					break;
			}
		}
	}
	
	public class Box implements Item {
		public void examine() {
			switch (Player.getLocation().title) {
				case "Creaky Deck":
					Story.print("The tall wooden box resembles a cupboard, except that it has no door to speak of. On the front of the box is a button, and a metal panel.");

					if (World.creakyDeckOpen) {
						Story.print(" A secret compartment has been opened.");
						
						if (World.goInBox) {
							Story.print(" There is a frosty scroll inside.");
						} else {
							Story.print("It's empty.");
						}
					}
					break;
				default:
					Story.printNotHere();
					break;
			}
		}
		
		public void take(){
			if (Player.getLocation().title.equals("Creaky Deck")) {
				Story.printTooHeavy();
			} else {
				Story.printNotHere();
			}
		}
		
		public void open() {
			if (Player.getLocation().title.equals("Creaky Deck")) {
				Story.print("There's no discernable way to open the case by hand.");
			} else {
				Story.printNotHere();
			}
		}
		
		public void shut() {
			if (World.creakyDeckOpen) {
				Story.print("There's no way to shut it.");
			} else {
				Story.printAlreadyShut();
			}
		}
	}
	
	public class Compartment implements Item {
		public void examine() {
			if (Player.getLocation().title.equals("Creaky Deck") && World.creakyDeckOpen) {
				if (World.goInBox) {
					Story.print("There is a frosty scroll in the secret compartment.");
				} else {
					Story.print("The secret compartment is empty.");
				}
			} else {
				Story.printNotHere();
			}
		}
		
		public void take() {
			if (Player.getLocation().title.equals("Creaky Deck") && World.creakyDeckOpen) {
				Story.printInteresting();
			} else {
				Story.printNotHere();
			}
		}
	}
	
	public class Birds implements Item {
		public void examine() {
			// if at overlook or shrine1 w right screen
			if (Player.getLocation().title.equals("Overlook")) {
				Story.print("There are thousands of paper oragami birds in every color. They are strung together and hung from the ceiling, forming a large curtain on the west end of the overlook.");
			} else if (Player.getLocation().title.equals("Avalokitesvara Shrine") && Player.purpleAlive) {
				Story.print("The colorful oragami birds fill the entire television display.");
			} else {
				Story.printNotHere();
			}
		}
		
		public void take(){
			if (Player.getLocation().title.equals("Overlook")) {
				Action.moveBirds();
			} else {
				Story.printNotHere();
			}
		}
	}
	
	public class Memory implements Item {
		public void examine() {
			Story.printMemory();
		}
		
		public void take(){
			Story.printHow();
		}
	}
	
	public class Shrine implements Item {
		public void examine() {
			switch (Player.getLocation().title) {
				case "Living Room":
				case "Hondo":
					Story.print("You're too far away to adequately examine that.");
					break;
				case "Avalokitesvara Shrine":
					Story.print(Story.shrine1Desc);
					break;
				case "Altar of Samantabhadra":
					Story.print(Story.shrine2Desc);
					break;
				case "Butsudan of Kannon":
					Story.print(Story.shrine3Desc);
					break;
				case "Island":
					if (World.islandOpen) {
						Story.print(Story.hokuraOpen);
					} else {
						Story.print(Story.hokuraClosed);
					}
					break;
				default:
					Story.printNotHere();
					break;
			}
		}
		
		public void take(){
			switch (Player.getLocation().title) {
				case "Avalokitesvara Shrine":
				case "Altar of Samantabhadra":
				case "Butsudan of Kannon":
				case "Island":
					Story.printInteresting();
					break;
				default:
					Story.printNotHere();
					break;
			}
		}
	}
	
	public class Tassel implements Item {
		public void examine() {
			if (Player.getLocation().title.equals("Island")) {
				Story.print("The tassel is a gold silk, swaying gently in the wind from the hokura.");
			} else {
				Story.printNotHere();
			}
		}
		
		public void take(){
			if (Player.getLocation().title.equals("Island")) {
				pull();
			} else {
				Story.printNotHere();
			}
		}
		
		public void pull() {
			if (Player.getLocation().title.equals("Island")) {
				if (World.islandOpen) {
					Story.print("You pull the tassel, but nothing happens. The barrier is already open.");
				} else {
					World.islandOpen = true;
					Story.printTassel();
					
					if (!Player.openedHokura) {
						Player.openedHokura = true;
						Data.updateScore(5);
					}
				}
			} else {
				Story.printNotHere();
			}
		}
	}
	
	public class Tea implements Item {
		public void examine() {
			if (Player.getLocation().title.equals("Hisachi Ichiro's House")) {
				Story.printNothingSpecial();
			} else {
				Story.printNotHere();
			}
		}
		
		public void take(){
			if (Player.getLocation().title.equals("Hisachi Ichiro's House")) {
				Story.print("You sip the tea. It's quite good.");
				Player.sipped = true;
			} else {
				Story.printNotHere();
			}
		}
	}
	
	public class Tree implements Item {
		public void examine() {
			if (Player.getArea().equals("temple") && !Player.getLocation().title.equals("Hisachi Ichiro's House")) {
				Story.print("The tall pine trees surround you in every direction.");
			} else if (Player.getLocation().title.equals("Garden Patio") || Player.getLocation().title.equals("Garden Overlook") || Player.getLocation().title.equals("Wabe")) {
				Story.print("The pruned trees and stone walkways are positioned in such a way that every angle of the landscape offers a unique aesthetic.");
			} else {
				Story.printNotHere();
			}
		}
		
		public void take(){
			if ((Player.getArea().equals("temple") && !Player.getLocation().title.equals("Hisachi Ichiro's House")) || Player.getLocation().title.equals("Garden Patio") || Player.getLocation().title.equals("Garden Overlook")) {
				Story.print("The tree is deeply rooted in the ground.");
			} else {
				Story.printNotHere();
			}
		}
	}
	
	public class Chest implements Item {
		public void examine() {
			if (Player.getLocation().title.equals("Assembly Room")) {
				Story.print("The ornate gold chest has a metal panel on the front of it.\nThe chest is closed.");
			} else {
				Story.printNotHere();
			}
		}
		
		public void take(){
			if (Player.getLocation().title.equals("Assembly Room")) {
				Story.printTooHeavy();
			} else {
				Story.printNotHere();
			}
		}
		
		public void open() {
			if (Player.getLocation().title.equals("Assembly Room")) {
				Story.print("One of the cloaked figures stops you.");
				Story.newLine();
				Story.print(Story.tod10);
			} else {
				Story.printNotHere();
			}
		}
	}
	
	public class Figure implements Item {
		public void examine() {
			if (Player.getLocation().title.equals("Assembly Room")) {
				Story.print("They are wearing black, hooded cloaks, standing around a golden chest. Their facial features are obscured.");
			} else {
				Story.printNotHere();
			}
		}
		
		public void take(){
			if (Player.getLocation().title.equals("Assembly Room")) {
				Story.printHow();
			} else {
				Story.printNotHere();
			}
		}
	}
	
	public class Button implements Item {
		public void examine() {
			switch (Player.getLocation().title) {
				case "Creaky Deck":
				case "Avalokitesvara Shrine":
				case "Master Bedroom":
				case "Island":
				case "Theater":
					Story.printNothingSpecial();
					break;
				default:
					Story.printNotHere();
					break;
			}
		}
		
		public void take(){
			switch (Player.getLocation().title) {
				case "Creaky Deck":
				case "Avalokitesvara Shrine":
				case "Master Bedroom":
				case "Island":
				case "Theater":
					Story.printCantTake();
					break;
				default:
					Story.printNotHere();
					break;
			}
		}
		
		public void press() {
			switch (Player.getLocation().title) {
				case "Avalokitesvara Shrine":
				case "Master Bedroom":
				case "Island":
				case "Theater":
					Story.print("Which button?");
					break;
				case "Creaky Deck":
					if (World.XXO && !World.creakyDeckOpen) {
						Story.printActivateCreakyDeck();
						World.creakyDeckOpen = true;
						Room.creakyDeckObjects.add(Go.getTitle());
					} else {
						Story.print("You push the button, but nothing happens.");
					}
					break;
				default:
					Story.printNotHere();
					break;
			}
		}
	}
	
	public class Hole implements Item {
		public void examine() {
			if (Player.getLocation().title.equals("Dark Passageway")) {
				Story.print("Through the hole, you can see a masked woman dressed in a blue kimono.");
				
				if (!Player.sawReaper2 && !World.reaperDisabled) {
					Story.print(" Lurking behind the woman, you see a cloaked figure. Seemingly unsatisfied, it leaves the area.");
				}
				
				Player.sawReaper2 = true;
			} else if (Player.getLocation().title.equals("Closet")) {
				Story.print("The small hole appears to be the chute for laundry to fall through.");
			} else {
				Story.printNotHere();
			}
		}
		
		public void take(){
			if (Player.getLocation().title.equals("Dark Passageway")) {
				Story.printInteresting();
			} else {
				Story.printNotHere();
			}
		}
	}
	
	public class Window implements Item {
		public void examine() {
			switch (Player.getLocation().title) {
				case "Cafe":
				case "Living Room":
					Story.print("A masked woman in a blue kimono is staring at you from the other side of the glass.");
					break;
				case "Master Bedroom":
					Story.print("You are on the second story, overlooking a small pond.");
					break;
				case "Hallway":
					chute.examine();
					break;
				case "Hamlet":
					Story.print("The curtains are drawn, obscuring whatever is inside.");
					break;
				default:
					Story.printNotHere();
					break;
			}
		}
		
		public void take(){
			if (Room.hasWindow()) {
				Story.printCantTake();
			} else {
				Story.printNotHere();
			}
		}
		
		public void open() {
			if (Room.hasWindow()) {
				Story.print("It won't budge.");
			} else {
				Story.printNotHere();
			}
		}
	}
	
	public class Chute implements Item {
		public void examine() {
			switch (Player.getLocation().title) {
				case "Hallway":
					Story.print("Somebody has installed a glass pane across the opening.");
					
					if (!World.raDropped)
						Story.print(Story.hallwayDescRaNotDropped);
					break;
				default:
					Story.printNotHere();
					break;
			}
		}
		
		public void take(){
			switch (Player.getLocation().title) {
				case "Hallway":
				case "Closet":
					Story.printCantTake();
					break;
				default:
					Story.printNotHere();
					break;
			}
		}
	}
	
	public class Sofa implements Item {
		public void examine() {
			switch (Player.getLocation().title) {
				case "Lounge":
					Story.print("Its red cushions look comfortable and inviting.");
					break;
				case "Hisachi Ichiro's House":
					Story.print("It's very comfortable.");
					break;
				default:
					Story.printNotHere();
					break;
			}
		}
		
		public void take(){
			switch (Player.getLocation().title) {
				case "Lounge":
					Story.printCantTake();
					break;
				case "Hisachi Ichiro's House":
					Story.print("Hisachi looks at you curiously. \"I must insist you leave my furniture here.\"");
					break;
				default:
					Story.printNotHere();
					break;
			}
		}
	}
	
	public class Exhibit implements Item {
		public void examine() {
			switch (Player.getLocation().title) {
				case "Sand Exhibit":
					Story.print("The miniature zen garden has spiral and wave-like patterns combed through the sand.");
					break;
				case "Garden Patio":
				case "Garden Overlook":
				case "Wabe":
					Story.print("There are spiral and wave-like patterns combed through the sand.");
					break;
				default:
					Story.printNotHere();
					break;
			}
		}
		
		public void take(){
			switch (Player.getLocation().title) {
				case "Garden Patio":
				case "Sand Exhibit":
				case "Garden Overlook":
					Story.print("And ruin a beautiful piece of art?");
					break;
				default:
					Story.printNotHere();
					break;
			}
		}
	}
	
	public class Lever implements Item {
		public void examine() {
			if (Player.getLocation().title.equals("Hallway")) {
				Story.print("It's a wooden lever protruding from the west wall.");
			} else {
				Story.printNotHere();
			}
		}
		
		public void take(){
			if (Player.getLocation().title.equals("Hallway")) {
				Story.printCantTake();
			} else {
				Story.printNotHere();
			}
		}
		
		public static void pull() {
			if (Player.getLocation().title.equals("Hallway")) {
				if (World.OOO && !World.raDropped) {
					Story.printActivateHallway();
					World.raDropped = true;
					Room.closetObjects.add(Item.Ra.getTitle());
					Room.closet.scrollCount++;
					
					if (!Player.pulledHallwayLever) {
						Player.pulledHallwayLever = true;
						Data.updateScore(5);
					}
				} else {
					Story.print("You pull the lever, but nothing happens.");
				}
			} else {
				Story.printNotHere();
			}
		}
		
		public static void push() {
			if (Player.getLocation().title.equals("Hallway")) {
				Story.print("The lever doesn't seem to move in that direction.");
			} else {
				Story.printNotHere();
			}
		}
	}
	
	public class Bed implements Item {
		public void examine() {
			if (Player.getLocation().title.equals("Master Bedroom")) {
				Story.print("The bed looks quite comfortable.");
			} else {
				Story.printNotHere();
			}
		}
		
		public void take(){
			if (Player.getLocation().title.equals("Master Bedroom")) {
				Story.printNotAChance();
			}
		}
	}
	
	public class Mannequin implements Item {
		public void examine() {
			if (Player.getLocation().title.equals("Mannequin Room")) {
				Story.print("It's difficult to see in the dark, but these mannequins are garbed in traditional Japanese clothing.");
				
				if (!Player.tookParchment) {
					Story.print(" One of them is holding a parchment.");
				}
				
				if (!Player.examinedMannequin) {
					Room.mannequinRoomObjects.add(Parchment.getTitle());
				}
				
				Player.examinedMannequin = true;
			} else {
				Story.printNotHere();
			}
		}
		
		public void take(){
			if (Player.getLocation().title.equals("Mannequin Room")) {
				Story.print("The mannequins are too awkward to carry.");
			} else {
				Story.printNotHere();
			}
		}
	}
	
	public class Lattice implements Item {
		public void examine() {
			if (Player.getLocation().title.equals("Island")) {
				Story.printNothingSpecial();
			} else {
				Story.printNotHere();
			}
		}
		
		public void take(){
			if (Player.getLocation().title.equals("Island")) {
				Story.printCantTake();
			} else {
				Story.printNotHere();
			}
		}
		
		public void open() {
			if (Player.getLocation().title.equals("Island")) {
				Story.printCantOpen();
			} else {
				Story.printNotHere();
			}
		}
	}
	
	public class Snow implements Item {
		public void examine() {
			if (Player.getArea().equals("temple")) {
				Story.print("A flurry is falling gently on the surrounding pine trees.");
			} else {
				Story.printNotHere();
			}
		}
		
		public void take(){
			if (Player.getArea().equals("temple") && !Player.getLocation().title.equals("Hisachi Ichiro's House")) {
				Story.print("You take some snow into your hand, but it melts pretty quickly.");
			} else {
				Story.printNotHere();
			}
		}
	}
	
	public class Mountain implements Item {
		public void examine() {
			if (Player.getArea().equals("temple") && !Player.getLocation().title.equals("Hisachi Ichiro's House")) {
				Story.print("The mountain is enveloped in silent white snowfall.");
			} else {
				Story.printNotHere();
			}
		}
		
		public void take(){
			if (Player.getArea().equals("temple") && !Player.getLocation().title.equals("Hisachi Ichiro's House")) {
				Story.printInteresting();
			} else {
				Story.printNotHere();
			}
		}
	}
	
	public class Sandals implements Item {
		public void examine() {
			Story.printNothingSpecial();
		}
		
		public void take(){
			Story.printAlreadyHave();
		}
	}
	
	public class House implements Item {
		public void examine() {
			switch (Player.getLocation().title) {
				case "Top of Mountain":
					Story.print("You're too far away to adequately examine that.");
					break;
				case "Hamlet":
					Story.print("The snow-covered roof overhangs a front door, which is closed. Beside the door is a wooden post with a panel bolted to it.");
					break;
				case "Hisachi Ichiro's House":
					Story.print(Room.hisachiIchirosHouseDesc);
					break;
				default:
					Story.printNotHere();
					break;
			}
		}
		
		public void take(){
			switch (Player.getLocation().title) {
			case "Top of Mountain":
			case "Hamlet":
			case "Hisachi Ichiro's House":
				Story.printInteresting();
				break;
			default:
				Story.printNotHere();
				break;
		}
		}
	}
	
	public class Roof implements Item {
		public void examine() {
			switch (Player.getLocation().title) {
				case "Island":
				case "Hamlet":
					Story.printNothingSpecial();
					break;
				default:
					Story.printNotHere();
					break;
			}
		}
		
		public void take(){
			switch (Player.getLocation().title) {
				case "Island":
				case "Hamlet":
					Story.printInteresting();
					break;
				default:
					Story.printNotHere();
					break;
			}
		}
	}
	
	public class Deck implements Item {
		public void examine() {
			switch (Player.getLocation().title) {
				case "Pond":
				case "Living Room":
				case "Balcony":
				case "Creaky Deck":
				case "Overlook":
					Story.printNothingSpecial();
					break;
				default:
					Story.printNotHere();
					break;
			}
		}
		
		public void take(){
			switch (Player.getLocation().title) {
				case "Pond":
				case "Living Room":
				case "Balcony":
				case "Creaky Deck":
				case "Overlook":
					Story.printHow();
					break;
				default:
					Story.printNotHere();
					break;
			}
		}
	}
	
	public class Shop implements Item {
		public void examine() {
			switch (Player.getLocation().title) {
				case "Hondo":
				case "Trinket Shop":
					Story.printNothingSpecial();
					break;
				default:
					Story.printNotHere();
					break;
			}
		}
		
		public void take(){
			switch (Player.getLocation().title) {
				case "Hondo":
				case "Trinket Shop":
					Story.printHow();
					break;
				default:
					Story.printNotHere();
					break;
			}
		}
	}
	
	public class Hisachi implements Item {
		public void examine() {
			if (Player.getLocation().title.equals("Hisachi Ichiro's House")) {
				Story.print("Hisachi Ichiro is about your age. He is wearing glasses and a purple robe."); 
			} else {
				Story.printNotHere();
			}
		}
		
		public void take(){
			if (Player.getLocation().title.equals("Hisachi Ichiro's House")) {
				Story.printHow(); 
			} else {
				Story.printNotHere();
			}
		}
	}
	
	public class Painting implements Item {
		public void examine() {
			switch (Player.getLocation().title) {
				case "Wabe":
				case "Gallery":
				case "Assembly Room":
					Story.print("The contemporary Japanese paintings embody the spirit of springtime.");
					break;
				default:
					Story.printNotHere();
					break;
			}
		}
		
		public void take(){
			switch (Player.getLocation().title) {
				case "Wabe":
				case "Gallery":
				case "Assembly Room":
					Story.print("You wouldn't dare!");
					break;
				default:
					Story.printNotHere();
					break;
			}
		}
	}
	
	public class Hallway implements Item {
		public void examine() {
			if (Room.hasHallway()) {
				Story.printNothingSpecial();
			} else {
				Story.printNotHere();
			}
		}
		
		public void take(){
			if (Room.hasHallway()) {
				Story.printHow();
			} else {
				Story.printNotHere();
			}
		}
	}
	
	public class Blood implements Item {
		public void examine() {
			switch (Player.getLocation().title) {
				case "Avalokitesvara Shrine":
					if (!Player.purpleAlive) {
						Story.print("The pool of blood surrounds the body on the television screen.");
					} else {
						Story.printNotHere();
					}
					break;
				case "Master Bedroom":
					if (!Player.orangeAlive) {
						Story.print("The pool of blood surrounds the body on the television screen.");
					} else {
						Story.printNotHere();
					}
					break;
				case "Island":
					if (!Player.greenAlive) {
						Story.print("The pool of blood surrounds the body on the television screen.");
					} else {
						Story.printNotHere();
					}
					break;
				default:
					Story.printNotHere();
					break;
			}
		}
		
		public void take(){
			switch (Player.getLocation().title) {
				case "Avalokitesvara Shrine":
					if (Player.purpleAlive) {
						Story.printCantTake();
					} else {
						Story.printNotHere();
					}
					break;
				case "Master Bedroom":
					if (Player.orangeAlive) {
						Story.printCantTake();
					} else {
						Story.printNotHere();
					}
					break;
				case "Island":
					if (Player.greenAlive) {
						Story.printCantTake();
					} else {
						Story.printNotHere();
					}
					break;
				default:
					Story.printNotHere();
					break;
			}
		}
	}
	
	public class Picture implements Item {
		public void examine() {
			if (Player.hasScroll()) {
				Story.printNothingSpecial();
			} else {
				Story.printNotHere();
			}
		}
		
		public void take(){
			if (Player.hasScroll()) {
				Story.printAlreadyHave();
			} else {
				Story.printNotHere();
			}
		}
	}
	
	public class Wall implements Item {
		public void examine() {
			switch (Player.getLocation().title) {
				case "Island":
				case "Halfway up Mountain":
				case "Top of Mountain":
					Story.printNotHere();
					break;
				default:
					Story.printNothingSpecial();
					break;
			}
		}
		
		public void take(){
			switch (Player.getLocation().title) {
				case "":
				
					break;
				default:
					Story.printNotHere();
					break;
			}
		}
	}
	
	public class Junk implements Item {
		public void examine() {
			switch (Player.getLocation().title) {
				case "Theater":
				case "Butsudan of Kannon":
					Story.printNothingSpecial();
					break;
				default:
					Story.printNotHere();
					break;
			}
		}
		
		public void take(){
			switch (Player.getLocation().title) {
				case "Theater":
				case "Butsudan of Kannon":
					Story.printNoUse();
					break;
				default:
					Story.printNotHere();
					break;
			}
		}
	}
	
	public class Museum implements Item {
		public void examine() {
			switch (Player.getArea()) {
				case "garden":
					Story.print("The Adachi Museum of Art is a large network of hallways and exhibition rooms, half of which lead to outdoor areas. The artwork on display all embody the spirit of the season: springtime.");
					break;
				default:
					Story.printNotHere();
					break;
			}
		}
		
		public void take(){
			switch (Player.getArea()) {
				case "garden":
					Story.printInteresting();
					break;
				default:
					Story.printNotHere();
					break;
			}
		}
	}
	
	public class Temple implements Item {
		public void examine() {
			switch (Player.getLocation().title) {
				case "Top of Mountain":
				case "Hondo":
				case "Balcony":
				case "Butsudan of Kannon":
				case "Trinket Shop":
				case "Creaky Deck":
				case "Overlook":
					Story.print("The Kegon-ji temple sits high atop a snowy mountain, and appears to be over one thousand years old.");
					break;
				default:
					Story.printNotHere();
					break;
			}
		}
		
		public void take(){
			switch (Player.getLocation().title) {
				case "Top of Mountain":
				case "Hondo":
				case "Balcony":
				case "Butsudan of Kannon":
				case "Trinket Shop":
				case "Creaky Deck":
				case "Overlook":
					Story.printInteresting();
					break;
				default:
					Story.printNotHere();
					break;
			}
		}
	}
	
	public class Hut implements Item {
		public void examine() {
			switch (Player.getLocation().title) {
				case "Cobble Square":
				case "Thatched Hut":
					Story.print("The small hut was built with a straw ceiling at the south end of the cobble square.");
					break;
				default:
					Story.printNotHere();
					break;
			}
		}
		
		public void take(){
			switch (Player.getLocation().title) {
				case "Cobble Square":
				case "Thatched Hut":
					Story.printTooHeavy();
					break;
				default:
					Story.printNotHere();
					break;
			}
		}
	}
	
	public class Path implements Item {
		public void examine() {
			Story.printNothingSpecial();
		}
		
		public void take(){
			Story.printCantTake();
		}
	}
	
	public class Stairs implements Item {
		public void examine() {
			switch (Player.getLocation().title) {
				case "Hallway":
				case "Landing":
				case "Courtyard":
				case "Bottom of Mountain":
				case "Halfway up Mountain":
				case "Top of Mountain":
					Story.printNothingSpecial();
					break;
				default:
					Story.printNotHere();
					break;
			}
		}
		
		public void take(){
			switch (Player.getLocation().title) {
				case "Hallway":
				case "Landing":
				case "Courtyard":
				case "Bottom of Mountain":
				case "Halfway up Mountain":
				case "Top of Mountain":
					Story.printHow();
					break;
				default:
					Story.printNotHere();
					break;
			}
		}
	}
	
	public class Template implements Item {
		public void examine() {
			switch (Player.getLocation().title) {
				case "":
				
					break;
				default:
					Story.printNotHere();
					break;
			}
		}
		
		public void take(){
			switch (Player.getLocation().title) {
				case "":
				
					break;
				default:
					Story.printNotHere();
					break;
			}
		}
	}
}
