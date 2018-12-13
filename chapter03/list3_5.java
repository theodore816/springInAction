//程序清单3.5　在Condition中检查是否存在magic属性
package com.habuma.restfun;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.util.ClassUtils;
public class MagicExistCondition implements Condition{
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata){
        Environment env = context.getEnvironment();
        return Env.containsProperty("magic");
    }
}