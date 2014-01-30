package Solitaire;

public class Plateau extends Bille {

	public int[][] plateau = new int[7][7];
	private Bille b = new Bille();
	
	public Plateau() 
	{	
		for(int i = 0; i < plateau.length; i++)
		{
			for(int j = 0; j < plateau.length; j++) 
			{
			    plateau[i][j] = 2;
			
			if (i==3 && j==3) 
			{
				plateau[i][j] = 1;
			}
			
			if (i<=1 && j<=1)
			{
				plateau[i][j] = 0;
			}
			
			if (i>4 && j<=1)
			{
				plateau[i][j] = 0;
			}
			
			if (i<=1 && j>4)
			{
				plateau[i][j] = 0;
			}
			
			if (i>4 && j>4)
			{
				plateau[i][j] = 0;
			}
			
			}
		}
	}
	
	public void AfficherPlateau()
	{
		for (int i = 0; i < plateau.length; i++) {
			for (int j = 0; j < plateau.length; j++) {	
				System.out.print(transform(plateau[i][j]));
			}
			System.out.println();
		}
		
	}

	private String transform(int carreau) {
		switch(carreau)
		{
		case 1 : return "[ ]";
		case 2 : return "[X]";
		default: return "   ";
		}
	
	}
	
	public void affecterBilleDepart()
	{
		for (int i = 0; i < plateau.length; i++)
		{
			for (int j = 0; j < plateau.length; j++)
			{
				b.SetCooAbsDepart(i);
				b.SetCooOrdDepart(j);
			}
	    }
	}
		
	public void affecterBilleArrivee()
	{
		for (int i = 0; i < plateau.length; i++)
		{
			for (int j = 0; j < plateau.length; j++)
			{
					b.SetCooAbsArrivee(i);
					b.SetCooOrdArrivee(j);
			}	
		}
    }
	
	public void deplacement()
	{
		for (int i = 0; i < plateau.length; i++)
		{
			for (int j = 0; j < plateau.length; j++)
			{
				 
			}	
		}
	}
	
}