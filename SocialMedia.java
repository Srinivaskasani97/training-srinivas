import java.io.*;

class Tweeter
{
    int tweets;
    int followers;
    String name;
    int number;
    String account;
    int following;
}
class Tiktok
{
    int videos;
    int followers;
    String name;
    int number;
    int likes;
    int comments;
    int share;
}
class SocialMedia
{
    public static void main(String args[])
    {
        Tweeter srinivas=new Tweeter();
        srinivas.tweets=20;
        srinivas.followers=200;
        srinivas.name="Ramarao";
        srinivas.number=89768543;
        srinivas.account="Srinu";
        srinivas.following=346;
        System.out.println("------Tweeter Details-----");
        System.out.println("tweets:"+srinivas.tweets);
        System.out.println("followers:"+srinivas.followers);
        System.out.println("name="+srinivas.name);
        System.out.println("number:"+srinivas.number);
        System.out.println("account:"+srinivas.account);
        System.out.println("following="+srinivas.following + "\n");
        Tiktok krishna=new Tiktok();
        krishna.videos=15;
        krishna.followers=145;
        krishna.name="Krish";
        krishna.number=12325678;
        krishna.likes=256;
        krishna.comments=13;
        krishna.share=38;
        System.out.println("-------Tiktok Details-----");
        System.out.println("videos:" +krishna.videos);
        System.out.println("followers:"+krishna.followers);
        System.out.println("name="+krishna.name);
        System.out.println("number:"+krishna.number);
        System.out.println("like:"+krishna.likes);
        System.out.println("comment:"+krishna.comments);
        System.out.println("share="+krishna.share);
    }
}
