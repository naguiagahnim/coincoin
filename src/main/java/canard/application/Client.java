package canard.application;

import canard.model.Canard;
import canard.model.Colvert;
import canard.model.PrototypeCanard;
import canard.model.vol.PropulsionAReaction;

public class Client {
	public static void main(String[] args) {
		Canard jacques = new Colvert("Jacques V de Labiroutière");
		Canard predator = new PrototypeCanard("Predator2000");

		
		System.out.println(jacques.afficher());
		System.out.println(jacques.nager());
        System.out.println(jacques.voler());
        System.out.println(jacques.faireCancan());
        System.out.println(predator.afficher());
        System.out.println(predator.voler());
        predator.setComportementVol(new PropulsionAReaction());
        System.out.println(predator.voler());
        
	}


}