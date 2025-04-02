package com.example.demo.repository.mybatis;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.UserSearchRequest;
import com.example.demo.entity.User;

/**
 * ユーザー情報 Mapper
 */
@Mapper
@Configuration
@Repository // Bean として認識させる
public interface UserMapper {

	/**
	 * ユーザー情報検索
	 * @param user 検索用リクエストデータ
	 * @return ユーザー情報
	 */
	User search(UserSearchRequest user);
}
