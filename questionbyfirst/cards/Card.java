package questionbyfirst.cards;

public class Card {
    final private Rank rank;
    final private Suit suit;

    public Card(Rank rank, Suit suit){
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank(){
        return this.rank;
    }
    public Suit getSuit(){
        return this.suit;
    }
    public Rank getValue(){
        return this.getRank();
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Card other = (Card) obj;
        if (rank != other.rank)
            return false;
        if (suit != other.suit)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return String.format("Suit %s: Rank %s", getSuit(), getRank());
    }
    

}
