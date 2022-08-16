package com.kindata.uniearn.api.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wenzhiwei
 * @date 2021/4/10 上午10:01
 * @mail 597384114@qq.com
 */
@Configuration
public class MybatisPlusConfig {
  /**
   * 分页插件
   */
  @Bean
  public PaginationInterceptor paginationInterceptor() {
    return new PaginationInterceptor();
  }

}
