package edu.CECAR.componentes.comunicaciones;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Esta clase permite crear una conexion TCP hacia un servidor
 *
 */

public class SocketCliente {
	
	
	private Socket socket;
	private BufferedReader entrada;
	private PrintWriter salida;
	
	
	public SocketCliente(String direccionIP,int numeroPuertoTCP) {
		
		try {
			
			socket = new Socket(direccionIP,numeroPuertoTCP);
			
			//Se configuran los canles de entrada y salida
			entrada = new BufferedReader(new InputStreamReader(
					socket.getInputStream()));

			salida = new PrintWriter(new BufferedWriter(new OutputStreamWriter(
					socket.getOutputStream())), true);
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	
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
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	

}
