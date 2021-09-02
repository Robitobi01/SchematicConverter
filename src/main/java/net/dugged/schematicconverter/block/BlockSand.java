package net.dugged.schematicconverter.block;

public class BlockSand extends Block {
	public BlockSand() {
		super("sand");
		setOldId(12);
		setOldName("sand");
	}

	@Override
	public Block getNewBlock() {
		if (metadata == 1) {
			return new BlockRedSand();
		} else {
			return new BlockSand();
		}
	}

	@Override
	public Block getOldBlock() {
		return this;
	}
}