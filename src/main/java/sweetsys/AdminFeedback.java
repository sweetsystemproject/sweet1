package sweetsys;

import java.util.ArrayList;

public class AdminFeedback {

    public boolean in;
    private String username;
    private String AdminName;
    private String Response;
    private int responseNumber;


    static public ArrayList<AdminFeedback> adminresponse = new ArrayList<>();


    public AdminFeedback(String adminName, int responseNumber, String response, String username) {
        AdminName = adminName;
        this.responseNumber = responseNumber;
        Response = response;
        this.username = username;
    }

    public int getResponseNumber() {
        return responseNumber;
    }

    public void setResponseNumber(int responseNumber) {
        this.responseNumber = responseNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAdminName() {
        return AdminName;
    }

    public void setAdminName(String adminName) {
        AdminName = adminName;
    }

    public String getResponse() {
        return Response;
    }

    public void setResponse(String response) {
        Response = response;
    }

    public static ArrayList<AdminFeedback> getAdminresponse() {
        return adminresponse;
    }

    public static void setAdminresponse(ArrayList<AdminFeedback> adminresponse) {
        AdminFeedback.adminresponse = adminresponse;
    }

    public AdminFeedback() {
    }

    @Override
    public String toString() {
        return "AdminFeedback{" +
                "username='" + username + '\'' +
                ", AdminName='" + AdminName + '\'' +
                ", Response='" + Response + '\'' +
                '}';
    }


    public void adminResponsemessege(User user,int num,String resmsg) {


        String name = user.getUsername();

            String usernameee="";
            int resnum=0;
            for (FeedBack feed : FeedBack.getFeedBacklist()) {
                if (feed.getFeednumber() == num) {
                  usernameee = feed.getSenderName();
                  resnum=num;
                }
            }


            AdminFeedback a=new AdminFeedback(name,resnum,resmsg,usernameee);
            adminresponse.add(a);
            setAdminresponse(adminresponse);
            System.out.println(getAdminresponse());


    }




}