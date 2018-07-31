import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class jobOffers {

	public jobOffers() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = null;
        if (fileName != null) {
            bw = new BufferedWriter(new FileWriter(fileName));
        }
        else {
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        int[] res;
        int scores_size = 0;
        scores_size = Integer.parseInt(in.nextLine().trim());

        int[] scores = new int[scores_size];
        for(int i = 0; i < scores_size; i++) {
            int scores_item;
            scores_item = Integer.parseInt(in.nextLine().trim());
            scores[i] = scores_item;
        }

        int lowerLimits_size = 0;
        lowerLimits_size = Integer.parseInt(in.nextLine().trim());

        int[] lowerLimits = new int[lowerLimits_size];
        for(int i = 0; i < lowerLimits_size; i++) {
            int lowerLimits_item;
            lowerLimits_item = Integer.parseInt(in.nextLine().trim());
            lowerLimits[i] = lowerLimits_item;
        }

        int upperLimits_size = 0;
        upperLimits_size = Integer.parseInt(in.nextLine().trim());

        int[] upperLimits = new int[upperLimits_size];
        for(int i = 0; i < upperLimits_size; i++) {
            int upperLimits_item;
            upperLimits_item = Integer.parseInt(in.nextLine().trim());
            upperLimits[i] = upperLimits_item;
        }

        res = jobOffers(scores, lowerLimits, upperLimits);
        for(int res_i = 0; res_i < res.length; res_i++) {
            bw.write(String.valueOf(res[res_i]));
            bw.newLine();
        }

        bw.close();
    }


	
	private static int[] jobOffers(int[] scores, int[] lowerLimits, int[] upperLimits) {
		int lowerLimit = 0;
		int upperLimit = 0;
		int arraySize = 0;
		int attendRange = 0;
		int[] results;
		
		arraySize = lowerLimits.length;
		results = new int[arraySize];
		
		for (int i = 0; i < lowerLimits.length; i ++){
			attendRange = 0;
			lowerLimit = lowerLimits[i];
			upperLimit = upperLimits[i];
			
			for (int j = 0; j < scores.length; j ++){
				if ((scores[j] >= lowerLimit) && scores[j] <= upperLimit){
					attendRange ++;
				}
			}
			
			results[i] = attendRange;
		}
		
		return results;
    }
}
