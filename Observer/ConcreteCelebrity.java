package com.company;

import java.util.ArrayList;

public class ConcreteCelebrity implements CelebritySubject{
    private ArrayList<Follower> followers;
    private String tweet;
    private String celebrityName;



    public ConcreteCelebrity(String celebrityName){
        followers = new ArrayList<Follower>();
        this.celebrityName = celebrityName;
    }

    @Override
    public void registerFollower(Follower f) {
       followers.add(f);
       System.out.println(f + " has started following "+ celebrityName);
    }




    @Override
    public void removeFollower(Follower f) {
            int i = followers.indexOf(f);
            if( i >= 0 ) {
                followers.remove(i);
            }

            System.out.println(f + " has stopped following " + celebrityName );

    }



    @Override
    public void notifyFollowers() {
        for(Follower follower : followers){
            follower.update(celebrityName,tweet);
        }

    }

    public void newTweet(){
        notifyFollowers();
    }

    public void setTweets(String tweet){
        this.tweet = tweet;
        System.out.println(celebrityName + " has tweeted :: " + tweet + "\n");
        newTweet();
    }

    public String getTweet() {
        return tweet;
    }

    public String getCelebrityName() {
        return celebrityName;
    }
}
