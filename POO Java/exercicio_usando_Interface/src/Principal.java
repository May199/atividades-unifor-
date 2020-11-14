package exercicio_usando_Interface.src;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args){
		IngressoComum comum = new IngressoComum("Usuario", false, 20, 1);
		IngressoVIP VIP = new IngressoVIP("Usuario", true, 30, 2);

		comum.mostra();
		VIP.mostra();
		System.out.println("Valor do reembolso para ingressos comuns: "+comum.calculaReembolso());
		System.out.println("Valor do reembolso para ingressos VIPs: "+VIP.calculaReembolso());
	}

}

