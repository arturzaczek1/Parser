package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.thoughtworks.xstream.XStream;

import main.xmlParser.*;

public class ContentDao {
	public static final String PATH = "Parser\\resources\\filexml.xml";

	public CustomDataContent readXML() {

		File xmlFile = new File(PATH);
		XStream xstream = new XStream();

		xstream.alias("custom-data-content", CustomDataContent.class);
		xstream.alias("general", General.class);
		xstream.alias("add", Add.class);
		xstream.alias("change", Change.class);
		xstream.alias("deprecate", Deprecated.class);
		xstream.alias("remove", Remove.class);
		xstream.alias("fix", Fix.class);
		xstream.alias("secure", Secure.class);

		xstream.alias("added", String.class);
		xstream.alias("changed", String.class);
		xstream.alias("deprecated", String.class);
		xstream.alias("removed", String.class);
		xstream.alias("fixed", String.class);
		xstream.alias("security", String.class);

		xstream.aliasAttribute(CustomDataContent.class, "attribute", "m1");

		xstream.addImplicitCollection(Add.class, "addedList");
		xstream.addImplicitCollection(Change.class, "changedList");
		xstream.addImplicitCollection(Deprecate.class, "deprecateList");
		xstream.addImplicitCollection(Remove.class, "removedList");
		xstream.addImplicitCollection(Fix.class, "fixedList");
		xstream.addImplicitCollection(Secure.class, "secureList");

		CustomDataContent content = null;
		try {
			content = (CustomDataContent) xstream.fromXML(new FileInputStream(xmlFile));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return content;
	}
}
