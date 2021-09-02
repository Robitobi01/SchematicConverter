package net.dugged.schematicconverter.block;

public class BlockPottedJungleSapling extends Block {
	public BlockPottedJungleSapling() {
		super("potted_jungle_sapling");
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