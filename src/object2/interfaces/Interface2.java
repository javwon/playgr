package object2.interfaces;

public class Interface2 {

	public static void main(String[] args) {
		Parseable parser = ParserManager.getrParser("XML");
		parser.parse("xml document");
		parser = ParserManager.getrParser("HTML");
		parser.parse("HTML Document");
	}

}

interface Parseable{
	void parse(String fileName);
}
class ParserManager{
	public static Parseable getrParser(String type) {
		if(type.equals("XML")) {
			return new XMLParser();
		}
		else {
			Parseable p = new HTMLParser();
			return p;
		}
	}
}

class XMLParser implements Parseable{
	public void parse(String fileName) {
		System.out.println(fileName);
	}
}
class HTMLParser implements Parseable{
	public void parse(String fileName) {
		System.out.println(fileName);
	}
}