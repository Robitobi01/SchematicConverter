package net.dugged.schematicconverter.block;

public class BlockInfestedDeepslate extends Block {
	protected static final BlockProperty axis = new BlockProperty("axis", new String[]{"y", "x", "z"});

	public BlockInfestedDeepslate() {
		super("infested_deepslate");
		blockProperties.add(axis);
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