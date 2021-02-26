package com.turboklaus.easyconsistencehash;

import java.util.List;

/**
 * @author Turbo Klaus
 * @author <a href="mailto:guyue375@outlook.com">klaus</a>
 * @program easy-consistence-hash
 **/
public interface LoadBalancer {

    Server select(List<Server> servers, Invocation invocation);
}
