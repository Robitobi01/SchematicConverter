package net.dugged.schematicconverter.block;

public class BlockAzureBluet extends Block {
	public BlockAzureBluet() {
		super("azure_bluet");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockPoppy().setMetadata(3);
	}
}