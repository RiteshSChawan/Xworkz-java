class BreadExecutor {

    public static void main(String[] args) {

        Bread bread1 = new Bread();
			bread1.type = "White";
			String[] outletNames1 = {"Reliance","More"};
			bread1.outletNames = outletNames1;
			String[] ingredients1 = {"Flour","Salt","Yeast"};
			bread1.ingredients = ingredients1;
			bread1.shape = "Rectangle";

        Bread bread2 = new Bread();
			bread2.type = "Brown";
			String[] outletNames2 = {"DMart","Reliance"};
			bread2.outletNames = outletNames2;
			String[] ingredients2 = {"Wheat","Salt","Sugar"};
			bread2.ingredients = ingredients2;
			bread2.shape = "Rectangle";

        Bread bread3 = new Bread();
			bread3.type = "Multigrain";
			String[] outletNames3 = {"More","BigBasket"};
			bread3.outletNames = outletNames3;
			String[] ingredients3 = {"Grains","Salt","Oil"};
			bread3.ingredients = ingredients3;
			bread3.shape = "Round";

        Bread bread4 = new Bread();
			bread4.type = "Garlic";
			String[] outletNames4 = {"Reliance","Spar"};
			bread4.outletNames = outletNames4;
			String[] ingredients4 = {"Flour","Garlic","Butter"};
			bread4.ingredients = ingredients4;
			bread4.shape = "Oval";

    }
}