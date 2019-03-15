package Função;
/*
Objetivo:		Calcule e mostre quantos anos ser�o necess�rios para que Ana seja maior que Maria 
				sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m e cresce 2 cm ao ano.
Programador:	Kesia Amanda
Data: 			02/03/2019
*/

import javax.swing.*;

public class Lt01_ModFunEx43 
{
	public static void main (String[] args)
	{
		double altAna=1.10, altMaria=1.50;
		
		JOptionPane.showMessageDialog(null, "Levará "+FunAltAna(altAna,altMaria)+" anos para que Ana sejá maior que Maria.");
	}
	
	static int FunAltAna(double altAna, double altMaria)
	{
		int contAno = 0;
		do
		{
			contAno++;
			altAna+=0.03;
			altMaria+=0.02;
		}
		while (altAna<altMaria);
		
		return contAno;
	}
}
