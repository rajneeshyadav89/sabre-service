package com.aa.apauto.sabrewebservices.session;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.StringBufferInputStream;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class XMLFormater {
	private static final Logger logger = LoggerFactory.getLogger(XMLFormater.class);

	private XMLFormater() {
	}

	@SuppressWarnings("deprecation")
	public static String format(String unformatedXML) {
		String formatedXML = null;
		StreamSource in = null;
		StreamResult out = null;
		TransformerFactory transformFactory = TransformerFactory.newInstance();

		try {
			Transformer serializer = transformFactory.newTransformer();
			serializer.setOutputProperty("indent", "yes");
			serializer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
			in = new StreamSource(new StringBufferInputStream(unformatedXML));
			out = new StreamResult(new ByteArrayOutputStream());
			serializer.transform(in, out);

			try {
				OutputStream output = out.getOutputStream();
				Throwable var7 = null;

				try {
					if (output != null) {
						formatedXML = output.toString();
					}

					if (formatedXML == null) {
						formatedXML = unformatedXML;
					}
				} catch (Throwable var18) {
					var7 = var18;
					throw var18;
				} finally {
					if (output != null) {
						if (var7 != null) {
							try {
								output.close();
							} catch (Throwable var17) {
								var7.addSuppressed(var17);
							}
						} else {
							output.close();
						}
					}

				}
			} catch (IOException var20) {
				logger.error("An Exception occurred while trying to close OutputStream in XMLFormater.format(): ",
						var20);
			}
		} catch (Exception var21) {
			formatedXML = unformatedXML;
		}

		return formatedXML;
	}
}
