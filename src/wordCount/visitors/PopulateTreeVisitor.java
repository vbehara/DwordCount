package wordCount.visitors;

import java.util.Map;

import wordCount.treesForStrings.TreeStructure;
import wordCount.treesForStrings.WordNode;
import wordCount.util.FileProcessor;
import wordCount.util.MyLogger;

public class PopulateTreeVisitor implements Visitor {

	private FileProcessor fProcessor;

	public PopulateTreeVisitor(FileProcessor fProcessor) {

		this.fProcessor = fProcessor;
		MyLogger.getInstance().printToStdout(2,
				"DEBUG MESSAGE FROM Constructor of PopularTreeVisitor");
	}


	@Override
	public void visit(TreeStructure treeMap) {
		MyLogger.getInstance().printToStdout(1,
				"DEBUG MESSAGE FROM Visit of PopularTreeVisitor");
		
		Map<Integer, WordNode> tree = treeMap.getTree();
		
		String inputLine = null;
		while ((inputLine = this.fProcessor.readFromFile()) != null) {
			WordNode node;
			inputLine = inputLine.trim();
			int input= inputLine.hashCode();
			if(!inputLine.isEmpty()){
				if(!tree.containsKey(input)) {
					node = new WordNode();
					node.setWordCount(1L);
					node.setCharacters(inputLine.length());
					
					tree.put(input, node);
				} else {
					node = tree.get(input);
					node.setWordCount(node.getWordCount() + 1);
				}
			}
		}
	}
		
	

//Overriding toString method in TreeVisitor class
	public String toString() {
		return "\nOverriding toString in PopulateTreeVisitor Class";
	}

}
