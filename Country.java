class Country {

    public static String[] findStatesByCountry(String countryName) {

        System.out.println("Invoked findStatesByCountry");

        if (countryName == "India") {

            String[] indiaStates = {
                "Andhra Pradesh","Arunachal Pradesh","Assam","Bihar","Chhattisgarh",
                "Goa","Gujarat","Haryana","Himachal Pradesh","Jharkhand",
                "Karnataka","Kerala","Madhya Pradesh","Maharashtra","Manipur",
                "Meghalaya","Mizoram","Nagaland","Odisha","Punjab",
                "Rajasthan","Sikkim","Tamil Nadu","Telangana","Tripura",
                "Uttar Pradesh","Uttarakhand","West Bengal"
            };

            return indiaStates;
        }

        else if (countryName == "Mexico") {
            String[] mexicoStates = {
                "Aguascalientes","Baja California","Baja California Sur","Campeche","Chiapas",
                "Chihuahua","Coahuila","Colima","Durango","Guanajuato","Guerrero","Hidalgo",
                "Jalisco","Mexico City","Michoacan","Morelos","Nayarit","Nuevo Leon","Oaxaca","Puebla"
            };
            return mexicoStates;
        }

        else if (countryName == "Japan") {
            String[] japanStates = {
                "Aichi","Akita","Aomori","Chiba","Ehime","Fukui","Fukuoka",
                "Fukushima","Gifu","Gunma","Hiroshima","Hokkaido","Hyogo",
                "Ibaraki","Ishikawa","Iwate","Kagawa","Kagoshima","Kanagawa","Kochi"
            };
            return japanStates;
        }

        else if (countryName == "France") {
            String[] franceStates = {
                "Auvergne-Rhone-Alpes","Bourgogne-Franche-Comte","Brittany","Centre-Val de Loire",
                "Corsica","Grand Est","Hauts-de-France","Île-de-France","Normandy","Nouvelle-Aquitaine",
                "Occitanie","Pays de la Loire","Provence-Alpes-Côte d'Azur"
            };
            return franceStates;
        }

        else if (countryName == "United Kingdom") {
            String[] ukStates = {
                "England","Scotland","Wales","Northern Ireland"
            };
            return ukStates;
        }

        else if (countryName == "Italy") {
            String[] italyStates = {
                "Abruzzo","Basilicata","Calabria","Campania","Emilia-Romagna","Friuli Venezia Giulia",
                "Lazio","Liguria","Lombardy","Marche","Molise","Piedmont","Apulia","Sardinia","Sicily",
                "Tuscany","Trentino-Alto Adige","Umbria","Aosta Valley","Veneto"
            };
            return italyStates;
        }

        else if (countryName == "South Africa") {
            String[] saStates = {
                "Eastern Cape","Free State","Gauteng","KwaZulu-Natal","Limpopo",
                "Mpumalanga","Northern Cape","North West","Western Cape"
            };
            return saStates;
        }
		
		else if (countryName == "United States") {

            String[] usaStates = {
                "Alabama","Alaska","Arizona","Arkansas","California",
                "Colorado","Connecticut","Delaware","Florida","Georgia",
                "Hawaii","Idaho","Illinois","Indiana","Iowa",
                "Kansas","Kentucky","Louisiana","Maine","Maryland",
                "Massachusetts","Michigan","Minnesota","Mississippi","Missouri",
                "Montana","Nebraska","Nevada","New Hampshire","New Jersey",
                "New Mexico","New York","North Carolina","North Dakota","Ohio",
                "Oklahoma","Oregon","Pennsylvania","Rhode Island","South Carolina",
                "South Dakota","Tennessee","Texas","Utah","Vermont",
                "Virginia","Washington","West Virginia","Wisconsin","Wyoming"
            };

            return usaStates;
        }
		else if (countryName == "Australia") {
            String[] ausStates = {
                "New South Wales","Victoria","Queensland","Western Australia",
                "South Australia","Tasmania"
            };
            return ausStates;
        }

        else if (countryName == "Germany") {
            String[] germanyStates = {
                "Bavaria","Berlin","Brandenburg","Bremen","Hamburg",
                "Hesse","Lower Saxony","Mecklenburg-Vorpommern","North Rhine-Westphalia",
                "Rhineland-Palatinate","Saarland","Saxony","Saxony-Anhalt",
                "Schleswig-Holstein","Thuringia","Baden-Württemberg"
            };
            return germanyStates;
        }

        else if (countryName == "Brazil") {
            String[] brazilStates = {
                "Acre","Alagoas","Amapa","Amazonas","Bahia",
                "Ceara","Distrito Federal","Espirito Santo","Goias",
                "Maranhao","Mato Grosso","Mato Grosso do Sul",
                "Minas Gerais","Para","Paraiba","Parana","Pernambuco",
                "Piaui","Rio de Janeiro","Rio Grande do Norte",
                "Rio Grande do Sul","Rondonia","Roraima",
                "Santa Catarina","Sao Paulo","Sergipe","Tocantins"
            };
            return brazilStates;
        }

        else if (countryName == "Canada") {
            String[] canadaStates = {
                "Alberta","British Columbia","Manitoba","New Brunswick","Newfoundland and Labrador",
                "Nova Scotia","Ontario","Prince Edward Island","Quebec","Saskatchewan"
            };
            return canadaStates;
        }

        else if (countryName == "China") {
            String[] chinaStates = {
                "Anhui","Beijing","Chongqing","Fujian","Gansu","Guangdong","Guangxi",
                "Guizhou","Hainan","Hebei","Heilongjiang","Henan","Hong Kong",
                "Hubei","Hunan","Inner Mongolia","Jiangsu","Jiangxi","Jilin","Liaoning"
            };
            return chinaStates;
        }

        else if (countryName == "Russia") {
            String[] russiaStates = {
                "Adygea","Altai Republic","Bashkortostan","Buryatia","Chechnya",
                "Chukotka","Ingushetia","Kabardino-Balkaria","Kalmykia","Karachay-Cherkessia",
                "Karelia","Komi","Mari El","Mordovia","Sakha","Tatarstan","Tuva","Udmurtia","Yakutia"
            };
            return russiaStates;
        }

        else if (countryName == "Argentina") {
            String[] argentinaStates = {
                "Buenos Aires","Catamarca","Chaco","Chubut","Cordoba","Corrientes",
                "Entre Rios","Formosa","Jujuy","La Pampa","La Rioja","Mendoza",
                "Misiones","Neuquen","Rio Negro","Salta","San Juan","San Luis",
                "Santa Cruz","Santa Fe","Santiago del Estero","Tierra del Fuego","Tucuman"
            };
            return argentinaStates;
        }

        else if (countryName == "Egypt") {
            String[] egyptStates = {
                "Cairo","Giza","Alexandria","Luxor","Aswan","Suez","Port Said","Faiyum","Ismailia","Asyut"
            };
            return egyptStates;
        }

        else if (countryName == "Spain") {
            String[] spainStates = {
                "Andalusia","Aragon","Asturias","Balearic Islands","Basque Country",
                "Canary Islands","Cantabria","Castile and Leon","Castile-La Mancha","Catalonia",
                "Extremadura","Galicia","La Rioja","Madrid","Murcia","Navarre","Valencia"
            };
            return spainStates;
        }

        else if (countryName == "Saudi Arabia") {
            String[] saudiStates = {
                "Riyadh","Makkah","Madinah","Eastern Province","Asir","Tabuk","Hail","Northern Borders","Jizan","Najran","Al Bahah","Al Jawf"
            };
            return saudiStates;
        }

        else if (countryName == "Nigeria") {
            String[] nigeriaStates = {
                "Abia","Adamawa","Akwa Ibom","Anambra","Bauchi","Bayelsa","Benue","Borno","Cross River","Delta",
                "Ebonyi","Edo","Ekiti","Enugu","Gombe","Imo","Jigawa","Kaduna","Kano","Katsina",
                "Kebbi","Kogi","Kwara","Lagos","Nasarawa","Niger","Ogun","Ondo","Osun","Oyo",
                "Plateau","Rivers","Sokoto","Taraba","Yobe","Zamfara","FCT"
            };
            return nigeriaStates;
        }
		else if (countryName == "Turkey") {
            String[] turkeyStates = {
                "Adana","Adiyaman","Afyonkarahisar","Agri","Aksaray","Amasya","Ankara",
                "Antalya","Ardahan","Artvin","Aydin","Balikesir","Bartin","Batman","Bayburt"
            };
            return turkeyStates;
        }

        else if (countryName == "Iran") {
            String[] iranStates = {
                "Alborz","Ardabil","Bushehr","Chaharmahal and Bakhtiari","East Azerbaijan","Esfahan","Fars",
                "Gilan","Golestan","Hamadan","Hormozgan","Ilam","Kerman","Kermanshah","Khuzestan"
            };
            return iranStates;
        }

        else if (countryName == "Thailand") {
            String[] thailandStates = {
                "Bangkok","Chiang Mai","Chiang Rai","Chonburi","Khon Kaen","Krabi","Lampang",
                "Lamphun","Loei","Mae Hong Son","Maha Sarakham","Nakhon Nayok","Nakhon Pathom","Nakhon Ratchasima","Nakhon Si Thammarat"
            };
            return thailandStates;
        }

        

        else if (countryName == "South Korea") {
            String[] skoreaStates = {
                "Busan","Daegu","Daejeon","Gwangju","Incheon","Seoul","Ulsan","Gyeonggi","Gangwon","North Chungcheong","South Chungcheong","North Jeolla","South Jeolla","North Gyeongsang","South Gyeongsang","Jeju"
            };
            return skoreaStates;
        }

        else if (countryName == "Philippines") {
            String[] philippineStates = {
                "Abra","Agusan del Norte","Agusan del Sur","Aklan","Albay","Antique","Apayao","Aurora","Basilan","Bataan","Batanes","Batangas","Benguet","Biliran","Bohol"
            };
            return philippineStates;
        }

        else if (countryName == "Malaysia") {
            String[] malaysiaStates = {
                "Johor","Kedah","Kelantan","Melaka","Negeri Sembilan","Pahang","Penang","Perak","Perlis","Sabah","Sarawak","Selangor","Terengganu","Kuala Lumpur","Labuan","Putrajaya"
            };
            return malaysiaStates;
        }

        else if (countryName == "Singapore") {
            String[] singaporeStates = {
                "Central Singapore","East Singapore","North Singapore","North-East Singapore","West Singapore"
            };
            return singaporeStates;
        }

        else if (countryName == "New Zealand") {
            String[] nzStates = {
                "Auckland","Bay of Plenty","Canterbury","Gisborne","Hawke's Bay","Manawatu-Wanganui","Marlborough",
                "Nelson","Northland","Otago","Southland","Taranaki","Tasman","Waikato","Wellington","West Coast"
            };
            return nzStates;
        }

        else if (countryName == "Norway") {
            String[] norwayStates = {
                "Agder","Innlandet","Møre og Romsdal","Nordland","Oslo","Rogaland","Troms og Finnmark","Trøndelag","Vestfold og Telemark","Vestland","Viken"
            };
            return norwayStates;
        }

        else if (countryName == "Sweden") {
            String[] swedenStates = {
                "Blekinge","Dalarna","Gotland","Gävleborg","Halland","Jämtland","Jönköping","Kalmar","Kronoberg","Norrbotten","Skåne","Stockholm","Södermanland","Uppsala","Värmland","Västerbotten","Västernorrland","Västmanland","Västra Götaland","Örebro","Östergötland"
            };
            return swedenStates;
        }

        else if (countryName == "Finland") {
            String[] finlandStates = {
                "Åland Islands","Central Finland","Central Ostrobothnia","Kainuu","Kanta-Häme","Lapland","North Karelia","Northern Ostrobothnia","Northern Savonia","Ostrobothnia","Päijät-Häme","Satakunta","South Karelia","Southern Ostrobothnia","Southern Savonia","Tavastia Proper","Uusimaa","Varsinais-Suomi"
            };
            return finlandStates;
        }

        else if (countryName == "Denmark") {
            String[] denmarkStates = {
                "Capital Region","Central Denmark Region","North Denmark Region","Region of Southern Denmark","Region Zealand"
            };
            return denmarkStates;
        }

        else if (countryName == "Netherlands") {
            String[] netherlandsStates = {
                "Drenthe","Flevoland","Friesland","Gelderland","Groningen","Limburg","North Brabant","North Holland","Overijssel","South Holland","Utrecht","Zeeland"
            };
            return netherlandsStates;
        }

        else if (countryName == "Belgium") {
            String[] belgiumStates = {
                "Antwerp","Brussels","East Flanders","Flemish Brabant","Hainaut","Liège","Limburg","Luxembourg","Namur","Walloon Brabant","West Flanders"
            };
            return belgiumStates;
        }

        else if (countryName == "Switzerland") {
            String[] switzerlandStates = {
                "Aargau","Appenzell Ausserrhoden","Appenzell Innerrhoden","Basel-Landschaft","Basel-Stadt",
                "Bern","Fribourg","Geneva","Glarus","Graubünden","Jura","Lucerne","Neuchâtel","Nidwalden","Obwalden","Schaffhausen","Schwyz","Solothurn","St. Gallen","Thurgau","Ticino","Uri","Valais","Vaud","Zug","Zurich"
            };
            return switzerlandStates;
        }
		else if (countryName == "Austria") {
            String[] austriaStates = {
                "Burgenland","Carinthia","Lower Austria","Salzburg","Styria","Tyrol","Upper Austria","Vienna","Vorarlberg"
            };
            return austriaStates;
        }

        else if (countryName == "Poland") {
            String[] polandStates = {
                "Greater Poland","Kuyavian-Pomeranian","Lesser Poland","Lodz","Lower Silesian","Lublin","Lubusz",
                "Masovian","Opole","Podlaskie","Pomeranian","Silesian","Subcarpathian","Swietokrzyskie","Warmian-Masurian",
                "West Pomeranian"
            };
            return polandStates;
        }

        else if (countryName == "Portugal") {
            String[] portugalStates = {
                "Aveiro","Beja","Braga","Bragança","Castelo Branco","Coimbra","Évora","Faro","Guarda","Leiria",
                "Lisbon","Portalegre","Porto","Santarém","Setúbal","Viana do Castelo","Vila Real","Viseu"
            };
            return portugalStates;
        }

        else if (countryName == "Greece") {
            String[] greeceStates = {
                "Achaea","Aetolia-Acarnania","Argolis","Arta","Attica","Chania","Corfu","Cyclades","Drama","Euboea",
                "Evros","Heraklion","Imathia","Ioannina","Karditsa","Kastoria","Kavala","Kefalonia","Kilkis","Kozani"
            };
            return greeceStates;
        }

        else if (countryName == "Ireland") {
            String[] irelandStates = {
                "Carlow","Cavan","Clare","Cork","Donegal","Dublin","Galway","Kerry","Kildare","Kilkenny",
                "Laois","Leitrim","Limerick","Longford","Louth","Mayo","Meath","Monaghan","Offaly","Roscommon",
                "Sligo","Tipperary","Waterford","Westmeath","Wexford","Wicklow"
            };
            return irelandStates;
        }

        else if (countryName == "Iceland") {
            String[] icelandStates = {
                "Capital Region","Southern Peninsula","Westfjords","West","North","East","South"
            };
            return icelandStates;
        }

        else if (countryName == "Czech Republic") {
            String[] czechStates = {
                "Prague","Central Bohemian","South Bohemian","Plzen","Karlovy Vary","Usti nad Labem","Liberec",
                "Hradec Kralove","Pardubice","Vysocina","South Moravian","Olomouc","Zlin","Moravian-Silesian"
            };
            return czechStates;
        }

        else if (countryName == "Slovakia") {
            String[] slovakiaStates = {
                "Bratislava","Trnava","Trencin","Nitra","Zilina","Banska Bystrica","Presov","Kosice"
            };
            return slovakiaStates;
        }

        else if (countryName == "Hungary") {
            String[] hungaryStates = {
                "Baranya","Bacs-Kiskun","Bekes","Borsod-Abauj-Zemplen","Budapest","Csongrad","Fejer","Gyor-Moson-Sopron",
                "Hajdu-Bihar","Heves","Jasz-Nagykun-Szolnok","Komarom-Esztergom","Nograd","Pest","Somogy","Szabolcs-Szatmar-Bereg",
                "Tolna","Vas","Veszprem","Zala"
            };
            return hungaryStates;
        }

        else if (countryName == "Romania") {
            String[] romaniaStates = {
                "Alba","Arad","Arges","Bacau","Bihor","Bistrita-Nasaud","Botosani","Braila","Brasov","Bucuresti",
                "Buzau","Caras-Severin","Calarasi","Cluj","Constanta","Covasna","Dambovita","Dolj","Galati","Giurgiu"
            };
            return romaniaStates;
        }

        else if (countryName == "Bulgaria") {
            String[] bulgariaStates = {
                "Blagoevgrad","Burgas","Varna","Veliko Tarnovo","Vidin","Vratsa","Gabrovo","Dobrich","Kardzhali","Kyustendil",
                "Lovech","Montana","Pazardzhik","Pernik","Pleven","Plovdiv","Razgrad","Ruse","Silistra","Sliven"
            };
            return bulgariaStates;
        }

        else if (countryName == "Croatia") {
            String[] croatiaStates = {
                "Bjelovar-Bilogora","Brodsko-Posavska","Dubrovnik-Neretva","Istra","Karlovac","Koprivnica-Krizhevci",
                "Krapina-Zagorje","Lika-Senj","Medimurje","Osijek-Baranja","Pozega-Slavonia","Primorje-Gorski Kotar",
                "Sibenik-Knin","Sisak-Moslavina","Split-Dalmatia","Varazdin","Virovitica-Podravina","Vukovar-Srijem","Zadar","Zagreb"
            };
            return croatiaStates;
        }

        else if (countryName == "Slovenia") {
            String[] sloveniaStates = {
                "Ajdovscina","Bled","Bohinj","Borovnica","Bovec","Brezice","Celje","Cerklje na Gorenjskem","Cerknica","Cerkno",
                "Crnomelj","Domzale","Dravograd","Gornja Radgona","Gornji Grad","Grosuplje","Hrastnik","Hrpelje-Kozina","Idrija","Ig"
            };
            return sloveniaStates;
        }

        else if (countryName == "Estonia") {
            String[] estoniaStates = {
                "Harju","Hiiu","Ida-Viru","Jõgeva","Järva","Lääne","Lääne-Viru","Põlva","Pärnu","Rapla",
                "Saare","Tartu","Valga","Viljandi","Võru"
            };
            return estoniaStates;
        }

        else if (countryName == "Latvia") {
            String[] latviaStates = {
                "Kurzeme","Latgale","Riga","Vidzeme","Zemgale"
            };
            return latviaStates;
        }

        else if (countryName == "Lithuania") {
            String[] lithuaniaStates = {
                "Alytus","Kaunas","Klaipeda","Marijampole","Panevezys","Siauliai","Taurage","Telsiai","Utena","Vilnius"
            };
            return lithuaniaStates;
        }

        else if (countryName == "Belarus") {
            String[] belarusStates = {
                "Brest","Gomel","Grodno","Minsk","Mogilev","Vitebsk"
            };
            return belarusStates;
        }

        else if (countryName == "Ukraine") {
            String[] ukraineStates = {
                "Cherkasy","Chernihiv","Chernivtsi","Dnipropetrovsk","Donetsk","Ivano-Frankivsk","Kharkiv",
                "Kherson","Khmelnytskyi","Kirovohrad","Krym","Kiev","Kirovohrad","Luhansk","Lviv","Mykolaiv",
                "Odessa","Poltava","Rivne","Sumy","Ternopil","Vinnytsia","Volyn","Zakarpattia","Zaporizhia","Zhytomyr"
            };
            return ukraineStates;
        }

        else if (countryName == "Belize") {
            String[] belizeStates = {
                "Belize","Cayo","Corozal","Orange Walk","Stann Creek","Toledo"
            };
            return belizeStates;
        }

        else if (countryName == "Costa Rica") {
            String[] costaRicaStates = {
                "Alajuela","Cartago","Guanacaste","Heredia","Limon","Puntarenas","San Jose"
            };
            return costaRicaStates;
        }

        else if (countryName == "Panama") {
            String[] panamaStates = {
                "Bocas del Toro","Chiriqui","Cocle","Colon","Darien","Herrera","Los Santos","Panama","Veraguas","San Blas"
            };
            return panamaStates;
        }

        else if (countryName == "Colombia") {
            String[] colombiaStates = {
                "Amazonas","Antioquia","Arauca","Atlantico","Bolivar","Boyaca","Caldas","Caqueta","Casanare","Cauca",
                "Cesar","Choco","Cordoba","Cundinamarca","Guainia","Guaviare","Huila","La Guajira","Magdalena","Meta"
            };
            return colombiaStates;
        }
		else if (countryName == "Chile") {
            String[] chileStates = {
                "Arica y Parinacota","Tarapacá","Antofagasta","Atacama","Coquimbo",
                "Valparaíso","Metropolitana","O’Higgins","Maule","Ñuble","Biobío","Araucanía",
                "Los Ríos","Los Lagos","Aysén","Magallanes"
            };
            return chileStates;
        }

        else if (countryName == "Peru") {
            String[] peruStates = {
                "Amazonas","Ancash","Apurímac","Arequipa","Ayacucho","Cajamarca","Callao",
                "Cusco","Huancavelica","Huánuco","Ica","Junín","La Libertad","Lambayeque",
                "Lima","Loreto","Madre de Dios","Moquegua","Pasco","Piura","Puno","San Martín",
                "Tacna","Tumbes","Ucayali"
            };
            return peruStates;
        }

        else if (countryName == "Venezuela") {
            String[] venezuelaStates = {
                "Amazonas","Anzoátegui","Apure","Aragua","Barinas","Bolívar","Carabobo","Cojedes",
                "Delta Amacuro","Falcón","Guárico","Lara","Mérida","Miranda","Monagas","Nueva Esparta",
                "Portuguesa","Sucre","Táchira","Trujillo","Vargas","Yaracuy","Zulia","Capital District"
            };
            return venezuelaStates;
        }

        else if (countryName == "Ecuador") {
            String[] ecuadorStates = {
                "Azuay","Bolívar","Cañar","Carchi","Chimborazo","Cotopaxi","El Oro","Esmeraldas",
                "Galápagos","Guayas","Imbabura","Loja","Los Ríos","Manabí","Morona Santiago","Napo",
                "Orellana","Pastaza","Pichincha","Santa Elena","Santo Domingo de los Tsáchilas","Sucumbíos","Tungurahua","Zamora-Chinchipe"
            };
            return ecuadorStates;
        }

        else if (countryName == "Bolivia") {
            String[] boliviaStates = {
                "Chuquisaca","La Paz","Cochabamba","Oruro","Potosí","Santa Cruz","Beni","Pando"
            };
            return boliviaStates;
        }

        else if (countryName == "Paraguay") {
            String[] paraguayStates = {
                "Alto Paraná","Amambay","Asunción","Boquerón","Caaguazú","Caazapá","Canindeyú","Central",
                "Concepción","Cordillera","Guairá","Itapúa","Misiones","Neembucú","Paraguarí","Presidente Hayes","San Pedro"
            };
            return paraguayStates;
        }

        else if (countryName == "Uruguay") {
            String[] uruguayStates = {
                "Artigas","Canelones","Cerro Largo","Colonia","Durazno","Flores","Florida","Lavalleja",
                "Maldonado","Montevideo","Paysandú","Río Negro","Rivera","Rocha","Salto","San José",
                "Soriano","Tacuarembó","Treinta y Tres"
            };
            return uruguayStates;
        }

        else if (countryName == "Morocco") {
            String[] moroccoStates = {
                "Casablanca-Settat","Marrakesh-Safi","Rabat-Salé-Kénitra","Fès-Meknès","Tanger-Tetouan-Al Hoceima",
                "Souss-Massa","Béni Mellal-Khénifra","Oriental","Drâa-Tafilalet","Guelmim-Oued Noun","Laâyoune-Sakia El Hamra",
                "Dakhla-Oued Ed-Dahab"
            };
            return moroccoStates;
        }

        else if (countryName == "Algeria") {
            String[] algeriaStates = {
                "Adrar","Chlef","Laghouat","Oum El Bouaghi","Batna","Béjaïa","Biskra","Béchar","Blida","Bouira",
                "Tamanrasset","Tébessa","Tlemcen","Tiaret","Tizi Ouzou","Algiers","Djelfa","Jijel","Sétif","Saïda",
                "Skikda","Sidi Bel Abbès","Annaba","Guelma","Constantine","Médéa","Mostaganem","M'Sila","Mascara","Ouargla",
                "Oran","El Bayadh","Illizi","Bordj Bou Arreridj","Boumerdès","El Tarf","Tindouf","Tissemsilt","El Oued","Khenchela",
                "Souk Ahras","Tipaza","Mila","Aïn Defla","Naama","Aïn Témouchent","Ghardaïa","Relizane"
            };
            return algeriaStates;
        }

        else if (countryName == "Tunisia") {
            String[] tunisiaStates = {
                "Ariana","Beja","Ben Arous","Bizerte","Gabes","Gafsa","Jendouba","Kairouan",
                "Kasserine","Kebili","Kef","Mahdia","Manouba","Medenine","Monastir","Nabeul",
                "Sfax","Sidi Bouzid","Siliana","Sousse","Tataouine","Tozeur","Tunis","Zaghouan"
            };
            return tunisiaStates;
        }

        else if (countryName == "Libya") {
            String[] libyaStates = {
                "Tripoli","Benghazi","Misrata","Al Jufrah","Al Kufrah","Ajdabiya","Al Marj","Al Wahat","Benghazi","Zawiya"
            };
            return libyaStates;
        }

        else if (countryName == "Sudan") {
            String[] sudanStates = {
                "Khartoum","North Darfur","South Darfur","West Darfur","East Darfur","North Kordofan","South Kordofan",
                "West Kordofan","Blue Nile","White Nile","Northern","River Nile","Gezira","Sennar","Red Sea"
            };
            return sudanStates;
        }

        else if (countryName == "Ethiopia") {
            String[] ethiopiaStates = {
                "Addis Ababa","Afar","Amhara","Benishangul-Gumuz","Dire Dawa","Gambela","Harari","Oromia","Sidama","Somali","Southern Nations, Nationalities, and Peoples' Region","Tigray"
            };
            return ethiopiaStates;
        }

        else if (countryName == "Kenya") {
            String[] kenyaStates = {
                "Mombasa","Kwale","Kilifi","Tana River","Lamu","Taita-Taveta","Garissa","Wajir","Mandera","Marsabit",
                "Isiolo","Meru","Tharaka-Nithi","Embu","Kitui","Machakos","Makueni","Nyandarua","Nyeri","Kirinyaga",
                "Murang'a","Kiambu","Turkana","West Pokot","Samburu","Trans-Nzoia","Uasin Gishu","Elgeyo-Marakwet","Nandi","Baringo",
                "Laikipia","Nakuru","Narok","Kajiado","Kericho","Bomet","Kakamega","Vihiga","Bungoma","Busia"
            };
            return kenyaStates;
        }

        else if (countryName == "Tanzania") {
            String[] tanzaniaStates = {
                "Arusha","Dar es Salaam","Dodoma","Geita","Iringa","Kagera","Katavi","Kigoma","Kilimanjaro","Lindi",
                "Manyara","Mara","Mbeya","Morogoro","Mtwara","Mwanza","Njombe","Pemba North","Pemba South","Pwani",
                "Rukwa","Ruvuma","Shinyanga","Simiyu","Singida","Tabora","Tanga","Zanzibar North","Zanzibar South"
            };
            return tanzaniaStates;
        }

        else if (countryName == "Uganda") {
            String[] ugandaStates = {
                "Central","Eastern","Northern","Western"
            };
            return ugandaStates;
        }

        else if (countryName == "Ghana") {
            String[] ghanaStates = {
                "Ahafo","Ashanti","Bono","Bono East","Central","Eastern","Greater Accra","North East","Northern",
                "Oti","Savannah","Upper East","Upper West","Volta","Western","Western North"
            };
            return ghanaStates;
        }
		

        else if (countryName == "Cameroon") {
            String[] cameroonStates = {
                "Adamawa","Centre","East","Far North","Littoral","North","North-West","South","South-West","West"
            };
            return cameroonStates;
        }

        else if (countryName == "Ivory Coast") {
            String[] ivoryCoastStates = {
                "Abidjan","Bas-Sassandra","Comoé","Denguélé","Dix-Huit Montagnes","Fromager","Haut-Sassandra","Lacs",
                "Lagunes","Montagnes","Sassandra-Marahoué","Savanes","Vallée du Bandama","Woroba","Yamoussoukro","Zanzan"
            };
            return ivoryCoastStates;
        }

        else if (countryName == "Senegal") {
            String[] senegalStates = {
                "Dakar","Diourbel","Fatick","Kaolack","Kédougou","Kolda","Louga","Matam","Saint-Louis","Sédhiou","Tambacounda","Thiès","Ziguinchor"
            };
            return senegalStates;
        }

        else if (countryName == "Mali") {
            String[] maliStates = {
                "Bamako","Gao","Kayes","Kidal","Koulikoro","Mopti","Segou","Sikasso","Tombouctou"
            };
            return maliStates;
        }

        else if (countryName == "Burkina Faso") {
            String[] burkinaStates = {
                "Boucle du Mouhoun","Cascades","Centre","Centre-Est","Centre-Nord","Centre-Ouest","Centre-Sud",
                "Est","Hauts-Bassins","Nord","Plateau-Central","Sahel","Sud-Ouest"
            };
            return burkinaStates;
        }

        else if (countryName == "Niger") {
            String[] nigerStates = {
                "Agadez","Diffa","Dosso","Maradi","Niamey","Tahoua","Tillabéri","Zinder"
            };
            return nigerStates;
        }
		
		
		else if (countryName == "Pakistan") {
            String[] pakistanStates = {
                "Punjab","Sindh","Khyber Pakhtunkhwa","Balochistan","Islamabad Capital Territory","Gilgit-Baltistan","Azad Jammu and Kashmir"
            };
            return pakistanStates;
        }

        else if (countryName == "Bangladesh") {
            String[] bangladeshStates = {
                "Dhaka","Chattogram","Khulna","Rajshahi","Barishal","Sylhet","Mymensingh","Rangpur"
            };
            return bangladeshStates;
        }

        else if (countryName == "Indonesia") {
            String[] indonesiaStates = {
                "Aceh","Bali","Banten","Bengkulu","Central Java","Central Kalimantan","Central Sulawesi","East Java",
                "East Kalimantan","East Nusa Tenggara","Gorontalo","Jakarta","Jambi","Lampung","Maluku"
            };
            return indonesiaStates;
        }

        else if (countryName == "Vietnam") {
            String[] vietnamStates = {
                "An Giang","Ba Ria-Vung Tau","Bac Giang","Bac Kan","Bac Lieu","Bac Ninh","Ben Tre","Binh Dinh","Binh Duong","Binh Phuoc"
            };
            return vietnamStates;
        }
		
		else if (countryName == "Albania") {
            String[] albaniaStates = {
                "Berat","Dibër","Durrës","Elbasan","Fier","Gjirokastër","Korçë","Kukës","Lezhë","Shkodër","Tirana","Vlorë"
            };
            return albaniaStates;
        }
		
		else if (countryName == "Andorra") {
            String[] andorraStates = {
                "Andorra","Canillo","Encamp","Escaldes-Engordany","La Massana","Ordino","Sant Julià de Lòria"
            };
            return andorraStates;
        }
		
		else if (countryName == "Armenia") {
            String[] armeniaStates = {
                "Aragatsotn","Ararat","Armavir","Gegharkunik","Kotayk","Lori","Shirak","Syunik","Tavush","Vayots Dzor","Yerevan"
            };
            return armeniaStates;
        }
		
		else if (countryName == "Azerbaijan") {
            String[] azerbaijanStates = {
                "Absheron","Aran","Daglig Shirvan","Ganja-Gazakh","Karabakh","Lankaran","Quba-Khachmaz","Sheki-zagatala","Baku","Nakhchivan"
            };
            return azerbaijanStates;
        }
		
		else if (countryName == "Bosnia and Herzegovina") {
			String[] bosniaAndHerzegovinaStates = {
				"Federation of Bosnia and Herzegovina", "Republika Srpska", "Brčko District"
			};
		return bosniaAndHerzegovinaStates;
		}

		else if (countryName == "Cyprus") {
		String[] states = {"Nicosia","Limassol","Larnaca","Paphos","Famagusta"};
		return states;
		}
		else if (countryName == "Georgia") {
		String[] states = {"Abkhazia","Adjara","Guria","Imereti","Kakheti","Kvemo Kartli","Mtskheta-Mtianeti","Racha-Lechkhumi","Samegrelo","Samtskhe-Javakheti","Shida Kartli","Tbilisi"};
		return states;
		}
		else if (countryName == "Kosovo") {
		String[] states = {"Pristina","Prizren","Peja","Mitrovica","Gjakova","Gjilan","Ferizaj"};
		return states;
		}
		else if (countryName == "Liechtenstein") {
		String[] states = {"Balzers","Eschen","Gamprin","Mauren","Planken","Ruggell","Schaan","Schellenberg","Triesen","Triesenberg","Vaduz"};
		return states;
		}
		else if (countryName == "Luxembourg") {
		String[] states = {"Diekirch","Grevenmacher","Luxembourg"};
		return states;
		}
		else if (countryName == "Malta") {
		String[] states = {"Gozo","Northern Harbour","Southern Harbour","South Eastern","Western","Northern"};
		return states;
		}
		else if (countryName == "Moldova") {
		String[] states = {"Chisinau","Balti","Gagauzia","Transnistria","Cahul","Orhei","Soroca"};
		return states;
		}
	else if (countryName == "Monaco") {
    String[] states = {"Monte Carlo","La Condamine","Fontvieille","Moneghetti"};
    return states;
	}
	else if (countryName == "Montenegro") {
    String[] states = {"Podgorica","Niksic","Budva","Herceg Novi","Pljevlja","Bar"};
    return states;
	}
	else if (countryName == "North Macedonia") {
    String[] states = {"Skopje","Bitola","Kumanovo","Tetovo","Ohrid","Prilep"};
    return states;
	}
	else if (countryName == "San Marino") {
    String[] states = {"Acquaviva","Borgo Maggiore","Domagnano","Faetano","Fiorentino","Montegiardino","San Marino","Serravalle","Chiesanuova"};
    return states;
	}
	else if (countryName == "Serbia") {
    String[] states = {"Belgrade","Vojvodina","Sumadija","Southern Serbia","Eastern Serbia","Western Serbia"};
    return states;
	}
	else if (countryName == "Vatican City") {
    String[] states = {"Vatican City"};
    return states;
	}
	
	else if (countryName == "Afghanistan") {
    String[] states = {"Kabul","Herat","Kandahar","Balkh","Nangarhar","Badakhshan"};
    return states;
	}
	else if (countryName == "Bahrain") {
    String[] states = {"Capital","Muharraq","Northern","Southern"};
    return states;
	}
	else if (countryName == "Bhutan") {
    String[] states = {"Thimphu","Paro","Punakha","Chukha","Wangdue Phodrang"};
    return states;
	}
	else if (countryName == "Brunei") {
    String[] states = {"Brunei-Muara","Belait","Tutong","Temburong"};
    return states;
	}
	else if (countryName == "Cambodia") {
    String[] states = {"Phnom Penh","Siem Reap","Battambang","Kampong Cham","Sihanoukville"};
    return states;
	}
	else if (countryName == "Iraq") {
    String[] states = {"Baghdad","Basra","Erbil","Sulaymaniyah","Dohuk","Najaf","Karbala"};
    return states;
	}
	else if (countryName == "Israel") {
    String[] states = {"Jerusalem","Tel Aviv","Haifa","Northern","Southern","Central"};
    return states;
	}
	else if (countryName == "Jordan") {
    String[] states = {"Amman","Irbid","Zarqa","Aqaba","Mafraq","Karak"};
    return states;
	}
	else if (countryName == "Kazakhstan") {
    String[] states = {"Almaty","Astana","Shymkent","Atyrau","Aktobe","Karaganda"};
    return states;
	}
	else if (countryName == "Kuwait") {
    String[] states = {"Al Asimah","Hawalli","Farwaniya","Jahra","Ahmadi","Mubarak Al-Kabeer"};
    return states;
	}
	else if (countryName == "Kyrgyzstan") {
    String[] states = {"Bishkek","Osh","Chuy","Jalal-Abad","Naryn","Issyk-Kul","Talas","Batken"};
    return states;
	}
	else if (countryName == "Laos") {
    String[] states = {"Vientiane","Luang Prabang","Savannakhet","Champasak","Xieng Khouang"};
    return states;
	}
	else if (countryName == "Lebanon") {
    String[] states = {"Beirut","Mount Lebanon","North","South","Bekaa","Nabatieh"};
    return states;
	}
	else if (countryName == "Maldives") {
    String[] states = {"Male","Addu","Haa Alif","Haa Dhaalu","Laamu"};
    return states;
	}
	else if (countryName == "Mongolia") {
    String[] states = {"Ulaanbaatar","Arkhangai","Bayan-Ulgii","Dornod","Gobi-Altai"};
    return states;
	}
	else if (countryName == "Myanmar") {
    String[] states = {"Yangon","Mandalay","Shan","Kachin","Kayin","Mon","Rakhine"};
    return states;
	}
	else if (countryName == "Nepal") {
    String[] states = {"Koshi","Madhesh","Bagmati","Gandaki","Lumbini","Karnali","Sudurpashchim"};
    return states;
	}
	else if (countryName == "North Korea") {
    String[] states = {"Pyongyang","South Pyongan","North Hamgyong","South Hamgyong","Kangwon"};
    return states;
	}
	else if (countryName == "Oman") {
    String[] states = {"Muscat","Dhofar","Al Batinah","Ad Dakhiliyah","Ash Sharqiyah"};
    return states;
	}
	else if (countryName == "Qatar") {
    String[] states = {"Doha","Al Rayyan","Al Wakrah","Al Khor","Umm Salal"};
    return states;
	}
	else if (countryName == "Sri Lanka") {
    String[] states = {"Western","Central","Southern","Northern","Eastern","North Western","Uva","Sabaragamuwa"};
    return states;
	}
	else if (countryName == "Syria") {
    String[] states = {"Damascus","Aleppo","Homs","Hama","Latakia","Idlib","Deir ez-Zor"};
    return states;
	}
	else if (countryName == "Tajikistan") {
    String[] states = {"Dushanbe","Sughd","Khatlon","Gorno-Badakhshan"};
    return states;
	}
	else if (countryName == "Timor-Leste") {
    String[] states = {"Dili","Baucau","Bobonaro","Covalima","Liquica"};
    return states;
	}
	else if (countryName == "Turkmenistan") {
    String[] states = {"Ashgabat","Ahal","Balkan","Dashoguz","Lebap","Mary"};
    return states;
	}
	else if (countryName == "United Arab Emirates") {
    String[] states = {"Abu Dhabi","Dubai","Sharjah","Ajman","Fujairah","Ras Al Khaimah","Umm Al Quwain"};
    return states;
	}
	else if (countryName == "Uzbekistan") {
    String[] states = {"Tashkent","Samarkand","Bukhara","Andijan","Fergana","Namangan","Karakalpakstan"};
    return states;
	}
	else if (countryName == "Yemen") {
    String[] states = {"Sanaa","Aden","Hadramaut","Taiz","Al Hudaydah"};
    return states;
	}

	else if (countryName == "Angola") {
    String[] states = {"Luanda","Benguela","Huambo","Huila","Malanje","Uige"};
    return states;
	}
	else if (countryName == "Benin") {
    String[] states = {"Cotonou","Porto-Novo","Atlantique","Borgou","Mono","Zou"};
    return states;
	}
	else if (countryName == "Botswana") {
    String[] states = {"Gaborone","Central","Kweneng","Ngamiland","Southern"};
    return states;
	}
	else if (countryName == "Burundi") {
    String[] states = {"Gitega","Bujumbura","Ngozi","Kirundo","Muyinga"};
    return states;
	}
	else if (countryName == "Cape Verde") {
    String[] states = {"Santiago","Sao Vicente","Sal","Boa Vista","Fogo"};
    return states;
	}
	else if (countryName == "Central African Republic") {
    String[] states = {"Bangui","Ouham","Lobaye","Vakaga","Mbomou"};
    return states;
	}
	else if (countryName == "Chad") {
    String[] states = {"N'Djamena","Chari-Baguirmi","Logone Occidental","Ouaddai","Kanem"};
    return states;
	}
	else if (countryName == "Comoros") {
    String[] states = {"Grande Comore","Anjouan","Moheli"};
    return states;
	}
	else if (countryName == "Republic of the Congo") {
    String[] states = {"Brazzaville","Pointe-Noire","Kouilou","Niari","Plateaux"};
    return states;
	}
	else if (countryName == "Democratic Republic of the Congo") {
    String[] states = {"Kinshasa","Katanga","Kasai","Kivu","Orientale","Equateur"};
    return states;
	}
	else if (countryName == "Djibouti") {
    String[] states = {"Djibouti","Ali Sabieh","Dikhil","Tadjourah","Obock"};
    return states;
	}
	else if (countryName == "Equatorial Guinea") {
    String[] states = {"Malabo","Bata","Bioko Norte","Bioko Sur","Centro Sur"};
    return states;
	}
	else if (countryName == "Eritrea") {
    String[] states = {"Asmara","Anseba","Gash-Barka","Debub","Northern Red Sea"};
    return states;
	}
	else if (countryName == "Eswatini") {
    String[] states = {"Hhohho","Manzini","Lubombo","Shiselweni"};
    return states;
	}
	else if (countryName == "Gabon") {
    String[] states = {"Libreville","Estuaire","Haut-Ogooue","Ogooue-Maritime","Ngounie"};
    return states;
	}
	else if (countryName == "Gambia") {
    String[] states = {"Banjul","Kanifing","West Coast","North Bank","Upper River"};
    return states;
	}
	else if (countryName == "Guinea") {
    String[] states = {"Conakry","Boke","Kindia","Labe","Nzerekore"};
    return states;
	}
	else if (countryName == "Guinea-Bissau") {
    String[] states = {"Bissau","Bafata","Cacheu","Gabu","Oio"};
    return states;
	}
	else if (countryName == "Lesotho") {
		String[] states = {"Maseru","Berea","Leribe","Mafeteng","Mohale's Hoek"};
		return states;
	}
	else if (countryName == "Liberia") {
		String[] states = {"Monrovia","Montserrado","Bong","Nimba","Grand Bassa"};
		return states;
	}
	else if (countryName == "Madagascar") {
		String[] states = {"Antananarivo","Toamasina","Fianarantsoa","Mahajanga","Toliara","Antsiranana"};
		return states;
	}
	else if (countryName == "Malawi") {
		String[] states = {"Lilongwe","Blantyre","Mzuzu","Central","Northern","Southern"};
		return states;
	}
	else if (countryName == "Mauritania") {
		String[] states = {"Nouakchott","Adrar","Brakna","Hodh El Gharbi","Trarza"};
		return states;
	}
	else if (countryName == "Mauritius") {
		String[] states = {"Port Louis","Plaines Wilhems","Moka","Flacq","Grand Port"};
		return states;
	}
	else if (countryName == "Mozambique") {
		String[] states = {"Maputo","Gaza","Sofala","Manica","Zambezia","Nampula"};
		return states;
	}
	else if (countryName == "Namibia") {
		String[] states = {"Windhoek","Khomas","Oshana","Erongo","Otjozondjupa"};
		return states;
	}
	else if (countryName == "Rwanda") {
		String[] states = {"Kigali","Northern","Southern","Eastern","Western"};
		return states;
	}
	else if (countryName == "Sao Tome and Principe") {
		String[] states = {"Sao Tome","Principe"};
		return states;
	}
	else if (countryName == "Seychelles") {
		String[] states = {"Mahe","Praslin","La Digue"};
		return states;
	}
	else if (countryName == "Sierra Leone") {
		String[] states = {"Freetown","Northern","Southern","Eastern","Western Area"};
		return states;
	}
	else if (countryName == "Somalia") {
		String[] states = {"Mogadishu","Puntland","Somaliland","Jubaland","Galmudug"};
		return states;
	}
	else if (countryName == "South Sudan") {
		String[] states = {"Juba","Central Equatoria","Upper Nile","Unity","Jonglei"};
		return states;
	}
	else if (countryName == "Togo") {
		String[] states = {"Lome","Maritime","Plateaux","Centrale","Kara","Savanes"};
		return states;
	}
	else if (countryName == "Zambia") {
		String[] states = {"Lusaka","Copperbelt","Central","Eastern","Northern","Southern"};
		return states;
	}
	else if (countryName == "Zimbabwe") {
		String[] states = {"Harare","Bulawayo","Manicaland","Mashonaland","Matabeleland"};
		return states;
	}

	else if (countryName == "Antigua and Barbuda") {
		String[] states = {"Saint John","Saint George","Saint Mary","Saint Paul"};
		return states;
	}
	else if (countryName == "Bahamas") {
		String[] states = {"Nassau","Freeport","Abaco","Andros","Eleuthera"};
		return states;
	}
	else if (countryName == "Barbados") {
		String[] states = {"Christ Church","Saint Michael","Saint James","Saint Philip"};
		return states;
	}
	else if (countryName == "Cuba") {
		String[] states = {"Havana","Santiago de Cuba","Camaguey","Holguin","Matanzas"};
		return states;
	}
	else if (countryName == "Dominica") {
		String[] states = {"Roseau","Saint Andrew","Saint George","Saint Peter"};
		return states;
	}
	else if (countryName == "Dominican Republic") {
		String[] states = {"Santo Domingo","Santiago","La Vega","San Cristobal","La Romana"};
		return states;
	}
	else if (countryName == "El Salvador") {
		String[] states = {"San Salvador","Santa Ana","San Miguel","La Libertad","Sonsonate"};
		return states;
	}
	else if (countryName == "Grenada") {
		String[] states = {"Saint George","Saint Andrew","Saint David","Saint Patrick"};
		return states;
	}
	else if (countryName == "Guatemala") {
		String[] states = {"Guatemala City","Alta Verapaz","Quetzaltenango","Escuintla","Huehuetenango"};
		return states;
	}
	else if (countryName == "Haiti") {
		String[] states = {"Port-au-Prince","Ouest","Artibonite","Nord","Sud"};
		return states;
	}
	else if (countryName == "Honduras") {
		String[] states = {"Tegucigalpa","Cortes","Atlantida","Choluteca","Yoro"};
		return states;
	}
	else if (countryName == "Jamaica") {
		String[] states = {"Kingston","Saint Andrew","Saint James","Saint Catherine"};
		return states;
	}
	else if (countryName == "Nicaragua") {
		String[] states = {"Managua","Leon","Chinandega","Masaya","Matagalpa"};
		return states;
	}
	else if (countryName == "Saint Kitts and Nevis") {
		String[] states = {"Saint Kitts","Nevis"};
		return states;
	}
	else if (countryName == "Saint Lucia") {
		String[] states = {"Castries","Gros Islet","Soufriere","Vieux Fort"};
		return states;
	}
	else if (countryName == "Saint Vincent and the Grenadines") {
		String[] states = {"Kingstown","Grenadines","Charlotte","Saint Andrew"};
		return states;
	}
	else if (countryName == "Trinidad and Tobago") {
		String[] states = {"Port of Spain","San Fernando","Tobago","Chaguanas"};
		return states;
	}
	else if (countryName == "Fiji") {
		String[] states = {"Central","Western","Northern","Eastern","Rotuma"};
		return states;
	}
	else if (countryName == "Kiribati") {
		String[] states = {"Gilbert Islands","Phoenix Islands","Line Islands"};
		return states;
	}
	else if (countryName == "Marshall Islands") {
		String[] states = {"Majuro","Ebeye","Jaluit","Wotje"};
		return states;
	}
	else if (countryName == "Micronesia") {
		String[] states = {"Chuuk","Pohnpei","Kosrae","Yap"};
		return states;
	}
	else if (countryName == "Nauru") {
		String[] states = {"Yaren","Anabar","Anetan","Aiwo"};
		return states;
	}
	else if (countryName == "Palau") {
		String[] states = {"Koror","Airai","Melekeok","Ngaraard"};
		return states;
	}
	else if (countryName == "Papua New Guinea") {
		String[] states = {"Port Moresby","Highlands","Momase","Southern","New Guinea Islands"};
		return states;
	}
	else if (countryName == "Samoa") {
		String[] states = {"Apia","Tuamasaga","Aiga-i-le-Tai","Fa'asaleleaga"};
		return states;
	}
	else if (countryName == "Solomon Islands") {
		String[] states = {"Honiara","Guadalcanal","Malaita","Western","Central"};
		return states;
	}
	else if (countryName == "Tonga") {
		String[] states = {"Tongatapu","Vava'u","Ha'apai","Eua","Niuas"};
		return states;
	}
	else if (countryName == "Tuvalu") {
		String[] states = {"Funafuti","Nanumea","Nanumanga","Nui"};
		return states;
	}
	else if (countryName == "Vanuatu") {
		String[] states = {"Shefa","Sanma","Tafea","Malampa","Torba","Penama"};
		return states;
	}
		
	else{
		System.out.println("Country not found");
	}
        return null;
    }
	public static void displayStates(String[] states) {

        System.out.println("Fetching states...");

            for (String state : states) {
                System.out.println(state);
            }

        System.out.println("End of method");
    }
}
