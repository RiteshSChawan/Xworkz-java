class NewsPaperExecutor {
	public static void main(String[] args) {
/*
		Article article1 = new Article();
		article1.articleId = 1;
		article1.headline = "India GDP Grows 7.2 Percent";
		article1.category = "Economy";
		article1.author = "Suresh Kumar";
		article1.isBreakingNews = true;
		NewsPaper newsPaper1 = new NewsPaper();
		newsPaper1.paperid = 1;
		newsPaper1.paperName = "The Hindu";
		newsPaper1.language = "English";
		newsPaper1.circulation = 1200000;
		newsPaper1.pricePerCopy = 8.0;
		newsPaper1.article = article1;
		newsPaper1.getNewsPaperDetails();

		Article article2 = new Article();
		article2.articleId = 2;
		article2.headline = "New IPL Season Begins";
		article2.category = "Sports";
		article2.author = "Ramesh Gupta";
		article2.isBreakingNews = false;
		NewsPaper newsPaper2 = new NewsPaper();
		newsPaper2.paperid = 2;
		newsPaper2.paperName = "Times of India";
		newsPaper2.language = "English";
		newsPaper2.circulation = 2800000;
		newsPaper2.pricePerCopy = 10.0;
		newsPaper2.article = article2;
		newsPaper2.getNewsPaperDetails();

		Article article3 = new Article();
		article3.articleId = 3;
		article3.headline = "Bangalore Metro Phase 3 Launch";
		article3.category = "City";
		article3.author = "Priya Sharma";
		article3.isBreakingNews = true;
		NewsPaper newsPaper3 = new NewsPaper();
		newsPaper3.paperid = 3;
		newsPaper3.paperName = "Deccan Herald";
		newsPaper3.language = "English";
		newsPaper3.circulation = 600000;
		newsPaper3.pricePerCopy = 7.0;
		newsPaper3.article = article3;
		newsPaper3.getNewsPaperDetails();

		Article article4 = new Article();
		article4.articleId = 4;
		article4.headline = "Budget 2025 Key Highlights";
		article4.category = "Politics";
		article4.author = "Amit Verma";
		article4.isBreakingNews = true;
		NewsPaper newsPaper4 = new NewsPaper();
		newsPaper4.paperid = 4;
		newsPaper4.paperName = "Hindustan Times";
		newsPaper4.language = "English";
		newsPaper4.circulation = 1500000;
		newsPaper4.pricePerCopy = 9.0;
		newsPaper4.article = article4;
		newsPaper4.getNewsPaperDetails();

		Article article5 = new Article();
		article5.articleId = 5;
		article5.headline = "Cauvery Water Dispute Resolved";
		article5.category = "Regional";
		article5.author = "Shiva Prakash";
		article5.isBreakingNews = true;
		NewsPaper newsPaper5 = new NewsPaper();
		newsPaper5.paperid = 5;
		newsPaper5.paperName = "Vijaya Karnataka";
		newsPaper5.language = "Kannada";
		newsPaper5.circulation = 800000;
		newsPaper5.pricePerCopy = 5.0;
		newsPaper5.article = article5;
		newsPaper5.getNewsPaperDetails();

		Article article6 = new Article();
		article6.articleId = 6;
		article6.headline = "Hyderabad Floods Warning";
		article6.category = "Weather";
		article6.author = "Venkat Rao";
		article6.isBreakingNews = true;
		NewsPaper newsPaper6 = new NewsPaper();
		newsPaper6.paperid = 6;
		newsPaper6.paperName = "Eenadu";
		newsPaper6.language = "Telugu";
		newsPaper6.circulation = 900000;
		newsPaper6.pricePerCopy = 5.5;
		newsPaper6.article = article6;
		newsPaper6.getNewsPaperDetails();

		Article article7 = new Article();
		article7.articleId = 7;
		article7.headline = "PM Modi Inaugurates New Railway";
		article7.category = "National";
		article7.author = "Kavita Singh";
		article7.isBreakingNews = false;
		NewsPaper newsPaper7 = new NewsPaper();
		newsPaper7.paperid = 7;
		newsPaper7.paperName = "Dainik Bhaskar";
		newsPaper7.language = "Hindi";
		newsPaper7.circulation = 3500000;
		newsPaper7.pricePerCopy = 6.0;
		newsPaper7.article = article7;
		newsPaper7.getNewsPaperDetails();

		Article article8 = new Article();
		article8.articleId = 8;
		article8.headline = "Chennai Auto Expo 2025";
		article8.category = "Business";
		article8.author = "Murugan R";
		article8.isBreakingNews = false;
		NewsPaper newsPaper8 = new NewsPaper();
		newsPaper8.paperid = 8;
		newsPaper8.paperName = "Dinamalar";
		newsPaper8.language = "Tamil";
		newsPaper8.circulation = 700000;
		newsPaper8.pricePerCopy = 5.0;
		newsPaper8.article = article8;
		newsPaper8.getNewsPaperDetails();

		Article article9 = new Article();
		article9.articleId = 9;
		article9.headline = "Sensex Hits 80000 Mark";
		article9.category = "Finance";
		article9.author = "Deepak Shah";
		article9.isBreakingNews = true;
		NewsPaper newsPaper9 = new NewsPaper();
		newsPaper9.paperid = 9;
		newsPaper9.paperName = "Economic Times";
		newsPaper9.language = "English";
		newsPaper9.circulation = 1100000;
		newsPaper9.pricePerCopy = 12.0;
		newsPaper9.article = article9;
		newsPaper9.getNewsPaperDetails();

		Article article10 = new Article();
		article10.articleId = 10;
		article10.headline = "Supreme Court Verdict on Reservation";
		article10.category = "Legal";
		article10.author = "Neha Joshi";
		article10.isBreakingNews = true;
		NewsPaper newsPaper10 = new NewsPaper();
		newsPaper10.paperid = 10;
		newsPaper10.paperName = "Indian Express";
		newsPaper10.language = "English";
		newsPaper10.circulation = 1000000;
		newsPaper10.pricePerCopy = 9.0;
		newsPaper10.article = article10;
		newsPaper10.getNewsPaperDetails();

		Article article11 = new Article();
		article11.articleId = 11;
		article11.headline = "Kerala Flood Relief Operations";
		article11.category = "Disaster";
		article11.author = "Rajan Nair";
		article11.isBreakingNews = true;
		NewsPaper newsPaper11 = new NewsPaper();
		newsPaper11.paperid = 11;
		newsPaper11.paperName = "Malayala Manorama";
		newsPaper11.language = "Malayalam";
		newsPaper11.circulation = 1400000;
		newsPaper11.pricePerCopy = 6.0;
		newsPaper11.article = article11;
		newsPaper11.getNewsPaperDetails();

		Article article12 = new Article();
		article12.articleId = 12;
		article12.headline = "Durga Puja Preparations Begin";
		article12.category = "Culture";
		article12.author = "Subhash Das";
		article12.isBreakingNews = false;
		NewsPaper newsPaper12 = new NewsPaper();
		newsPaper12.paperid = 12;
		newsPaper12.paperName = "Ananda Bazar";
		newsPaper12.language = "Bengali";
		newsPaper12.circulation = 1200000;
		newsPaper12.pricePerCopy = 5.5;
		newsPaper12.article = article12;
		newsPaper12.getNewsPaperDetails();

		Article article13 = new Article();
		article13.articleId = 13;
		article13.headline = "Punjab Agricultural Reforms";
		article13.category = "Agriculture";
		article13.author = "Harjit Singh";
		article13.isBreakingNews = false;
		NewsPaper newsPaper13 = new NewsPaper();
		newsPaper13.paperid = 13;
		newsPaper13.paperName = "Tribune";
		newsPaper13.language = "English";
		newsPaper13.circulation = 500000;
		newsPaper13.pricePerCopy = 7.0;
		newsPaper13.article = article13;
		newsPaper13.getNewsPaperDetails();

		Article article14 = new Article();
		article14.articleId = 14;
		article14.headline = "UP Election Campaign Heats Up";
		article14.category = "Politics";
		article14.author = "Rahul Mishra";
		article14.isBreakingNews = true;
		NewsPaper newsPaper14 = new NewsPaper();
		newsPaper14.paperid = 14;
		newsPaper14.paperName = "Navbharat Times";
		newsPaper14.language = "Hindi";
		newsPaper14.circulation = 800000;
		newsPaper14.pricePerCopy = 6.0;
		newsPaper14.article = article14;
		newsPaper14.getNewsPaperDetails();

		Article article15 = new Article();
		article15.articleId = 15;
		article15.headline = "RBI Cuts Repo Rate";
		article15.category = "Finance";
		article15.author = "Anil Kapoor";
		article15.isBreakingNews = true;
		NewsPaper newsPaper15 = new NewsPaper();
		newsPaper15.paperid = 15;
		newsPaper15.paperName = "Mint";
		newsPaper15.language = "English";
		newsPaper15.circulation = 650000;
		newsPaper15.pricePerCopy = 15.0;
		newsPaper15.article = article15;
		newsPaper15.getNewsPaperDetails();

		Article article16 = new Article();
		article16.articleId = 16;
		article16.headline = "Mumbai Smart City Project";
		article16.category = "Urban";
		article16.author = "Priti Mehta";
		article16.isBreakingNews = false;
		NewsPaper newsPaper16 = new NewsPaper();
		newsPaper16.paperid = 16;
		newsPaper16.paperName = "DNA";
		newsPaper16.language = "English";
		newsPaper16.circulation = 400000;
		newsPaper16.pricePerCopy = 8.0;
		newsPaper16.article = article16;
		newsPaper16.getNewsPaperDetails();

		Article article17 = new Article();
		article17.articleId = 17;
		article17.headline = "Pune IT Corridor Expansion";
		article17.category = "Business";
		article17.author = "Sandeep Kulkarni";
		article17.isBreakingNews = false;
		NewsPaper newsPaper17 = new NewsPaper();
		newsPaper17.paperid = 17;
		newsPaper17.paperName = "Pune Mirror";
		newsPaper17.language = "English";
		newsPaper17.circulation = 300000;
		newsPaper17.pricePerCopy = 6.0;
		newsPaper17.article = article17;
		newsPaper17.getNewsPaperDetails();

		Article article18 = new Article();
		article18.articleId = 18;
		article18.headline = "Hassan Tourism Boost";
		article18.category = "Tourism";
		article18.author = "Basavraj M";
		article18.isBreakingNews = false;
		NewsPaper newsPaper18 = new NewsPaper();
		newsPaper18.paperid = 18;
		newsPaper18.paperName = "Prajavani";
		newsPaper18.language = "Kannada";
		newsPaper18.circulation = 550000;
		newsPaper18.pricePerCopy = 5.0;
		newsPaper18.article = article18;
		newsPaper18.getNewsPaperDetails();

		Article article19 = new Article();
		article19.articleId = 19;
		article19.headline = "Telangana New Industrial Policy";
		article19.category = "Economy";
		article19.author = "Suryanarayana";
		article19.isBreakingNews = true;
		NewsPaper newsPaper19 = new NewsPaper();
		newsPaper19.paperid = 19;
		newsPaper19.paperName = "Hans India";
		newsPaper19.language = "English";
		newsPaper19.circulation = 250000;
		newsPaper19.pricePerCopy = 7.0;
		newsPaper19.article = article19;
		newsPaper19.getNewsPaperDetails();

		Article article20 = new Article();
		article20.articleId = 20;
		article20.headline = "Indian Space Mission 2026";
		article20.category = "Science";
		article20.author = "Geetha Rao";
		article20.isBreakingNews = true;
		NewsPaper newsPaper20 = new NewsPaper();
		newsPaper20.paperid = 20;
		newsPaper20.paperName = "New Indian Express";
		newsPaper20.language = "English";
		newsPaper20.circulation = 750000;
		newsPaper20.pricePerCopy = 8.0;
		newsPaper20.article = article20;
		newsPaper20.getNewsPaperDetails(); */

		Article article1 = new Article(1, "India GDP Grows 7.2 Percent", "Economy", "Suresh Kumar", true);
		NewsPaper newsPaper1 = new NewsPaper(1, "The Hindu", "English", 1200000, 8.0, article1);
		newsPaper1.getNewsPaperDetails();

		Article article2 = new Article(2, "New IPL Season Begins", "Sports", "Ramesh Gupta", false);
		NewsPaper newsPaper2 = new NewsPaper(2, "Times of India", "English", 2800000, 10.0, article2);
		newsPaper2.getNewsPaperDetails();

		Article article3 = new Article(3, "Bangalore Metro Phase 3 Launch", "City", "Priya Sharma", true);
		NewsPaper newsPaper3 = new NewsPaper(3, "Deccan Herald", "English", 600000, 7.0, article3);
		newsPaper3.getNewsPaperDetails();

		Article article4 = new Article(4, "Budget 2025 Key Highlights", "Politics", "Amit Verma", true);
		NewsPaper newsPaper4 = new NewsPaper(4, "Hindustan Times", "English", 1500000, 9.0, article4);
		newsPaper4.getNewsPaperDetails();

		Article article5 = new Article(5, "Cauvery Water Dispute Resolved", "Regional", "Shiva Prakash", true);
		NewsPaper newsPaper5 = new NewsPaper(5, "Vijaya Karnataka", "Kannada", 800000, 5.0, article5);
		newsPaper5.getNewsPaperDetails();

		Article article6 = new Article(6, "Hyderabad Floods Warning", "Weather", "Venkat Rao", true);
		NewsPaper newsPaper6 = new NewsPaper(6, "Eenadu", "Telugu", 900000, 5.5, article6);
		newsPaper6.getNewsPaperDetails();

		Article article7 = new Article(7, "PM Modi Inaugurates New Railway", "National", "Kavita Singh", false);
		NewsPaper newsPaper7 = new NewsPaper(7, "Dainik Bhaskar", "Hindi", 3500000, 6.0, article7);
		newsPaper7.getNewsPaperDetails();

		Article article8 = new Article(8, "Chennai Auto Expo 2025", "Business", "Murugan R", false);
		NewsPaper newsPaper8 = new NewsPaper(8, "Dinamalar", "Tamil", 700000, 5.0, article8);
		newsPaper8.getNewsPaperDetails();

		Article article9 = new Article(9, "Sensex Hits 80000 Mark", "Finance", "Deepak Shah", true);
		NewsPaper newsPaper9 = new NewsPaper(9, "Economic Times", "English", 1100000, 12.0, article9);
		newsPaper9.getNewsPaperDetails();

		Article article10 = new Article(10, "Supreme Court Verdict", "Legal", "Neha Joshi", true);
		NewsPaper newsPaper10 = new NewsPaper(10, "Indian Express", "English", 1000000, 9.0, article10);
		newsPaper10.getNewsPaperDetails();

		Article article11 = new Article(11, "Kerala Flood Relief", "Disaster", "Rajan Nair", true);
		NewsPaper newsPaper11 = new NewsPaper(11, "Malayala Manorama", "Malayalam", 1400000, 6.0, article11);
		newsPaper11.getNewsPaperDetails();

		Article article12 = new Article(12, "Durga Puja Preparations Begin", "Culture", "Subhash Das", false);
		NewsPaper newsPaper12 = new NewsPaper(12, "Ananda Bazar", "Bengali", 1200000, 5.5, article12);
		newsPaper12.getNewsPaperDetails();

		Article article13 = new Article(13, "Punjab Agricultural Reforms", "Agriculture", "Harjit Singh", false);
		NewsPaper newsPaper13 = new NewsPaper(13, "Tribune", "English", 500000, 7.0, article13);
		newsPaper13.getNewsPaperDetails();

		Article article14 = new Article(14, "UP Election Campaign", "Politics", "Rahul Mishra", true);
		NewsPaper newsPaper14 = new NewsPaper(14, "Navbharat Times", "Hindi", 800000, 6.0, article14);
		newsPaper14.getNewsPaperDetails();

		Article article15 = new Article(15, "RBI Cuts Repo Rate", "Finance", "Anil Kapoor", true);
		NewsPaper newsPaper15 = new NewsPaper(15, "Mint", "English", 650000, 15.0, article15);
		newsPaper15.getNewsPaperDetails();

		Article article16 = new Article(16, "Mumbai Smart City Project", "Urban", "Priti Mehta", false);
		NewsPaper newsPaper16 = new NewsPaper(16, "DNA", "English", 400000, 8.0, article16);
		newsPaper16.getNewsPaperDetails();

		Article article17 = new Article(17, "Pune IT Corridor Expansion", "Business", "Sandeep Kulkarni", false);
		NewsPaper newsPaper17 = new NewsPaper(17, "Pune Mirror", "English", 300000, 6.0, article17);
		newsPaper17.getNewsPaperDetails();

		Article article18 = new Article(18, "Hassan Tourism Boost", "Tourism", "Basavraj M", false);
		NewsPaper newsPaper18 = new NewsPaper(18, "Prajavani", "Kannada", 550000, 5.0, article18);
		newsPaper18.getNewsPaperDetails();

		Article article19 = new Article(19, "Telangana New Industrial Policy", "Economy", "Suryanarayana", true);
		NewsPaper newsPaper19 = new NewsPaper(19, "Hans India", "English", 250000, 7.0, article19);
		newsPaper19.getNewsPaperDetails();

		Article article20 = new Article(20, "Indian Space Mission 2026", "Science", "Geetha Rao", true);
		NewsPaper newsPaper20 = new NewsPaper(20, "New Indian Express", "English", 750000, 8.0, article20);
		newsPaper20.getNewsPaperDetails();


	}
}