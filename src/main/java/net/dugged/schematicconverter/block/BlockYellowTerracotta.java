package net.dugged.schematicconverter.block;

public class BlockYellowTerracotta extends Block {
	public BlockYellowTerracotta() {
		super("yellow_terracotta");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockWhiteTerracotta().setMetadata(4);
	}
}