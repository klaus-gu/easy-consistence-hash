package com.turboklaus.easyconsistencehash;

/**
 * @author Turbo Klaus
 * @author <a href="mailto:guyue375@outlook.com">klaus</a>
 * @program easy-consistence-hash
 **/
public class Invocation {
    public Invocation() {
    }

    public Invocation(String hashKey) {
        this.hashKey = hashKey;
    }

    private String hashKey;

    public String getHashKey() {
        return hashKey;
    }

    public void setHashKey(String hashKey) {
        this.hashKey = hashKey;
    }
}
