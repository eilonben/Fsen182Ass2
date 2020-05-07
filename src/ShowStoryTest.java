
public class ShowStoryTest  {
    private ShowsBridgeInterface bridge;
    public ShowStoryTest(){
        bridge = Driver.getBridge();
    }
    protected boolean addShow(String name,String desc ,String hallName,String date ,String price){
        return bridge.addShow(name,desc,hallName,date,price);
    }

    public boolean orderTickets(String showName,String customer,String phone,String[] chairs ){
        return bridge.orderTickets(showName,customer,phone,chairs);
    }

    public boolean login(String username,String password){
        return bridge.login(username,password);
    }

    public boolean isLegalDetails(String username,String phone){
        return bridge.isLegalDetails(username,phone);
    }

    public boolean updateHour(String username,String show,String hour){
        return bridge.updateHour(username,show,hour);
    }

    public boolean isLegalPhone(String phone){
        return bridge.isLegalPhone(phone);
    }
}
