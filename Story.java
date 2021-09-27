import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Story {
	public static boolean brief;
	public static boolean mustPressKey;
	public static boolean restartRestoreOrQuit;
	
	public static String key = "";
	
	public static String intro1 = "WABEWALKER\nCopyright (C) 2021 by Benjamin Sisk. All rights reserved.\nVersion 1.0.7";
	public static String intro2 = "Your admission ticket to the Adachi Museum of Art cost you 2,300 yen--a modest price to experience a full day of Japanese gardens and masterpiece paintings. It's not long before you navigate through the hallways and find yourself outside at the main attraction.";
	private static String help = "This game understands a variety of commands such as LOOK, EXAMINE SWORD, and PICK UP THE SHINY CROWN.\nList of shortcuts:\nGo north = N\nGo south = S\nGo east = E\nGo west = W\nGo northeast = NE\nGo northwest = NW\nGo southeast = SE\nGo southwest = SW\nGo up = U\nGo down = D\nLook = L\nExamine = X\nInventory = I\nMemory = M\nWait = Z\nHelp = H\nType HINT to get a nudge in the right direction\nType CREDITS to view the game's credits\nType BRIEF to hide the description of your surroundings each time upon re-entering\nType VERBOSE to see the description of your surroundings each time upon re-entering (This is the default)\nRecommended: save after every achievenemt.\nNote: This parser allows interaction with one item at a time, not multiple.";
	private static String invalid = "I beg your pardon?";
	private static String unused = "Nothing happens.";
	private static String inventory = "Your inventory contains: ";
	private static String inventoryEmpty = "Your inventory is empty.";
	private static String missingNoun = "You are missing a noun in that sentence.";
	private static String notHere = "You can't see that here.";
	private static String alreadyHave = "You already have that.";
	private static String alreadyDoing = "You are already doing that.";
	private static String noExit = "You can't go that way.";
	private static String locked = "It's locked.";
	private static String doorBlocking = "The door is blocking you way.";
	private static String alreadyOpen = "It's already open.";
	private static String alreadyShut = "It's already closed.";
	private static String shutDoor = "The door slams shut.";
	private static String tooDark = "It's too dark to adequately examine.";
	private static String woman = "Her stillness is inhuman, like a mannequin. You feel a strong sense of foreboding from the sight of her.";
	private static String nowMeditating = "You close your eyes, and the world around becomes quiet. You are now meditating.";
	private static String nowVisualizing = "You are now visualizing the sacred symbol of the ";
	private static String alreadyMeditating = "You are meditating.";
	private static String alreadyVisualizing = "You are.";
	private static String doneMeditating = "Your concentration breaks. You are no longer meditating.";
	private static String notMemorized = "You don't have that memorized.";
	private static String notMeditating = "Despite your best efforts, you become distracted and give up. That sort of thing is best done while meditating.";
	private static String activateHallway = "You pull the lever and hear a mechanism activate the laundry chute. The shelf behind the glass swings down on a hinge, and the crumpled scroll falls down the chute.";
	private static String activateCreakyDeck = "You push the button and hear a mechanism activate within the tall wooden box. A secret compartment flips open, revealing a frosty scroll.";
	private static String pullTassel = "When you pull the tassel, you a hear a mechanism activate within the hokura. The lattice barrier swings open, revealing a television set.";
	public static String hokuraClosed = "The hokura is made of a dark wood, and is nearly as tall as you are. The front opening is closed off by a cedar lattice barrier, behind which is a television set. Hanging from the hokura's curved roof is a tassel, swaying in the wind.";
	public static String hokuraOpen = "The hokura is made of a dark wood, and is nearly as tall as you are. A television set rests inside. Hanging from the hokura's curved roof is a tassel, swaying in the wind.";
	public static String shrine1Desc = "The shrine is decorated in red velvet, with an old television set resting in the center.";
	public static String shrine2Desc = "Recessed in the north wall of this quiet room is a beautifully gilded altar. Above it hangs a wooden carving.";
	public static String shrine3Desc = "This is a magnificent golden shrine, decorated with candles and brown cloth. There is a banner hanging above.";
	public static String gate = "The enormouos wooden gate appears to be hundreds of years old.";
	private static String cornOnRod = "You attach the kernel of corn to the hook of the fishing pole.";
	private static String cast = "You cast your line. It lands in the pond with a plop.";
	public static String hallwayDescRaNotDropped = " Behind the glass pane of the laundry chute, you can see a crumpled scroll sitting on a shelf.";
	
	// Reaper
	private static String seeReaper1 = "Out of the corner of your eye, you see a hooded figure to the north before it vanishes out of sight.";
	private static String reaperEncounter1 = "A figure in a black, hooded cloak lurks out from behind you. Before you can act, it brandishes a long sword and whispers, \"What year did the Wabewalker write Bunraku?\"";
	private static String reaperEncounter2 = "A figure in a black, hooded cloak lurks out from around the corner. Before you can act, it brandishes a long sword and whispers, \"What year did the Wabewalker write Bunraku?\"";
	private static String reaperEncounter3 = "You hear the deck creak behind you. A figure in a black, hooded cloak lurks out from around the corner. Before you can act, it brandishes a long sword and whispers, \"What year did the Wabewalker write Bunraku?\"";
	private static String reaperWhispers = "The cloaked figure whispers...";
	private static String reaperWrong1 = "\"...Incorrect.\"";
	private static String reaperWrong2 = "\"No.\"";
	private static String reaperWrong3 = "\"How unfortunate.\"";
	private static String reaperKill1 = "It plunges the sword into your heart.";
	private static String reaperKill2 = "With one swift motion, it slices your head clean off.";
	private static String reaperKill3 = "Fast as lightning, it stabs the sword into your stomach.";
	
	// panels
	private static String panelDesc = "The square metal panel has three colored bulbs: orange, green, and purple.";
	private static String panelSandExhibit = "\nArrows are scratched into the metal, pointing at the orange bulb and the green bulb.";
	private static String panelLounge = "\nArrows are scratched into the metal, pointing at the orange bulb and the green bulb.";
	private static String panelShrineRoom1 = "\nArrows are scratched into the metal, pointing at the orange bulb and the purple bulb.";
	private static String panelAssemblyRoom = "\nUnlike the other panels, this one has no scratch marks.";
	private static String panelShrineRoom2 = "\nAn arrow is scratched into the metal, pointing at the green bulb.";
	private static String panelCourtyard = "\nArrows are scratched into the metal, pointing at the green bulb and the purple bulb.";
	private static String panelHallway = "\nArrows are scratched into the metal, pointing at all three bulbs.";
	private static String panelStudy = "\nArrows are scratched into the metal, pointing at the orange bulb and the green bulb.";
	private static String panelHamlet = "\nArrows are scratched into the metal panel on the wooden post, pointing at the green bulb and the purple bulb.";
	private static String panelJewelledCase = "\nArrows are scratched into the metal panel on the jewelled case, pointing at all three bulbs.";
	private static String panelCreakyDeck = "\nAn arrow is scratched into the metal panel on the wooden box, pointing at the purple bulb.";
	private static String OOO = "\nAll three bulbs are glowing.";
	private static String OOX = "\nThe orange bulb and the green bulb are glowing.";
	private static String OXO = "\nThe orange bulb and the purple bulb are glowing.";
	private static String XOO = "\nThe green bulb and the purple bulb are glowing.";
	private static String XXO = "\nThe purple bulb is glowing.";
	private static String XOX = "\nThe green bulb is glowing.";
	private static String OXX = "\nThe orange bulb is glowing.";
	
	// signs
	public static String sandExhibitSign = "The sign reads: \"Avalokitesvara Shrine.\"";
	public static String shrineRoom2Sign = "The carving reads: \"Altar of Samantabhadra.\"";
	public static String gateSign = "The memorial stone inscription reads: \"Commemoration: 2800 years of service.\"";
	public static String bottomOfMountainSign = "The slate inscription reads: \"The 33rd Stone Monument.\"";
	public static String hondoSign = "The basin reads: \"Kegon-ji Temple\"";
	public static String shrineRoom3Sign = "The banner reads: \"Butsudan of Kannon.\"";
	
	// kimi
	private static String kimiMoshi = "You hear a ringing tone. Someone at the other end picks up the phone.\n\"Moshi moshi. This is Kimi, therapist and meditation instructor. What can I do for you?\"";
	private static String kimiBiz = "\"Haha. Is this a business call or a personal one?\"";
	private static String kimiRight = "\"Then you've called the right number! Is it a remedy you seek? Or knowledge?\"";
	private static String kimiRemOrKno = "\"Is it a remedy you seek? Or knowledge?\"";
	private static String kimiNeedSch = "\"Excellent! Of course you need to schedule an appointment for this therapy. Does that work for you?\"";
	private static String kimiHaveOpening = "\"OK, I have an opening next Sunday at noon. Does that work for you?\"";
	private static String kimiAnythingElse = "\"OK, you're all set for a session next Sunday. Is there anything else I can help you with today?\"";
	private static String kimiSorry = "\"I'm sorry, but there's probably not much we can get done over the phone for that service. Is there anything else I can help you with today?\"";
	private static String kimiSchOrPho = "\"Excellent. It's never too late to gain control over your mind. Were you calling to schedule an appointment for an in-depth lesson, or for a free phone consultation?\"";
	private static String kimiWisdom = "\"Very well. I am always eager to share this treasured wisdom. As a henro of Saigoku Kannon, I can only speak of the tradition I know. For today's consultation, I'll brief you on our method of meditation. There are countless methods, but Sensei Kukai systematized the process and focused on the core elements in order to produce a result similar to what is written in the Amitayurdhyana Sutra. Those core elements are the visualization, and the spoken mantra. Do not underestimate the value of any of those two elements, as they are critical to shaping your mind to recieve the image Kukai writes so much about. The powerful combination a symbol and a mantra will open the gates of your mind and reveal to you what was hiding behind the curtain. The Shingon are also particular about which visualization and mantra should be meditated upon at each temple. For example, a henro will chant the Heart Sutra at an altar of Samantabhadra, the Mantra of Light at a butsudan of Kannon, and the Gohogo Mantra at an Avalokitesvara shrine. These are the rites of a Shingon henro, and when practiced with sincerety, the henro will be one step closer towards enlightenment. I would be happy to speak more about this with you in person, but unfortunately I don't have anymore openings for an appointment. Is there anything else I can help you with today?\"";
	private static String kimiWrong = "\"Hmm. You might have the wrong number. I offer healing and learning services. If this is not what you called for, I'm sorry. Is there anything else I can help you with today?\"";
	private static String kimiBye = "\"Dewa mata.\" Kimi hangs up.";
	private static String kimiNoSch = "\"Oops! Unfortunately I don't have anymore openings. Is there anything else I can help you with today?\"";
	
	// tod
	public static String tod1 = "A monk wearing glasses and a purple robe peers out his window.\n\"What the heck did you do?\"\nHe exits his house and walks onto his porch.\n\"My power has been out for three days, but suddenly it turns back on when you show up at my door. Well... if you didn't do anything, this remains quite a mystery. Maybe you have just brought good luck to me! Please, come inside and let me make you a cup of tea.\"\nHe ushers you inside his home.";
	public static String tod2 = "\"Upon finishing my journey as a henro, I felt a deep connection to the woods here at Kegon-ji. I suppose I felt that it was the purpose of my life to remain here and maintain this temple. This simple life has brought me peace, and I am happy.\"";
	public static String tod3 = "\"Curiously, three days ago my power had been cut off. That same morning, I noticed that someone had installed a wooden post beside my slate with a strange metal panel. The correlation was obvious. The device was somehow interfering with my electricity. None of the other residents were much help with solving this conundrum. There was also a scroll I found at my door that day. Although it seems irrelevant, it still adds to my confusion. But with your appearance today, suddenly my lights turned back on, and my heater started humming again. Curious, indeed.\"";
	public static String tod4a = "\"It was left at my door three days ago. It seems to be a Shingon scroll portraying a sacred syllable for a mantra. I have derived no meaning from it but I keep it regardless. I see your interest in the scroll. Perhaps you will find a better use with it than I, but I will not part with it so quickly. Perhaps you would do me one last favor in exchange for the scroll? Apart from maintaining the temple grounds, I aspire to help Shingon disciples to reach a greater depth in their mind during their medatative practice, namely by the use of hypnosis. A light sedative, which I have used as an ingredient in the tea that you've been ";
	public static String tod4b = "neglecting,";
	public static String tod4c = "enjoying,";
	public static String tod4d = " goes a long way in helping my hypnosis kick off. Will you allow me to put you in a light trance so I can test my method? In return, you may have the scroll. What do you say?\"";
	public static String tod5 = "\"Excellent. Now, if I could just have you close your eyes for me. I want you to focus on my voice. I am going to count to five. When I get to five, you will settle into a deep meditative dream state.\nOne.\nYou feel yourself starting to slip away.\nTwo.\nYou still hear my voice, but you feel you are moving very far away.\nT h r e e . . .\nYou are very far away.\nF  o  u  r  .  .  .\nEverything is black. You are removed.\nF   i   v   e   .   .   .\"\n\n";
	public static String tod6 = "\"I apologize. It was inappropriate of me to ask.\"";
	public static String tod7 = "He looks at you as if he expects you to ask him a question.";
	public static String tod8 = "\"I can't claim to know what you are talking about.\"";
	public static String tod9 = "\"You're late. Luckily for us, our target has followed you here. Ambushes are always easier to execute than a hunt. This one is all yours. Here, take this.\"\nThey hand you a long sword.\n\"One last thing. Make sure that they are not the Wabewalker before you kill them. Now go.\"";
	public static String tod10 = "\"The chest won't open until you complete this task. Now go.\"";
	public static String tod11 = "\"Hmm. That's not right,\" Ichiro mutters while sipping his tea. \"You woke up prematurely. And you looked pretty uncomfortable throughout the hypnosis also. Understand that whatever you just went through wasn't real, and there was nothing for you to learn from that, rest assured. I do apologize if you experienced anything unpleasant. I suppose my experiment served its purpose, although I have some improvements to make. Here's the scroll. I hope you somehow find it useful. Thank you again for all of your help.\" Ichiro tucks a stained scroll into your samue, and ushers you out.";
	
	// TV
	private static String theaterTV = "A bright white light fills the theater room with a blinding glow. As your eyes adjust, the song \"Clair de lune\" by Isao Tomita begins to play softly from the television. The screen displays a backdrop of a luscious sanctuary. An elderly monk walks onto the screen.\n\"Konnichiwa. My name is Kiyoshi Mikami. This is my introduction to Shingon video. The name 'Shingon' means 'true word,' referring to the mantra or the chanting that's used in the practice. Shingon was first brought to Japan from China in 806 A.D. by Kukai. One fundamental principle is the belief that you can attain buddahood in this life without reincarnation. The idea is to break down the mental barrier between yourself and the universe, and realize oneness. All of the strength and wisdom of the universe becomes yours after this realization. The practice of mandala and mantra is called sanmitsu. Mandala is the concept of visualization, and mantra is chanting. Bring them together as one. Pair mandalas to their sister mantra to enhance their power. Traditional pairings include the Conch Shell with the Celestial Sutra, the Golden Fish with the Mantra of Light, the Endless Knot with the Gohogo Mantra, the Wheel of Dharma with the Mantra of Jambi, the Lotus Flower with the Heart Sutra... The list goes on. This is the process to achieve oneness and to recieve the aid from your deity. You must destroy parts of yourself at times if you are to maintain inner balance. You will start to merge with it and become one with it, and from there, you merge with the universe. Thank you, and namaste.\"\nThe monk exits the scene, and the screen goes black.";

	private static String trance1 = "\"Where am I?\"\n\n\"The dimensionless dimension. The placeless place.\"\n\n\"How did I get here? A moment ago I was in a shrine room.\"\n\n\"What do you know of the shrine room?\"\n\n\"I know what it looked like, and how it felt.\"\n\n\"You mean to say, that your perception of the room is all you know about it?\"\n\n\"Yes, nothing beyond that.\"\n\n\"Where do perceptions appear?\"\n\n\"My perceptions appear in my consciousness.\"\n\n\"The room appears in consciousness, like how a movie appears on a television screen.\"\n\n\"Yes.\"\n\n\"Why then did you say that you were in a room, when in fact the room is appearing in you?\"";
	private static String trance2 = "\"My spirit has wandered from body to body, and I strive to reach the end of this journey.\"\n\n\"Listen. It is not true that you have wandered at all.\"\n\n\"But I have experienced it myself: an endless cycle of death and rebirth.\"\n\n\"You are the witness of the wandering experience. The witness never wanders.\"\n\n\"I understand that my perceptions appear on the screen of consciousness. But my consciousness is bound to my body. If my body wanders, how could I not wander with it?\"\n\n\"Tell me, what part the television screen moves with the events of a movie? Tell me, what part of the spirit is wandering?\"\n\n\"The spirit is formless. It has no parts I can discern.\"\n\n\"If something is formless, can it ever be limited to a body?\"";
	private static String trance3 = "\"How do I escape the cycle of rebirth?\"\n\n\"You must ask the right question.\"\n\n\"What is the right question?\"\n\n\"...\"\n\n\"What year did the Wabewalker write Bunraku?\"";
	
	private static String samadhi1 = "The cloaked figure hesitates, but then slowly lowers its sword.\n\"Moushiwake arimasen. My upmost apologies. Only the Wabewalker could have found the answer within themself.";
	private static String samadhi2 = "  Please, follow me.\"\n\nThe figure heads off to the east, and disappears to the south.";
	private static String samadhi3 = " Please, follow me.\"\n\nThe figure heads off to the north, and disappears to the west.";
	private static String samadhi4 = "\"\nThe figure walks across the deck to the woman in the blue kimono.";
	private static String samadhi5 = "The hooded figure is here, standing beside the ";
	private static String samadhi6 = "\"Trust that all the trials you have gone through were designed to lead us to this precise moment. Know that I am not speaking to you--the one dressed in a ";
	private static String samadhi7 = "--but the one who has witnessed all of your lives.\" \nThe cloaked figure sheathes its sword. \n\"Right now, there is someone looking through a screen, playing this game, Wabewalker. For a time, this player forgot who they are, as they played puppet master in this world. This player may also believe that I am speaking to them right now--but I am not. I speak to the one who is looking through their eyes. Just as the characters in this game found their way back to the player, it is the duty of the player to find their way back to the Self. All you have to do is ask the right question, and look.\" \nThe cloaked figure ";
	private static String credits = "Wabewalker\nA game by Benjamin Sisk\n\nPlaytesting and feedback:\nKevin Vo\nTod Beckwith\nGeoff Bruskin\nzoviet_frances\nKel\nJessie Kuzma\nFrogge\n\nSpecial thanks:\nChi Hund Tang (Japanese translation)\nNick Zak (Creative consultation)\nSengo Muramasa (Shingon consultation)\nJustin Palange (Philosophy consultation)";
	
	public static void setScrollbar() {
		Wabewalker.body.setCaretPosition(Wabewalker.body.getDocument().getLength());
		
		/** Use this if stopping scroll, and delete above command
		if (stopScroll) {
			Wabewalker.body.setCaretPosition(Wabewalker.body.getDocument().getLength() - scrollStop);
			stopScroll = false;
		} else {
			Wabewalker.body.setCaretPosition(Wabewalker.body.getDocument().getLength());
		}
		*/
		// System.out.println("body length " + Wabewalker.body.getDocument().getLength());
	}
	
	// public static void setScrollStop(int i) {
		// stopScroll = true;
		
		// scrollStop = i;
	// }
	
	public static void brief(boolean b) {
		if (b) {
			brief = true;
			print("[Brief is now on.]");
		} else {
			brief = false;
			print("[Verbose is now on.]");
		}
	}
	
	public static void invalid() {
		print(invalid);
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
		print(">" + Wabewalker.inputBox.getText());
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
	
	public static void printNothingSpecial() {
		print("There's nothing special about it.");
	}
	
	public static void print(String s) {
		Wabewalker.body.append(s);
	}
	
	public static void printDesc() {
		print(Player.getLocation().desc);
	}
	
	public static void printDesc2() {
		switch (Player.getLocation().title) {
			case "Hallway":
				if (!World.raDropped) 
					print(hallwayDescRaNotDropped);
				break;
			case "Landing":
				if (Player.getPreviousLocation().equals("Hallway")) {
					print(" down ");
				} else if (Player.getPreviousLocation().equals("Courtyard")) {
					print(" up ");
				} else {
					print(" up ");
					System.out.println("Story.printDesc2() error");
				}
					print(Room.landingDesc2);
				break;
			case "Island":
				if (World.islandOpen) {
					print(Room.islandOpen);
				} else {
					print(Room.islandClosed);
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
	
	public static void printUnused() {
		print(unused);
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
		print(nowVisualizing + s + ".");
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
	
	public static void printMoreSpecific() {
		print("You'll have to be more specific.");
	}
	
	public static void printNoUse() {
		print("You have no use for that kind of thing.");
	}
	
	public static void printCantTake() {
		print("You can't take that.");
	}
	
	public static void printDropped() {
		print("Dropped.");
	}
	
	public static void printWall() {
		print("There's a wall there.");
	}
	
	public static void printLost() {
		print("You wander in between the trees for quite some time, only to end up right back where you were.");
	}
	
	public static void printRailing() {
		print("There's a railing there.");
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
			print("   a " + Player.inventory.get(i));
		}
	}
	
	public static void printNotHere() {
		print(notHere);
	}
	
	public static void printAlreadyHave() {
		print(alreadyHave);
	}
	
	public static void printAlreadyDoing() {
		print(alreadyDoing);
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
	
	public static void printCantOpen() {
		print("That is not something you can open.");
	}
	
	public static void printObjects() {
		for (int i = 0; i < Room.getObjects().size(); i++) {
			newLine();
			print("There is " + Room.getTitleOfObjectInList(i) + " here.");
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
		print(reaperEncounter3);
	}
	
	public static void printReaperEncounter3() {
		print(reaperEncounter3);
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
	
	public static void printPanel() {
		print(panelDesc);
		printSpace();
		
		switch (Player.getLocation().title) {
			case "Sand Exhibit":
				print(panelSandExhibit);
				break;
			case "Lounge":
				print(panelLounge);
				break;
			case "Avalokitesvara Shrine":
				print(panelShrineRoom1);
				break;
			case "Assembly Room":
				print(panelAssemblyRoom);
				break;
			case "Altar of Samantabhadra":
				print(panelShrineRoom2);
				break;
			case "Courtyard":
				print(panelCourtyard);
				break;
			case "Hallway":
				print(panelHallway);
				break;
			case "Study":
				print(panelStudy);
				break;
			case "Hamlet":
				print(panelHamlet);
				
				if (Player.inventory.contains(Item.JewelledCase.getTitle()) || Room.getObjects().contains(Item.JewelledCase.getTitle())) 
					print(" " + panelJewelledCase);
				break;
			case "Creaky Deck":
				print(panelCreakyDeck);
				
				if (Player.inventory.contains(Item.JewelledCase.getTitle()) || Room.getObjects().contains(Item.JewelledCase.getTitle())) 
					print(" " + panelJewelledCase);
				break;
			default:
				if (Player.inventory.contains(Item.JewelledCase.getTitle()) || Room.getObjects().contains(Item.JewelledCase.getTitle())) {
					print(panelJewelledCase);
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
			System.out.println("Story.printPanel() error");
		}
	}
	
	public static void printWoman() {
		print(woman);
	}
	
	public static void printTapeAtBeginning() {
		print("The tape is already at the beginning.");
	}
	
	public static void printAlreadyPlaying() {
		print("You push the play button, but nothing happens. It looks like the tape is already playing.");
	}
	
	public static void printDance() {
		int d = (int)(Math.random() * 3 + 1);
		
		if (d == 1)
			print("You do a little jig.");
		
		if (d == 2)
			print("You bust a move.");
		
		if (d == 3)
			print("You attempt a breakdance, but fail.");
		
		System.out.println(d);
	}
	
	public static void printRewind(String c) {
		print("The television screen becomes distorted with static. As the tape rewinds, ");
		
		switch (c) {
			case "orange":
				print("a cloaked figure glides in reverse across the screen. The pool of blood shrinks, and the body on the ground flies to their feet. The cloaked figure glides off screen as its victim walks backward into the cafe, and exits the scene to the left.");
				break;
			case "green":
				print("a cloaked figure glides in reverse across the screen. The pool of blood shrinks, and the body on the floor flies to their feet. Both of them exit the living room.");
				break;
			case "purple":
				print("a cloaked figure glides in reverse across the screen. The pool of blood shrinks, and the body on the ground flies to their feet. A colorful array of oragami birds rise across the screen, obscuring everything behind it.");
				break;
			case "theater":
				print("a monk walks backward onto the screen, says something inaudible, and leaves.");
				break;
			default:
				System.out.println("Story.printRewind() error");
				break;
		}
		
		print("\n\nThe static on the television screen dissipates.");
	}
	
	public static void printFastforward(String c) {
		print("The television screen becomes distorted with static. As the tape fastforwards, ");
		
		switch (c) {
			case "orange":
				print("someone enters the cafe from the left, and heads off north. A cloaked figure appears, and swiftly cuts them down with a sword. The figure glides out of sight as the pool of blood spreads across the ground.");
				break;
			case "green":
				print("someone enters the living room from the left. A cloaked figure appears, and swiftly cuts them down with a sword. The figure glides out of sight as the pool of blood spreads across the floor.");
				break;
			case "purple":
				print("the curtain of oragami birds falls to the ground, revealing someone wearing a purple samue. A cloaked figure appears, and swiftly cuts them down with a sword. The figure glides out of sight as the pool of blood spreads across the deck.");
				break;
			case "theater":
				print("a monk walks onto the scene, says something inaudible, and leaves.");
				break;
			default:
				System.out.println("Story.printRewind() error");
				break;
		}
		
	}
	
	public static void printBlackOut() {
		print("You wake up.");
		newParagraph();
	}
	
	public static void printMoveBirds() {
		print("As you take an oragami bird into your hand, the entire curtain falls to the ground. Standing before you, with an unwavering stare, is a masked woman dressed in a blue kimono.");
	}
	
	public static void printGameOver() {
		print("There is no ningyo alive who can recieve your spirit.\n\n***GAME OVER***\n\n");
		askQuestion();
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
		print("The wooden sign is detailed with the sacred symbol of the Endless Knot.");
	}
	
	public static void printMemorizeSymbol() {
		print(" The sacred symbol is commited to memory and available to visualize while meditating!");
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
	
	public static void printBait() {
		print(cornOnRod);
	}
	
	public static void printHow() {
		print("How do you expect to do that?");
	}
	
	public static void printCast() {
		print(cast);
	}

	public static void printGlassObstructs() {
		print("The glass obstructs you from doing that.");
	}
	
	public static void printPassTime() {
		print("Time passes...");
	}
	
	public static void printNotAChance() {
		print("Not a chance!");
	}
	
	public static void printBite() {
		print("\nYou feel a tug on your fishing rod. You got a bite!");
	}
	
	public static void printCatch() {
		print(" You caught a koi fish! You notice there is a marking on its side... It is the sacred symbol of the Golden Fish! ");
		
		if (!Player.memory.contains("fish"))
			printMemorizeSymbol();
		
		print(" The fish wiggles out of your hands back into the pond with a splash.");
	}
	
	public static void printMemory() {
		if (Player.memory.size() == 0) {
			print("You don't have anything memorized.");
		} else {
			print("You have memorized:");
			
			if (Player.memory.contains("fish")) {
				newLine();
				print("   The sacred symbol: Golden Fish");
			}
			
			if (Player.memory.contains("lotus")) {
				newLine();
				print("   The sacred symbol: Lotus Flower");
			}
			
			if (Player.memory.contains("knot")) {
				newLine();
				print("   The sacred symbol: Endless Knot");
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
	
	public static void printTooHeavy() {
		print("It's too heavy to move.");
	}
	
	public static void printShutCase() {
		if (World.caseOpen) {
			print("The jewelled case shuts with a satisfying snap.");
			World.caseOpen = false;
		} else {
			printAlreadyShut();
		}
	}
	
	public static void printOpenCase() {
		if (World.creakyDeckOpen) {
			printAlreadyOpen();
		} else {
			if (World.XXO) {
				print("The case opens with a creak.");
				
				if (World.goInBox) {
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
		// setScrollStop(scrollStopTheater);
	}
	
	public static void printTrance(int t) {
		newParagraph();
		print("Everything goes quiet.\n\nYou hear distant voices...");
		newParagraph();
		
		if (t == 1) {
			print(trance1);
			// setScrollStop(scrollStopTrance1);
		}
		
		if (t == 2) {
			print(trance2);
			// setScrollStop(scrollStopTrance2);
		}
		
		if (t == 3) {
			Data.setYear();
			print(trance3);
			newParagraph();
			print("\"" + Data.year + ".\"");
			// setScrollStop(scrollStopTrance3);
		}
		
		newParagraph();
		printDoneMeditating();
	}
	
	public static void printSamadhi1() {
		print(samadhi1);
		
		switch (Player.getArea()) {
			case "garden":
				print(samadhi2);
				NPC.reaperMoved = true;
				break;
			case "house":
				print(samadhi3);
				
				// this opens Altar of Samantabhadra door
				Player.orangeAlive = true;
				Player.purpleAlive = false;
				World.resetBulbs();
				World.shrineRoom2DoorOpen = true;
				NPC.reaperMoved = true;
				break;
			case "temple":
				print(samadhi4);
				printSamadhiFinal();
				break;
			default:
				System.out.println("Story.printSamadhi1 error");
				break;
		}
	}
	
	public static void printSamadhiFinal() {
		newLine();
		
		switch (Player.getArea()) {
			case "garden":
			print(samadhi5);
				print("golden chest.");
				newLine();
				break;
			case "house":
				print(samadhi5);
				print("television.");
				newLine();
				break;
			default:
				System.out.println("Story.printSamadhiFinal() error");
				break;
		}

		print(samadhi6);
		
		switch (Player.getArea()) {
			case "garden":
				print("orange samue standing in an assembly room");
				break;
			case "house":
				print("green samue standing in a theater");
				break;
			case "temple":
				print("purple samue standing on the overlook of Kegon-ji temple");
				break;
			default:
				System.out.println("Story.printSamadhiFinal() error");
				break;
		}

		print(samadhi7);
		
		switch (Player.getArea()) {
			case "garden":
				print("opens the golden chest.");
				break;
			case "house":
				print("presses play on the television.");
				break;
			case "temple":
				print("removes the mask of the woman in the blue kimono.");
				break;
			default:
				System.out.println("Story.printSamadhiFinal() error");
				break;
		}
		
		newLine();
		pressKey("end");
	}
	
	public static void pressKey(String s) {
		print("[press any key to continue...]");
		mustPressKey = true;
		key = s;
		Wabewalker.deleteInputBox();
		Wabewalker.changeFocus("bigPanel");
	}
	
	public static void pressedKey() {
		switch (key) {
			case "start":
				Data.startGame();
				break;
			case "end":
				Story.printEnd();
				break;
			default:
				System.out.println("Story.pressKey() error");
				break;
		}
		
		Wabewalker.setInputBox();
		Parser.resetInput();
		Wabewalker.changeFocus("inputBox");
		Story.mustPressKey = false;
	}
	
	public static void wipeStory() {
		Wabewalker.body.setText("");
	}
	
	public static void askQuestion() {
		print("Would you like to restart the game, restore a save file, or quit?");
		restartRestoreOrQuit = true;
	}
	
	public static void handleQuestion(String s) {
		switch (s) {
			case "RESTART":
				restartRestoreOrQuit = false;
				Data.newGame();
				break;
			case "RESTORE":
				Data.attemptToRestoreGame();
				break;
			case "QUIT":
				System.exit(0);
				break;
			default:
				invalid();
				newLine();
				askQuestion();
				break;
		}
	}
	
	public static void printEnd() {
		Data.updateScore(10);
		newParagraph();
		print("*THE END*\n\nCongradulations! You completed Wabewalker in " + Data.moves + " moves, " + Data.deaths + " deaths, and a ");
		
		if (Data.score == Data.maxScore)
			print("perfect ");
		
		print("score of " + Data.score + " out of " + Data.maxScore + ".");
		
		newParagraph();
		printCredits();
		newParagraph();
		print("Thank you for playing Wabewalker");
		newParagraph();
		askQuestion();
	}
	
	public static void printCredits() {
		print(credits);
	}
	
	public static void printHint(String s) {
		if (!s.equals("")) {
			try {
				Data.hint = Integer.parseInt(s);
			} catch (Exception e) {
				System.out.println("Story.printHint() User typed HINT X where X was not a valid integer.");
			}
		}
		
		print("[Hint " + Data.hint + "/24]");
		newLine();
		
		switch (Data.hint) {
			case 1:
				print("There are no hints for this game! You have nothing to rely on but your own wit!");
				break;
			case 2:
				print("Okay, there may be some hints. But imagine the spine-tingling thrill of solving the puzzles on your own!");
				break;
			case 3:
				print("You really need a hint, huh? Okay!");
				break;
			case 4:
				print("Did you notice the metal panels scattered around the world? They aren't directly interactable.");
				break;
			case 5:
				print("Did you notice that sometimes the bulbs are glowing, and sometimes they aren't?");
				break;
			case 6:
				print("What changed in the world that affected the state of the glow?");
				break;
			case 7:
				print("Do the colors of the bulbs have any significance?");
				break;
			case 8:
				print("I've given you a million hints already!");
				break;
			case 9:
				print("Have you noticed that your reflection in the mirrors changes depending on where you are?");
				break;
			case 10:
				print("The color of each bulb corresponds to something in the world.");
				break;
			case 11:
				print("The color of each bulb corresponds to the color of your samue. The bulb will stop glowing when you die in that color samue.");
				break;
			case 12:
				print("Did you notice what happens when the glowing bulbs align with the arrows? It unlocks whatever is near the panel.");
				break;
			case 13:
				print("Have you examined the hokura on the Island more closely?");
				break;
			case 14:
				print("Have you mastered control of the televisions? You can rewind death, and travel to that world by \"playing\" it.");
				break;
			case 15:
				print("I'm out of breath giving out all these hints! What I say next will contain spoilers that do not pertain to the bulbs on the metal panels!");
				break;
			case 16:
				print("Did you know that fish like to eat tasty snacks?");
				break;
			case 17:
				print("Have you read the sign halfway up the mountain?");
				break;
			case 18:
				print("Have you examined the mannequins more closely? The item they hold may need to be examined in the proper light.");
				break;
			case 19:
				print("Have you found a phone number to call on the landline in the sitting room yet? Someone may have written it on their business card.");
				break;
			case 20:
				print("On the phone, Kimi gives you vital information needed to finish the game. Did you take notes?");
				break;
			case 21:
				print("Did you find the hidden theater? When you do, take notes.");
				break;
			case 22:
				print("Check your memory by typing MEMORY. Once you found all three sacred symbols and all seven sacred words, you can meditate at the three shrines.");
				break;
			case 23:
				print("Combine the wisdom of Kimi and Kiyoshi with the aid of the cryptogram to learn what year the Wabewalker wrote Bunraku.");
				break;
			case 24:
				print("Good luck!");
				break;
			default:
				System.out.println("Story.printHint error");
				break;
		}
		
		newLine();
		print("For another hint, type HINT.");
		Data.hint++;
		
		if (Data.hint > 24)
			Data.hint = 1;
	}
}
