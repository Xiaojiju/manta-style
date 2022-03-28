package com.xiaojiju.auth.core.strategy;

/**
 * 多实现
 * @param <T> 权限面板
 * @param <R> 验证负载
 */
public interface AuthorizationStrategy<T extends Board, R extends AccessPayload> {

    boolean authorize(R accessPayload);

    boolean remove(T board);

}
