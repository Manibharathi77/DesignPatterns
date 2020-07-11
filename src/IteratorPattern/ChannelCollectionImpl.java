package IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class ChannelCollectionImpl implements ChannelCollection {

    private List<Channel> channelsList = new ArrayList<>();

    @Override
    public void addChannel(Channel c) {
        this.channelsList.add(c);
    }

    @Override
    public void removeChannel(Channel c) {
        this.channelsList.remove(c);
    }

    @Override
    public ChannelIterator iterator(ChannelType channelType) {
            return new ChannelIteratorImpl(channelType, channelsList);
        }
    }
