package net.dugged.schematicconverter.block;

public class BlockBuddingAmethyst extends Block {
	public BlockBuddingAmethyst() {
		super("budding_amethyst");
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