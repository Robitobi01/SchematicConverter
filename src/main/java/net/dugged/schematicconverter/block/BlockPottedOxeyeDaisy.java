package net.dugged.schematicconverter.block;

public class BlockPottedOxeyeDaisy extends Block {
	public BlockPottedOxeyeDaisy() {
		super("potted_oxeye_daisy");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return this;
	}
}