package com.company;

public interface CelebritySubject {
    public void registerFollower (Follower f);
    public void removeFollower(Follower f);
    public void notifyFollowers();

}
