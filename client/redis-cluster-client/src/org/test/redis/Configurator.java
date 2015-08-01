package org.test.redis;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisShardInfo;

public class Configurator {
	public JedisCluster configure(){
		Set<HostAndPort> nodes = new HashSet<HostAndPort>();
		nodes.add(new HostAndPort("localhost", 7000));
		JedisCluster cluster = new JedisCluster(nodes);
		
		
		return cluster;
	}
}
