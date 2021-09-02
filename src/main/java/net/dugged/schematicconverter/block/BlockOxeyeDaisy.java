package net.dugged.schematicconverter.block;

public class BlockOxeyeDaisy extends Block {
	public BlockOxeyeDaisy() {
		super("oxeye_daisy");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockPoppy().setMetadata(8);
	}
}