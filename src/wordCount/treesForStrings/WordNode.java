package wordCount.treesForStrings;

public class WordNode {
	
	private long wordCount;
	private long characters;
	
	public String toString(){
		return "WordNode class";
	}
	
	public long getWordCount() {
		return wordCount;
	}
	public void setWordCount(long wordCount) {
		this.wordCount = wordCount;
	}
	public long getCharacters() {
		return characters;
	}
	public void setCharacters(long characters) {
		this.characters = characters;
	}

}
