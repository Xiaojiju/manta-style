package com.xiaojiju.auth.core.strategy;

public interface AccessPayload {

    String encode();

    String decode();

}
