package com.xiaojiju.models.requests;

import javax.validation.Valid;
import java.util.List;

/**
 * 验证数组中的对象的属性
 * @param <T> 待验证的对象
 */
public class ValidateList<T> {

    @Valid
    List<T> targets;

    public ValidateList() {
    }

    public ValidateList(List<T> targets) {
        this.targets = targets;
    }

    public List<T> getTargets() {
        return targets;
    }

    public void setTargets(List<T> targets) {
        this.targets = targets;
    }
}
