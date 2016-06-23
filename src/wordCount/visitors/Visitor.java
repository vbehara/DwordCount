package wordCount.visitors;

import wordCount.treesForStrings.TreeStructure;

public interface Visitor 
{
	   // add one visit method for each element
		public void visit(TreeStructure tree);

}
