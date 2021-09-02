package net.dugged.schematicconverter.block;

import java.util.ArrayList;

import static net.dugged.schematicconverter.block.BlockRegistry.BLOCKS;

public abstract class Block {
	private final String name;
	protected ArrayList<BlockProperty> blockProperties = new ArrayList<>();
	protected int metadata = 0;
	private int id = -1;
	private boolean legacyBlock = false;
	private String oldName;

	public Block(String name) {
		this.name = name;
	}

	public static Block getByName(String name) {
		for (Block block : BLOCKS) {
			if (block.getName().equals(name) | block.getFullName().equals(name)) {
				return block;
			}
		}
		return null;
	}

	public static Block getById(int id) {
		if (id == 253 || id == 254) {
			System.out.println("Block ID 253 and 254 do not exist!");
		} else {
			for (Block block : BLOCKS) {
				if (block.getOldId() >= 0 && block.getOldId() == id) {
					try {
						return block.getClass().newInstance();
					} catch (InstantiationException e) {
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					}
				}
			}
		}
		return null;
	}

	public Block setProperty(String name, String value) {
		for (BlockProperty state : blockProperties) {
			if (state.getName().equals(name)) {
				if (state.setProperty(value)) {
					return this;
				} else {
					System.out.println("Tried setting invalid property " + value + " for BlockProperty: " + name);
				}
			}
		}
		System.out.println("Tried setting property " + value + " for non existent BlockProperty " + name);
		return this;
	}

	public int getOldId() {
		return id;
	}

	protected void setOldId(int oldId) {
		this.id = oldId;
	}

	protected void setAsLegacy() {
		legacyBlock = true;
	}

	public String getName() {
		return name;
	}

	public String getFullName() {
		return "minecraft:" + name;
	}

	public String getOldName() {
		return oldName;
	}

	protected void setOldName(String oldName) {
		this.oldName = oldName;
	}

	public int getMetadata() {
		return metadata;
	}

	public Block setMetadata(int metadata) {
		this.metadata = metadata;
		return this;
	}

	public abstract Block getNewBlock();

	public abstract Block getOldBlock();

	public BlockProperty getProperty(String name) {
		for (BlockProperty blockProperty : blockProperties) {
			if (blockProperty.getName().equals(name)) {
				return blockProperty;
			}
		}
		return null;
	}

	protected int getMetaBits(int bitCount, int bitStartIndex) {
		return getMetaBits(metadata, bitCount, bitStartIndex);
	}

	protected int getMetaBits(int number, int bitCount, int bitStartIndex) {
		return getMetaBits(number, bitCount, bitStartIndex, 0);
	}

	protected int getMetaBits(int number, int bitCount, int bitStartIndex, int offset) {
		int bit = (((1 << bitCount) - 1) & (number >> (bitStartIndex)));
		return bitStartIndex > 0 && offset > 0 ? bit - offset : bit;
	}

	protected int setMetaBits(int addedNumber, int bitStartIndex) {
		return setMetaBits(0, addedNumber, bitStartIndex);
	}

	protected int setMetaBits(int number, int addedNumber, int bitStartIndex) {
		return number | (addedNumber << bitStartIndex);
		//int mask = 1 << bitStartIndex;
		//return (number & ~mask) | ((addedNumber << bitStartIndex) & mask);
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		for (BlockProperty property : blockProperties) {
			s.append(property.getName() + ":" + property.getValue() + ", ");
		}
		return "Block{" +
				"name='" + name + '\'' +
				", metadata=" + metadata +
				", oldName='" + oldName + '\'' +
				", properties='{" + s + "}" +
				'}';
	}
}
