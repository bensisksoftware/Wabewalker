import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Story {
	private static String help = "The parser understands one or two word commands such as LOOK or READ BOOK.\nShortcuts:\ngo north = n\ngo south = s\ngo east = e\ngo west = w\ngo northeast = ne\ngo northwest = nw\ngo southeast = se\ngo southwest = sw\nup = u\ndown = d\nlook = l\nexamine = x\ninventory = i\nmemory = m\nhelp = h\nwait = z\nrewind = rw\nfastforward = ff";
	private static String invalid = "That is a sentence I don't understand."; // Frotz copyright?
	private static String tooManySpaces = "There are too many words and/or spaces in that sentence. Try to pair a verb with a noun.";
	private static String inventory = "Your inventory contains: ";
	private static String inventoryEmpty = "Your inventory is empty.";
	private static String missingNoun = "You are missing a noun in that sentence.";
	private static String notHere = "You can't see that here.";
	private static String alreadyHave = "You already have that.";
	private static String noExit = "You can't go that way.";
	private static String locked = "It's locked.";
	private static String doorBlocking = "The door blocking you way.";
	private static String alreadyOpen = "It's already open.";
	private static String alreadyShut = "It's already closed.";
	private static String shutDoor = "The door slams shut.";
	private static String tooDark = "It's too dark to adequately examine.";
	private static String woman = "Her stillness is inhuman, like a mannequin. You feel a strong sense of foreboding from the sight of her.";
	private static String nowMeditating = "You close your eyes, and all of your surroundings become quiet and disappear. You are now meditating.";
	private static String nowVisualizing = "You are now visualizing the sacred ";
	private static String alreadyMeditating = "You are meditating.";
	private static String alreadyVisualizing = "You are.";
	private static String doneMeditating = "Your concentration breaks. You are no longer meditating.";
	private static String notMemorized = "You don't have that memorized.";
	private static String notMeditating = "Despite your best efforts, you become distracted and give up. That sort of thing is best done while meditating.";
	private static String activateHallway = "You push the button and hear a beep. The shelf behind the glass slides. The scroll that was on the shelf falls down the laundry chute.";
	private static String activateCreakyDeck = "You push the button and hear a beep. The wooden plank slides up, revealing a cool secret cabinet. In the cabinet is a frosty scroll.";
	private static String pullTassel = "You pull the tassel, and the gate of the thing creaks as it raises up, revealing a TV.";
	private static String gate = "It's a gate, but you notice a tassel!";
	private static String cornOnRod = "You put that corn on the hook boy!";
	private static String cast = "You cast your line. It lands in the pond with a plop.";
	private static String hallwayDescRaDropped = "There is a scroll on the shelf behind the glass pane.";
	private static String hallwayDescRaNotDropped = "There is nothing on the shelf behind the glass pane.";
	
	// Reaper
	private static String seeReaper1 = "Out of the corner of your eye, you see a hooded figure to the north before it vanishes out of sight.";
	private static String reaperEncounter1 = "A figure in a black robe lurks out from around the corner. Before you can act, it brandishes a long sword and whispers, \"What year did Palu write Post Radius?\"";
	private static String reaperEncounter2 = "You hear the deck creak behind you. A figure in a black robe lurks out from around the corner. Before you can act, it brandishes a long sword and whispers, \"What year did Palu write Post Radius?\"";
	private static String reaperWhispers = "The cloaked figure whispers...";
	private static String reaperWrong1 = "\"...Incorrect.\"";
	private static String reaperWrong2 = "\"No.\"";
	private static String reaperWrong3 = "\"How unfortunate.\"";
	private static String reaperKill1 = "It plunges the sword into your heart.";
	private static String reaperKill2 = "With one swift motion, it slices your head clean off.";
	private static String reaperKill3 = "Fast as lightning, it stabs the sword into your stomach.";
	
	// plaques
	private static String plaqueDesc = "The square metal plaque has an orange bulb, a green bulb, and a purple bulb.";
	private static String plaqueSandExhibit = "Scratched into the metal are arrows pointing at the orange bulb and the green bulb.";
	private static String plaqueLounge = "Scratched into the metal are arrows pointing at the orange bulb and the green bulb.";
	private static String plaqueShrineRoom1 = "Scratched into the metal are arrows pointing at the orange bulb and the purple bulb.";
	private static String plaqueAssemblyRoom = "Unlike the other plaques, this one has no scratch marks.";
	private static String plaqueShrineRoom2 = "Scratched into the metal are arrows pointing at the orange bulb and the green bulb.";
	private static String plaqueCourtyard = "Scratched into the metal are arrows pointing at the green bulb and the purple bulb.";
	private static String plaqueHallway = "Scratched into the metal are arrows pointing at all three bulbs.";
	private static String plaqueMasterBedroom = "Scratched into the metal is an arrow pointing at the green bulb.";
	private static String plaqueHondo = "Scratched into the metal are arrows pointing at the green bulb and the purple bulb.";
	private static String plaqueTrinketShop = "Scratched into the metal of the jewelled box is an arrow pointing at the purple bulb.";
	private static String plaqueCreakyDeck = "Scratched into the metal are arrows pointing at all three bulbs.";
	private static String OOO = "All three bulbs are glowing.";
	private static String OOX = "The orange bulb and the green bulb are glowing.";
	private static String OXO = "The orange bulb and the purple bulb are glowing.";
	private static String XOO = "The green bulb and the purple bulb are glowing.";
	private static String XXO = "The purple bulb is glowing.";
	private static String XOX = "The green bulb is glowing.";
	private static String OXX = "The orange bulb is glowing.";
	
	// signs
	public static String sandExhibitSign = "The sign reads: \"Avalokitesvara Shrine.\"";
	public static String shrineRoom2Sign = "The banner reads: \"Altar of Samantabhadra.\"";
	public static String sittingRoomSign = "The sign reads: \"Would you like some green tea? Please don't hesitate to ask. 300 yen.\"";
	public static String insideGateSign = "The stone carving reads: \"Commemoration: 2800 years of service.\"";
	public static String bottomOfStairsSign = "The stone carving reads: \"The 33rd Stone Monument.\"";
	public static String hondoSign = "The basin reads: \"Tanigumisan\" (Kegon-ji Temple)";
	public static String shrineRoom3Sign = "The banner reads: \"Butsudan of Kannon.\"";
	
	// kimi
	private static String kimiMoshi = "\"Moshi moshi. This is Kimi, therapist and meditation instructor. What can I do for you?\"";
	private static String kimiBiz = "\"Haha. Is this a business call or a personal one?\"";
	private static String kimiRight = "\"Then you've called the right number! Is it a remedy you seek? Or knowledge?\"";
	private static String kimiRemOrKno = "\"Is it a remedy you seek? Or knowledge?\"";
	private static String kimiNeedSch = "\"Excellent! Of course you need to schedule an appointment for this therapy. Does that work for you?\"";
	private static String kimiHaveOpening = "\"OK, I have an opening next Sunday at noon. Does that work for you?\"";
	private static String kimiAnythingElse = "\"OK, you're all set for a session next Sunday. Is there anything else I can help you with today?\"";
	private static String kimiSorry = "\"I'm sorry, but there's probably not much we can get done over the phone for that service. Is there anything else I can help you with today?\"";
	private static String kimiSchOrPho = "\"Excellent. It's never too late to gain control over your mind. Were you calling to schedule an appointment for an in-depth lesson, or for a free phone consultation?\"";
	private static String kimiWisdom = "\"Very well. I am always eager to share this treasured wisdom. As a henro of Saigoku Kannon, I can only speak of the tradition I know. For today's consultation, I'll brief you on our method of meditation. There are countless methods, but Sensei Kukai systematized the process and focused on the core elements in order to produce a result similar to what is written in the Amitayurdhyana Sutra. Those core elements are the visualization, and the spoken mantra. Do not underestimate the value of any of the three elements, as they are all critical to shaping your mind to recieve the image Kukai writes so much about. You will find that breathing must always be consistent to allow your visualizations and mantras to dance freely. The powerful combination a symbol and a mantra will open the gates of your mind and reveal to you what was hiding behind the curtain. The Shingon are also particular about which visualization and mantra should be meditated upon at each temple. For example, a henro will chant the Heart Sutra at an altar of Samantabhadra, the Mantra of Light at a batsudan of Kannon, and the Gohogo Mantra at an Avalokitesvara shrine. These are the rites of a Shingon henro, and when practiced with sincerety, the henro will be one step closer towards enlightenment. I would be happy to speak more about this with you in person, but unfortunately I don't have anymore openings for an appointment. Is there anything else I can help you with today?\"";
	private static String kimiWrong = "\"Hmm. You might have the wrong number. I offer healing and learning services. If this is not what you called for, I'm sorry. Is there anything else I can help you with today?\"";
	private static String kimiBye = "\"Dewa mata.\" Kimi hangs up.";
	private static String kimiNoSch = "\"Oops! Unfortunately I don't have anymore openings. Is there anything else I can help you with today?\"";
	
	// tod
	public static String tod1 = "A monk wearing glasses and a purple robe peers out his window.\n\"What the heck did you do?\"\nHe exits his house and walks on his porch.\n\"My power has been out for three days, but suddenly it turns back on when you show up at my door. Well... if you didn't do anything, this remains quite a mystery. Maybe you have just brought good luck to me! Please, come in to my home and let me make you a cup of tea\"\nYou both go in his house.\n\"The tea should have cooled off by now,\" he says. \"It's nice to have some company over every now and then. My name is Hisachi Ichiro, by the way.\"";
	public static String tod2 = "\"Upon finishing my journey as a henro, I felt a deep connection to the woods here at Kegon-Ji. I suppose I felt that it was the purpose of my life to remain here and maintain this temple. This simple life has brought me peace, and I am happy.\"";
	public static String tod3 = "\"Curiously, three days ago my power had been cut off. That same morning, I noticed that someone had installed a wooden post beside my slate with a strange metal plaque. The correlation was obvious. The device was somehow interfering with my electricity. None of the other residents were much help with solving this conundrum. There was also a scroll I found at my door that day. Although it seems irrelevant, it still adds to my confusion. But with your appearance today, suddenly my lights turned back on, and my heater started humming again. Curious, indeed.\"";
	public static String tod4a = "\"It was left at my door three days ago. It seems to be a Shingon scroll portraying a sacred syllable for a mantra. I have derived no meaning from it but I keep it regardless. I see your interest in the scroll. Perhaps you will find a better use with it than I, but I will not part with it so quickly. Perhaps you would do me one last favor in exchange for the scroll? Apart from maintaining the temple grounds, I aspire to help Shingon disciples to reach a greater depth in their mind during their medatative practice, namely by the use of hypnosis. A light sedative, which I have used as an ingredient in the tea that you've been ";
	public static String tod4b = "neglecting";
	public static String tod4c = "enjoying";
	public static String tod4d = " goes a little way in that you've been enjoying, goes a little way in helping my hypnosis kick off. Will you allow me to put you in a light trance so I can test my method? In return, you may have the scroll. What do you say?\"";
	public static String tod5 = "\"Excellent. Now, if I could just have you close your eyes for me. I want you to focus on my voice. I am going to count to five. When I get to five, you will settle into a deep meditative dream state.\nOne.\nYou feel yourself starting to slip away.\nTwo.\nYou still hear my voice, but you feel you are moving very far away.\nT h r e e . . .\nYou are very far away.\nF  o  u  r  .  .  .\nEverything is black. You are removed.\nF   i   v   e   .   .   .\"\n\n";
	public static String tod6 = "\"I apologize. It was inappropriate of me to ask.\"";
	public static String tod7 = "He looks at you as if he expects you to ask him a question.";
	public static String tod8 = "\"I can't claim to know what you are talking about.\"";
	public static String tod9 = "\"You're late. Luckily for us, our target has followed you here. Ambushes are always easier to execute than a hunt. This guy is all yours. Here, take this.\"\nThey hand you a long sword.\n\"One last thing. Check to make sure that he is not a bodhisattva before you finish him. Now go.\"";
	public static String tod10 = "\"The chest won't open until you complete this job. Now go.\"";
	public static String tod11 = "\"Hmm. That's not right,\" Ichiro mutters while sipping his tea. \"You woke up prematurely. And you looked pretty uncomfortable throughout the hypnosis also. Understand that whatever you just went through wasn't real. I do apologize if you experienced anything unpleasant. I suppose my experiment served its purpose, although I have some improvements to make. Here's the scroll. I hope you somehow find it useful. Thank you again for all of your help.\" He ushers you out.";
	
	// TV
	private static String theaterTV = "Bright white light. Fades. Monk enters scene. He says, \"Konnichiwa. My name is Kiyoshi Mikami. This is my introduction to Shingon video. The name 'Shingon' means 'true word,' referring to the mantra or the chanting that's used in the practice. Shingon was first brought to Japan from China in  A.D. by Kukai. One fundamental principle is the belief that you can attain buddahood in this life without reincarnation. The idea is to break down the mental barrier between yourself and the universe and realize oneness. All of the strength and wisdom of the universe becomes yours after this realization. The practice of prana, mandala, and mantra is called sanmitsu. Prana is the breath, which must precede all else. Mandala is the concept of visualization, and mantra is chanting. Bring those three together as one. Pair mandalas to their sister mantra to enhance their power. Traditional pairings include the Conch Shell with the Celestial Sutra, the Golden Fish with the Mantra of Light, the Endless Knot with the Gohogo Mantra, the Wheel of Dharma with the Mantra of Jambi, the Lotus Flower with the Heart Sutra... The list goes on. This is the process to achieve oneness and to recieve the aid from your deity. You must destroy parts of yourself at times if you are to maintain inner balance. You will start to merge with it and become one with it, and from there, you merge with the universe. Thank you and namaste.\" The monk exits the scene.";
	
	// Trance
	private static String trance1 = "\"How is it when a practitioner goes along a narrow path?\"\n\n\"You will meet a deadly snake on the great road. I advise you not to run into it.\"\n\n\"What if I do run into it?\"\n\n\"You will lose your life.\"\n\n\"What if I don't run into it?\"\n\n\"You have no place to escape from it.\"\n\n\"Precisely at such a time, what then?\"\n\n\"It is lost.\"\n\n\"I wonder where it is gone...\"";
	private static String trance2 = "\"What will happen when the leaves fall and the trees become bare?\"\n\n\"The golden wind.\"\n\n\"What do you mean?\"\n\n\"The trunk becomes visible in the autumn wind.\"";
	private static String trance3 = "\"Where are you going?\"\n\n\"I am on pilgrimage, following the wind.\"\n\n\"What are you on pilgrimage for?\"\n\n\"I don't know.\"\n\n\"Non-knowing is most intimate.\"\n\n\"What year did Palu write Post Radius?\"";
	
	public static void setScrollbar() {
		// set scrollbar to bottom
		Bunraku.body.setCaretPosition(Bunraku.body.getDocument().getLength());
	}
	
	public static void invalid() {
		print(invalid);
	}
	
	public static void tooManySpaces() {
		print(tooManySpaces);
	}
	
	public static void newLine() {
		print("\n");
	}
	
	public static void printSpace() {
		print(" ");
	}
	
	public static void newParagraph() {
		print("\n\n");
	}
	
	public static void printInput() {
		print(">" + Bunraku.inputBox.getText());
		newParagraph();
	}
	
	public static void printLocation() {
		print(Player.getLocation().title);
	}
	
	public static void printMissingNoun() {
		print(missingNoun);
	}
	
	public static void printNoExit() {
		print(noExit);
	}
	
	public static void printNothingHappens() {
		print("Nothing happens.");
	}
	
	public static void print(String s) {
		Bunraku.body.append(s);
	}
	
	public static void printDesc() {
		print(Player.getLocation().desc);
	}
	
	public static void printDesc2() {
		switch (Player.getLocation().title) {
			case "Hallway":
				newLine();
				
				if (World.raDropped) {
					print(hallwayDescRaDropped);
				} else {
					print(hallwayDescRaNotDropped);
				}
				break;
			default:
				// leave blank
				break;
		}
	}
	
	public static void printHelp() {
		print(help);
	}
	
	public static void printNowMeditating() {
		print(nowMeditating);
	}
	
	public static void printNotMeditating() {
		print(notMeditating);
	}
	
	public static void printDoneMeditating() {
		print(doneMeditating);
	}
	
	public static void printVisualize(String s) {
		print(nowVisualizing + s);
	}
	
	public static void printNotMemorized() {
		print(notMemorized);
	}
	
	public static void printAlreadyVisualizing() {
		print(alreadyVisualizing);
	}
	
	public static void printTake(String t) {
		print("You pick up the " + t + ".");
	}
	
	public static void printCantTake() {
		print("You can't take that.");
	}
	
	public static void printNotInInventory() {
		print("You are not carrying that.");
	}
	
	public static void printInventoryEmpty() {
		print(inventoryEmpty);
	}
	
	public static void printInventory() {
		print(inventory);
		
		for (int i = 0; i < Player.inventory.size(); i++) {
			newLine();
			print("   a " + Player.inventory.get(i).title);
		}
	}
	
	public static void printNotHere() {
		print(notHere);
	}
	
	public static void printAlreadyHave() {
		print(alreadyHave);
	}
	
	public static void printAlreadyOpen() {
		print(alreadyOpen);
	}
	
	public static void printAlreadyShut() {
		print(alreadyShut);
	}
	
	public static void printShutDoor() {
		print(shutDoor);
	}
	
	public static void printDoorBlocking() {
		print(doorBlocking);
	}
	
	public static void printLocked() {
		print(locked);
	}
	
	public static void printObjects() {
		if ((Player.getLocation().equals(Room.teaRoom.title)) && !Player.tookACBook) { 
			// normal Story.printDesc handles this exception
		} else {
			// print all objects in room
			for (int i = 0; i < Room.getObjects().size(); i++) {
				newLine();
				print("There is " + Item.getTitleOfObjectInList(i) + " here.");
			}
		}
	}
	
	public static void printSeeReaper1() {
		newLine();
		print(seeReaper1);
	}
	
	public static void printReaperEncounter1() {
		print(reaperEncounter1);
	}
	
	public static void printReaperEncounter2() {
		print(reaperEncounter2);
	}
	
	public static void printReaperWrong() {
		int reply = ThreadLocalRandom.current().nextInt(1, 3 + 1);
		int action = ThreadLocalRandom.current().nextInt(1, 3 + 1);
		
		print(reaperWhispers);
		newLine();
		
		switch (reply) {
			case 1:
				print(reaperWrong1);
				break;
			case 2:
				print(reaperWrong2);
				break;
			case 3:
				print(reaperWrong3);
				break;
			default:
				System.out.println("Story.printReaperWrong() error 1");
				break;
		}
		
		newLine();
		
		switch (action) {
			case 1:
				print(reaperKill1);
				break;
			case 2:
				print(reaperKill2);
				break;
			case 3:
				print(reaperKill3);
				break;
			default:
				System.out.println("Story.printReaperWrong() error 2");
				break;
		}
		
		newParagraph();
		Player.die();
	}
	
	public static void printPlaque() {
		print(plaqueDesc);
		printSpace();
		
		switch (Player.getLocation().title) {
			case "Sand Exhibit":
				print(plaqueSandExhibit);
				break;
			case "Lounge":
				print(plaqueLounge);
				break;
			case "Shrine Room 1":
				print(plaqueShrineRoom1);
				break;
			case "Assembly Room":
				print(plaqueAssemblyRoom);
				break;
			case "Shrine Room 2":
				print(plaqueShrineRoom2);
				break;
			case "Courtyard":
				print(plaqueCourtyard);
				break;
			case "Hallway":
				print(plaqueHallway);
				break;
			case "Master Bedroom":
				print(plaqueMasterBedroom);
				break;
			case "Hamlet":
				print(plaqueHondo);
				
				if (Player.inventory.contains(Item.box) || Room.getObjects().contains(Item.box)) 
					print(" " + plaqueTrinketShop);
				break;
			case "Creaky Deck":
				print(plaqueCreakyDeck);
				
				if (Player.inventory.contains(Item.box) || Room.getObjects().contains(Item.box)) 
					print(" " + plaqueTrinketShop);
				break;
			default:
				if (Player.inventory.contains(Item.box) || Room.getObjects().contains(Item.box)) {
					print(plaqueTrinketShop);
				} else {
					Story.printNotHere();
				}
				break;
		}
		
		printSpace();
		
		if (World.OOO) {
			print(OOO);
		} else if (World.OOX) {
			print(OOX);
		} else if (World.OXO) {
			print(OXO);
		} else if (World.XOO) {
			print(XOO);
		} else if (World.OXX) {
			print(OXX);
		} else if (World.XXO) {
			print(XXO);
		} else if (World.XOX) {
			print(XOX);
		} else {
			System.out.println("Story.printPlaque() error");
		}
	}
	
	public static void printWoman() {
		print(woman);
	}
	
	public static void printTapeAtBeginning() {
		print("The tape is already at the beginning.");
	}
	
	public static void printTapePlaying() {
		print("The tape is already playing.");
	}
	
	public static void printRewind(String c) {
		switch (c) {
			case "orange":
				print("The screen becomes static. The pool of blood reenters monk. Monk rises. Walks backwards toward camera. Walks off left side of screen.");
				break;
			case "green":
				print("The screen becomes static. The pool of blood reenters monk. Figure enters scene. Monk rises. Figure leaves backwards. Monk leaves.");
				break;
			case "purple":
				print("The screen becomes static. The figure enters the scene. Purple monk rises up and spins around. Colorful oragami cranes cover the screen.");
				break;
			case "theater":
				print("The screen becomes static. A monk enters and exits the scene.");
				break;
			default:
				System.out.println("Story.printRewind() error");
				break;
		}
		
	}
	
	public static void printFastforward(String c) {
		switch (c) {
			case "orange":
				print("The screen becomes static. Figure kills monk and walks away.");
				break;
			case "green":
				print("The screen becomes static. Figure kills monk and walks away.");
				break;
			case "purple":
				print("The screen becomes static. Figure kills monk and walks away.");
				break;
			case "theater":
				print("The screen becomes static. A monk enters and exits the scene.");
				break;
			default:
				System.out.println("Story.printRewind() error");
				break;
		}
		
	}
	
	public static void printBlackOut() {
		print("You black out and wake up.");
		newParagraph();
	}
	
	public static void printMoveCranes() {
		print("The cranes move to the side, revealing a masked woman in a blue kimono.");
	}
	
	public static void printGameOver() {
		print("There is no ningyo to recieve your spirit.\n\n***GAME OVER***\n\nDo you want to play again?");
	}
	
	public static void printYesOrNo() {
		print("Please type \"yes\" or \"no.\"");
		newLine();
		printGameOver();
	}
	
	public static void printReadLotus() {
		print("The parchment has a lotus on it.");
	}
	
	public static void printReadFish() {
		print("The fish has a fish on it.");
	}
	
	public static void printReadKnot() {
		print("The sign has a knot on it.");
	}
	
	public static void printMemorizeSymbol() {
		print("The sacred symbol is commited to memory and available to visualize while meditating!");
	}
	
	public static void printPhoneWrong() {
		print("\"We're sorry; we are unable to complete your call as dialed. Please check the number and dial again, or call your operator for assistance.\"");
	}
	
	public static void printKimiMoshi() {
		print(kimiMoshi);
	}
	
	public static void printKimiBiz() {
		print(kimiBiz);
	}
	
	public static void printKimiRight() {
		print(kimiRight);
	}
	
	public static void printKimiRemOrKno() {
		print(kimiRemOrKno);
	}
	
	public static void printKimiNeedSch() {
		print(kimiNeedSch);
	}
	
	public static void printKimiHaveOpening() {
		print(kimiHaveOpening);
	}
	
	public static void printKimiAnythingElse() {
		print(kimiAnythingElse);
	}
	
	public static void printKimiSorry() {
		print(kimiSorry);
	}
	
	public static void printKimiSchOrPho() {
		print(kimiSchOrPho);
	}
	
	public static void printKimiNoSch() {
		print(kimiNoSch);
	}
	
	public static void printKimiWisdom() {
		print(kimiWisdom);
	}
	
	public static void printKimiWrong() {
		print(kimiWrong);
	}
	
	public static void printKimiBye() {
		print(kimiBye);
	}
	
	public static void printActivateHallway() {
		print(activateHallway);
	}
	
	public static void printActivateCreakyDeck() {
		print(activateCreakyDeck);
	}
	
	public static void printInteresting() {
		print("An interesting concept!");
	}
	
	public static void printTassel() {
		print(pullTassel);
	}
	
	public static void printExamineGate() {
		print(gate);
	}
	
	public static void printBait() {
		print(cornOnRod);
	}
	
	public static void printHow() {
		print("How do you expect to do that?");
	}
	
	public static void printCast() {
		print(cast);
	}
	
	public static void printPassTime() {
		print("Time passes...");
	}
	
	public static void printBite() {
		print("\nYou feel a tug on your fishing rod. You got a bite!");
	}
	
	public static void printCatch() {
		print(" You caught a koi fish! There is a marking on the fish. It is the sacred symbol of fish! ");
		
		if (!Player.memory.contains("Fish"))
			printMemorizeSymbol();
		
		print(" The fish wiggles out of your hands back into the pond with a splash.");
	}
	
	public static void printMemory() {
		if (Player.memory.size() == 0) {
			print("You don't have anything memorized.");
		} else {
			print("You have memorized:");
			
			if (Player.memory.contains("Fish")) {
				newLine();
				print("   The sacred symbol: Fish");
			}
			
			if (Player.memory.contains("Lotus")) {
				newLine();
				print("   The sacred symbol: Lotus");
			}
			
			if (Player.memory.contains("Knot")) {
				newLine();
				print("   The sacred symbol: Knot");
			}
			
			if (Player.memory.contains("om")) {
				newLine();
				print("   The sacred word: \"Om\"");
			}
			
			if (Player.memory.contains("ni")) {
				newLine();
				print("   The sacred word: \"Ni\"");
			}
			
			if (Player.memory.contains("go")) {
				newLine();
				print("   The sacred word: \"Go\"");
			}
			
			if (Player.memory.contains("yu")) {
				newLine();
				print("   The sacred word: \"Yu\"");
			}
			
			if (Player.memory.contains("ji")) {
				newLine();
				print("   The sacred word: \"Ji\"");
			}
			
			if (Player.memory.contains("ra")) {
				newLine();
				print("   The sacred word: \"Ra\"");
			}
			
			if (Player.memory.contains("shi")) {
				newLine();
				print("   The sacred word: \"Shi\"");
			}
		}
	}
	
	public static void printAlreadyMemorizedWord() {
		print("The sacred word is already memorized.");
	}
	
	public static void printAlreadyMemorizedSymbol() {
		print("The sacred symbol is already memorized.");
	}
	
	public static void printExamineShrine() {
		switch (Player.getLocation().title) {
			case "Shrine Room 1":
				Story.print("Beautiful shrine. TV in front.");
				break;
			case "Shrine Room 2":
				Story.print("Beautiful shrine. Banner above.");
				break;
			case "Shrine Room 3":
				Story.print("Beautiful shrine.");
				break;
			default:
				printNotHere();
				break;
		}
	}
	
	public static void printOpenBox() {
		if (World.boxOpen) {
			printAlreadyOpen();
		} else {
			if (World.XXO) {
				print("The box opens with a satisfying click.");
				World.boxOpen = true;
				
				if (World.yuInBox) {
					print(" There's a crumpled scroll inside.");
				} else {
					print(" It's empty.");
				}
			} else {
				printLocked();
			}
		}
	}
	
	public static void printShutBox() {
		if (World.boxOpen) {
			print("The jewelled box shuts with a satisfying snap.");
			World.boxOpen = false;
		} else {
			printAlreadyShut();
		}
	}
	
	public static void printOpenCase() {
		if (World.creakyDeckOpen) {
			printAlreadyOpen();
		} else {
			if (World.OOO) {
				print("The case opens with a creak.");
				
				if (World.goInCase) {
					print(" There's a frosty scroll inside.");
				} else {
					print(" It's empty.");
				}
			} else {
				printLocked();
			}
		}
	}
	
	public static void printTooDark() {
		print(tooDark);
	}
	
	public static void printTheaterTV() {
		print(theaterTV);
	}
	
	public static void printTrance(int t) {
		newParagraph();
		print("Everything goes quiet.\n\nYou hear distant voices...");
		newParagraph();
		
		if (t == 1)
			print(trance1);
		
		if (t == 2)
			print(trance2);
		
		if (t == 3) {
			print(trance3);
			newParagraph();
			print("\"" + Data.year + ".\"");
		}
		
		newParagraph();
		printDoneMeditating();
	}
}