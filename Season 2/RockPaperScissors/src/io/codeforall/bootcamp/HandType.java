package io.codeforall.bootcamp;

public enum HandType {
    ROCK, PAPER, SCISSORS;

    public static HandType getRandomHand(){
        HandType[] possibleHands = HandType.values();
        int randomIndex = (int) (Math.random() * possibleHands.length);
        HandType chosenHand = possibleHands[randomIndex];
        return chosenHand;
    }
}
