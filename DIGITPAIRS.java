import java.util.*;
public class DIGITPAIRS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =  sc.nextInt();
		List<Integer> numbers = new ArrayList<Integer>();
		List<String> bitScores = new ArrayList<String>();
		while(n-- > 0) {
			numbers.add(sc.nextInt());
		}
		for(int i=0;i<numbers.size();i++)
		{
			String num = numbers.get(i).toString();
			int d1 = Character.getNumericValue(num.charAt(0));
			int d2 = Character.getNumericValue(num.charAt(1));
			int d3 = Character.getNumericValue(num.charAt(2));
			int max = Math.max(Math.max(d1, d2), d3);
			int min = Math.min(Math.min(d1, d2), d3);
			String bitScore = Integer.toString((max*11) + (min*7));
			if(bitScore.length() == 3)
			{
				bitScore = (Character.toString(bitScore.charAt(1)) + Character.toString(bitScore.charAt(2)));
			}
			bitScores.add(bitScore);
		}
		System.out.println(bitScores);
		List<String> oddBitScores = new ArrayList<String>();
		List<String> evenBitScores = new ArrayList<String>();
		for(int i=0;i<bitScores.size();i+=2)
		{
			oddBitScores.add(bitScores.get(i));
		}
		for(int i=1;i<bitScores.size();i+=2)
		{
			evenBitScores.add(bitScores.get(i));
		}
		System.out.println(oddBitScores);
		System.out.println(evenBitScores);
		List<String> oddBitScoreMSBs = new ArrayList<String>();
		List<String> evenBitScoreMSBs = new ArrayList<String>();
		for(int i=0;i<oddBitScores.size();i++)
		{
			String temp = Character.toString(oddBitScores.get(i).charAt(0));
			oddBitScoreMSBs.add(temp);
		}
		for(int i=0;i<evenBitScores.size();i++)
		{
			String temp = Character.toString(evenBitScores.get(i).charAt(0));
			evenBitScoreMSBs.add(temp);
		}
		System.out.println(oddBitScoreMSBs);
		System.out.println(evenBitScoreMSBs);
		int count = 0;
		List<String> oddBitScoreMSBsUnique = new ArrayList<String>();
		List<String> evenBitScoreMSBsUnique = new ArrayList<String>();
		for(int i=0;i<oddBitScoreMSBs.size();i++)
		{
			if(!oddBitScoreMSBsUnique.contains(oddBitScoreMSBs.get(i)))
			{
				oddBitScoreMSBsUnique.add(oddBitScoreMSBs.get(i));
			}
		}
		for(int i=0;i<evenBitScoreMSBs.size();i++)
		{
			if(!evenBitScoreMSBsUnique.contains(evenBitScoreMSBs.get(i)))
			{
				evenBitScoreMSBsUnique.add(evenBitScoreMSBs.get(i));
			}
		}
		System.out.println(oddBitScoreMSBsUnique);
		System.out.println(evenBitScoreMSBsUnique);
		for(int i=0;i<oddBitScoreMSBsUnique.size();i++)
		{
			if(Collections.frequency(oddBitScoreMSBs, oddBitScoreMSBsUnique.get(i)) == 2)
			{
				count++;
			}
			else if(Collections.frequency(oddBitScoreMSBs, oddBitScoreMSBsUnique.get(i)) >= 3)
			{
				count+=2;
			}
		}
		for(int i=0;i<evenBitScoreMSBsUnique.size();i++)
		{
			if(Collections.frequency(evenBitScoreMSBs, evenBitScoreMSBsUnique.get(i)) == 2)
			{
				count++;
			}
			else if(Collections.frequency(evenBitScoreMSBs, evenBitScoreMSBsUnique.get(i)) == 3)
			{
				count+=2;
			}
		}
		System.out.println(count);
	}

}
