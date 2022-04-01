package trafficlight.states;

public class greenstate implements State{

    public TrafficLightColor tlc(){
        return TrafficLightColor.GREEN;
    }

    @Override
    public State nextState() {
        return null;
    }

    @Override
    public State getState() {
        return null;
    }
}
