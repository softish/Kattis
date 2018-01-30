package problems;

import java.util.Scanner;

/**
 * Created by softish on 2017-11-04.
 */
public class Trik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CupHandler cupHandler = new CupHandler();

        while (scanner.hasNext()) {
            String line = scanner.nextLine();

            for (Character character : line.toCharArray()) {
                if (character.equals('A')) {
                    cupHandler.invokeActionA();
                } else if (character.equals('B')) {
                    cupHandler.invokeActionB();
                } else if (character.equals('C')) {
                    cupHandler.invokeActionC();
                }
            }

            System.out.println(cupHandler.getCurrentIndex());
        }
    }
}

abstract class State {
    public abstract int getCurrentIndex();

    public State actionA() {
        return this;
    }

    public State actionB() {
        return this;
    }

    public State actionC() {
        return this;
    }
}

class CupOne extends State {

    @Override
    public int getCurrentIndex() {
        return 1;
    }

    @Override
    public State actionA() {
        return new CupTwo();
    }

    @Override
    public State actionC() {
        return new CupThree();
    }
}

class CupTwo extends State {

    @Override
    public int getCurrentIndex() {
        return 2;
    }

    @Override
    public State actionA() {
        return new CupOne();
    }

    @Override
    public State actionB() {
        return new CupThree();
    }
}


class CupThree extends State {

    @Override
    public int getCurrentIndex() {
        return 3;
    }

    @Override
    public State actionB() {
        return new CupTwo();
    }

    @Override
    public State actionC() {
        return new CupOne();
    }
}

class CupHandler {
    private State currentState;

    CupHandler() {
        currentState = new CupOne();
    }

    public void invokeActionA() {
        currentState = currentState.actionA();
    }

    public void invokeActionB() {
        currentState = currentState.actionB();
    }

    public void invokeActionC() {
        currentState = currentState.actionC();
    }

    public int getCurrentIndex() {
        return currentState.getCurrentIndex();
    }
}