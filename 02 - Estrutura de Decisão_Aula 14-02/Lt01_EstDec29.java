/**
 * Objetivo:        Receba o tipo de investimento (1 = poupan�a e 2 = renda fixa) e o valor do investimento. 
 * 					Calcule e mostre o valor corrigido em 30 dias sabendo que a poupan�a = 3% e a renda fixa = 5%. 
 * 					Demais tipos n�o ser�o considerados.
 * Programadora:    Kesia Amanda
 * Data:            16/02/2019
 */

import javax.swing.JOptionPane;

public class Lt01_EstDec29 
{
	public static void main (String[] args)
	{
		int tipoInvest;
		
		do
		{
			tipoInvest = Integer.parseInt(JOptionPane.showInputDialog("Informe o tipo do investimento: \n[1] = Poupan�a \n[2] = Renda Fixa"));
		}
		while ( tipoInvest!=1 && tipoInvest!=2 );
		
		double valorInvest = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do investimento"));
		
		if (tipoInvest==1)
		{
			JOptionPane.showMessageDialog(null, "Valor corrigido em 30 dias [Poupan�a] " + (valorInvest*1.03));
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Valor corrigido em 30 dias [Renda Fixa]" + (valorInvest*1.05));
		}
	}
}
