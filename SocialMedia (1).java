import java.io.*;
import java.util.*;

class Tweeter
{
    int tweets;
    int followers;
    String name;
    long number;
    String account;
    int following;
}
class Tiktok
{
    int videos;
    int followers;
    String name;
    long number;
    int likes;
    int comments;
    int share;
}
class SocialMedia
{
    public static void main(String args[])
    {
        Tweeter srinivas=new Tweeter();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your tweeter account details:");
	System.out.print("Enter no of tweets:");
        srinivas.tweets=sc.nextInt();
	System.out.print("\nEnter no of followers:");
        srinivas.followers=sc.nextInt();
	System.out.print("\nEnter name:");
        srinivas.name=sc.next();
	System.out.print("\nEnter Mobile number:");
        srinivas.number=sc.nextLong();
	System.out.print("\nEnter username:");
        srinivas.account=sc.next();
	System.out.print("\nEnter no of following:");
        srinivas.following=sc.nextInt();
        System.out.println("------Tweeter Details-----");
        System.out.println("tweets:"+srinivas.tweets);
        System.out.println("followers:"+srinivas.followers);
        System.out.println("name="+srinivas.name);
        System.out.println("number:"+srinivas.number);
        System.out.println("account:"+srinivas.account);
        System.out.println("following="+srinivas.following + "\n");
        Tiktok krishna=new Tiktok();
	System.out.println("Enter your tiktok account details:");
	System.out.print("Enter no of videos:");
        krishna.videos=sc.nextInt();
	System.out.print("\nEnter no of followers:");
        krishna.followers=sc.nextInt();
	System.out.print("\nEnter name:");
        krishna.name=sc.next();
	System.out.print("\nEnter Mobile number:");
        krishna.number=sc.nextLong();
	System.out.print("\nEnter no of likes:");
        krishna.likes=sc.nextInt();
	System.out.print("\nEnter no of comments:");
        krishna.comments=sc.nextInt();
	System.out.print("\nEnter no of shares:");
        krishna.share=sc.nextInt();
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
