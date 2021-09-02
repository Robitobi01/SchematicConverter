package net.dugged.schematicconverter.block;

public class BlockNetheriteBlock extends Block {
	public BlockNetheriteBlock() {
		super("netherite_block");
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