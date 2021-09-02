package net.dugged.schematicconverter;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Game {

	public static Version getVersion(String version) {
		for (Version v : Version.values()) {
			return v;
		}
		return null;
	}

	public static String getData(Version version) {
		try {
			URLConnection connection = new URL("https://raw.githubusercontent.com/PrismarineJS/minecraft-data/master/data/dataPaths.json").openConnection();
			JsonElement jsonData = JsonParser.parseReader(new InputStreamReader(connection.getInputStream()));
			String path = jsonData.getAsJsonObject().get("pc").getAsJsonObject().get(version.version).getAsJsonObject().get("blocks").getAsString();
			connection = new URL("https://raw.githubusercontent.com/PrismarineJS/minecraft-data/master/data/" + path + "/blocks.json").openConnection();
			jsonData = JsonParser.parseReader(new InputStreamReader(connection.getInputStream()));
			return jsonData.toString();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public enum Version {
		ONE_NINE("1.9"),
		ONE_TEN("1.10"),
		ONE_ELEVEN("1.11"),
		ONE_TWELVE("1.12"),
		ONE_THIRTEEN("1.13"),
		ONE_FOURTEEN("1.14"),
		ONE_FIFTEEN("1.15"),
		ONE_SIXTEEN("1.16"),
		ONE_SEVENTEEN("1.17");

		private final String version;

		Version(String version) {
			this.version = version;
		}
	}
}
