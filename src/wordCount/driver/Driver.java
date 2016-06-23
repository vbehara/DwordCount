package wordCount.driver;

import wordCount.util.FileProcessor;
import wordCount.util.MyLogger;
import wordCount.treesForStrings.TreeStructure;
import wordCount.visitors.PopulateTreeVisitor;
import wordCount.visitors.Visitor;
import wordCount.visitors.WordCountVisitor;

public class Driver {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		if (args.length != 4) {
			System.err.println("Need to provide four arguments - inputfileName,outputfileName,N value,debugValue");
			System.exit(1);
		}
        
		int debugValue = Integer.parseInt(args[3]);
		if((debugValue < 0)|| (debugValue >3))
		{
			System.err.println("Need to provide proper debug value");
                        System.exit(1);
		}
		int N = Integer.parseInt(args[2]);
		if(N <=0)
		{
			System.err.println("Need to provide proper Iteration value");
		}
		String inputFileName = args[0];
		String outputFileName = args[1];
		
		MyLogger.getInstance().setDebug(Integer.parseInt(args[3]));

		for (int i = 0; i < N; i++) {

			TreeStructure treeData = new TreeStructure();
			
			FileProcessor fProcessor = new FileProcessor(inputFileName,outputFileName);
			
			
			// create the visitors
			Visitor populateTreevisitor = new PopulateTreeVisitor(fProcessor);
			Visitor wordCountVisitor = new WordCountVisitor(fProcessor);

			// visit the elements
			treeData.accept(populateTreevisitor);
			treeData.accept(wordCountVisitor);
			fProcessor.closeWrite();
		}

		long finishTime = System.currentTimeMillis();

		long total_time = (finishTime - startTime) / N;

		System.out.println("total time : " + total_time);
	

	}
}
