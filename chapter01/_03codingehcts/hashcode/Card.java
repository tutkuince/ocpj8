package com.oracle.javacert.professional.chapter01._03codingehcts.hashcode;

public class Card {
	private String rank;
	private String suit;

	public Card(String rank, String suit) {
		if (rank == null || suit == null)
			throw new IllegalArgumentException("Rank or Suit cannot be null");

		this.rank = rank;
		this.suit = suit;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Card))
			return false;

		Card c = (Card) obj;

		return rank.equals(c.rank) && suit.equals(c.suit);
	}
	
	@Override
	public int hashCode() {
		return rank.hashCode();
	}
}
