package com.imie.Diagram_UML;
import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		
		Human president = new Bad("Emmanuel", "Macron");
		Panda pandaMacron = new Panda("Yuan");
		
		System.out.println(president.getName());
		System.out.println(pandaMacron.getName());
		pandaMacron.congratulate();
	
		//////////////////////////////////////////
		
		List<Client> listeClient= new ArrayList<Client>();
		listeClient.add(new Bad("Emmanuel", "Macron"));
		listeClient.add(new Panda("Yuan"));
		
		for (Client client : listeClient) {
			System.out.println(client.getName());
		}	
	}

}
