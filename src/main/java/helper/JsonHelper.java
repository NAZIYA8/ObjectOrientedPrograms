package helper;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonHelper {

	private static ObjectMapper mapper;
	static {
		mapper = new ObjectMapper();
	}

	/**
	 * @param object is java object which we fetch from the file path. Using
	 *               jsonHelper we convert it to output String and print it.
	 * @return Result after converting java type to String.
	 */
	public static String converToJson(Object object) {
		String result = null;
		try {
			result = mapper.writeValueAsString(object);

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * @param path   : File path containing JSON file It is consisting of attribute
	 *               - value pairs and arrays.
	 * @param object : It is the Java object which we need to fetch
	 * @return :JSON content into the java type
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	public static Object convertToJava(String path, Object object)
			throws JsonParseException, JsonMappingException, IOException {
		return mapper.readValue(new File(path), object.getClass());
	}

}