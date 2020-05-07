public class ProxyBridge implements ShowsBridgeInterface {
    public ShowsBridgeInterface real;

    public ProxyBridge(){this.real=null;}

    public boolean login(String username, String password){
        if (this.real!=null)
            return real.login(username,password);
        return false;
    }
    public boolean addShow(String name,String desc ,String hallName,String date ,String price ){
        if (this.real!=null)
            return real.addShow(name,desc,hallName,date,price);
        return false;
    }
    public boolean orderTickets(String showName,String customer,String phone,String[] chairs ){
        if (this.real!=null)
            return this.real.orderTickets(showName,customer,phone,chairs);
        return false;
    }

    public boolean  isLegalDetails(String username,String phone){
        if (this.real!=null)
            return this.real.isLegalDetails(username,phone);
        return false;
    }
    public boolean isLegalPhone(String phone){
        if (this.real!=null)
            return this.real.isLegalPhone(phone);
        return false;
    }

    public boolean updateHour(String username,String showName,String hour){
        if (this.real!=null)
            return this.real.updateHour(username,showName,hour);
        return false;
    }
}
