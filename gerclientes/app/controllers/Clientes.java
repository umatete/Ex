/**
 * 
 */
package controllers;

import models.Cliente;
import play.mvc.Controller;

/**
 * @author joaohelis
 *
 */
public class Clientes extends Controller {
	
	public static void form() {
		render();
	}
	
	public static void salvar(Cliente cliente) {
		
//		Cliente cliente = new Cliente();
//		
//		cliente.nome = nome;
//		cliente.email = email;
		
		cliente.save();
		
		renderTemplate("Clientes/salvarFake.html", cliente);
		
	}
	
	public static void salvarFake(String nome, String email) {
//		String nome = params.get("nome");
//		String email = params.get("email");
		render(nome, email);
	}
}