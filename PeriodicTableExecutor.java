class PeriodicTableExecutor {
	public static void main(String[] args) {
/*
		Element element1 = new Element();
		element1.atomicNumber = 1;
		element1.elementName = "Hydrogen";
		element1.symbol = "H";
		element1.atomicMass = 1.008;
		element1.isMetal = false;
		PeriodicTable table1 = new PeriodicTable();
		table1.tableId = 1;
		table1.tableName = "Mendeleev Table";
		table1.category = "Non-Metal";
		table1.totalElements = 118;
		table1.period = 1;
		table1.element = element1;
		table1.getPeriodicTableDetails();

		Element element2 = new Element();
		element2.atomicNumber = 2;
		element2.elementName = "Helium";
		element2.symbol = "He";
		element2.atomicMass = 4.003;
		element2.isMetal = false;
		PeriodicTable table2 = new PeriodicTable();
		table2.tableId = 2;
		table2.tableName = "IUPAC Table";
		table2.category = "Noble Gas";
		table2.totalElements = 118;
		table2.period = 1;
		table2.element = element2;
		table2.getPeriodicTableDetails();

		Element element3 = new Element();
		element3.atomicNumber = 6;
		element3.elementName = "Carbon";
		element3.symbol = "C";
		element3.atomicMass = 12.011;
		element3.isMetal = false;
		PeriodicTable table3 = new PeriodicTable();
		table3.tableId = 3;
		table3.tableName = "Modern Table";
		table3.category = "Non-Metal";
		table3.totalElements = 118;
		table3.period = 2;
		table3.element = element3;
		table3.getPeriodicTableDetails();

		Element element4 = new Element();
		element4.atomicNumber = 8;
		element4.elementName = "Oxygen";
		element4.symbol = "O";
		element4.atomicMass = 15.999;
		element4.isMetal = false;
		PeriodicTable table4 = new PeriodicTable();
		table4.tableId = 4;
		table4.tableName = "Mendeleev Table";
		table4.category = "Non-Metal";
		table4.totalElements = 118;
		table4.period = 2;
		table4.element = element4;
		table4.getPeriodicTableDetails();

		Element element5 = new Element();
		element5.atomicNumber = 11;
		element5.elementName = "Sodium";
		element5.symbol = "Na";
		element5.atomicMass = 22.990;
		element5.isMetal = true;
		PeriodicTable table5 = new PeriodicTable();
		table5.tableId = 5;
		table5.tableName = "IUPAC Table";
		table5.category = "Alkali Metal";
		table5.totalElements = 118;
		table5.period = 3;
		table5.element = element5;
		table5.getPeriodicTableDetails();

		Element element6 = new Element();
		element6.atomicNumber = 13;
		element6.elementName = "Aluminium";
		element6.symbol = "Al";
		element6.atomicMass = 26.982;
		element6.isMetal = true;
		PeriodicTable table6 = new PeriodicTable();
		table6.tableId = 6;
		table6.tableName = "Modern Table";
		table6.category = "Post-Transition Metal";
		table6.totalElements = 118;
		table6.period = 3;
		table6.element = element6;
		table6.getPeriodicTableDetails();

		Element element7 = new Element();
		element7.atomicNumber = 26;
		element7.elementName = "Iron";
		element7.symbol = "Fe";
		element7.atomicMass = 55.845;
		element7.isMetal = true;
		PeriodicTable table7 = new PeriodicTable();
		table7.tableId = 7;
		table7.tableName = "Mendeleev Table";
		table7.category = "Transition Metal";
		table7.totalElements = 118;
		table7.period = 4;
		table7.element = element7;
		table7.getPeriodicTableDetails();

		Element element8 = new Element();
		element8.atomicNumber = 29;
		element8.elementName = "Copper";
		element8.symbol = "Cu";
		element8.atomicMass = 63.546;
		element8.isMetal = true;
		PeriodicTable table8 = new PeriodicTable();
		table8.tableId = 8;
		table8.tableName = "IUPAC Table";
		table8.category = "Transition Metal";
		table8.totalElements = 118;
		table8.period = 4;
		table8.element = element8;
		table8.getPeriodicTableDetails();

		Element element9 = new Element();
		element9.atomicNumber = 47;
		element9.elementName = "Silver";
		element9.symbol = "Ag";
		element9.atomicMass = 107.868;
		element9.isMetal = true;
		PeriodicTable table9 = new PeriodicTable();
		table9.tableId = 9;
		table9.tableName = "Modern Table";
		table9.category = "Transition Metal";
		table9.totalElements = 118;
		table9.period = 5;
		table9.element = element9;
		table9.getPeriodicTableDetails();

		Element element10 = new Element();
		element10.atomicNumber = 79;
		element10.elementName = "Gold";
		element10.symbol = "Au";
		element10.atomicMass = 196.967;
		element10.isMetal = true;
		PeriodicTable table10 = new PeriodicTable();
		table10.tableId = 10;
		table10.tableName = "Mendeleev Table";
		table10.category = "Transition Metal";
		table10.totalElements = 118;
		table10.period = 6;
		table10.element = element10;
		table10.getPeriodicTableDetails();

		Element element11 = new Element();
		element11.atomicNumber = 92;
		element11.elementName = "Uranium";
		element11.symbol = "U";
		element11.atomicMass = 238.029;
		element11.isMetal = true;
		PeriodicTable table11 = new PeriodicTable();
		table11.tableId = 11;
		table11.tableName = "IUPAC Table";
		table11.category = "Actinide";
		table11.totalElements = 118;
		table11.period = 7;
		table11.element = element11;
		table11.getPeriodicTableDetails();

		Element element12 = new Element();
		element12.atomicNumber = 17;
		element12.elementName = "Chlorine";
		element12.symbol = "Cl";
		element12.atomicMass = 35.45;
		element12.isMetal = false;
		PeriodicTable table12 = new PeriodicTable();
		table12.tableId = 12;
		table12.tableName = "Modern Table";
		table12.category = "Halogen";
		table12.totalElements = 118;
		table12.period = 3;
		table12.element = element12;
		table12.getPeriodicTableDetails();

		Element element13 = new Element();
		element13.atomicNumber = 20;
		element13.elementName = "Calcium";
		element13.symbol = "Ca";
		element13.atomicMass = 40.078;
		element13.isMetal = true;
		PeriodicTable table13 = new PeriodicTable();
		table13.tableId = 13;
		table13.tableName = "Mendeleev Table";
		table13.category = "Alkaline Earth Metal";
		table13.totalElements = 118;
		table13.period = 4;
		table13.element = element13;
		table13.getPeriodicTableDetails();

		Element element14 = new Element();
		element14.atomicNumber = 82;
		element14.elementName = "Lead";
		element14.symbol = "Pb";
		element14.atomicMass = 207.2;
		element14.isMetal = true;
		PeriodicTable table14 = new PeriodicTable();
		table14.tableId = 14;
		table14.tableName = "IUPAC Table";
		table14.category = "Post-Transition Metal";
		table14.totalElements = 118;
		table14.period = 6;
		table14.element = element14;
		table14.getPeriodicTableDetails();

		Element element15 = new Element();
		element15.atomicNumber = 14;
		element15.elementName = "Silicon";
		element15.symbol = "Si";
		element15.atomicMass = 28.085;
		element15.isMetal = false;
		PeriodicTable table15 = new PeriodicTable();
		table15.tableId = 15;
		table15.tableName = "Modern Table";
		table15.category = "Metalloid";
		table15.totalElements = 118;
		table15.period = 3;
		table15.element = element15;
		table15.getPeriodicTableDetails();

		Element element16 = new Element();
		element16.atomicNumber = 78;
		element16.elementName = "Platinum";
		element16.symbol = "Pt";
		element16.atomicMass = 195.084;
		element16.isMetal = true;
		PeriodicTable table16 = new PeriodicTable();
		table16.tableId = 16;
		table16.tableName = "Mendeleev Table";
		table16.category = "Transition Metal";
		table16.totalElements = 118;
		table16.period = 6;
		table16.element = element16;
		table16.getPeriodicTableDetails();

		Element element17 = new Element();
		element17.atomicNumber = 10;
		element17.elementName = "Neon";
		element17.symbol = "Ne";
		element17.atomicMass = 20.180;
		element17.isMetal = false;
		PeriodicTable table17 = new PeriodicTable();
		table17.tableId = 17;
		table17.tableName = "IUPAC Table";
		table17.category = "Noble Gas";
		table17.totalElements = 118;
		table17.period = 2;
		table17.element = element17;
		table17.getPeriodicTableDetails();

		Element element18 = new Element();
		element18.atomicNumber = 16;
		element18.elementName = "Sulfur";
		element18.symbol = "S";
		element18.atomicMass = 32.06;
		element18.isMetal = false;
		PeriodicTable table18 = new PeriodicTable();
		table18.tableId = 18;
		table18.tableName = "Modern Table";
		table18.category = "Non-Metal";
		table18.totalElements = 118;
		table18.period = 3;
		table18.element = element18;
		table18.getPeriodicTableDetails();

		Element element19 = new Element();
		element19.atomicNumber = 30;
		element19.elementName = "Zinc";
		element19.symbol = "Zn";
		element19.atomicMass = 65.38;
		element19.isMetal = true;
		PeriodicTable table19 = new PeriodicTable();
		table19.tableId = 19;
		table19.tableName = "Mendeleev Table";
		table19.category = "Transition Metal";
		table19.totalElements = 118;
		table19.period = 4;
		table19.element = element19;
		table19.getPeriodicTableDetails();

		Element element20 = new Element();
		element20.atomicNumber = 80;
		element20.elementName = "Mercury";
		element20.symbol = "Hg";
		element20.atomicMass = 200.592;
		element20.isMetal = true;
		PeriodicTable table20 = new PeriodicTable();
		table20.tableId = 20;
		table20.tableName = "IUPAC Table";
		table20.category = "Transition Metal";
		table20.totalElements = 118;
		table20.period = 6;
		table20.element = element20;
		table20.getPeriodicTableDetails(); */
		

		Element element1 = new Element(1, "Hydrogen", "H", 1.008, false);
		PeriodicTable periodicTable1 = new PeriodicTable(1, "Mendeleev Table", "Non-Metal", 118, 1, element1);
		periodicTable1.getPeriodicTableDetails();

		Element element2 = new Element(2, "Helium", "He", 4.003, false);
		PeriodicTable periodicTable2 = new PeriodicTable(2, "IUPAC Table", "Noble Gas", 118, 1, element2);
		periodicTable2.getPeriodicTableDetails();

		Element element3 = new Element(3, "Carbon", "C", 12.011, false);
		PeriodicTable periodicTable3 = new PeriodicTable(3, "Modern Table", "Non-Metal", 118, 2, element3);
		periodicTable3.getPeriodicTableDetails();

		Element element4 = new Element(4, "Oxygen", "O", 15.999, false);
		PeriodicTable periodicTable4 = new PeriodicTable(4, "Mendeleev Table", "Non-Metal", 118, 2, element4);
		periodicTable4.getPeriodicTableDetails();

		Element element5 = new Element(5, "Sodium", "Na", 22.99, true);
		PeriodicTable periodicTable5 = new PeriodicTable(5, "IUPAC Table", "Alkali Metal", 118, 3, element5);
		periodicTable5.getPeriodicTableDetails();

		Element element6 = new Element(6, "Aluminium", "Al", 26.982, true);
		PeriodicTable periodicTable6 = new PeriodicTable(6, "Modern Table", "Post-Transition Metal", 118, 3, element6);
		periodicTable6.getPeriodicTableDetails();

		Element element7 = new Element(7, "Iron", "Fe", 55.845, true);
		PeriodicTable periodicTable7 = new PeriodicTable(7, "Mendeleev Table", "Transition Metal", 118, 4, element7);
		periodicTable7.getPeriodicTableDetails();

		Element element8 = new Element(8, "Copper", "Cu", 63.546, true);
		PeriodicTable periodicTable8 = new PeriodicTable(8, "IUPAC Table", "Transition Metal", 118, 4, element8);
		periodicTable8.getPeriodicTableDetails();

		Element element9 = new Element(9, "Silver", "Ag", 107.868, true);
		PeriodicTable periodicTable9 = new PeriodicTable(9, "Modern Table", "Transition Metal", 118, 5, element9);
		periodicTable9.getPeriodicTableDetails();

		Element element10 = new Element(10, "Gold", "Au", 196.967, true);
		PeriodicTable periodicTable10 = new PeriodicTable(10, "Mendeleev Table", "Transition Metal", 118, 6, element10);
		periodicTable10.getPeriodicTableDetails();

		Element element11 = new Element(11, "Uranium", "U", 238.029, true);
		PeriodicTable periodicTable11 = new PeriodicTable(11, "IUPAC Table", "Actinide", 118, 7, element11);
		periodicTable11.getPeriodicTableDetails();

		Element element12 = new Element(12, "Chlorine", "Cl", 35.45, false);
		PeriodicTable periodicTable12 = new PeriodicTable(12, "Modern Table", "Halogen", 118, 3, element12);
		periodicTable12.getPeriodicTableDetails();

		Element element13 = new Element(13, "Calcium", "Ca", 40.078, true);
		PeriodicTable periodicTable13 = new PeriodicTable(13, "Mendeleev Table", "Alkaline Earth Metal", 118, 4, element13);
		periodicTable13.getPeriodicTableDetails();

		Element element14 = new Element(14, "Lead", "Pb", 207.2, true);
		PeriodicTable periodicTable14 = new PeriodicTable(14, "IUPAC Table", "Post-Transition Metal", 118, 6, element14);
		periodicTable14.getPeriodicTableDetails();

		Element element15 = new Element(15, "Silicon", "Si", 28.085, false);
		PeriodicTable periodicTable15 = new PeriodicTable(15, "Modern Table", "Metalloid", 118, 3, element15);
		periodicTable15.getPeriodicTableDetails();

		Element element16 = new Element(16, "Platinum", "Pt", 195.084, true);
		PeriodicTable periodicTable16 = new PeriodicTable(16, "Mendeleev Table", "Transition Metal", 118, 6, element16);
		periodicTable16.getPeriodicTableDetails();

		Element element17 = new Element(17, "Neon", "Ne", 20.18, false);
		PeriodicTable periodicTable17 = new PeriodicTable(17, "IUPAC Table", "Noble Gas", 118, 2, element17);
		periodicTable17.getPeriodicTableDetails();

		Element element18 = new Element(18, "Sulfur", "S", 32.06, false);
		PeriodicTable periodicTable18 = new PeriodicTable(18, "Modern Table", "Non-Metal", 118, 3, element18);
		periodicTable18.getPeriodicTableDetails();

		Element element19 = new Element(19, "Zinc", "Zn", 65.38, true);
		PeriodicTable periodicTable19 = new PeriodicTable(19, "Mendeleev Table", "Transition Metal", 118, 4, element19);
		periodicTable19.getPeriodicTableDetails();

		Element element20 = new Element(20, "Mercury", "Hg", 200.592, true);
		PeriodicTable periodicTable20 = new PeriodicTable(20, "IUPAC Table", "Transition Metal", 118, 6, element20);
		periodicTable20.getPeriodicTableDetails();

	}
}