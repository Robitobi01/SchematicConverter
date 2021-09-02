package net.dugged.schematicconverter.block;

public class BlockPottedAzureBluet extends Block {
	public BlockPottedAzureBluet() {
		super("potted_azure_bluet");
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