package net.minelink.ctplus.compat.v1_16_R1;

import java.net.SocketAddress;

import javax.crypto.SecretKey;

import io.netty.channel.ChannelHandlerContext;
import io.netty.util.concurrent.GenericFutureListener;
import net.minecraft.server.v1_16_R1.EnumProtocol;
import net.minecraft.server.v1_16_R1.EnumProtocolDirection;
import net.minecraft.server.v1_16_R1.NetworkManager;
import net.minecraft.server.v1_16_R1.Packet;
import net.minecraft.server.v1_16_R1.PacketListener;

public final class NpcNetworkManager extends NetworkManager {

    public NpcNetworkManager() {
        super(EnumProtocolDirection.SERVERBOUND);
    }

    @Override
    public void channelActive(ChannelHandlerContext channelhandlercontext) throws Exception {

    }

    @Override
    public void setProtocol(EnumProtocol enumprotocol) {

    }

    @Override
    public void channelInactive(ChannelHandlerContext channelhandlercontext) {

    }

    @Override
    public void exceptionCaught(ChannelHandlerContext channelhandlercontext, Throwable throwable) {

    }

    @Override
    protected void channelRead0(ChannelHandlerContext channelhandlercontext, Packet packet) throws Exception {

    }

    @Override
    public void setPacketListener(PacketListener packetlistener) {

    }

    @Override
    public void sendPacket(Packet packet) {

    }

    @Override
    public void sendPacket(Packet packet, GenericFutureListener genericfuturelistener) {

    }

    @Override
    public SocketAddress getSocketAddress() {
        return new SocketAddress() {};
    }

    @Override
    public boolean isLocal() {
        return false;
    }

    @Override
    public void a(SecretKey secretkey) {

    }

    @Override
    public boolean isConnected() {
        return true;
    }

    @Override
    public void stopReading() {

    }

    @Override
    public void setCompressionLevel(int i) {

    }

    @Override
    public void handleDisconnection() {

    }

}
