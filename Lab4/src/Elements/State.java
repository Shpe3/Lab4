package Elements;

public enum State {
    NORMAL("в норме"),
    EXCITED("взволнован"),
    AMUSED("развеселённый"),
    GLOOMY("угрюмый"),
    TIRED("уставший"),
    CAUTIOUS("настороженный"),
    SCARED("испуганный"),
    VACUUM("нехватка воздуха"),
    FROZE("мучительный холод"),
    SHAMED("посрамлённый");


    private final String state_name;

    State(String state_name) { this.state_name = state_name; };

    @Override
    public String toString() {
        return this.state_name;
    }


}
