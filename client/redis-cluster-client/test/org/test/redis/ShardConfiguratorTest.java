package org.test.redis;

import java.util.List;
import java.util.Random;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.junit.Assert;
import org.junit.Test;

import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisShardInfo;
import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;

public class ShardConfiguratorTest {

	

	@Test
	public void testPool() {
		Configurator config = new Configurator();

		JedisCluster cluster = config.configure();

		ShardedJedis jedis;
		Random random = new Random();
		for (int i = 0; i < 10000; i++) {
			
			Assert.assertEquals("OK", cluster.set(Integer.toString(i), Long.toString(random.nextLong())));
		}

	}
}
