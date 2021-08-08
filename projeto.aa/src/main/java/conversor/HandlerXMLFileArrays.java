package conversor;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class HandlerXMLFileArrays {

	public static void converter(Long[][] arrays, String titulo) {
		XStream xstream = new XStream(new DomDriver("UTF-8"));
		
		File arquivoArrays = new File(titulo);
		
		String xmlPersistidos = xstream.toXML(arrays);
//		xstream.alias("ArrayList", java.util.ArrayList.class);
		
		try {
			
			arquivoArrays.createNewFile();
			PrintWriter gravador = new PrintWriter(arquivoArrays);
			gravador.print(xmlPersistidos);
			gravador.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}