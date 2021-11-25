package it.shop;

import java.util.Random;
import java.util.Scanner;

public class Prodotto {
	//attributi
	private int codice;
	private String nome;
	private String descrizione;
	private double prezzo;
	private double iva;
	
	//costruttore
	
	public Prodotto(String nome, double prezzo) {
			this.nome = nome;
			this.prezzo = prezzo;
		}
	
	//metodi getter e setter
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDecrizione() {
		return descrizione;
	}

	public void setDecrizione(String decrizione) {
		this.descrizione = decrizione;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public double getIva() {
		return iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}

	public int getCodice() {
		return codice;
	}

	
	
	
	// metodo che ritorna il prezzo base
	public double prezzoBase(double prezzo) {
		this.prezzo = prezzo;
		return this.prezzo;
	}
	
	// metodo che ritorna il prezzo calcolato conoscendo l'iva
	public double prezzoIva(double prezzo) {
		iva = 0.24;
		double prezzoIva = this.prezzo * (1 - iva);
		return prezzoIva;
	}
	
	//metodo che unisce il codice e il nome in una sola stringa
	public String nomeEsteso() {
		String nomeEsteso = this.codice + "-" + this.nome;
		return nomeEsteso;
	}
	
	//metodo che genera in modo random il codice
	public int codice() {
		
		Random rand = new Random();
		this.codice = rand.nextInt(1000);
		
		return codice;
	}
	
	//metodo che permette di aggiungere una descrizione
	
	public String inserisciDescrizione() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Inserisci una descrizione del prodotto: ");
		this.descrizione = scan.nextLine(); 
		return this.descrizione;
		
		
	}
	
}
