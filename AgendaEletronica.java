package Questao02;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class AgendaEletronica {
	Set<Contato> set;

	public AgendaEletronica() {
		this.set = new TreeSet<>();

	}

	public void addContato(Contato c) {
		set.add(c);
	}

	public boolean removerContato(Contato c) {
		for (Contato con : set) {
			if (con.equals(c)) {
				set.remove(c);
				return true;
			}

		}

		return false;
	}

	public void removerContato(String id) {

		String[] palavras = id.split("");
		set.removeIf(x -> x.getNome().substring(0, palavras.length) == id);
		for (Contato x : set) {
			System.out.print(x);
			set.remove(x);
		}

	}

	public ArrayList<Contato> listarContato(String id) {
		Set<Contato> copia = set;
		ArrayList<Contato> lista = new ArrayList<Contato>();
		String[] palavras = id.split("");
		set.removeIf(x -> x.getNome().substring(0, palavras.length) != id);

		for (Contato x : copia) {
			System.out.print(x);
			lista.add(x);
		}

		return lista;
	}

}
