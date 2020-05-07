public class Driver {
    public static ShowsBridgeInterface getBridge(){
        ProxyBridge bridge = new ProxyBridge();
        //RealBridge bridge = new RealBridge();
        return bridge;
    }
}
