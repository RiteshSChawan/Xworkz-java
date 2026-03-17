class DanceExecutor {
	public static void main(String[] args) {
/*
		Form form1 = new Form();
		form1.formId = 1;
		form1.formName = "Bharatanatyam";
		form1.origin = "Tamil Nadu";
		form1.performers = 1;
		form1.costume = "Traditional Silk Saree";
		Dance dance1 = new Dance();
		dance1.danceId = 1;
		dance1.danceName = "Classical Dance";
		dance1.event = "Temple Festival";
		dance1.country = "India";
		dance1.duration = 45;
		dance1.form = form1;
		dance1.getDanceDetails();

		Form form2 = new Form();
		form2.formId = 2;
		form2.formName = "Kathak";
		form2.origin = "Uttar Pradesh";
		form2.performers = 2;
		form2.costume = "Ghagra Choli";
		Dance dance2 = new Dance();
		dance2.danceId = 2;
		dance2.danceName = "Storytelling Dance";
		dance2.event = "Cultural Gala";
		dance2.country = "India";
		dance2.duration = 60;
		dance2.form = form2;
		dance2.getDanceDetails();

		Form form3 = new Form();
		form3.formId = 3;
		form3.formName = "Odissi";
		form3.origin = "Odisha";
		form3.performers = 1;
		form3.costume = "Patta Saree";
		Dance dance3 = new Dance();
		dance3.danceId = 3;
		dance3.danceName = "Temple Dance";
		dance3.event = "National Arts Festival";
		dance3.country = "India";
		dance3.duration = 50;
		dance3.form = form3;
		dance3.getDanceDetails();

		Form form4 = new Form();
		form4.formId = 4;
		form4.formName = "Kuchipudi";
		form4.origin = "Andhra Pradesh";
		form4.performers = 4;
		form4.costume = "Kuchipudi Dress";
		Dance dance4 = new Dance();
		dance4.danceId = 4;
		dance4.danceName = "Devotional Dance";
		dance4.event = "State Cultural Meet";
		dance4.country = "India";
		dance4.duration = 40;
		dance4.form = form4;
		dance4.getDanceDetails();

		Form form5 = new Form();
		form5.formId = 5;
		form5.formName = "Manipuri";
		form5.origin = "Manipur";
		form5.performers = 6;
		form5.costume = "Potloi Skirt";
		Dance dance5 = new Dance();
		dance5.danceId = 5;
		dance5.danceName = "Ras Leela";
		dance5.event = "Manipuri Sangai Festival";
		dance5.country = "India";
		dance5.duration = 55;
		dance5.form = form5;
		dance5.getDanceDetails();

		Form form6 = new Form();
		form6.formId = 6;
		form6.formName = "Kathakali";
		form6.origin = "Kerala";
		form6.performers = 5;
		form6.costume = "Elaborate Makeup and Crown";
		Dance dance6 = new Dance();
		dance6.danceId = 6;
		dance6.danceName = "Epic Narrative Dance";
		dance6.event = "Kerala Festival";
		dance6.country = "India";
		dance6.duration = 120;
		dance6.form = form6;
		dance6.getDanceDetails();

		Form form7 = new Form();
		form7.formId = 7;
		form7.formName = "Mohiniyattam";
		form7.origin = "Kerala";
		form7.performers = 1;
		form7.costume = "White and Gold Saree";
		Dance dance7 = new Dance();
		dance7.danceId = 7;
		dance7.danceName = "Dance of the Enchantress";
		dance7.event = "Thrissur Pooram";
		dance7.country = "India";
		dance7.duration = 35;
		dance7.form = form7;
		dance7.getDanceDetails();

		Form form8 = new Form();
		form8.formId = 8;
		form8.formName = "Ballet";
		form8.origin = "France";
		form8.performers = 12;
		form8.costume = "Tutu and Pointe Shoes";
		Dance dance8 = new Dance();
		dance8.danceId = 8;
		dance8.danceName = "Swan Lake";
		dance8.event = "Opera House Performance";
		dance8.country = "France";
		dance8.duration = 90;
		dance8.form = form8;
		dance8.getDanceDetails();

		Form form9 = new Form();
		form9.formId = 9;
		form9.formName = "Salsa";
		form9.origin = "Cuba";
		form9.performers = 2;
		form9.costume = "Bright Colored Dress";
		Dance dance9 = new Dance();
		dance9.danceId = 9;
		dance9.danceName = "Latin Partner Dance";
		dance9.event = "Salsa World Championship";
		dance9.country = "Cuba";
		dance9.duration = 30;
		dance9.form = form9;
		dance9.getDanceDetails();

		Form form10 = new Form();
		form10.formId = 10;
		form10.formName = "Flamenco";
		form10.origin = "Spain";
		form10.performers = 3;
		form10.costume = "Flamenco Dress with Ruffles";
		Dance dance10 = new Dance();
		dance10.danceId = 10;
		dance10.danceName = "Passionate Footwork Dance";
		dance10.event = "Flamenco Biennale";
		dance10.country = "Spain";
		dance10.duration = 40;
		dance10.form = form10;
		dance10.getDanceDetails();

		Form form11 = new Form();
		form11.formId = 11;
		form11.formName = "Tango";
		form11.origin = "Argentina";
		form11.performers = 2;
		form11.costume = "Elegant Evening Wear";
		Dance dance11 = new Dance();
		dance11.danceId = 11;
		dance11.danceName = "Argentine Tango";
		dance11.event = "Buenos Aires Tango Festival";
		dance11.country = "Argentina";
		dance11.duration = 25;
		dance11.form = form11;
		dance11.getDanceDetails();

		Form form12 = new Form();
		form12.formId = 12;
		form12.formName = "Hip Hop";
		form12.origin = "United States";
		form12.performers = 8;
		form12.costume = "Street Wear";
		Dance dance12 = new Dance();
		dance12.danceId = 12;
		dance12.danceName = "Street Dance Battle";
		dance12.event = "World Hip Hop Championship";
		dance12.country = "USA";
		dance12.duration = 20;
		dance12.form = form12;
		dance12.getDanceDetails();

		Form form13 = new Form();
		form13.formId = 13;
		form13.formName = "Breakdance";
		form13.origin = "United States";
		form13.performers = 4;
		form13.costume = "Tracksuit and Sneakers";
		Dance dance13 = new Dance();
		dance13.danceId = 13;
		dance13.danceName = "B-Boy Showcase";
		dance13.event = "Red Bull BC One";
		dance13.country = "USA";
		dance13.duration = 15;
		dance13.form = form13;
		dance13.getDanceDetails();

		Form form14 = new Form();
		form14.formId = 14;
		form14.formName = "Waltz";
		form14.origin = "Austria";
		form14.performers = 2;
		form14.costume = "Ball Gown and Tuxedo";
		Dance dance14 = new Dance();
		dance14.danceId = 14;
		dance14.danceName = "Viennese Waltz";
		dance14.event = "Vienna Opera Ball";
		dance14.country = "Austria";
		dance14.duration = 30;
		dance14.form = form14;
		dance14.getDanceDetails();

		Form form15 = new Form();
		form15.formId = 15;
		form15.formName = "Samba";
		form15.origin = "Brazil";
		form15.performers = 20;
		form15.costume = "Feathered Carnival Costume";
		Dance dance15 = new Dance();
		dance15.danceId = 15;
		dance15.danceName = "Carnival Parade Dance";
		dance15.event = "Rio Carnival";
		dance15.country = "Brazil";
		dance15.duration = 60;
		dance15.form = form15;
		dance15.getDanceDetails();

		Form form16 = new Form();
		form16.formId = 16;
		form16.formName = "Bhangra";
		form16.origin = "Punjab";
		form16.performers = 10;
		form16.costume = "Kurta Pajama with Turban";
		Dance dance16 = new Dance();
		dance16.danceId = 16;
		dance16.danceName = "Harvest Celebration Dance";
		dance16.event = "Baisakhi Festival";
		dance16.country = "India";
		dance16.duration = 30;
		dance16.form = form16;
		dance16.getDanceDetails();

		Form form17 = new Form();
		form17.formId = 17;
		form17.formName = "Garba";
		form17.origin = "Gujarat";
		form17.performers = 50;
		form17.costume = "Chaniya Choli";
		Dance dance17 = new Dance();
		dance17.danceId = 17;
		dance17.danceName = "Navratri Circle Dance";
		dance17.event = "Navratri Festival";
		dance17.country = "India";
		dance17.duration = 180;
		dance17.form = form17;
		dance17.getDanceDetails();

		Form form18 = new Form();
		form18.formId = 18;
		form18.formName = "Lavani";
		form18.origin = "Maharashtra";
		form18.performers = 5;
		form18.costume = "Nine Yard Nauvari Saree";
		Dance dance18 = new Dance();
		dance18.danceId = 18;
		dance18.danceName = "Folk Entertainment Dance";
		dance18.event = "Maharashtra Lok Utsav";
		dance18.country = "India";
		dance18.duration = 45;
		dance18.form = form18;
		dance18.getDanceDetails();

		Form form19 = new Form();
		form19.formId = 19;
		form19.formName = "Bihu";
		form19.origin = "Assam";
		form19.performers = 15;
		form19.costume = "Mekhela Chador";
		Dance dance19 = new Dance();
		dance19.danceId = 19;
		dance19.danceName = "Spring Festival Dance";
		dance19.event = "Rongali Bihu";
		dance19.country = "India";
		dance19.duration = 40;
		dance19.form = form19;
		dance19.getDanceDetails();

		Form form20 = new Form();
		form20.formId = 20;
		form20.formName = "Chhau";
		form20.origin = "Jharkhand";
		form20.performers = 8;
		form20.costume = "Warrior Mask and Costume";
		Dance dance20 = new Dance();
		dance20.danceId = 20;
		dance20.danceName = "Martial Folk Dance";
		dance20.event = "Chaitra Parva";
		dance20.country = "India";
		dance20.duration = 50;
		dance20.form = form20;
		dance20.getDanceDetails(); */
		

		Form form1 = new Form(1, "Bharatanatyam", "Tamil Nadu", 1, "Traditional Silk Saree");
		Dance dance1 = new Dance(1, "Classical Dance", "Temple Festival", "India", 45, form1);
		dance1.getDanceDetails();

		Form form2 = new Form(2, "Kathak", "Uttar Pradesh", 2, "Ghagra Choli");
		Dance dance2 = new Dance(2, "Storytelling Dance", "Cultural Gala", "India", 60, form2);
		dance2.getDanceDetails();

		Form form3 = new Form(3, "Odissi", "Odisha", 1, "Patta Saree");
		Dance dance3 = new Dance(3, "Temple Dance", "National Arts Festival", "India", 50, form3);
		dance3.getDanceDetails();

		Form form4 = new Form(4, "Kuchipudi", "Andhra Pradesh", 4, "Kuchipudi Dress");
		Dance dance4 = new Dance(4, "Devotional Dance", "State Cultural Meet", "India", 40, form4);
		dance4.getDanceDetails();

		Form form5 = new Form(5, "Manipuri", "Manipur", 6, "Potloi Skirt");
		Dance dance5 = new Dance(5, "Ras Leela", "Manipuri Sangai Festival", "India", 55, form5);
		dance5.getDanceDetails();

		Form form6 = new Form(6, "Kathakali", "Kerala", 5, "Elaborate Makeup and Crown");
		Dance dance6 = new Dance(6, "Epic Narrative Dance", "Kerala Festival", "India", 120, form6);
		dance6.getDanceDetails();

		Form form7 = new Form(7, "Mohiniyattam", "Kerala", 1, "White and Gold Saree");
		Dance dance7 = new Dance(7, "Dance of the Enchantress", "Thrissur Pooram", "India", 35, form7);
		dance7.getDanceDetails();

		Form form8 = new Form(8, "Ballet", "France", 12, "Tutu and Pointe Shoes");
		Dance dance8 = new Dance(8, "Swan Lake", "Opera House Performance", "France", 90, form8);
		dance8.getDanceDetails();

		Form form9 = new Form(9, "Salsa", "Cuba", 2, "Bright Colored Dress");
		Dance dance9 = new Dance(9, "Latin Partner Dance", "Salsa World Championship", "Cuba", 30, form9);
		dance9.getDanceDetails();

		Form form10 = new Form(10, "Flamenco", "Spain", 3, "Flamenco Dress with Ruffles");
		Dance dance10 = new Dance(10, "Passionate Footwork Dance", "Flamenco Biennale", "Spain", 40, form10);
		dance10.getDanceDetails();

		Form form11 = new Form(11, "Tango", "Argentina", 2, "Elegant Evening Wear");
		Dance dance11 = new Dance(11, "Argentine Tango", "Buenos Aires Tango Festival", "Argentina", 25, form11);
		dance11.getDanceDetails();

		Form form12 = new Form(12, "Hip Hop", "United States", 8, "Street Wear");
		Dance dance12 = new Dance(12, "Street Dance Battle", "World Hip Hop Championship", "USA", 20, form12);
		dance12.getDanceDetails();

		Form form13 = new Form(13, "Breakdance", "United States", 4, "Tracksuit and Sneakers");
		Dance dance13 = new Dance(13, "B-Boy Showcase", "Red Bull BC One", "USA", 15, form13);
		dance13.getDanceDetails();

		Form form14 = new Form(14, "Waltz", "Austria", 2, "Ball Gown and Tuxedo");
		Dance dance14 = new Dance(14, "Viennese Waltz", "Vienna Opera Ball", "Austria", 30, form14);
		dance14.getDanceDetails();

		Form form15 = new Form(15, "Samba", "Brazil", 20, "Feathered Carnival Costume");
		Dance dance15 = new Dance(15, "Carnival Parade Dance", "Rio Carnival", "Brazil", 60, form15);
		dance15.getDanceDetails();

		Form form16 = new Form(16, "Bhangra", "Punjab", 10, "Kurta Pajama with Turban");
		Dance dance16 = new Dance(16, "Harvest Celebration Dance", "Baisakhi Festival", "India", 30, form16);
		dance16.getDanceDetails();

		Form form17 = new Form(17, "Garba", "Gujarat", 50, "Chaniya Choli");
		Dance dance17 = new Dance(17, "Navratri Circle Dance", "Navratri Festival", "India", 180, form17);
		dance17.getDanceDetails();

		Form form18 = new Form(18, "Lavani", "Maharashtra", 5, "Nine Yard Nauvari Saree");
		Dance dance18 = new Dance(18, "Folk Entertainment Dance", "Maharashtra Lok Utsav", "India", 45, form18);
		dance18.getDanceDetails();

		Form form19 = new Form(19, "Bihu", "Assam", 15, "Mekhela Chador");
		Dance dance19 = new Dance(19, "Spring Festival Dance", "Rongali Bihu", "India", 40, form19);
		dance19.getDanceDetails();

		Form form20 = new Form(20, "Chhau", "Jharkhand", 8, "Warrior Mask and Costume");
		Dance dance20 = new Dance(20, "Martial Folk Dance", "Chaitra Parva", "India", 50, form20);
		dance20.getDanceDetails();


	}
}