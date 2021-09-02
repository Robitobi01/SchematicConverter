package net.dugged.schematicconverter;

import net.dugged.schematicconverter.block.BlockRegistry;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class SchematicConverter {
	private static final List<FileFormat> fileFormats = new ArrayList<>();

	public static void main(String[] args) {
		BlockRegistry.registerBlocks();
		fileFormats.add(new FormatLitematic());
		fileFormats.add(new FormatNBT());
		fileFormats.add(new FormatSchematic());

		Path path = Paths.get("/home/robi/Desktop/code/SchematicConverter/testfiles/wizard.schematic");
		FileFormat fileFormat = getFileFormat(path);
		if (fileFormat != null) {
			fileFormat.importData(path);
//			for (int i = 0; i < 255; i++) {
//				String name = Block.getById(i).getOldName();
//					System.out.println(name);
//			}
//			System.out.println(new BlockAnvil().setMetadata(7).getNewBlock().getOldBlock());
			//Block block = Block.getBlockByName("farmland");
			//block.setBlockPropety("moisture", "2");
			//System.out.println(block.getBlockProptery("moisture"));
			//CompoundTag data =  fileFormat.importData(path);
			//System.out.println(Game.getData(Game.getVersion("1.12")));
		} else {
			System.out.println("Invalid File Format!");
		}
	}

	private static FileFormat getFileFormat(Path path) {
		for (FileFormat fileFormat : fileFormats) {
			if (path.getFileName().toString().endsWith(fileFormat.getFileExtension())) {
				return fileFormat;
			}
		}
		return null;
	}
}
