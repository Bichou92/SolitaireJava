package Solitaire;

public class Plateau {

	public int[][] plateau = new int[7][7];
	public final static int VIDE = 1, OCCUPE = 2;
	
	public void RemplirPlateau() 
	{	
		for(int i = 0; i < plateau.length; i++)
		{
			for(int j = 0; j < plateau.length; j++) 
			{
			    SetPlateauRempli(i, j, OCCUPE);
			
				if (i==3 && j==3) 
				{
					SetPlateauRempli(i, j, VIDE);
				}
				
			}
		}
	}
	
	private String transform(int carreau) {
		switch(carreau)
		{
		case VIDE : return "[ ]";
		case OCCUPE : return "[X]";
		default: return "   ";
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
				System.out.print(transform(GetPlateauRempli(i,j)));
			}
			System.out.println();
		}	
	}
		
}