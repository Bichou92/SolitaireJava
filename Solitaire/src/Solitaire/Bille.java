package Solitaire;

import java.util.Scanner;

public class Bille {
	
	private int CooAbsDepart;
	private int CooAbsArrivee;
	private int CooOrdDepart;
	private int CooOrdArrivee;
	private int NbBilles = 30;
	public boolean possible;
	private Scanner sc = new Scanner (System.in);
		
	public int GetCooAbsDepart(int CooAbsDep)
	{
		return CooAbsDepart;
	}
	
	public int GetCooAbsArrivee(int CooAbsArr)
	{
		return CooAbsArrivee;
	}
	
	public int GetCooOrdDepart(int CooOrdDep)
	{
		return CooOrdDepart;
	}
	
	public int GetCooOrdArrivee(int CooOrdArr)
	{
		return CooOrdArrivee;
	}
	
	public void SetCooAbsDepart(int CooAbsDep)
	{
		this.CooAbsDepart = CooAbsDep;
	}
	
	public void SetCooAbsArrivee(int CooAbsArr)
	{
		this.CooAbsArrivee = CooAbsArr;
	}
	
	public void SetCooOrdDepart(int CooOrdDep)
	{
		this.CooOrdDepart = CooOrdDep;
	}
	
	public void SetCooOrdArrivee(int CooOrdArr)
	{
		this.CooOrdArrivee = CooOrdArr;
	}
	
	public int getNbBilles()
	{
		return NbBilles;
	}

	public void setNbBilles(int nbBilles) 
	{
		this.NbBilles = nbBilles;
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
		System.out.println("Saisir l'abscisse de la bille :");
		SetCooAbsDepart(sc.nextInt());
		System.out.println("Saisir l'ordonnée de la bille :");
		SetCooOrdDepart(sc.nextInt());
	}
	
	public void DeplacerBille()
	{
		System.out.println("Saisir l'abscisse de la case voulue :");
		SetCooAbsArrivee(sc.nextInt());
		System.out.println("Saisir l'ordonnée de la case voulue :");
		SetCooOrdArrivee(sc.nextInt());
	}
	
	public void EnleveBille()
	{
		
	}
}
