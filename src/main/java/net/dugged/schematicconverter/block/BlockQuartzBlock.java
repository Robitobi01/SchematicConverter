package net.dugged.schematicconverter.block;

public class BlockQuartzBlock extends Block {
	public BlockQuartzBlock() {
		super("quartz_block");
		setOldId(155);
		setOldName("quartz_block");
	}

	@Override
	public Block getNewBlock() {
		switch (metadata) {
			case 1:
				return new BlockChiseledQuartzBlock();
			case 2:
				return new BlockQuartzPillar().setProperty(BlockQuartzPillar.axis.getName(), "y");
			case 3:
				return new BlockQuartzPillar().setProperty(BlockQuartzPillar.axis.getName(), "x");
			case 4:
				return new BlockQuartzPillar().setProperty(BlockQuartzPillar.axis.getName(), "z");
			default:
				return new BlockQuartzBlock();
		}
	}

	@Override
	public Block getOldBlock() {
		return this;
	}
}