package proxyserver;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.IOException;

public class Jhttpp2ServerInputStream extends BufferedInputStream implements Jhttpp2InputStream
{
	private Jhttpp2HTTPSession connection;

	public Jhttpp2ServerInputStream(Jhttpp2Server server,
			Jhttpp2HTTPSession connection, InputStream a, boolean filter) {
		super(a);
		this.connection = connection;
	}

	public int read_f(byte[] b) throws IOException {
		return read(b);
	}
}

