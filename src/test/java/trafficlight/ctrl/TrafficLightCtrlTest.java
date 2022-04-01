package trafficlight.ctrl;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import trafficlight.states.State;
import trafficlight.states.TrafficLightColor;
import trafficlight.states.greenstate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrafficLightCtrlTest {

    private TrafficLightCtrl ctrl = new TrafficLightCtrl();


    @Test
    @DisplayName("nextStateGreen")
    public void test_nextStateGreen() {
        ctrl.nextState();
        State actual = ctrl.getCurrentState();
        State expected = ctrl.getGreenState();

        assertEquals(actual, expected);
    }

    @Test
    @DisplayName("nextStateYellow")
    public void test_nextStateYellow() {
        ctrl.nextState();
        ctrl.nextState();
        State actual = ctrl.getCurrentState();
        State expected = ctrl.getYellowState();

        assertEquals(actual, expected);
    }

    @Test
    @DisplayName("nextStateRed")
    public void test_nextStateRed() {
        ctrl.nextState();
        ctrl.nextState();
        ctrl.nextState();
        State actual = ctrl.getCurrentState();
        State expected = ctrl.getRedState();

        assertEquals(actual, expected);
    }
}

