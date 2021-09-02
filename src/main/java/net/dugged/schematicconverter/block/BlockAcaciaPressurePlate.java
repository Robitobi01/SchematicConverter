package net.dugged.schematicconverter.block;

public class BlockAcaciaPressurePlate extends Block {
	protected static final BlockProperty powered = new BlockProperty("powered", new String[]{"false", "true"});

	public BlockAcaciaPressurePlate() {
		super("acacia_pressure_plate");
		blockProperties.add(powered);
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