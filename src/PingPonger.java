public class PingPonger {
    private String state;

    public PingPonger(String setState) {
        if (!setState.equals("ping") && !setState.equals("pong")) {
            throw new IllegalArgumentException();
        }

        state = setState;
    }

    public boolean ping() {
        if (!state.equals("pong")) {
            throw new IllegalStateException();
        }

        state = "ping";
        return true;
    }

    public boolean pong() {
        if (!state.equals("ping")) {
            throw new IllegalStateException();
        }

        state = "pong";
        return false;
    }
}