package ru.mai;

public class Party {
    private String name;
    private int numVoices;
    private int numSeats;
    private double remnant;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumVoices() {
        return numVoices;
    }

    public void setNumVoices(int numVoices) {
        this.numVoices = numVoices;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }

    public double getRemnant() {
        return remnant;
    }

    public void setRemnant(double remnant) {
        this.remnant = remnant;
    }
}
