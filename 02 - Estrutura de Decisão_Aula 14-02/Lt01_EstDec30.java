/**
 * Objetivo:        Receba a data de nascimento e atual em ano, m�s e dia. Calcule e mostre a 
 * 					idade em anos, meses e dias, considerando os anos bissextos.
 * Programadora:    Kesia Amanda
 * Data:            06/04/2019
 */

import javax.swing.JOptionPane;

public class Lt01_EstDec30 
{
	public static void main (String[] args)
	{		
		int diaAtual = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia atual: "));
		int mesAtual = Integer.parseInt(JOptionPane.showInputDialog("Informe o m�s atual: "));
		int anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano atual: "));
		int diaNasc = Integer.parseInt(JOptionPane.showInputDialog("Informe o seu dia de nascimento: "));
		int mesNasc = Integer.parseInt(JOptionPane.showInputDialog("Informe o seu m�s de nascimento: "));
		int anoNasc = Integer.parseInt(JOptionPane.showInputDialog("Informe o seu ano de nascimento: "));
		
		int difDia = diaAtual - diaNasc;
		int difMes = mesAtual - mesNasc;
		int difAno = anoAtual - anoNasc;
			
		if (difDia<0){
			difMes-=1;
			difDia+=FuncDiasMesPassado(mesAtual,anoAtual);
		}
		if (difMes<0){
			difMes=12+difMes;
			difAno-=1;	
		}
				
		System.out.print("Anos: "+difAno+" meses: "+difMes+" dias: "+difDia);
	}
	
	static int FuncDiasMesPassado (int mesAtual, int anoAtual) {
		if (mesAtual==3) {
			return FunBissexto(anoAtual);
		}else if (mesAtual==5||mesAtual==7||mesAtual==10||mesAtual==12) {
			return 30;
		}else {
			return 31;
		}
	}
	
	static int FunBissexto (int anoAtual) {
		if (anoAtual%4==0) {
			if (anoAtual%100==0 && anoAtual%400!=0) {
				return 28;
			}else {
				return 29;
			}
		}else {
			return 28;
		}
	}
}
