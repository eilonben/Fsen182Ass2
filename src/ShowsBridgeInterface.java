public interface ShowsBridgeInterface {
     boolean login(String username,String password);
     boolean addShow(String name,String desc ,String hallName,String date ,String price );
     boolean updateHour(String username,String show,String hour);
     boolean orderTickets(String showName,String customer,String phone,String[] chairs );
     boolean isLegalDetails(String username,String phone);
     boolean isLegalPhone(String phone);
}
