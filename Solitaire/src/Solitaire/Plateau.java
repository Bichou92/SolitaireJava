package Solitaire;

public class Plateau extends Bille {

	public int[][] plateau = new int[7][7];
	
	public void RemplirPlateau() 
	{	
		for(int i = 0; i < plateau.length; i++)
		{
			for(int j = 0; j < plateau.length; j++) 
			{
			    SetPlateauRempli(i, j, 2);
			
				if (i==3 && j==3) 
				{
					SetPlateauRempli(i, j, 1);
				}
				
			}
		}
	}
	
	public int GetPlateauRempli(int i,int j)
	{
		return plateau[i][j];
	}
	
	public void SetPlateauRempli(int i, int j, int contenu)
	{
		this.plateau[i][j] = contenu; 
	}
	
	public boolean ComparerCasesDepArr(int i,int j, int x, int y)
	{
		return GetPlateauRempli(i, j) != GetPlateauRempli(x, y);
	}
	
	public void Deplacer(int i,int j, int x, int y)
	{
		if (ComparerCasesDepArr(i, j, x, y))
		{
			int temp = GetPlateauRempli(x, y);
			SetPlateauRempli(x, y, GetPlateauRempli(i, j));
			SetPlateauRempli(i,j,temp);
		}
	}
	
	private static int ComparerCoord(int a, int b)
	{
		if (a>b)
		{
			return +1;
		}
		else
		{
			return -1;
		}
	}
	
	public boolean ComparerCasesHorizontal(int i, int j, int x, int y)
	{
		return GetPlateauRempli(i, j) == GetPlateauRempli(x + ComparerCoord(i, x) , y);	
	}
	
	public boolean ComparerCasesVertical(int i, int j, int x, int y)
	{
		return GetPlateauRempli(i, j) == GetPlateauRempli(x,y + ComparerCoord(j, y));
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
		
}