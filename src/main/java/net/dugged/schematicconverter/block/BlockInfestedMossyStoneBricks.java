package net.dugged.schematicconverter.block;

public class BlockInfestedMossyStoneBricks extends Block {
	public BlockInfestedMossyStoneBricks() {
		super("infested_mossy_stone_bricks");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockInfestedStoneBricks().setMetadata(3);
	}
}