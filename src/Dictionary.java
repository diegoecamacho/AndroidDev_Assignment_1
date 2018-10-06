
import java.util.HashMap;
import java.util.Random;

/**
 * <p> Dictionary Class
 * Holds all the words in the Word Guess Game.
 * </p>
 * @param wordKey Holds the current Word in play
 * @param dictionary {@code<string,string>} Hash table Key is the Word Definition is Value
 * @param dictionaryText all the dictionary Words in an array
 * @author Diego Camacho 
 */
public class Dictionary {
	Dictionary(){
		dictionary = new HashMap<String,String>();
		for(int x = 0 ; x < dictionaryText.length ; x += 2) {
			dictionary.put(dictionaryText[x], dictionaryText[x + 1]);
		}
	}
	
	/**
	 * Print's the Dictionary
	 */
	public void PrintDictionary() {
		System.out.println(dictionary);
	}
	
	/**
	 * Returns a random definition from the dictionary placing the Word in WordKey
	 * @return Word Definition
	 */
	String GetRandomDefinition(){
		String[] keyArray = dictionary.keySet().toArray(new String[10]);
		wordKey = keyArray[new Random().nextInt(keyArray.length - 1)];
		System.out.println(dictionary.get(wordKey) + "\n");
		return dictionary.get(wordKey);
	}
	
	/**
	 * Returns the active Word
	 * @return Word
	 */
	public String GetWord() {
		return wordKey;
	}
	
	String wordKey;
	HashMap<String,String> dictionary;
	
	String[] dictionaryText  = {
			"Schism"," Division or separation",
			"Approbator"," One who approves",
			"Flatulently","In a flatulent manner with flatulence",
			"Superpraise","To praise to excess",
			"Harassed","troubled persistently especially with petty annoyances as harassed working mothers",
			"complot","to plot or conspire ",
			"lavatory","wash-basin for washing bodies of newly dead; room where lavabo kept ",
			"vaquita","small porpoise living in the Gulf of California ",
			"volery","place for aircraft repair ",
			"vigoro","team sport combining cricket and baseball ",
			"Handful","As much as the hand will grasp or contain",
			"Sameness","The state of being the same identity absence of difference near resemblance correspondence similarity as a sameness of person of manner of sound of appearance and the like",
			"Coestate","Joint estate",
			"Photographer","One who practices or is skilled in photography",
			"Water tender","In the United States navy a first class petty officer in charge in a fireroom He ldquotendsrdquo water to the boilers sees that fires are properly cleaned and stoked etc There is also a rating of chief water tender who is a chief petty officer",
			"Despotism","The power spirit or principles of a despot absolute control over others tyrannical sway tyranny",
			"Movie"," A motion picture",
			"Smock","A womans under garment a shift a chemise",
			"Devocation","A calling off or away",
			"Deflator","a statistical factor designed to remove the effect of inflation inflation adjusted variables are in constant dollars as the GNP deflator",
			"Harmonically","In an harmonical manner harmoniously",
			"Arthrogastra","A division of the Arachnida having the abdomen annulated including the scorpions harvestmen etc pedipalpi",
			"Tubercular","Having tubercles affected with tubercles tubercled tuberculate",
			"Verbarsudatorium","A sudatory",
			"Overgrassed","Overstocked or overgrown or covered with grass",
			"Chamaeleonidae","a natural family comprising the Old World chameleons in some classifications Rhiptoglossa is considered a superfamily of Sauria",
			"Auncel","A rude balance for weighing and a kind of weight formerly used in England",
			"Frowey","Working smoothly or without splitting said of timber",
			"Gastropod","One of the Gastropoda",
			"Eucalyn","An unfermentable sugar obtained as an uncrystallizable sirup by the decomposition of melitose also obtained from a Tasmanian eucalyptus whence its name",
			"Equiparate"," To compare",
			"Inquietness","Unquietness",
			"Ilicic","Pertaining to or derived from the holly Ilex and allied plants as ilicic acid",
			"Mussulmanly","In the manner of Moslems",
			"Grinningly","In a grinning manner",
			"Furnarius","The type genus of the Furnariidae comprising the South American ovenbirds",
			"Bluestocking","A literary lady a female pedant",
			"By pass","A by passage for a pipe or other channel to divert circulation from the usual course",
			"Demulce","To soothe to mollify to pacify to soften",
			"Unpannel","To take the saddle off to unsaddle",
			"Cystine"," A white crystalline substance C3H7NSO2 containing sulphur occuring as a constituent of certain rare urinary calculi and occasionally found as a sediment in urine",
			"Operable","Practicable",
			"Transportable","Capable of being transported",
			"trenchant","incisive; terse; vigorous ",
			"ephelis","freckle or mole ",
			"acratia","impotence",
			"yusho","skin-staining disease caused by contaminated rice oil ",
			"foremast","mast nearest the bow of a ship",
			"gallipot","small medicine jar",
			"novity","innovation; newness",
			"quean","lewd woman; hussy; woman of bad character",
			"osmesis","act of smelling",
			"disorbed"," arrr",
			"tuck","deprived of authority or sovereignty ",
			"klendusic","able to withstand disease due to protective mechanism",
			"jota","fast Spanish folk dance in triple time",
			"bagging","coarse fabric for making bags or sacks",
			"compeer","one who is equal in rank; a companion",
			"affray","an attack or assault; an alarm or fright ",
			"brogan","strong and tough working shoe ",
			"jabot","lace frill worn on shirt or dress front ",
			"kettlestitch","stitch made at head and tail of section of book to connect sections ",
			"undate","wavy",
			};
}
