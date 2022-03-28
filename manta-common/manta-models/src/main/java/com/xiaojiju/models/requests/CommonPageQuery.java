package com.xiaojiju.models.requests;

public abstract class CommonPageQuery<T> implements PageQuery<T> {

    private Long size;

    private Long current;

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public Long getCurrent() {
        return current;
    }

    public void setCurrent(Long current) {
        this.current = current;
    }
}
