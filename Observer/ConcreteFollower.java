package com.company;

public class ConcreteFollower implements Follower{

    private CelebritySubject concreteCelebrity;
    String followerName;

    public ConcreteFollower(CelebritySubject concreteCelebrity, String followerName){
        this.followerName = followerName;
        concreteCelebrity.registerFollower(this);
    }




    @Override
    public void update(String celebrityName, String tweet) {
        System.out.println(followerName + " has recieved "+ celebrityName + " 's tweet :: " + tweet );
    }

    @Override
    public String toString() {
        return followerName;
    }
}
