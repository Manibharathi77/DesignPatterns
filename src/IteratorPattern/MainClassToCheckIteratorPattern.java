package IteratorPattern;

public class MainClassToCheckIteratorPattern {

    public static void main(String[] args) {
        ChannelCollection channels = new ChannelCollectionImpl();
        channels.addChannel(new Channel(98.5, ChannelType.English));
        channels.addChannel(new Channel(100.8, ChannelType.Thamizh));
        channels.addChannel(new Channel(99.6, ChannelType.Thamizh));
        channels.addChannel(new Channel(98.8, ChannelType.Thamizh));
        channels.addChannel(new Channel(98.9, ChannelType.All));
        channels.addChannel(new Channel(98.10, ChannelType.French));

        ChannelIterator channelIterator = channels.iterator(ChannelType.Thamizh);
        while (channelIterator.hasNext()){
           Channel c = channelIterator.next();
            System.out.println(c.toString());
        }

    }
}
