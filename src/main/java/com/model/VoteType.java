package com.model;

//import com.programming.techie.springredditclone.exceptions.SpringRedditException;

import java.util.Arrays;

public enum VoteType {
    UPVOTE(1), DOWNVOTE(-1),
    ;

    private int direction;

    VoteType(int direction) {
    }



    public Integer getDirection() {
        return direction;
    }
}