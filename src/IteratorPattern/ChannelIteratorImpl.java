package IteratorPattern;

import java.util.List;

public class ChannelIteratorImpl implements ChannelIterator {

    private ChannelType channelType;
    private List<Channel> channelList;
    private int position;

    ChannelIteratorImpl(ChannelType channelType, List<Channel> channelList){
        this.channelType = channelType;
        this.channelList = channelList;
    }

    @Override
    public boolean hasNext() {
     while(channelList.size() > position){
         if(channelList.get(position).getChannelType().equals(channelType)){
             return true;
         }else
             position++;
     }
    return false;
    }

    @Override
    public Channel next() {
        Channel c = channelList.get(position);
        position++;
        return c;
    }
}
