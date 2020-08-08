package com.mcres.octarus.data;

public class Constant {

    // The server that you want to connect to
    public static String SERVER = "http://addons.octarus.com/";

    // Leave this blank to make a general connection
    public static final String SECURITY_KEY = "";

    // The URL to use for the help page
    public static String HELP_PAGE = "http://storage.octarus.com/files/How%20to%20download%20addons%20Jul%2018%2C%202020%207.25.31%20PM.mp4";

    // The URL to use for the news page
    public static String NEWS_PAGE = "http://addons.octarus.com/uploads/pages/news";

    // Limit requests to decrease server load
    public static int CONTENT_PER_REQUEST = 20;  //Default 20
    public static int CATEGORY_PER_REQUEST = 20;  //Default 20
    public static int COMMENT_PER_REQUEST = 50; //Default 50
    public static int NOTIFICATION_PAGE = 30;  //Default 30
    public static int BOOKMARKS_PAGE = 20;  //Default 20
    public static int LOAD_IMAGE_RETRY = 3;  //Default 3

    // Data request locations
    public static String getURLcontent(String file_name) {
        return SERVER + "uploads/news/" + file_name;
    }
    public static String getURLcategory(String file_name) {
        return SERVER + "uploads/topic/" + file_name;
    }
    public static String getURLuser(String file_name) {
        return SERVER + "uploads/user/" + file_name;
    }

}