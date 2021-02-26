package com.turboklaus.easyconsistencehash;

/**
 * @author Turbo Klaus
 * @author <a href="mailto:guyue375@outlook.com">klaus</a>
 * @program easy-consistence-hash
 **/
public class JdkHashCodeStrategy implements HashStrategy {

    @Override
    public int getHashCode(String origin) {
        return origin.hashCode();
    }

}
