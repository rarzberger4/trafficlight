package trafficlight.states;

public class redstate implements State{

    public TrafficLightColor tlc(){
        return TrafficLightColor.RED;
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
