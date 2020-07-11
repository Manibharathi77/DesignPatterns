package IteratorPattern;

public class Channel {

    private ChannelType channelType;
    private double frequency;

    public Channel(double freq, ChannelType type){
        this.frequency=freq;
        this.channelType=type;
    }

    @Override
    public String toString() {
        return "Channel{" +
                "channelType=" + channelType +
                ", frequency=" + frequency +
                '}';
    }

    public ChannelType getChannelType() {
        return channelType;
    }

    public void setChannelType(ChannelType channelType) {
        this.channelType = channelType;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }
}
