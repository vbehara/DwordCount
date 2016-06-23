package wordCount.visitors;

import java.util.Map;

import wordCount.treesForStrings.TreeStructure;
import wordCount.treesForStrings.WordNode;
import wordCount.util.FileProcessor;
import wordCount.util.MyLogger;

public class WordCountVisitor implements Visitor {

	private FileProcessor fProcessor;

	public WordCountVisitor(FileProcessor fProcessor) {
		MyLogger.getInstance().printToStdout(2,
				"DEBUG MESSAGE FROM Constructor of WordCountVisitor");
		this.fProcessor = fProcessor;
	}

	@Override
	public void visit(TreeStructure tree) {
		MyLogger.getInstance().printToStdout(1,
				"DEBUG MESSAGE FROM Visit of WordCounterVisitor");

		Map<Integer, WordNode> tMap = tree.getTree();
		long wordCount = 0;
		long uniqueWordCount = tMap.size();
		long charCount = 0;
		if (tMap != null) {

			for (WordNode node : tMap.values()) {
				wordCount = wordCount + node.getWordCount();
				charCount = charCount
						+ (node.getWordCount() * node.getCharacters());
			}
		}

		String s = "No of Word Counts: " + wordCount + "\n"
				+ "No of Char Counts: " + charCount + "\n"
				+ "No of Unique Word Counts: " + uniqueWordCount + "\n";
		fProcessor.writeToFile(s);

	}

	// Overriding toString method in WordCountVisitor class
	public String toString() {
		return "\nOverriding toString in WordCountVisitor Class";
	}

}
