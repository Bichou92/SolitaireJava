package Solitaire;

import java.util.Scanner;

public class Bille {
	
	private int CooDepart;
	private int CooArrivee;
	public boolean possible;
	private Scanner sc = new Scanner (System.in);
	
	public int GetCooDepart(int CooDep)
	{
		return CooDepart;
	}
	
	public int GetCooArrivee(int CooArr)
	{
		return CooArrivee;
	}
	
	public void SetCooDepart(int CooDep)
	{
		this.CooDepart = CooDep;
	}
	
	public void SetCooArrivee(int CooArr)
	{
		this.CooArrivee = CooArr;
	}
	
	public boolean EstPossible()
	{
		return possible;
	}
	
	public void SetPossible(boolean Poss)
	{
		this.possible = Poss;
	}
	
	public void SelectionnerBille()
	{
		System.out.println("Saisir les coordonn�es de la bille :");
		SetCooDepart(sc.nextInt());	
	}
	
	public void DeplacerBille()
	{
		System.out.println("Saisir les coordonn�es de la case � utiliser :");
		SetCooArrivee(sc.nextInt());
	}
	
	
	
}
