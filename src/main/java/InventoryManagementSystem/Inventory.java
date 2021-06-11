package InventoryManagementSystem;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import helper.JsonHelper;

public class Inventory {

	public List<Rice> rice;
	public List<Wheat> wheat;
	public List<Pulse> pulse;

	/**
	 * Uses convertToJava and convertToJSON function from jsonHelper class To read
	 * and write the JSON input file in java type
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Inventory inventory = new Inventory();
		try {
			inventory = (Inventory) JsonHelper.convertToJava(
					"C:/Users/Naziya/eclipse-workspace/ObjectOrientedProblems/object/inventory.json", inventory);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		int total = 0;
		for (int j = 0; j < inventory.rice.size(); j++) {
			total = inventory.rice.get(j).getWeight() * inventory.rice.get(j).getPricePerKg();
			inventory.rice.get(j).setTotalPrice(total);
		}
		for (int k = 0; k < inventory.pulse.size(); k++) {
			total = inventory.pulse.get(k).getWeight() * inventory.pulse.get(k).getPricePerKg();
			inventory.pulse.get(k).setTotalPrice(total);
		}
		for (int l = 0; l < inventory.wheat.size(); l++) {
			total = inventory.wheat.get(l).getWeight() * inventory.wheat.get(l).getPricePerKg();
			inventory.wheat.get(l).setTotalPrice(total);
		}

		String outputString = JsonHelper.converToJson(inventory);
		System.out.println(outputString);
		System.out.println("The java object has been sucessfully converted to JSON string  ");

	}

}
