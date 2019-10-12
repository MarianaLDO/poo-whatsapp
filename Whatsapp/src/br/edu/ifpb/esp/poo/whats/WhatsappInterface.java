package br.edu.ifpb.esp.poo.whats;

import java.io.File;
import java.util.ArrayList;

public interface WhatsappInterface {
	
	public boolean cadastrarUsuario(String nomeUsuario, String senha);
	
	public boolean autenticar(String nomeUsuario, String senha);
	
	public boolean enviarMensagem(String destinatario, String mensagem);
	
	public ArrayList<String> contatosComMensagensNaoLidas();
	
	public ArrayList<String> mensagensNaoLidas(String contato);
	
	public ArrayList<String> mensagens(String contato);
	
}

	
