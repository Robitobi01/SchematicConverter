package net.dugged.schematicconverter.block;

public class BlockProperty {
	private final String name;
	private final String[] properties;
	private int currentIndex = 0;

	private int metadataIndexBit = -1;
	private int metadataBitCount = -1;

	public BlockProperty(String name, String[] properties) {
		this.name = name;
		this.properties = properties;
	}

	public String getName() {
		return name;
	}

	public String[] getProperties() {
		return properties;
	}

	public String getValue() {
		return properties[currentIndex];
	}

	public String getPropertyByIndex(int index) {
		return properties[index];
	}

	public int getCurrentIndex() {
		return currentIndex;
	}

	public int getIndexByProperty(String value) {
		for (int i = 0; i < properties.length; i++) {
			if (properties[i].equals(value)) {
				return i;
			}
		}
		return -1;
	}

	public boolean setProperty(String value) {
		for (int i = 0; i < properties.length; i++) {
			if (properties[i].equals(value)) {
				currentIndex = i;
				return true;
			}
		}
		return false;
	}

	public int getMetadataIndexBit() {
		return metadataIndexBit;
	}

	public void setMetadataIndexBit(int index) {
		metadataIndexBit = index;
	}

	public int getMetadataBitCount() {
		return metadataBitCount;
	}

	public void setMetadataBitCount(int count) {
		metadataBitCount = count;
	}

	public boolean hasMetadata() {
		return metadataIndexBit >= 0 && metadataBitCount >= 0;
	}
}
