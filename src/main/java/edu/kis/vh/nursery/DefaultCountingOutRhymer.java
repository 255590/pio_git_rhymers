package edu.kis.vh.nursery;

/**
 * Klasa DefaultCountingOutRhymer dostarcza bazowa funkcjonalnosc wyliczanki
 */
public class DefaultCountingOutRhymer {

    private static final int EMPTY = -1;

	private static final int ERROR_VALUE = EMPTY;

	private static final int FULL_TAB = 11;

	private static final int MAX_SIZE = 12;

	private final int[] numbers = new int[MAX_SIZE];

    /**
     * Zwraca pole total
     * @return total
     */
    public int getTotal() {
        return total;
    }

    private int total = EMPTY;

    /**
     * Dodaje nową wartość do wyliczanki, jesli nie jest ona pelna.
     * @param in Wartosc do dodania
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Sprawdza, czy wyliczanka jest pusta.
     * @return true, jesli wyliczanka jest pusta; w przeciwnym razie false.
     */
    public boolean callCheck() {
        return total == EMPTY;
    }

    /**
     * Sprawdza czy wyliczanka jest pelna.
     * @return true, jesli wyliczanka jest pelna; w przeciwnym razie false.
     */
    public boolean isFull() {
        return total == FULL_TAB;
    }

    /**
     * Zwraca ostatnio dodana wartosc bez usuwania jej z wyliczanki.
     * @return Ostatnia wartosc na stosie lub ERROR_VALUE, jeśli stos jest pusty.
     */
    protected int peekABoo() {
        if (callCheck())
            return ERROR_VALUE;
        return numbers[total];
    }

    /**
     * Zwraca ostatnio dodana wartosc i usuwa ja z wyliczanki.
     * @return Usunieta wartość lub ERROR_VALUE, jesli stos jest pusty.
     */
    public int countOut() {
        if (callCheck())
            return ERROR_VALUE;
        return numbers[total--];
    }

}
