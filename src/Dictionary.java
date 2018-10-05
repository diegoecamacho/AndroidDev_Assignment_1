
import java.util.HashMap;
import java.util.Random;

public class Dictionary {
	Dictionary(){
		dictionary = new HashMap<String,String>();
		for(int x = 0 ; x < dictionaryText.length ; x += 2) {
			dictionary.put(dictionaryText[x], dictionaryText[x + 1]);
		}
	}
	
	
	public void PrintDictionary() {
		System.out.println(dictionary);
	}
	
	String GetRandomDefinition(){
		String[] keyArray = dictionary.keySet().toArray(new String[10]);
		keyRef = keyArray[new Random().nextInt(keyArray.length - 1)];
		System.out.println(dictionary.get(keyRef) + "\n");
		return dictionary.get(keyRef);
	}
	
	public String GetWord() {
		return keyRef;
	}
	
	String keyRef;
	HashMap<String,String> dictionary;
	
	String[] dictionaryText  = {"Schism"," Division or separation",
			"Approbator"," One who approves",
			"tuck"," arrr",
			"Superpraise"," To praise to excess",
			"Harassed"," troubled persistently especially with petty annoyances as harassed working mothers",
			"complot"," to plot or conspire ",
			"lavatory"," wash-basin for washing bodies of newly dead; room where lavabo kept ",
			"vaquita"," small porpoise living in the Gulf of California ",
			"volery"," place for aircraft repair ",
			"vigoro"," team sport combining cricket and baseball "
			};
}
