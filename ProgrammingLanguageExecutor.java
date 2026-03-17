class ProgrammingLanguageExecutor {
	public static void main(String[] args) {
/*
		Syntax syntax1 = new Syntax();
		syntax1.syntaxId = 1;
		syntax1.keyword = "class";
		syntax1.useCase = "Class Declaration";
		syntax1.example = "class MyClass{}";
		syntax1.isCaseSensitive = true;
		ProgrammingLanguage programmingLanguage1 = new ProgrammingLanguage();
		programmingLanguage1.langId = 1;
		programmingLanguage1.langName = "Java";
		programmingLanguage1.paradigm = "Object Oriented";
		programmingLanguage1.releaseYear = 1995;
		programmingLanguage1.isOpenSource = false;
		programmingLanguage1.syntax = syntax1;
		programmingLanguage1.getProgrammingLanguageDetails();

		Syntax syntax2 = new Syntax();
		syntax2.syntaxId = 2;
		syntax2.keyword = "def";
		syntax2.useCase = "Function Definition";
		syntax2.example = "def greet():";
		syntax2.isCaseSensitive = true;
		ProgrammingLanguage programmingLanguage2 = new ProgrammingLanguage();
		programmingLanguage2.langId = 2;
		programmingLanguage2.langName = "Python";
		programmingLanguage2.paradigm = "Multi Paradigm";
		programmingLanguage2.releaseYear = 1991;
		programmingLanguage2.isOpenSource = true;
		programmingLanguage2.syntax = syntax2;
		programmingLanguage2.getProgrammingLanguageDetails();

		Syntax syntax3 = new Syntax();
		syntax3.syntaxId = 3;
		syntax3.keyword = "#include";
		syntax3.useCase = "Header File";
		syntax3.example = "#include<iostream>";
		syntax3.isCaseSensitive = true;
		ProgrammingLanguage programmingLanguage3 = new ProgrammingLanguage();
		programmingLanguage3.langId = 3;
		programmingLanguage3.langName = "C++";
		programmingLanguage3.paradigm = "Object Oriented";
		programmingLanguage3.releaseYear = 1983;
		programmingLanguage3.isOpenSource = false;
		programmingLanguage3.syntax = syntax3;
		programmingLanguage3.getProgrammingLanguageDetails();

		Syntax syntax4 = new Syntax();
		syntax4.syntaxId = 4;
		syntax4.keyword = "function";
		syntax4.useCase = "Function Declaration";
		syntax4.example = "function add(){}";
		syntax4.isCaseSensitive = true;
		ProgrammingLanguage programmingLanguage4 = new ProgrammingLanguage();
		programmingLanguage4.langId = 4;
		programmingLanguage4.langName = "JavaScript";
		programmingLanguage4.paradigm = "Event Driven";
		programmingLanguage4.releaseYear = 1995;
		programmingLanguage4.isOpenSource = true;
		programmingLanguage4.syntax = syntax4;
		programmingLanguage4.getProgrammingLanguageDetails();

		Syntax syntax5 = new Syntax();
		syntax5.syntaxId = 5;
		syntax5.keyword = "fun";
		syntax5.useCase = "Function Declaration";
		syntax5.example = "fun main(){}";
		syntax5.isCaseSensitive = true;
		ProgrammingLanguage programmingLanguage5 = new ProgrammingLanguage();
		programmingLanguage5.langId = 5;
		programmingLanguage5.langName = "Kotlin";
		programmingLanguage5.paradigm = "Object Oriented";
		programmingLanguage5.releaseYear = 2011;
		programmingLanguage5.isOpenSource = true;
		programmingLanguage5.syntax = syntax5;
		programmingLanguage5.getProgrammingLanguageDetails();

		Syntax syntax6 = new Syntax();
		syntax6.syntaxId = 6;
		syntax6.keyword = "var";
		syntax6.useCase = "Variable Declaration";
		syntax6.example = "var name = John";
		syntax6.isCaseSensitive = true;
		ProgrammingLanguage programmingLanguage6 = new ProgrammingLanguage();
		programmingLanguage6.langId = 6;
		programmingLanguage6.langName = "Swift";
		programmingLanguage6.paradigm = "Object Oriented";
		programmingLanguage6.releaseYear = 2014;
		programmingLanguage6.isOpenSource = true;
		programmingLanguage6.syntax = syntax6;
		programmingLanguage6.getProgrammingLanguageDetails();

		Syntax syntax7 = new Syntax();
		syntax7.syntaxId = 7;
		syntax7.keyword = "func";
		syntax7.useCase = "Function Declaration";
		syntax7.example = "func main(){}";
		syntax7.isCaseSensitive = true;
		ProgrammingLanguage programmingLanguage7 = new ProgrammingLanguage();
		programmingLanguage7.langId = 7;
		programmingLanguage7.langName = "Go";
		programmingLanguage7.paradigm = "Concurrent";
		programmingLanguage7.releaseYear = 2009;
		programmingLanguage7.isOpenSource = true;
		programmingLanguage7.syntax = syntax7;
		programmingLanguage7.getProgrammingLanguageDetails();

		Syntax syntax8 = new Syntax();
		syntax8.syntaxId = 8;
		syntax8.keyword = "fn";
		syntax8.useCase = "Function Declaration";
		syntax8.example = "fn main(){}";
		syntax8.isCaseSensitive = true;
		ProgrammingLanguage programmingLanguage8 = new ProgrammingLanguage();
		programmingLanguage8.langId = 8;
		programmingLanguage8.langName = "Rust";
		programmingLanguage8.paradigm = "Systems Programming";
		programmingLanguage8.releaseYear = 2010;
		programmingLanguage8.isOpenSource = true;
		programmingLanguage8.syntax = syntax8;
		programmingLanguage8.getProgrammingLanguageDetails();

		Syntax syntax9 = new Syntax();
		syntax9.syntaxId = 9;
		syntax9.keyword = "def";
		syntax9.useCase = "Method Definition";
		syntax9.example = "def hello end";
		syntax9.isCaseSensitive = true;
		ProgrammingLanguage programmingLanguage9 = new ProgrammingLanguage();
		programmingLanguage9.langId = 9;
		programmingLanguage9.langName = "Ruby";
		programmingLanguage9.paradigm = "Object Oriented";
		programmingLanguage9.releaseYear = 1995;
		programmingLanguage9.isOpenSource = true;
		programmingLanguage9.syntax = syntax9;
		programmingLanguage9.getProgrammingLanguageDetails();

		Syntax syntax10 = new Syntax();
		syntax10.syntaxId = 10;
		syntax10.keyword = "echo";
		syntax10.useCase = "Print Statement";
		syntax10.example = "echo Hello World";
		syntax10.isCaseSensitive = false;
		ProgrammingLanguage programmingLanguage10 = new ProgrammingLanguage();
		programmingLanguage10.langId = 10;
		programmingLanguage10.langName = "PHP";
		programmingLanguage10.paradigm = "Scripting";
		programmingLanguage10.releaseYear = 1994;
		programmingLanguage10.isOpenSource = true;
		programmingLanguage10.syntax = syntax10;
		programmingLanguage10.getProgrammingLanguageDetails();

		Syntax syntax11 = new Syntax();
		syntax11.syntaxId = 11;
		syntax11.keyword = "namespace";
		syntax11.useCase = "Namespace Declaration";
		syntax11.example = "namespace MyApp{}";
		syntax11.isCaseSensitive = true;
		ProgrammingLanguage programmingLanguage11 = new ProgrammingLanguage();
		programmingLanguage11.langId = 11;
		programmingLanguage11.langName = "C#";
		programmingLanguage11.paradigm = "Object Oriented";
		programmingLanguage11.releaseYear = 2000;
		programmingLanguage11.isOpenSource = false;
		programmingLanguage11.syntax = syntax11;
		programmingLanguage11.getProgrammingLanguageDetails();

		Syntax syntax12 = new Syntax();
		syntax12.syntaxId = 12;
		syntax12.keyword = "interface";
		syntax12.useCase = "Interface Declaration";
		syntax12.example = "interface User{}";
		syntax12.isCaseSensitive = true;
		ProgrammingLanguage programmingLanguage12 = new ProgrammingLanguage();
		programmingLanguage12.langId = 12;
		programmingLanguage12.langName = "TypeScript";
		programmingLanguage12.paradigm = "Typed JavaScript";
		programmingLanguage12.releaseYear = 2012;
		programmingLanguage12.isOpenSource = true;
		programmingLanguage12.syntax = syntax12;
		programmingLanguage12.getProgrammingLanguageDetails();

		Syntax syntax13 = new Syntax();
		syntax13.syntaxId = 13;
		syntax13.keyword = "void";
		syntax13.useCase = "Return Type";
		syntax13.example = "void main(){}";
		syntax13.isCaseSensitive = true;
		ProgrammingLanguage programmingLanguage13 = new ProgrammingLanguage();
		programmingLanguage13.langId = 13;
		programmingLanguage13.langName = "Dart";
		programmingLanguage13.paradigm = "Object Oriented";
		programmingLanguage13.releaseYear = 2011;
		programmingLanguage13.isOpenSource = true;
		programmingLanguage13.syntax = syntax13;
		programmingLanguage13.getProgrammingLanguageDetails();

		Syntax syntax14 = new Syntax();
		syntax14.syntaxId = 14;
		syntax14.keyword = "object";
		syntax14.useCase = "Singleton Object";
		syntax14.example = "object Main{}";
		syntax14.isCaseSensitive = true;
		ProgrammingLanguage programmingLanguage14 = new ProgrammingLanguage();
		programmingLanguage14.langId = 14;
		programmingLanguage14.langName = "Scala";
		programmingLanguage14.paradigm = "Functional OOP";
		programmingLanguage14.releaseYear = 2004;
		programmingLanguage14.isOpenSource = true;
		programmingLanguage14.syntax = syntax14;
		programmingLanguage14.getProgrammingLanguageDetails();

		Syntax syntax15 = new Syntax();
		syntax15.syntaxId = 15;
		syntax15.keyword = "print";
		syntax15.useCase = "Print Function";
		syntax15.example = "print(Hello)";
		syntax15.isCaseSensitive = true;
		ProgrammingLanguage programmingLanguage15 = new ProgrammingLanguage();
		programmingLanguage15.langId = 15;
		programmingLanguage15.langName = "R";
		programmingLanguage15.paradigm = "Statistical";
		programmingLanguage15.releaseYear = 1993;
		programmingLanguage15.isOpenSource = true;
		programmingLanguage15.syntax = syntax15;
		programmingLanguage15.getProgrammingLanguageDetails();

		Syntax syntax16 = new Syntax();
		syntax16.syntaxId = 16;
		syntax16.keyword = "for";
		syntax16.useCase = "Loop Declaration";
		syntax16.example = "for i=1:10";
		syntax16.isCaseSensitive = false;
		ProgrammingLanguage programmingLanguage16 = new ProgrammingLanguage();
		programmingLanguage16.langId = 16;
		programmingLanguage16.langName = "MATLAB";
		programmingLanguage16.paradigm = "Numerical";
		programmingLanguage16.releaseYear = 1984;
		programmingLanguage16.isOpenSource = false;
		programmingLanguage16.syntax = syntax16;
		programmingLanguage16.getProgrammingLanguageDetails();

		Syntax syntax17 = new Syntax();
		syntax17.syntaxId = 17;
		syntax17.keyword = "my";
		syntax17.useCase = "Variable Declaration";
		syntax17.example = "my $name";
		syntax17.isCaseSensitive = true;
		ProgrammingLanguage programmingLanguage17 = new ProgrammingLanguage();
		programmingLanguage17.langId = 17;
		programmingLanguage17.langName = "Perl";
		programmingLanguage17.paradigm = "Scripting";
		programmingLanguage17.releaseYear = 1987;
		programmingLanguage17.isOpenSource = true;
		programmingLanguage17.syntax = syntax17;
		programmingLanguage17.getProgrammingLanguageDetails();

		Syntax syntax18 = new Syntax();
		syntax18.syntaxId = 18;
		syntax18.keyword = "let";
		syntax18.useCase = "Binding";
		syntax18.example = "let x = 5 in x+1";
		syntax18.isCaseSensitive = true;
		ProgrammingLanguage programmingLanguage18 = new ProgrammingLanguage();
		programmingLanguage18.langId = 18;
		programmingLanguage18.langName = "Haskell";
		programmingLanguage18.paradigm = "Functional";
		programmingLanguage18.releaseYear = 1990;
		programmingLanguage18.isOpenSource = true;
		programmingLanguage18.syntax = syntax18;
		programmingLanguage18.getProgrammingLanguageDetails();

		Syntax syntax19 = new Syntax();
		syntax19.syntaxId = 19;
		syntax19.keyword = "local";
		syntax19.useCase = "Local Variable";
		syntax19.example = "local x = 10";
		syntax19.isCaseSensitive = true;
		ProgrammingLanguage programmingLanguage19 = new ProgrammingLanguage();
		programmingLanguage19.langId = 19;
		programmingLanguage19.langName = "Lua";
		programmingLanguage19.paradigm = "Scripting";
		programmingLanguage19.releaseYear = 1993;
		programmingLanguage19.isOpenSource = true;
		programmingLanguage19.syntax = syntax19;
		programmingLanguage19.getProgrammingLanguageDetails();

		Syntax syntax20 = new Syntax();
		syntax20.syntaxId = 20;
		syntax20.keyword = "defmodule";
		syntax20.useCase = "Module Definition";
		syntax20.example = "defmodule App do end";
		syntax20.isCaseSensitive = true;
		ProgrammingLanguage programmingLanguage20 = new ProgrammingLanguage();
		programmingLanguage20.langId = 20;
		programmingLanguage20.langName = "Elixir";
		programmingLanguage20.paradigm = "Functional";
		programmingLanguage20.releaseYear = 2011;
		programmingLanguage20.isOpenSource = true;
		programmingLanguage20.syntax = syntax20;
		programmingLanguage20.getProgrammingLanguageDetails(); */


		Syntax syntax1 = new Syntax(1, "class", "Class Declaration", "class MyClass{}", true);
		ProgrammingLanguage programmingLanguage1 = new ProgrammingLanguage(1, "Java", "Object Oriented", 1995, false, syntax1);
		programmingLanguage1.getProgrammingLanguageDetails();

		Syntax syntax2 = new Syntax(2, "def", "Function Definition", "def greet():", true);
		ProgrammingLanguage programmingLanguage2 = new ProgrammingLanguage(2, "Python", "Multi Paradigm", 1991, true, syntax2);
		programmingLanguage2.getProgrammingLanguageDetails();

		Syntax syntax3 = new Syntax(3, "#include", "Header File", "#include<iostream>", true);
		ProgrammingLanguage programmingLanguage3 = new ProgrammingLanguage(3, "C++", "Object Oriented", 1983, false, syntax3);
		programmingLanguage3.getProgrammingLanguageDetails();

		Syntax syntax4 = new Syntax(4, "function", "Function Declaration", "function add(){}", true);
		ProgrammingLanguage programmingLanguage4 = new ProgrammingLanguage(4, "JavaScript", "Event Driven", 1995, true, syntax4);
		programmingLanguage4.getProgrammingLanguageDetails();

		Syntax syntax5 = new Syntax(5, "fun", "Function Declaration", "fun main(){}", true);
		ProgrammingLanguage programmingLanguage5 = new ProgrammingLanguage(5, "Kotlin", "Object Oriented", 2011, true, syntax5);
		programmingLanguage5.getProgrammingLanguageDetails();

		Syntax syntax6 = new Syntax(6, "var", "Variable Declaration", "var name = John", true);
		ProgrammingLanguage programmingLanguage6 = new ProgrammingLanguage(6, "Swift", "Object Oriented", 2014, true, syntax6);
		programmingLanguage6.getProgrammingLanguageDetails();

		Syntax syntax7 = new Syntax(7, "func", "Function Declaration", "func main(){}", true);
		ProgrammingLanguage programmingLanguage7 = new ProgrammingLanguage(7, "Go", "Concurrent", 2009, true, syntax7);
		programmingLanguage7.getProgrammingLanguageDetails();

		Syntax syntax8 = new Syntax(8, "fn", "Function Declaration", "fn main(){}", true);
		ProgrammingLanguage programmingLanguage8 = new ProgrammingLanguage(8, "Rust", "Systems Programming", 2010, true, syntax8);
		programmingLanguage8.getProgrammingLanguageDetails();

		Syntax syntax9 = new Syntax(9, "def", "Method Definition", "def hello end", true);
		ProgrammingLanguage programmingLanguage9 = new ProgrammingLanguage(9, "Ruby", "Object Oriented", 1995, true, syntax9);
		programmingLanguage9.getProgrammingLanguageDetails();

		Syntax syntax10 = new Syntax(10, "echo", "Print Statement", "echo Hello World", false);
		ProgrammingLanguage programmingLanguage10 = new ProgrammingLanguage(10, "PHP", "Scripting", 1994, true, syntax10);
		programmingLanguage10.getProgrammingLanguageDetails();

		Syntax syntax11 = new Syntax(11, "namespace", "Namespace Declaration", "namespace MyApp{}", true);
		ProgrammingLanguage programmingLanguage11 = new ProgrammingLanguage(11, "C#", "Object Oriented", 2000, false, syntax11);
		programmingLanguage11.getProgrammingLanguageDetails();

		Syntax syntax12 = new Syntax(12, "interface", "Interface Declaration", "interface User{}", true);
		ProgrammingLanguage programmingLanguage12 = new ProgrammingLanguage(12, "TypeScript", "Typed JavaScript", 2012, true, syntax12);
		programmingLanguage12.getProgrammingLanguageDetails();

		Syntax syntax13 = new Syntax(13, "void", "Return Type", "void main(){}", true);
		ProgrammingLanguage programmingLanguage13 = new ProgrammingLanguage(13, "Dart", "Object Oriented", 2011, true, syntax13);
		programmingLanguage13.getProgrammingLanguageDetails();

		Syntax syntax14 = new Syntax(14, "object", "Singleton Object", "object Main{}", true);
		ProgrammingLanguage programmingLanguage14 = new ProgrammingLanguage(14, "Scala", "Functional OOP", 2004, true, syntax14);
		programmingLanguage14.getProgrammingLanguageDetails();

		Syntax syntax15 = new Syntax(15, "print", "Print Function", "print(Hello)", true);
		ProgrammingLanguage programmingLanguage15 = new ProgrammingLanguage(15, "R", "Statistical", 1993, true, syntax15);
		programmingLanguage15.getProgrammingLanguageDetails();

		Syntax syntax16 = new Syntax(16, "for", "Loop Declaration", "for i=1:10", false);
		ProgrammingLanguage programmingLanguage16 = new ProgrammingLanguage(16, "MATLAB", "Numerical", 1984, false, syntax16);
		programmingLanguage16.getProgrammingLanguageDetails();

		Syntax syntax17 = new Syntax(17, "my", "Variable Declaration", "my $name", true);
		ProgrammingLanguage programmingLanguage17 = new ProgrammingLanguage(17, "Perl", "Scripting", 1987, true, syntax17);
		programmingLanguage17.getProgrammingLanguageDetails();

		Syntax syntax18 = new Syntax(18, "let", "Binding", "let x = 5", true);
		ProgrammingLanguage programmingLanguage18 = new ProgrammingLanguage(18, "Haskell", "Functional", 1990, true, syntax18);
		programmingLanguage18.getProgrammingLanguageDetails();

		Syntax syntax19 = new Syntax(19, "local", "Local Variable", "local x = 10", true);
		ProgrammingLanguage programmingLanguage19 = new ProgrammingLanguage(19, "Lua", "Scripting", 1993, true, syntax19);
		programmingLanguage19.getProgrammingLanguageDetails();

		Syntax syntax20 = new Syntax(20, "defmodule", "Module Definition", "defmodule App do end", true);
		ProgrammingLanguage programmingLanguage20 = new ProgrammingLanguage(20, "Elixir", "Functional", 2011, true, syntax20);
		programmingLanguage20.getProgrammingLanguageDetails();

	}
}