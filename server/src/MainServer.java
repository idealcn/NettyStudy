import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;

/**
 * author: guoning
 * date 2018/4/25 下午5:49
 * eamil: gn18667130631@gmail.com
 * QQ: 3060974205
 */
public class MainServer {

    public static void main(String[] args){
        EventLoopGroup boss = new NioEventLoopGroup();
        EventLoopGroup group = new NioEventLoopGroup();
    }
}
