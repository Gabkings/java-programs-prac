/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardsimulation;

/**
 *
 * @author developer
 */
public class Card {
    private String face;
    private String suit;
    public Card(String cardFace, String cardSuit){
        face = cardFace;
        suit = cardSuit;
    }
    public String toString(){
        return face +" of "+suit;
    }
    
}
