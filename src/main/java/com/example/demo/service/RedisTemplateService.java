package com.example.demo.service;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.util.Pair;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

@Service
public class RedisTemplateService {

	private final RedisTemplate<String, String> redisTemplate;

	public RedisTemplateService(RedisTemplate<String, String> redisTemplate) {
		this.redisTemplate = redisTemplate;
	}

	public Pair<String, String> setToRedis(@NonNull final String key, @NonNull final String value) {

		ValueOperations<String, String> ope = redisTemplate.opsForValue();
		ope.set(key, "set by " + new Object() {
		}.getClass().getEnclosingMethod().getName());

		return Pair.of(key, value);
	}

}
