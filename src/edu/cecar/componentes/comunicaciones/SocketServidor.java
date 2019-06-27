package edu.CECAR.componentes.comunicaciones;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Esta clase permite crear un un puerto TCP y configurar los canales de entrada y salida 
 * desde el Socket
 *
 */

public class SocketServidor {
	
	private ServerSocket serverSocket;
	private Socket socket;
	private BufferedReader entrada;
	private PrintWriter salida;
	
	
	public SocketServidor(int numeroPuertoTCP) {
		
		try {
			
			serverSocket = new ServerSocket(numeroPuertoTCP);
			socket = serverSocket.accept();
			
			//Se configuran los canles de entrada y salida
			entrada = new BufferedReader(new InputStreamReader(
					socket.getInputStream()));

			salida = new PrintWriter(new BufferedWriter(new OutputStreamWriter(
					socket.getOutputStream())), true);
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	
	}


	public ServerSocket getServerSocket() {
		return serverSocket;
	}


	public Socket getSocket() {
		return socket;
	}


	public BufferedReader getEntrada() {
		return entrada;
	}


	public PrintWriter getSalida() {
		return salida;
	}
	
	public void cerrarSocket() {
		
		try {
			
			socket.close();
			serverSocket.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	

}
