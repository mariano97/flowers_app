package org.usco.app;

import java.io.OutputStream;
import java.util.Scanner;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class App {
	/** The output stream to the port */
	private static OutputStream output;

	public static void main(String[] args) {
		String puerto = "COM5";
		SerialCom main = new SerialCom();
		main.initialize(puerto);
		output = main.getOutput();
		System.out.println("=== INICIO DEL PROGRAMA ===");
		
	}
	
	
	
}
