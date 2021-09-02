package net.dugged.schematicconverter.block;

public class BlockTarget extends Block {
	protected static final BlockProperty power = new BlockProperty("power", new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"});

	public BlockTarget() {
		super("target");
		blockProperties.add(power);
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