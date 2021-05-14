/*
 * Copyright (c) 2011-2019, hubin (jobob@qq.com).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * <p>
 * https://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.baomidou.mybatisplus.test.toolkit;

import com.baomidou.mybatisplus.core.toolkit.LambdaUtils;
import com.baomidou.mybatisplus.core.toolkit.support.SFunction;
import lombok.Getter;
import org.junit.jupiter.api.Test;

import java.lang.invoke.SerializedLambda;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;

/**
 * 测试 Lambda 解析类
 */
class LambdaUtilsTest {

    /**
     * 测试解析
     */
    @Test
    void testExtract() {
        SFunction<TestModel, Object> getId = TestModel::getId;
        SerializedLambda lambda = LambdaUtils.extract(getId);
        assertNotNull(lambda);
        assertSame(TestModel.class, LambdaUtils.instantiatedClass(lambda));
    }

    /**
     * 用于测试的 Model
     */
    @Getter
    private static class TestModel extends Parent implements Named {
        private String name;
    }

    @Getter
    private static abstract class Parent {
        private int id;
    }

    // 处理 ISSUE:https://gitee.com/baomidou/mybatis-plus/issues/I13Y8Y，由于 java 本身处理的问题，这里无法获取到实例
    private abstract static class BaseHolder<T extends Named> {

        SerializedLambda toLambda() {
            return LambdaUtils.extract(T::getName);
        }

    }

    private static class TestModelHolder extends BaseHolder<TestModel> {
    }

    private interface Named {
        String getName();
    }

}
