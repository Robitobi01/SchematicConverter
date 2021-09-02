package net.dugged.schematicconverter.block;

public class BlockInfestedStone extends Block {
	public BlockInfestedStone() {
		super("infested_stone");
		setOldId(97);
		setOldName("monster_egg");
	}

	@Override
	public Block getNewBlock() {
		switch (metadata) {
			case 1:
				return new BlockInfestedCobblestone();
			case 2:
				return new BlockInfestedStoneBricks();
			case 3:
				return new BlockInfestedMossyStoneBricks();
			case 4:
				return new BlockInfestedCrackedStoneBricks();
			case 5:
				return new BlockInfestedChiseledStoneBricks();
			default:
				return new BlockInfestedStone();
		}
	}

	@Override
	public Block getOldBlock() {
		return this;
	}
}