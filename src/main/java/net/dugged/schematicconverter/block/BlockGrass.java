package net.dugged.schematicconverter.block;

public class BlockGrass extends Block {
	public BlockGrass() {
		super("grass");
		setOldId(31);
		setOldName("tallgrass");
	}

	@Override
	public Block getNewBlock() {
		switch (metadata) {
			case 0:
				return new BlockDeadBush();
			case 2:
				return new BlockFern();
			default:
				return new BlockGrass();
		}
	}

	@Override
	public Block getOldBlock() {
		return new BlockGrass().setMetadata(1);
	}
}