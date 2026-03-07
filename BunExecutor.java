class BunExecutor {

    public static void main(String[] args) {

        Bun bun1 = new Bun();
			bun1.brand = "Britannia";
			bun1.price = 20;
			bun1.type = "Sweet";
			bun1.weight = 50;
			bun1.flavor = "Vanilla";
			bun1.fresh = true;
			bun1.quantity =4;
			bun1.shape = "Round";
			bun1.bakery = "Britannia";
			bun1.expiryDays = 5;
			String[] outlets1 = {"Flour","Sugar","Butter"};
			bun1.outlets = outlets1;
			String[] ingredients1 = {"Reliance","More"};
			bun1.ingredients = ingredients1;
			bun1.display();

        Bun bun2 = new Bun();
			bun2.brand = "Harvest";
			bun2.price = 25;
			bun2.type = "Milk";
			bun2.weight = 55;
			bun2.flavor = "Milk";
			bun2.fresh = true;
			bun2.quantity =6;
			bun2.shape = "Round";
			bun2.bakery = "Harvest";
			bun2.expiryDays = 4;
			String[] outlets2 = {"Flour","Milk","Sugar"};
			bun2.outlets = outlets2;
			String[] ingredients2 = {"DMart","Reliance"};
			bun2.ingredients = ingredients2;
			bun2.display();

        Bun bun3 = new Bun();
			bun3.brand = "Modern";
			bun3.price = 18;
			bun3.type = "Butter";
			bun3.weight = 45;
			bun3.flavor = "Butter";
			bun3.fresh = true;
			bun3.quantity =5;
			bun3.shape = "Round";
			bun3.bakery = "Modern";
			bun3.expiryDays = 3;
			String[] outlets3 = {"Flour","Butter"};
			bun3.outlets = outlets3;
			String[] ingredients3 = {"More","Spar"};
			bun3.ingredients = ingredients3;
			bun3.display();

        Bun bun4 = new Bun();
			bun4.brand = "LocalBakery";
			bun4.price = 15;
			bun4.type = "Plain";
			bun4.weight = 40;
			bun4.flavor = "Plain";
			bun4.fresh = true;
			bun4.quantity =3;
			bun4.shape = "Round";
			bun4.bakery = "Local";
			bun4.expiryDays = 2;
			String[] outlets4 = {"Flour","Salt"};
			bun4.outlets = outlets4;
			String[] ingredients4 = {"BakeryShop","MiniMart"};
			bun4.ingredients = ingredients4;
			bun4.display();


    }
}