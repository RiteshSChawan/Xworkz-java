class HappyDentExecutor {

    public static void main(String[] args) {

        HappyDent happyDent1 = new HappyDent();
			happyDent1.brand = "HappyDent";
			happyDent1.flavor = "Mint";
			happyDent1.price = 10;
			happyDent1.quantity = 5;
			happyDent1.sugarFree = true;
			happyDent1.manufacturer = "Perfetti";
			String[] ingredients1 = {"Sugar","Mint"} ;
			happyDent1.ingredients = ingredients1;
			String[] outlets1 = {"Reliance","More"};
			happyDent1.outlets = outlets1;
			happyDent1.display();

        HappyDent happyDent2 = new HappyDent();
			happyDent2.brand = "HappyDent";
			happyDent2.flavor = "Strawberry";
			happyDent2.price = 12;
			happyDent2.quantity = 7;
			happyDent2.sugarFree = false;
			happyDent2.manufacturer = "Perfetti";
			String[] ingredients2 = {"Sugar","Flavor"} ;
			happyDent2.ingredients = ingredients2;
			String[] outlets2 = {"DMart","Reliance"};
			happyDent2.outlets = outlets2;
			happyDent2.display();

        HappyDent happyDent3 = new HappyDent();
			happyDent3.brand = "HappyDent";
			happyDent3.flavor = "Orange";
			happyDent3.price = 15;
			happyDent3.quantity = 3;
			happyDent3.sugarFree = false;
			happyDent3.manufacturer = "Perfetti";
			String[] ingredients3 = {"Sugar","Orange"} ;
			happyDent3.ingredients = ingredients3;
			String[] outlets3 = {"More","Spar"};
			happyDent3.outlets = outlets3;
			happyDent3.display();
			

        HappyDent happyDent4 = new HappyDent();
			happyDent4.brand = "HappyDent";
			happyDent4.flavor = "MintStrong";
			happyDent4.price = 20;
			happyDent4.quantity = 7;
			happyDent4.sugarFree = true;
			happyDent4.manufacturer = "Perfetti";
			String[] ingredients4 = {"Mint","Sweetener"} ;
			happyDent4.ingredients = ingredients4;
			String[] outlets4 = {"Reliance","BigBasket"};
			happyDent4.outlets = outlets4;
			happyDent4.display();

    }
}