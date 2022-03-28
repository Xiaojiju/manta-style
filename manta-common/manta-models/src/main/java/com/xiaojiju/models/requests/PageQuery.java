package com.xiaojiju.models.requests;

public interface PageQuery<T> {

    <T> T parse();

}
