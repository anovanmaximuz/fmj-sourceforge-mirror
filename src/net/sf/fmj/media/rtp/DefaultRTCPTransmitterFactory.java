package net.sf.fmj.media.rtp;

/**
 * Created by gpolitis on 8/25/15.
 */
public class DefaultRTCPTransmitterFactory
    implements RTCPTransmitterFactory
{
    public RTCPTransmitter newRTCPTransmitter(
        SSRCCache cache, RTCPRawSender rtcpRawSender)
    {
        return new DefaultRTCPTransmitterImpl(cache, rtcpRawSender);
    }
}
