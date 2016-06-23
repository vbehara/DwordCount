package wordCount.treesForStrings;

import java.util.Map;
import java.util.TreeMap;

import wordCount.util.MyLogger;
import wordCount.visitors.Visitor;

public class TreeStructure {
	
	//Data Structure to hold words and its count
	private Map<Integer, WordNode> tree;
	
	// constructor for treeStructure
	public TreeStructure() {
		MyLogger.getInstance().printToStdout(2, "DEBUG MESSAGE FROM Constructor of TreeStructure");
		this.tree = new TreeMap<Integer, WordNode>();
		
	}

	
	// Gets the tree map
	public Map<Integer, WordNode> getTree() {
		MyLogger.getInstance().printToStdout(3, "DEBUG MESSAGE FROM getter of TreeMap");
		return tree;
	}

	//Sets the tree map
	public void setTree(Map<Integer, WordNode> tree) {
		MyLogger.getInstance().printToStdout(3, "DEBUG MESSAGE FROM setter of TreeMap");
		this.tree = tree;
	}


	/***
	 * accepts visitor to elements
	 * @param visitor
	 */
	public void accept(Visitor visitor) {
		// visitor.visitDVD(this);
		MyLogger.getInstance().printToStdout(1,"DEBUG MESSAGE FROM accept of TreeStructure");
		visitor.visit(this);
	}

//Overriding toString method in TreeStructure class
	public String toString() {
		return "\nOverriding toString in TreeStructure Class";
	}

}
