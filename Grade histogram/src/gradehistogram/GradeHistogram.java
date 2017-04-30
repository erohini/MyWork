package gradehistogram;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GradeHistogram {

	public static void main(String[] args) throws FileNotFoundException {
		int[] grades;
		int[] bins;
		readGrades("grades.in");
		computeHistogram();
		histogramHorizontal();
		histogramVerticle();
		
	}

	
	private static void readGrades(String filename) throws FileNotFoundException {
		try{
			String filepath = GradeHistogram.class.getResource(filename).getPath();
            Scanner file = new Scanner(new File(filepath));
            
            // read number of students' grades
            if ( ! file.hasNextInt()) {
                System.out.println("Error! Not found students number.");
                return;
            }
            int n = file.nextInt();
            
            // init grades array
            int[] grades = new int[n];
            
            // read grades
            for(int i = 0; i < n; i++) {
                if ( ! file.hasNextInt()) {
                    continue;
                }
                grades[i] = file.nextInt();
            }
		}catch(FileNotFoundException e){
			System.out.println("Exception Caught...");
			
		}
		
			
	}
	private static void computeHistogram() {
		int[] grades=new int[100];
		 int[] bins=new int[100];
		for(int i = 0; i < grades.length; i++) {
            int j = (grades[i] == 100) ? 9 : grades[i] / 10;
			bins[j] += 1;
		
		}
	}
	private static void histogramHorizontal() {
		System.out.println();
        int[] bins=new int[100];
		for(int i = 0; i < bins.length; i++)
        {
            int delta = (i == bins.length - 1) ? 10 : 9;
            System.out.printf("%2d -%3d:", (i*10), (i*10+delta));
            for(int j = 0; j < bins[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
		
		
	}

	private static void histogramVerticle() {
		int[] bins=new int[100];
		int maxBin = bins[0];
        for(int i = 0; i < bins.length; i++) {
            maxBin = (bins[i] > maxBin) ? bins[i] : maxBin;
        }
        
        // print histogram
        System.out.println();
        for(int i = maxBin; i >= 0; i--)
        {
            if (i == 0)
            {
                for(int j = 0; j < bins.length; j++)
                {
                    int delta = (j == bins.length - 1) ? 10 : 9;
                    System.out.printf("%2d-%-2d ", (j*10), (j*10+delta));
                }
            }
            else {
                for(int j = 0; j < bins.length; j++)
                {
                    String str = (bins[j] < i ) ? " " : "*";
                    System.out.printf("%3s%-2s ", str, " ");
                }
            }
            System.out.println();
        }
		
	}
	
	 private void printGrades()
	    {
		 int[] grades=new int[100];
	        for(int i = 0; i < grades.length; i++) {
	            System.out.print(grades[i]+" ");
	        }
	        System.out.println();
	    }
	    
	    /**
	     * Print students' grades
	     */
	    private void printBins()
	    {
	        int[] bins=new int[100];
			for(int i = 0; i < bins.length; i++) {
	            System.out.print(bins[i]+" ");
	        }
	        System.out.println();
	    }


}
