package trafficlight.states;

public interface State {

    TrafficLightColor tlc();

    State nextState();
    State getState();

}