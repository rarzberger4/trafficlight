package trafficlight.ctrl;

import trafficlight.gui.TrafficLightGui;
import trafficlight.states.*;

public class TrafficLightCtrl{

    private State greenState;

    private State redState;

    private State yellowState;

    private State currentState;

    private State previousState;

    private TrafficLightGui gui;


    public TrafficLightCtrl() {
        super();
        initStates();
        gui = new TrafficLightGui(this);
        gui.setVisible(true);
    }

    private void initStates() {
        //TOD create the states and set current and previous state
        currentState = new greenstate(){

            @Override
            public State nextState() {
                previousState = currentState;
                currentState = greenState;
                return currentState;
            }

            @Override
            public State getState() {
                return currentState;
            }
        };


        greenState = new greenstate() {

            @Override
            public State nextState() {
                previousState = currentState;
                currentState = yellowState;
                return currentState;
            }

            @Override
            public State getState() {
                return currentState;
            }
        };

        redState = new redstate(){

            @Override
            public State nextState() {
                previousState = currentState;
                currentState = greenState;
                return currentState;
            }

            @Override
            public State getState() {
                return currentState;
            }
        };

        yellowState = new yellowstate(){

            @Override
            public State nextState() {
                previousState = currentState;
                currentState = redState;
                return currentState;
            }

            @Override
            public State getState() {
                return currentState;
            }
        };
    }

    public State getGreenState() {
        return greenState;
    }

    public State getRedState() {
        return redState;
    }

    public State getYellowState() {
        return yellowState;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public State getPreviousState() {
        return previousState;
    }

    public void setPreviousState(State previousState) {
        this.previousState = previousState;
    }

    public void run() {
        gui.run();
    }

    public void nextState() {
        currentState.nextState();
        gui.setLight(currentState.tlc());
    }
}