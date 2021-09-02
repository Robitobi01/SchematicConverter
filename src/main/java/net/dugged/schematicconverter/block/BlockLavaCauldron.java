package net.dugged.schematicconverter.block;

public class BlockLavaCauldron extends Block {
	public BlockLavaCauldron() {
		super("lava_cauldron");
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