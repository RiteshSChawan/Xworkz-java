class UniverseExecutor {
	public static void main(String[] args) {
/*
		Earth earth1 = new Earth();
		earth1.earthId = 1;
		earth1.continent = "Asia";
		earth1.climate = "Tropical";
		earth1.population = 4700000000;
		earth1.surfaceArea = 44614000.0;
		Universe universe1 = new Universe();
		universe1.universeId = 1;
		universe1.universeName = "Milky Way Universe";
		universe1.galaxyType = "Spiral";
		universe1.ageInBillionYears = 13.8;
		universe1.isExpanding = true;
		universe1.earth = earth1;
		universe1.getUniverseDetails();

		Earth earth2 = new Earth();
		earth2.earthId = 2;
		earth2.continent = "Africa";
		earth2.climate = "Arid";
		earth2.population = 1400000000;
		earth2.surfaceArea = 30370000.0;
		Universe universe2 = new Universe();
		universe2.universeId = 2;
		universe2.universeName = "Andromeda Galaxy Zone";
		universe2.galaxyType = "Spiral";
		universe2.ageInBillionYears = 10.0;
		universe2.isExpanding = true;
		universe2.earth = earth2;
		universe2.getUniverseDetails();

		Earth earth3 = new Earth();
		earth3.earthId = 3;
		earth3.continent = "Europe";
		earth3.climate = "Temperate";
		earth3.population = 750000000;
		earth3.surfaceArea = 10530000.0;
		Universe universe3 = new Universe();
		universe3.universeId = 3;
		universe3.universeName = "Observable Universe";
		universe3.galaxyType = "Mixed";
		universe3.ageInBillionYears = 13.8;
		universe3.isExpanding = true;
		universe3.earth = earth3;
		universe3.getUniverseDetails();

		Earth earth4 = new Earth();
		earth4.earthId = 4;
		earth4.continent = "North America";
		earth4.climate = "Continental";
		earth4.population = 600000000;
		earth4.surfaceArea = 24709000.0;
		Universe universe4 = new Universe();
		universe4.universeId = 4;
		universe4.universeName = "Local Group";
		universe4.galaxyType = "Irregular";
		universe4.ageInBillionYears = 12.0;
		universe4.isExpanding = true;
		universe4.earth = earth4;
		universe4.getUniverseDetails();

		Earth earth5 = new Earth();
		earth5.earthId = 5;
		earth5.continent = "South America";
		earth5.climate = "Tropical";
		earth5.population = 430000000;
		earth5.surfaceArea = 17840000.0;
		Universe universe5 = new Universe();
		universe5.universeId = 5;
		universe5.universeName = "Virgo Supercluster";
		universe5.galaxyType = "Elliptical";
		universe5.ageInBillionYears = 11.5;
		universe5.isExpanding = true;
		universe5.earth = earth5;
		universe5.getUniverseDetails();

		Earth earth6 = new Earth();
		earth6.earthId = 6;
		earth6.continent = "Australia";
		earth6.climate = "Arid";
		earth6.population = 26000000;
		earth6.surfaceArea = 7692000.0;
		Universe universe6 = new Universe();
		universe6.universeId = 6;
		universe6.universeName = "Laniakea Supercluster";
		universe6.galaxyType = "Mixed";
		universe6.ageInBillionYears = 13.0;
		universe6.isExpanding = true;
		universe6.earth = earth6;
		universe6.getUniverseDetails();

		Earth earth7 = new Earth();
		earth7.earthId = 7;
		earth7.continent = "Antarctica";
		earth7.climate = "Polar";
		earth7.population = 1100;
		earth7.surfaceArea = 14200000.0;
		Universe universe7 = new Universe();
		universe7.universeId = 7;
		universe7.universeName = "Perseus Cluster";
		universe7.galaxyType = "Irregular";
		universe7.ageInBillionYears = 9.0;
		universe7.isExpanding = true;
		universe7.earth = earth7;
		universe7.getUniverseDetails();

		Earth earth8 = new Earth();
		earth8.earthId = 8;
		earth8.continent = "Arctic Zone";
		earth8.climate = "Polar";
		earth8.population = 4000000;
		earth8.surfaceArea = 14056000.0;
		Universe universe8 = new Universe();
		universe8.universeId = 8;
		universe8.universeName = "Coma Cluster";
		universe8.galaxyType = "Elliptical";
		universe8.ageInBillionYears = 8.5;
		universe8.isExpanding = true;
		universe8.earth = earth8;
		universe8.getUniverseDetails();

		Earth earth9 = new Earth();
		earth9.earthId = 9;
		earth9.continent = "Pacific Region";
		earth9.climate = "Oceanic";
		earth9.population = 50000000;
		earth9.surfaceArea = 165250000.0;
		Universe universe9 = new Universe();
		universe9.universeId = 9;
		universe9.universeName = "Bootes Supercluster";
		universe9.galaxyType = "Mixed";
		universe9.ageInBillionYears = 10.5;
		universe9.isExpanding = true;
		universe9.earth = earth9;
		universe9.getUniverseDetails();

		Earth earth10 = new Earth();
		earth10.earthId = 10;
		earth10.continent = "Indian Ocean Region";
		earth10.climate = "Humid";
		earth10.population = 2000000000;
		earth10.surfaceArea = 70560000.0;
		Universe universe10 = new Universe();
		universe10.universeId = 10;
		universe10.universeName = "Shapley Supercluster";
		universe10.galaxyType = "Mixed";
		universe10.ageInBillionYears = 11.0;
		universe10.isExpanding = true;
		universe10.earth = earth10;
		universe10.getUniverseDetails();

		Earth earth11 = new Earth();
		earth11.earthId = 11;
		earth11.continent = "Middle East";
		earth11.climate = "Desert";
		earth11.population = 400000000;
		earth11.surfaceArea = 6969000.0;
		Universe universe11 = new Universe();
		universe11.universeId = 11;
		universe11.universeName = "Hercules Cluster";
		universe11.galaxyType = "Spiral";
		universe11.ageInBillionYears = 9.5;
		universe11.isExpanding = true;
		universe11.earth = earth11;
		universe11.getUniverseDetails();

		Earth earth12 = new Earth();
		earth12.earthId = 12;
		earth12.continent = "Central Asia";
		earth12.climate = "Steppe";
		earth12.population = 100000000;
		earth12.surfaceArea = 5449000.0;
		Universe universe12 = new Universe();
		universe12.universeId = 12;
		universe12.universeName = "Centaurus Supercluster";
		universe12.galaxyType = "Elliptical";
		universe12.ageInBillionYears = 10.8;
		universe12.isExpanding = true;
		universe12.earth = earth12;
		universe12.getUniverseDetails();

		Earth earth13 = new Earth();
		earth13.earthId = 13;
		earth13.continent = "Caribbean";
		earth13.climate = "Tropical";
		earth13.population = 45000000;
		earth13.surfaceArea = 234000.0;
		Universe universe13 = new Universe();
		universe13.universeId = 13;
		universe13.universeName = "Pisces Cetus Supercluster";
		universe13.galaxyType = "Mixed";
		universe13.ageInBillionYears = 12.5;
		universe13.isExpanding = true;
		universe13.earth = earth13;
		universe13.getUniverseDetails();

		Earth earth14 = new Earth();
		earth14.earthId = 14;
		earth14.continent = "Scandinavia";
		earth14.climate = "Subarctic";
		earth14.population = 27000000;
		earth14.surfaceArea = 1248000.0;
		Universe universe14 = new Universe();
		universe14.universeId = 14;
		universe14.universeName = "Horologium Supercluster";
		universe14.galaxyType = "Irregular";
		universe14.ageInBillionYears = 11.2;
		universe14.isExpanding = true;
		universe14.earth = earth14;
		universe14.getUniverseDetails();

		Earth earth15 = new Earth();
		earth15.earthId = 15;
		earth15.continent = "Balkans";
		earth15.climate = "Mediterranean";
		earth15.population = 60000000;
		earth15.surfaceArea = 550000.0;
		Universe universe15 = new Universe();
		universe15.universeId = 15;
		universe15.universeName = "Corona Borealis Supercluster";
		universe15.galaxyType = "Spiral";
		universe15.ageInBillionYears = 10.2;
		universe15.isExpanding = true;
		universe15.earth = earth15;
		universe15.getUniverseDetails();

		Earth earth16 = new Earth();
		earth16.earthId = 16;
		earth16.continent = "Sahara Region";
		earth16.climate = "Hyper Arid";
		earth16.population = 3000000;
		earth16.surfaceArea = 9200000.0;
		Universe universe16 = new Universe();
		universe16.universeId = 16;
		universe16.universeName = "Aquarius Supercluster";
		universe16.galaxyType = "Elliptical";
		universe16.ageInBillionYears = 9.8;
		universe16.isExpanding = true;
		universe16.earth = earth16;
		universe16.getUniverseDetails();

		Earth earth17 = new Earth();
		earth17.earthId = 17;
		earth17.continent = "Amazon Basin";
		earth17.climate = "Rainforest";
		earth17.population = 35000000;
		earth17.surfaceArea = 7000000.0;
		Universe universe17 = new Universe();
		universe17.universeId = 17;
		universe17.universeName = "Sculptor Wall";
		universe17.galaxyType = "Mixed";
		universe17.ageInBillionYears = 12.1;
		universe17.isExpanding = true;
		universe17.earth = earth17;
		universe17.getUniverseDetails();

		Earth earth18 = new Earth();
		earth18.earthId = 18;
		earth18.continent = "Himalayas";
		earth18.climate = "Alpine";
		earth18.population = 15000000;
		earth18.surfaceArea = 600000.0;
		Universe universe18 = new Universe();
		universe18.universeId = 18;
		universe18.universeName = "Great Wall";
		universe18.galaxyType = "Mixed";
		universe18.ageInBillionYears = 13.2;
		universe18.isExpanding = true;
		universe18.earth = earth18;
		universe18.getUniverseDetails();

		Earth earth19 = new Earth();
		earth19.earthId = 19;
		earth19.continent = "Siberia";
		earth19.climate = "Subarctic";
		earth19.population = 38000000;
		earth19.surfaceArea = 13100000.0;
		Universe universe19 = new Universe();
		universe19.universeId = 19;
		universe19.universeName = "CfA2 Great Wall";
		universe19.galaxyType = "Irregular";
		universe19.ageInBillionYears = 11.8;
		universe19.isExpanding = true;
		universe19.earth = earth19;
		universe19.getUniverseDetails();

		Earth earth20 = new Earth();
		earth20.earthId = 20;
		earth20.continent = "Deccan Plateau";
		earth20.climate = "Semi-Arid";
		earth20.population = 300000000;
		earth20.surfaceArea = 500000.0;
		Universe universe20 = new Universe();
		universe20.universeId = 20;
		universe20.universeName = "Sloan Great Wall";
		universe20.galaxyType = "Mixed";
		universe20.ageInBillionYears = 13.5;
		universe20.isExpanding = true;
		universe20.earth = earth20;
		universe20.getUniverseDetails(); */

		Earth earth1 = new Earth(1, "Asia", "Tropical", 4700000000, 44614000.0);
		Universe universe1 = new Universe(1, "Milky Way Universe", "Spiral", 13.8, true, earth1);
		universe1.getUniverseDetails();

		Earth earth2 = new Earth(2, "Africa", "Arid", 1400000000, 30370000.0);
		Universe universe2 = new Universe(2, "Andromeda Galaxy Zone", "Spiral", 10.0, true, earth2);
		universe2.getUniverseDetails();

		Earth earth3 = new Earth(3, "Europe", "Temperate", 750000000, 10530000.0);
		Universe universe3 = new Universe(3, "Observable Universe", "Mixed", 13.8, true, earth3);
		universe3.getUniverseDetails();

		Earth earth4 = new Earth(4, "North America", "Continental", 600000000, 24709000.0);
		Universe universe4 = new Universe(4, "Local Group", "Irregular", 12.0, true, earth4);
		universe4.getUniverseDetails();

		Earth earth5 = new Earth(5, "South America", "Tropical", 430000000, 17840000.0);
		Universe universe5 = new Universe(5, "Virgo Supercluster", "Elliptical", 11.5, true, earth5);
		universe5.getUniverseDetails();

		Earth earth6 = new Earth(6, "Australia", "Arid", 26000000, 7692000.0);
		Universe universe6 = new Universe(6, "Laniakea Supercluster", "Mixed", 13.0, true, earth6);
		universe6.getUniverseDetails();

		Earth earth7 = new Earth(7, "Antarctica", "Polar", 1100, 14200000.0);
		Universe universe7 = new Universe(7, "Perseus Cluster", "Irregular", 9.0, true, earth7);
		universe7.getUniverseDetails();

		Earth earth8 = new Earth(8, "Arctic Zone", "Polar", 4000000, 14056000.0);
		Universe universe8 = new Universe(8, "Coma Cluster", "Elliptical", 8.5, true, earth8);
		universe8.getUniverseDetails();

		Earth earth9 = new Earth(9, "Pacific Region", "Oceanic", 50000000, 165250000.0);
		Universe universe9 = new Universe(9, "Bootes Supercluster", "Mixed", 10.5, true, earth9);
		universe9.getUniverseDetails();

		Earth earth10 = new Earth(10, "Indian Ocean Region", "Humid", 2000000000, 70560000.0);
		Universe universe10 = new Universe(10, "Shapley Supercluster", "Mixed", 11.0, true, earth10);
		universe10.getUniverseDetails();

		Earth earth11 = new Earth(11, "Middle East", "Desert", 400000000, 6969000.0);
		Universe universe11 = new Universe(11, "Hercules Cluster", "Spiral", 9.5, true, earth11);
		universe11.getUniverseDetails();

		Earth earth12 = new Earth(12, "Central Asia", "Steppe", 100000000, 5449000.0);
		Universe universe12 = new Universe(12, "Centaurus Supercluster", "Elliptical", 10.8, true, earth12);
		universe12.getUniverseDetails();

		Earth earth13 = new Earth(13, "Caribbean", "Tropical", 45000000, 234000.0);
		Universe universe13 = new Universe(13, "Pisces Cetus Supercluster", "Mixed", 12.5, true, earth13);
		universe13.getUniverseDetails();

		Earth earth14 = new Earth(14, "Scandinavia", "Subarctic", 27000000, 1248000.0);
		Universe universe14 = new Universe(14, "Horologium Supercluster", "Irregular", 11.2, true, earth14);
		universe14.getUniverseDetails();

		Earth earth15 = new Earth(15, "Balkans", "Mediterranean", 60000000, 550000.0);
		Universe universe15 = new Universe(15, "Corona Borealis", "Spiral", 10.2, true, earth15);
		universe15.getUniverseDetails();

		Earth earth16 = new Earth(16, "Sahara Region", "Hyper Arid", 3000000, 9200000.0);
		Universe universe16 = new Universe(16, "Aquarius Supercluster", "Elliptical", 9.8, true, earth16);
		universe16.getUniverseDetails();

		Earth earth17 = new Earth(17, "Amazon Basin", "Rainforest", 35000000, 7000000.0);
		Universe universe17 = new Universe(17, "Sculptor Wall", "Mixed", 12.1, true, earth17);
		universe17.getUniverseDetails();

		Earth earth18 = new Earth(18, "Himalayas", "Alpine", 15000000, 600000.0);
		Universe universe18 = new Universe(18, "Great Wall", "Mixed", 13.2, true, earth18);
		universe18.getUniverseDetails();

		Earth earth19 = new Earth(19, "Siberia", "Subarctic", 38000000, 13100000.0);
		Universe universe19 = new Universe(19, "CfA2 Great Wall", "Irregular", 11.8, true, earth19);
		universe19.getUniverseDetails();

		Earth earth20 = new Earth(20, "Deccan Plateau", "Semi-Arid", 300000000, 500000.0);
		Universe universe20 = new Universe(20, "Sloan Great Wall", "Mixed", 13.5, true, earth20);
		universe20.getUniverseDetails();


	}
}