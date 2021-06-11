package model;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import helper.JsonHelper;

public class Stocks {

	public List<Parle> parle;
	public List<Marie> marie;
	public List<Oreo> oreo;

	/**
	 * Uses convertTojava and convertToJSON function from jsonHelper class to read
	 * and write the JSON input file in java type
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Stocks stocks = new Stocks();

		try {
			stocks = (Stocks) JsonHelper.convertToJava(
					"C:/Users/Naziya/eclipse-workspace/ObjectOrientedProblems/object/stock.json", stocks);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		double allStocksValue = 0;
		for (int i = 0; i < stocks.parle.size(); i++) {
			allStocksValue = stocks.parle.get(i).getNumber_of_shares() * stocks.parle.get(i).getShare_price();
			stocks.parle.get(i).setTotalPrice(allStocksValue);
		}
		for (int j = 0; j < stocks.marie.size(); j++) {
			allStocksValue = stocks.marie.get(j).getNumber_of_shares() * stocks.marie.get(j).getShare_price();
			stocks.marie.get(j).setTotalPrice(allStocksValue);
		}
		for (int k = 0; k < stocks.oreo.size(); k++) {
			allStocksValue = stocks.oreo.get(k).getNumber_of_shares() * stocks.oreo.get(k).getShare_price();
			stocks.oreo.get(k).setTotalPrice(allStocksValue);
		}

		String outputString = JsonHelper.converToJson(stocks);
		System.out.println(outputString);
		System.out.println("The java object has been sucessfully converted to JSON string  ");

	}
}
