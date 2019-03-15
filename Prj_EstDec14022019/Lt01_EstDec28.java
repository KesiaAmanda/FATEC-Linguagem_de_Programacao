/**
 * Objetivo:        Receba o pre�o atual e a m�dia mensal de um produto. Calcule e mostre o novo pre�o sabendo que:
					Venda Mensal		Pre�o Atual		Pre�o Novo
					(<500)				(<30)			(+10%)
					(>=500 e <1000)		(>=30 e <80)	(+15%)
					(>= 1000)			(>= 80) 		(- 5%)
					Obs.: para outras condi��es, pre�o novo ser� igual ao pre�o atual.

 * Programadora:    Kesia Amanda
 * Data:            16/02/2019
 */

import javax.swing.JOptionPane;

public class Lt01_EstDec28 
{
	public static void main (String[] args)
	{
		Double precAtual = Double.parseDouble(JOptionPane.showInputDialog("Informe o Pre�o atual do produto:"));
		int medMensal= Integer.parseInt(JOptionPane.showInputDialog("Informe a m�dia de venda mensal do produto: "));
		
		if (medMensal>=100 && precAtual>=80)
		{
			JOptionPane.showMessageDialog(null, "O novo pre�o � " + (precAtual*0.95) + "!");
		}
		else if (medMensal>=500 && precAtual>=30)
		{
			JOptionPane.showMessageDialog(null, "O novo pre�o � " + (precAtual*1.15) + "!");
		}
		else if (medMensal<500 && precAtual<30)
		{
			JOptionPane.showMessageDialog(null, "O novo pre�o � " + (precAtual*1.1) + "!");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "N�o houve altera��o do pre�o!");
		}
	}
}
