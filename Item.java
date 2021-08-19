import java.util.ArrayList;

public class Item {
	public static String omTitle = "faded scroll"; 
	public static String niTitle = "fancy scroll"; 
	public static String goTitle = "frosty scroll"; 
	public static String yuTitle = "crumpled scroll"; 
	public static String jiTitle = "smooth scroll"; 
	public static String raTitle = "dusty scroll"; 
	public static String shiTitle = "stained scroll"; 
	public static String bookTitle = "book"; 
	public static String rodTitle = "fishing pole"; 
	//public static String bookletTitle = "booklet"; 
	//public static String handbookTitle = "handbook"; 
	public static String cryptogramTitle = "cryptogram"; 
	public static String cornTitle = "kernel of corn"; 
	public static String parchmentTitle = "parchment"; 
	public static String cardTitle = "business card"; 
	public static String phoneTitle = "corded landline telephone"; 
	public static String boxTitle = "jewelled box"; 
	public static String swordTitle = "long sword"; 
	
	public static String omDesc = "Inscribed on the faded scroll is the sacred word OM. The sacred word is commited to memory and available to chant while meditating! Near the bottom, someone drew a picture of a human eye."; 
	public static String niDesc = "Inscribed on the fancy scroll is the sacred word NI. The sacred word is commited to memory and available to chant while meditating! Near the bottom, someone drew a picture of a human mouth."; 
	public static String goDesc = "Inscribed on the frosty scroll is the sacred word GO. The sacred word is commited to memory and available to chant while meditating! Near the bottom, someone drew a picture of a human ear."; 
	public static String yuDesc = "Inscribed on the crumpled scroll is the sacred word YU. The sacred word is commited to memory and available to chant while meditating! Near the bottom, someone drew a picture of a human heart."; 
	public static String jiDesc = "Inscribed on the smooth scroll is the sacred word JI. The sacred word is commited to memory and available to chant while meditating! Near the bottom, someone drew a picture of a human foot."; 
	public static String raDesc = "Inscribed on the dusty scroll is the sacred word RA. The sacred word is commited to memory and available to chant while meditating! Near the bottom, someone drew a picture of a human hand."; 
	public static String shiDesc = "Inscribed on the stained scroll is the sacred word SHI. The sacred word is commited to memory and available to chant while meditating! Near the bottom, someone drew a picture of a human nose."; 
	public static String rodDesc = "It is made of wood with a sharp hook tied to the line."; 
	public static String cornDesc = "It smells sweet."; 
	public static String parchmentDesc = "Inscribed on the parchment is the sacred symbol of the Lotus."; 
	public static String cardDesc = "The business card reads:\n\"Dance, Narrative, and Reiki Therapy.\nMeditation Instruction.\nCall Kimi!\nBusiness Contact: ";
	public static String phoneDesc = "The beige landline phone has a dialpad.";
	public static String boxDesc = "It's really fancy! There's a plaque on it.";
	public static String swordDesc = "It's really sharp.";
	/** COPYRIGHTED
	public static String bookDesc = "(scroll down)\n\nMAGICK IN THEORY AND PRACTICE\nBY THE MASTER THERION (ALEISTER CROWLEY)\nFirst published Paris: Lecram Press., 1930.\n   What is there in common between Christ, Buddha, and Mohammed? Is there any one point upon which all three are in accord?\n   Buddha was born a Prince, and died a beggar.\n   Mohammed was born a beggar, and died a Prince.\n   Christ remained obscure until many years after his death.\n   Elaborate lives of each have been written by devotees, and there is one thing common to all three -- an ommision. We hear nothing of Christ between the ages of twelve and thirty. Mohammed disappeared into a cave. Buddha left his place, and went for a long while into the desert. Each of them, perfectly silent up to the time of disappearance, came back and immediately began to preach a new law. A nobody goes away, and comes back a somebody.\n   The methods advised by all these people have a startling resemblance to one another. They recommend \"virtue\" (of various kinds), solitude, absence of excitement, moderation in diet, and finally a practice which some call prayer and some call meditation.\n   On investigating what is meant by these two things, we find that they are only one. For what is the state of either prayer or meditation? It is the restraining of the mind to a single act, state, or thought.\n   If proper conditions are met, something happens whose nature may form the subject of a further discussion later on. For the moment let it suffice to say that this consciousness of the Ego and the non-Ego, the seer and the thing seen, the knower and the thing known, is blotted out. There is usually an intense light, an intense sound, and a feeling of such overwhelming bliss that the resources of language have been exhausted again and again in the attempt to describe it.\n   It is an absolute knock-out blow to the mind. It is so vivid and tremendous that those who experience it are in the gravest danger of losing all sense of proportion.\n   By its light all other events of life are as darkness. Owing to this, people have utterly failed to analyse it or to estimate it.\n   As it will be seen later, the \"vision of God,\" or \"Samadhi,\" or whatever we may agree to call it, has many kinds and many degrees, although there is an impassable abyss between the least of them and the greatest of all the phenomena of normal consciousness.\n   I: VISUALIZATION\nThe moment then that the student takes a simple subject -- or rather a simple object or symbol -- and visualizes it, he will find that it is not so much his creature as he supposed. Other thoughts will invade the mind, so that the object is altogether forgotten, perhaps for whole minutes at a time; and at other times the object itself will begin to play all sorts of tricks.\n   II: CHANT\nThe best way to time the breathing, is by the use of a mantra, or chant. The chant acts on the thoughts very much as Pranayama does upon the breath. The thought is bound down to a recurring cycle; any intruding thoughts are thrown off by the chant, just as pieces of putty would be from a fly-wheel; and the swifter the wheel the more difficult would it be for anything to stick.\n   Any sentence may be used as a chant, and possibly the Hindus are correct in thinking that there is a particular sentence best suited to any particular student, or possibly the Shingon Buddhists were correct in thinking that there is a particular location best suited to any particular mantra.\n   You have not even begun to master a mantra until it continues unbroken through sleep. This is much easier than it sounds.\n   By the time that you are meditating two or three hours a day, and filing up most of the rest of the day with other practices designed to assist, when nearly every time something or other happens, and there is constantly a feeling of being \"on the brink of something pretty big,\" one may expect to proceed to the next state -- Samadhi.\n   And there is this anchor for the beginner, that his work is cumulative: every act directed towards attainment builds up a destiny which must some day come to fruition. May all attain!";
	*/
	/** DONT NEED THIS
	public static String handbookDesc = "Hanzo's\n Handy\n   Fishing\n    Handbook\n\n   Whether you're a novice or a veteran, the fundamentals are the same for everybody. People of all ages and skills can enjoy the pleasures of fishing.\n   First, you need to pick a spot. Talk to local fisherman for tips on locations. Make sure you're not trespassing onto private property!\n   Next you need to decide on a rod. Typically, a medium length pole will be appropriate for most beginners. Pick a rod that's roughly as long as you are tall and that's a comfortable weight for your casting arm.\n   Additionaly, you need to choose the right bait for the fish you're trying to catch. You can either purchase live bait at the local angling shop, or you can gather your own.\n   Once you've gotten everything together and arrive at your spot, you need to bait your hook. While it depends on the kind of bait you're using, in general, you'll want to work the hook through your bait as many times as possible to keep it securely on the hook.\n   Now the fun begins! Cast your line. Most beginners will cast side arm, using the same motion used to skip a stone across water. Bring the rod back to your side and bring it smoothly in the direction you'd like to cast, releasing the line as you point in the right direction.\n   Wait quietly. You can tell if a fish is biting by touch, or by watching a loose line or a bobber.\n   Once you hooked a fish, keep the line tight and reel it in! Decide if you are releasing or keeping the fish. If the fish is too small, toss it bacck gently into the water. If you are going to cook the fish, you may want to consider cleaning the fish at this point, or keeping it alive in an underwater cage for the purpose and cleaning it later.\n   Further reading:\n   Hanzo's Handy Sailing Handbook\n   Hanzo's Handy Yoga Handbook\n   Hanzo's Handy Tea Ceremony Handbook\n   Hanzo's Handy Bunraku Handbook";
	*/
	
	// REWRITE
	public static String bookDesc = "   BUNRAKU\n   Bunraku is a form of Japanese puppet theater that blends elements of music and storytelling to create a powerful performance that has been revered in Japanese culture for hundreds of years.\n   Three puppeteers will manipulate a single puppet: the one with the most experience will control the head and right hand, the second will move the left hand, and the third operates the legs. Great care was crafted into the puppet's facial mechanics to best emulate the emotions of humans.\n   The puppeteers perform in full view of the audience, generally wearing black robes. Over time, the audience begins to ignore the visible puppeteers for the purpose of deepening their immersion.";
	
	// COPYRIGHTED
	public static String cryptogramDesc = "   Emei Mantra: eye, ear, hand, foot, heart, heart, mouth, foot, ear, ear, heart, mouth, hand, foot.\n   Gohogo Mantra: mouth, heart, foot, eye, eye, nose, nose, foot, nose, hand, eye, ear, nose, nose.\n   Heart Sutra: ear, foot, ear, foot, heart, hand, nose, eye, foot, ear, foot, mouth, hand, nose.\n   Luminous Sutra: heart, nose, ear, mouth, mouth, foot, eye, foot, nose, hand, ear, mouth, ear, heart.\n   Mantra of Harmony: eye, foot, ear, foot, mouth, hand, nose, ear, heart, ear, foot, heart, hand, nose.\n   Mantra of Light: eye, hand, heart, mouth, nose, heart, hand, ear, mouth, heart, foot, nose, heart, hand.\n   Mantra of Radiance: ear, heart, foot, hand, nose, eye, mouth, ear, heart, foot, hand, nose, ear, mouth.\n   Sutra of Peace: hand, ear, mouth, heart, foot, nose, heart, hand, heart, hand, heart, mouth, nose, heart.\n   Sutra of Shadow: ear, ear, hand, heart, eye, nose, ear, mouth, heart, eye, hand, mouth, nose, ear.";
	
	public String title;
	public String desc;
	
	public Item(String title, String desc) {
		this.title = title;
		this.desc = desc;
	}
	
	public static Item om = new Item(omTitle, omDesc);
	public static Item ni = new Item(niTitle, niDesc);
	public static Item go = new Item(goTitle, goDesc);
	public static Item yu = new Item(yuTitle, yuDesc);
	public static Item ji = new Item(jiTitle, jiDesc);
	public static Item ra = new Item(raTitle, raDesc);
	public static Item shi = new Item(shiTitle, shiDesc);
	//public static Item book = new Item(bookTitle, bookDesc);
	public static Item rod = new Item(rodTitle, rodDesc);
	public static Item book = new Item(bookTitle, bookDesc);
	//public static Item handbook = new Item(handbookTitle, handbookDesc);
	public static Item cryptogram = new Item(cryptogramTitle, cryptogramDesc);
	public static Item corn = new Item(cornTitle, cornDesc);
	public static Item parchment = new Item(parchmentTitle, parchmentDesc);
	public static Item card = new Item(cardTitle, cardDesc);
	public static Item phone = new Item(phoneTitle, phoneDesc);
	public static Item box = new Item(boxTitle, boxDesc);
	public static Item sword = new Item(swordTitle, swordDesc);
	
	public String getTitle() {
		return this.title;
	}
	
	
	public static String getTitleOfObjectInList(int i) {
		switch (Player.getLocation().title) {
			case "Garden Patio":
				return Room.gardenPatioObjects.get(i).title;
			case "Cobble Square":
				return Room.cobbleSquareObjects.get(i).title;
			case "Tea Room":
				return Room.teaRoomObjects.get(i).title;
			case "Sand Exhibit":
				return Room.sandExhibitObjects.get(i).title;
			case "Thatched Hut":
				return Room.thatchedHutObjects.get(i).title;
			case "Garden Overlook":
				return Room.gardenOverlookObjects.get(i).title;
			case "Lounge":
				return Room.loungeObjects.get(i).title;
			case "Cafe":
				return Room.cafeObjects.get(i).title;
			case "Outside Gallery":
				return Room.outsideGalleryObjects.get(i).title;
			case "Shrine Room 1":
				return Room.shrineRoom1Objects.get(i).title;
			case "Inside Gallery":
				return Room.insideGalleryObjects.get(i).title;
			case "Assembly Room":
				return Room.assemblyRoomObjects.get(i).title;
			case "Shrine Room 2":
				return Room.shrineRoom2Objects.get(i).title;
			case "Living Room":
				return Room.livingRoomObjects.get(i).title;
			case "Pond":
				return Room.pondObjects.get(i).title;
			case "Courtyard":
				return Room.courtyardObjects.get(i).title;
			case "Landing":
				return Room.landingObjects.get(i).title;
			case "Hallway":
				return Room.hallwayObjects.get(i).title;
			case "Sitting Room":
				return Room.sittingRoomObjects.get(i).title;
			case "Study":
				return Room.studyObjects.get(i).title;
			case "Master Bedroom":
				return Room.masterBedroomObjects.get(i).title;
			case "Closet":
				return Room.closetObjects.get(i).title;
			case "Dark Passageway":
				return Room.darkPassagewayObjects.get(i).title;
			case "Mannequin Room":
				return Room.mannequinRoomObjects.get(i).title;
			case "Theater":
				return Room.theaterObjects.get(i).title;
			case "Forest":
				return Room.forestObjects.get(i).title;
			case "Gate":
				return Room.gateObjects.get(i).title;
			case "Island":
				return Room.islandObjects.get(i).title;
			case "Bottom of Mountain":
				return Room.bottomOfMountainObjects.get(i).title;
			case "Top of Mountain":
				return Room.topOfMountainObjects.get(i).title;
			case "Hamlet":
				return Room.hamletObjects.get(i).title;
			case "Hondo":
				return Room.hondoObjects.get(i).title;
			case "Balcony":
				return Room.balconyObjects.get(i).title;
			case "Shrine Room 3":
				return Room.shrineRoom3Objects.get(i).title;
			case "Trinket Shop":
				return Room.trinketShopObjects.get(i).title;
			case "Creaky Deck":
				return Room.creakyDeckObjects.get(i).title;
			case "Overlook":
				return Room.overlookObjects.get(i).title;
			default:
				System.out.println("getTitleOfObjectInList() error");
				return null;
		}
	}
	
	public static void getBook() {
		Story.printTake(bookTitle);
		Player.inventory.add(book);
		Room.getObjects().remove(book);
	}
	
	public static void getScroll() {
		if (Room.getObjects().contains(om) || (Player.getLocation().title.equals("Lounge") && World.loungeSafeOpen && World.omInSafe))
			getOm();
		
		if (Room.getObjects().contains(ni) || (Player.getLocation().title.equals("Study") && World.studySafeOpen && World.niInSafe))
			getNi();
		
		if (Room.getObjects().contains(go) || (Player.getLocation().title.equals("Creaky Deck") && World.creakyDeckOpen && World.goInCase))
			getGo();
		
		if (Room.getObjects().contains(yu) || (World.yuInBox && World.boxOpen && (Player.inventory.contains(box) || Room.getObjects().contains(box))))
			getYu();
		
		if (Room.getObjects().contains(ji) || (World.jiInSafe && World.shrineRoom1SafeOpen && (Player.inventory.contains(ji))))
			getJi();
		
		if (Room.getObjects().contains(ra))
			getRa();
		
		if (Room.getObjects().contains(shi))
			getShi();
	}
	
	public static void getOm() {
		Story.printTake(omTitle);
		Player.inventory.add(om);
		Room.getObjects().remove(om);
		
		if (World.omInSafe) {
			World.omInSafe = false;
		} else {
			Room.removeScroll();
		}
	}
	
	public static void getNi() {
		Story.printTake(niTitle);
		Player.inventory.add(ni);
		Room.getObjects().remove(ni);
		
		if (World.niInSafe) {
			World.niInSafe = false;
		} else {
			Room.removeScroll();
		}
	}
	
	public static void getGo() {
		Story.printTake(goTitle);
		Player.inventory.add(go);
		Room.getObjects().remove(go);
	
		if (World.goInCase) {
			World.goInCase = false;
		} else {
			Room.removeScroll();
		}
	}
	
	public static void getYu() {
		Story.printTake(yuTitle);
		Player.inventory.add(yu);
		Room.getObjects().remove(yu);

		if (World.yuInBox) {
			World.yuInBox = false;
		} else {
			Room.removeScroll();
		}
	}
	
	public static void getJi() {
		Story.printTake(jiTitle);
		Player.inventory.add(ji);
		Room.getObjects().remove(ji);
		Room.removeScroll();
		
		if (World.jiInSafe) {
			World.jiInSafe = false;
		} else {
			Room.removeScroll();
		}
	}
	
	public static void getRa() {
		Story.printTake(raTitle);
		Player.inventory.add(ra);
		Room.getObjects().remove(ra);
		Room.removeScroll();
	}
	
	public static void getShi() {
		Story.printTake(shiTitle);
		Player.inventory.add(shi);
		Room.getObjects().remove(shi);
		Room.removeScroll();
	}
	
	public static void getRod() {
		Story.printTake(rodTitle);
		Player.inventory.add(rod);
		Room.getObjects().remove(rod);
	}
	
	/**
	public static void getBooklet() {
		Story.printTake(bookletTitle);
		Player.inventory.add(booklet);
		Room.getObjects().remove(booklet);
	}
	*/
	
	/**
	public static void getHandbook() {
		Story.printTake(handbookTitle);
		Player.inventory.add(cryptogram);
		Room.getObjects().remove(handbook);
	}
	*/
	
	public static void getCryptogram() {
		if (Room.getObjects().contains(cryptogram)) {
			Story.printTake(cryptogramTitle);
			Player.inventory.add(cryptogram);
			Room.getObjects().remove(cryptogram);
		} else if (Player.inventory.contains(cryptogram)) {
			Story.printAlreadyHave();
		} else {
			Story.printNotHere();
		}
	}
	
	public static void getCorn() {
		if (Room.getObjects().contains(corn)) {
			Story.printTake(cornTitle);
			Player.inventory.add(corn);
			Room.getObjects().remove(corn);
		} else if (Player.inventory.contains(corn)) {
			Story.printAlreadyHave();
		} else {
			Story.printNotHere();
		}
	}
	
	public static void getParchment() {
		if (Room.getObjects().contains(parchment)) {
			Story.printTake(parchmentTitle);
			Player.inventory.add(parchment);
			Room.getObjects().remove(parchment);
		} else if (Player.inventory.contains(parchment)) {
			Story.printAlreadyHave();
		} else {
			Story.printNotHere();
		}
	}
	
	public static void getCard() {
		if (Room.getObjects().contains(card)) {
			Story.printTake(cardTitle);
			Player.inventory.add(card);
			Room.getObjects().remove(card);
		} else if (Player.inventory.contains(card)) {
			Story.printAlreadyHave();
		} else {
			Story.printNotHere();
		}
	}
	
	public static void getPhone() {
		if (Room.getObjects().contains(phone)) {
			Story.printTake(phoneTitle);
			Player.inventory.add(phone);
			Room.getObjects().remove(phone);
		} else if (Player.inventory.contains(phone)) {
			Story.printAlreadyHave();
		} else {
			Story.printNotHere();
		}
	}
	
	public static void getBox() {
		if (Room.getObjects().contains(box)) {
			Story.printTake(boxTitle);
			Player.inventory.add(box);
			Room.getObjects().remove(box);
		} else {
			Story.printNotHere();
		}
	}
	
	public static void getSword() {
		if (Player.inventory.contains(sword)) {
			Story.printAlreadyHave();
		} else if (Room.getObjects().contains(sword)) {
			Player.inventory.add(sword);
			Story.print("Taken.");
		} else {
			Story.printNotHere();
		}
	}
	
	public static void dropScroll() {
		if (Player.inventory.contains(om)) {
			Player.inventory.remove(om);
			Room.getObjects().add(om);
			Room.addScroll();
			Story.print("Dropped.");
		} else {
			Story.printNotInInventory();
		}

		if (Player.inventory.contains(ni)) {
			Player.inventory.remove(ni);
			Room.getObjects().add(ni);
			Room.addScroll();
			Story.print("Dropped.");
		} else {
			Story.printNotInInventory();
		}

		if (Player.inventory.contains(go)) {
			Player.inventory.remove(go);
			Room.getObjects().add(go);
			Room.addScroll();
			Story.print("Dropped.");
		} else {
			Story.printNotInInventory();
		}

		if (Player.inventory.contains(yu)) {
			Player.inventory.remove(yu);
			Room.getObjects().add(yu);
			Room.addScroll();
			Story.print("Dropped.");
		} else {
			Story.printNotInInventory();
		}

		if (Player.inventory.contains(ji)) {
			Player.inventory.remove(ji);
			Room.getObjects().add(ji);
			Room.addScroll();
			Story.print("Dropped.");
		} else {
			Story.printNotInInventory();
		}

		if (Player.inventory.contains(ra)) {
			Player.inventory.remove(ra);
			Room.getObjects().add(ra);
			Room.addScroll();
			Story.print("Dropped.");
		} else {
			Story.printNotInInventory();
		}

		if (Player.inventory.contains(shi)) {
			Player.inventory.remove(shi);
			Room.getObjects().add(shi);
			Room.addScroll();
			Story.print("Dropped.");
		} else {
			Story.printNotInInventory();
		}
	}
	
	public static void examineBook() {
		if (Player.inventory.contains(book) || Room.getObjects().contains(book)) {
			Story.print(bookDesc);
			// Story.setScrollStop(Story.scrollStopBook);
			
			if (!Player.readBook) {
				Player.readBook = true;
				Data.updateScore(5);
			}
		} else {
			Story.printNotHere();
		}
	}
	
	public static void examineOm() {
		if (Room.getObjects().contains(om) || Player.inventory.contains(om) || (Player.getLocation().title.equals("Lounge") && World.loungeSafeOpen && World.omInSafe)) {
			Story.print(om.desc);
			
			if (!Player.memory.contains("om")) {
				Player.memory.add("om");
				Data.updateScore(10);
			}
		} else {
			Story.printNotHere();
		}
	}
	
	public static void examineNi() {
		if (Room.getObjects().contains(ni) || Player.inventory.contains(ni) || (Player.getLocation().title.equals("Study") && World.studySafeOpen && World.niInSafe)) {
			Story.print(ni.desc);
		
			if (!Player.memory.contains("ni")) {
				Player.memory.add("ni");
				Data.updateScore(10);
			}
		} else {
			Story.printNotHere();
		}
	}
	
	public static void examineGo() {
		if (Room.getObjects().contains(go) || Player.inventory.contains(go) || (Player.getLocation().title.equals("Creaky Deck") && World.creakyDeckOpen && World.goInCase)) {
			Story.print(go.desc);
		
			if (!Player.memory.contains("go")) {
				Player.memory.add("go");
				Data.updateScore(10);
			}
		} else {
			Story.printNotHere();
		}
	}
	
	public static void examineYu() {
		if (Room.getObjects().contains(yu) || Player.inventory.contains(yu) || (World.yuInBox && World.boxOpen && (Player.inventory.contains(box) || Room.getObjects().contains(box)))){
			Story.print(yu.desc);
		
			if (!Player.memory.contains("yu")) {
				Player.memory.add("yu");
				Data.updateScore(10);
			}
		} else{
			Story.printNotHere();
		}
	}
	
	public static void examineJi() {
		if (Room.getObjects().contains(ji) || Player.inventory.contains(ji) || (World.jiInSafe && World.shrineRoom1SafeOpen && Player.getLocation().title.equals("Shrine Room 1"))) {
			Story.print(ji.desc);
		
			if (!Player.memory.contains("ji")) {
				Player.memory.add("ji");
				Data.updateScore(10);
			}
		} else {
			Story.printNotHere();
		}
	}
	
	public static void examineRa() {
		if (Room.getObjects().contains(ra) || Player.inventory.contains(ra)) {
			Story.print(ra.desc);
		
			if (!Player.memory.contains("ra")) {
				Player.memory.add("ra");
				Data.updateScore(10);
			}
		} else {
			Story.printNotHere();
		}
	}
	
	public static void examineShi() {
		if (Room.getObjects().contains(shi) || Player.inventory.contains(shi)) {
			Story.print(shi.desc);
		
			if (!Player.memory.contains("shi")) {
				Player.memory.add("shi");
				Data.updateScore(10);
			}
		} else {
			Story.printNotHere();
		}
	}
	
	public static void attemptToExamineScroll() {
		if (Player.getLocation().equals(Room.hallway)) {
			// Hallway is the only location where a scroll can be seen but not accessible. For this reason, this condition is necessary
			if (World.getScrollCount() == 0) {
				if (World.raDropped) {
					Story.printNotHere();
				} else {
					Story.print("The glass panel prevents you from getting to the scroll.");
				}
			} else {
				Story.print("Which one?");
			}
		} else {
			if (World.getScrollCount() == 0) {
				Story.printNotHere();
			} else if (World.getScrollCount() > 1) {
				Story.print("Which one?");
			} else {
				examineScroll();
			}
		}
	}
	
	public static void examineScroll() {
		if (Room.getObjects().contains(om) || Player.inventory.contains(om) || (Player.getLocation().title.equals("Lounge") && World.loungeSafeOpen && World.omInSafe))
			examineOm();
		
		if (Room.getObjects().contains(ni) || Player.inventory.contains(ni) || (Player.getLocation().title.equals("Study") && World.studySafeOpen && World.niInSafe))
			examineNi();
		
		if (Room.getObjects().contains(go) || Player.inventory.contains(go) || (Player.getLocation().title.equals("Creaky Deck") && World.creakyDeckOpen && World.goInCase))
			examineGo();
		
		if (Room.getObjects().contains(yu) || Player.inventory.contains(yu) || (World.yuInBox && World.boxOpen && (Player.inventory.contains(box) || Room.getObjects().contains(box))))
			examineYu();
		
		if (Room.getObjects().contains(ji) || Player.inventory.contains(ji) 
		|| (Player.getLocation().title.equals("Shrine Room 1") && World.jiInSafe && World.shrineRoom1SafeOpen))
			examineJi();
		
		if (Room.getObjects().contains(ra) || Player.inventory.contains(ra))
			examineRa();
		
		if (Room.getObjects().contains(shi) || Player.inventory.contains(shi))
			examineShi();
	}
	
	public static void examineRod() {
		if (Player.inventory.contains(rod) || Room.getObjects().contains(rod)) {
			Story.print(rodDesc);
			
			if (World.cornOnRod)
				Story.print(" A kernel of corn is on the hook.");
		} else {
			Story.printNotHere();
		}
	}
	
	/**
	public static void examineBooklet() {
		if (Player.inventory.contains(booklet) || Room.getObjects().contains(booklet)) {
			Story.print(bookletDesc);
		} else {
			Story.printNotHere();
		}
	}
	*/
	
	/**
	public static void examineHandbook() {
		if (Player.inventory.contains(handbook) || Room.getObjects().contains(handbook)) {
			Story.print(handbookDesc);
		} else {
			Story.printNotHere();
		}
	}
	*/
	
	public static void examineCryptogram() {
		if (Player.inventory.contains(cryptogram) || Room.getObjects().contains(cryptogram)) {
			Story.print(cryptogramDesc);
			// Story.setScrollStop(Story.scrollStopCryptogram);
			
			if (!Player.readCryptogram) {
				Player.readCryptogram = true;
				Data.updateScore(5);
			}
		} else {
			Story.printNotHere();
		}
	}
	
	public static void examineSign() {
		switch (Player.getLocation().title) {
			case "Sand Exhibit":
				Story.print(Story.sandExhibitSign);
				break;
			case "Shrine Room 2":
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
				
				if (!Player.memory.contains("Knot")) {
					Story.printMemorizeSymbol();
					Player.memory.add("Knot");
					Data.updateScore(10);
				}
				break;
			case "Hondo":
				Story.print(Story.hondoSign);
				break;
			case "Shrine Room 3":
				Story.print(Story.shrineRoom3Sign);
				break;
			default:
				Story.printNotHere();
				break;
		}
	}
	
	public static void examineLever() {
		if (Player.getLocation().title.equals("Hallway")) {
			Story.print("It's a wooden lever protruding from the west wall.");
		} else {
			Story.printNotHere();
		}
	}
	
	public static void examineCorn() {
		if (Player.inventory.contains(corn) || Room.getObjects().contains(corn)) {
			Story.print(cornDesc);
		} else {
			Story.printNotHere();
		}
	}
	
	public static void examineWindow() {
		switch (Player.getLocation().title) {
			case "Master Bedroom":
				Story.print("You're on the second story.");
				break;
			case "Hallway":
				examineChute();
				break;
			case "Living Room":
				Story.print("A masked woman in a blue kimono is standing outside the west window.");
				break;
			default:
				Story.printNotHere();
				break;
		}
	}
	
	public static void examineChute() {
		switch (Player.getLocation().title) {
			case "Hallway":
				Story.print("It's a damn chute.");
				break;
			case "Closet":
				Story.print("It's a damn chute.");
				break;
			default:
				Story.printNotHere();
				break;
		}
	}
	
	public static void examineChest() {
		if (Player.getLocation().title.equals("Assembly Room")) {
			Story.print("It's gold and there's a plaque on the front of it.");
		} else {
			Story.printNotHere();
		}
	}
	
	public static void examineFigure() {
		if (Player.getLocation().title.equals("Assembly Room")) {
			Story.print("They are wearing black hooded robes.");
		} else {
			Story.printNotHere();
		}
	}
	
	public static void examineBed() {
		if (Player.getLocation().title.equals("Master Bedroom")) {
			Story.print("The bed looks quite comfortable.");
		} else {
			Story.printNotHere();
		}
	}
	
	public static void examineMannequin() {
		if (Player.getLocation().title.equals("Mannequin Room")) {
			Player.examinedMannequin = true;
			
			Story.print("It's difficult to see in the dark, but these mannequins are garbed in traditional Japanese clothing.");
			
			if (!Player.tookParchment) {
				Story.print(" One of them is holding a parchment.");
			}
			
			if (!Player.examinedMannequin) {
				Room.mannequinRoomObjects.add(parchment);
			}
		} else {
			Story.printNotHere();
		}
	}
	
	public static void examineBirds() {
		// if at overlook or shrine1 w right screen
		if (Player.getLocation().title.equals("Overlook")) {
			Story.print("The birds are colorful and on a hinge thing where you can maybe move it hint hint.");
		} else if (Player.getLocation().title.equals("Shrine Room 1") && Player.purpleAlive) {
			Story.print("The oragami birds on the TV are so colorful and encompass the whole screen");
		} else {
			Story.printNotHere();
		}
	}
	
	public static void examineSofa() {
		if (Player.getLocation().title.equals("Lounge")) {
			Story.print("Its red cushions look comfortable.");
		} else {
			Story.printNotHere();
		}
	}
	
	public static void examineExhibit() {
		if (Player.getLocation().title.equals("Sand Exhibit")) {
			Story.print("Its a sand exhibit.");
		} else {
			Story.printNotHere();
		}
	}
	
	public static void examineParchment() {
		if (Player.inventory.contains(parchment) || Room.getObjects().contains(parchment)) {
			Story.print(parchmentDesc);
			
			if (!Player.memory.contains("Lotus")) {
				Story.printMemorizeSymbol();
				Player.memory.add("Lotus");
				Data.updateScore(10);
			}
		} else {
			Story.printNotHere();
		}
	}
	
	public static void examineCard() {
		if (Player.inventory.contains(card) || Room.getObjects().contains(card)) {
			Story.print(cardDesc);
			Story.print(Data.kimisNumber + "\"");
			
			if (!Player.examinedCard) {
				Player.examinedCard = true;
				Data.updateScore(5);
			}
		} else {
			Story.printNotHere();
		}
	}	
	
	public static void examinePhone() {
		if (Player.inventory.contains(phone) || Room.getObjects().contains(phone)) {
			Story.print(phoneDesc);
		} else {
			Story.printNotHere();
		}
	}	
	
	public static void examineBox() {
		if (Player.inventory.contains(box) || Room.getObjects().contains(box)) {
			Story.print(boxDesc);
		} else {
			Story.printNotHere();
		}
	}	
	
	public static void examineMirror() {
		switch (Player.getLocation().title) {
			case "Thatched Hut":
				if (Player.dreaming) {
					Story.print("The Chippendale mirror casts your reflection back at you. You are wearing a black hooded robe.");
				} else {
					Story.print("The Chippendale mirror casts your reflection back at you. Your loosely kept hair goes well with your faded orange robe.");
				}
				break;
			case "Study":
				Story.print("The Chippendale mirror casts your reflection back at you. Your loosely kept hair goes well with your faded green robe.");
				break;
			case "Trinket Shop":
				Story.print("The Chippendale mirror casts your reflection back at you. Your loosely kept hair goes well with your faded purple robe.");
				break;
			default:
				Story.printNotHere();
				break;
		}
	}
	
	public static void examineCase() {
		switch (Player.getLocation().title) {
			case "Creaky Deck":
				if (World.creakyDeckOpen) {
					Story.print("The wooden case is open.");
				} else {
					Story.print("The wooden case is like a cabinet with a plank door, which conceals whatever is hidden inside it.");
				}
				break;
			default:
				Story.printNotHere();
				break;
		}
	}
	
	public static void getMirror() {
		if (Player.getLocation().title.equals("Thatched Hut") || Player.getLocation().title.equals("Study") || Player.getLocation().title.equals("Trinket Shop")) {
			Story.print("The mirror is too heavy to move.");
		} else {
			Story.printNotHere();
		}
	}
	
	public static void examineTV() {
		Story.print("It's red and black. Nintendo Sharp Television. On the screen is ");
		
		switch (Player.getLocation().title) {
			case "Shrine Room 1":
				if (Player.purpleAlive) {
					Story.print("a colorful array of oragami birds.");
				} else {
					Story.print("a snowy overlook.");
				}
				break;
			case "Master Bedroom":
				if (Player.orangeAlive) {
					Story.print("an empty cafe.");
				} else {
					Story.print("an empty cafe, with a dead monk in the distance.");
				}
				break;
			case "Island":
				if (Player.greenAlive) {
					Story.print("an empty living room.");
				} else {
					Story.print("a dead monk in a living room.");
				}
				break;
			case "Theater":
			
				break;
			default:
				System.out.println("examineTV() error");
				break;
		}
		
		Story.print(" There is a rewind button, a fastforward button, and a play button.");
	}
	
	public static void examineDoor() {
		switch (Player.getLocation().title) {
			case "Sand Exhibit":
				Story.print("It has a metal plaque bolted on it.");
				break;
			case "Shrine Room 1":
				Story.print("It has a metal plaque bolted on it.");
				break;
			case "Shrine Room 2":
				Story.print("It's a wooden sliding door on the west wall.");
				break;
			case "Dark Passageway":
				Story.print("It's a wooden sliding door on the east wall.");
				break;
			case "Courtyard":
				Story.printNothingSpecial();
				break;
			case "Closet":
				Story.printNothingSpecial();
				break;
			case "Hamlet":
				Story.printNothingSpecial();
				break;
			default:
				Story.printNotHere();
				break;
		}
	}
	
	public static void examineSafe() {
		switch (Player.getLocation().title) {
			case "Shrine Room 1":
				Story.print("It has a metal plaque bolted on it.");
				break;
			case "Lounge":
				Story.print("It has a metal plaque bolted on it.");
				break;
			case "Study":
				Story.print("It has a metal plaque bolted on it.");
				break;
			default:
				Story.printNotHere();
				break;
		}
	}
	
	public static void putCorn() {
		switch (Parser.sentence.get(2)) {
			case "":
				Story.printMissingNoun();
				break;
			case "ROD":
				if (Player.inventory.contains(rod) && Player.inventory.contains(corn)) {
					Story.printBait();
					World.cornOnRod = true;
					Player.inventory.remove(corn);
					
					if (!Player.baitedRod) {
						Player.baitedRod = true;
						Data.updateScore(5);
					}
				} else {
					Story.printHow();
				}
				break;
			case "Pond":
				if (Player.getLocation().title.equals("Pond") && Player.inventory.contains(corn)) {
					Story.print("The corn lands in the pond with a \"plop.\" You see a koi fish gobble it up.");
					Player.inventory.remove(corn);
				} else {
					Story.printNotHere();
				}
				break;
			default:
				Story.invalid();
				break;
		}
	}
	
	public static void examineBasin() {
		if (Player.getLocation().title.equals("Hondo")) {
			Story.print(Story.hondoSign);
		} else {
			Story.printNotHere();
		}
	}
	
	public static void takeSign() {
		if (Room.hasSign()) {
			Story.printCantTake();
		} else {
			Story.printNotHere();
		}
	}
	
	public static void takeDoor() {
		if (Room.hasDoor()) {
			Story.printCantTake();
		} else {
			Story.printNotHere();
		}
	}
	
	public static void takeWindow() {
		if (Room.hasWindow()) {
			Story.printInteresting();
		} else {
			Story.printNotHere();
		}
	}
	
	public static void takeSafe() {
		if (Room.hasSafe()) {
			Story.printCantTake();
		} else {
			Story.printNotHere();
		}
	}
	
	public static void takeSofa() {
		if (Player.getLocation().title.equals("Lounge")) {
			Story.printCantTake();
		} else {
			Story.printNotHere();
		}
	}
	
	public static void takePlaque() {
		if (Room.roomsWithPlaques.contains(Player.getLocation()) || (Player.inventory.contains(box) || Room.getObjects().contains(box))) {
			Story.printCantTake();
		} else {
			Story.printNotHere();
		}
	}
	
	public static void openWindow() {
		if (Room.hasWindow()) {
			Story.print("It won't budge.");
		} else {
			Story.printNotHere();
		}
	}
	
	public static void takeLattice() {
		if (Player.getLocation().title.equals("Island")) {
			Story.printCantTake();
		} else {
			Story.printNotHere();
		}
	}
	
	public static void examineLattice() {
		if (Player.getLocation().title.equals("Island")) {
			Story.printNothingSpecial();
		} else {
			Story.printNotHere();
		}
	}
	
	public static void openLattice() {
		if (Player.getLocation().title.equals("Island")) {
			Story.printCantOpen();
		} else {
			Story.printNotHere();
		}
	}
	
	public static void examineShrine() {
		switch (Player.getLocation().title) {
			case "Shrine Room 1":
				Story.print(Story.shrine1Desc);
				break;
			case "Shrine Room 2":
				Story.print(Story.shrine2Desc);
				break;
			case "Shrine Room 3":
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
	
	public static void examineSnow() {
		if (Player.getArea().equals("temple")) {
			Story.printNothingSpecial();
		} else {
			Story.printNotHere();
		}
	}
}
