package conversor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;


public class HandlerXMLFileArrays {

	private static XStream xstream = new XStream(new DomDriver("UTF-8"));

	public static void saveArrays(Long[] arrays, String titulo) {
		XStream xstream = new XStream(new DomDriver("UTF-8"));

		File arquivoArrays = new File(titulo);

		String xmlPersistidos = xstream.toXML(arrays);

		try {

			arquivoArrays.createNewFile();
			PrintWriter gravador = new PrintWriter(arquivoArrays);
			gravador.print(xmlPersistidos);
			gravador.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Long[][] loadArrays(Long[][] arrays, String titulo) {
		try {
			
			FileInputStream fis = new FileInputStream(titulo);
			System.out.println("2");
			arrays = (Long[][]) xstream.fromXML(fis);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return arrays;
	}
}