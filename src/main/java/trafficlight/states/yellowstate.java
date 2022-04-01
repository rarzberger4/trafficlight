package trafficlight.states;

public class yellowstate implements State{

    @Override
    public TrafficLightColor tlc(){
        return TrafficLightColor.YELLOW;
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
