//程序清单3.4　条件化地配置bean
@Bean
@Conditional(MagicExistsCondition.class)
public MagicBean magicBean(){
    return new MagicBean();
}



public interface Condition{
    boolean matches(ConditionContext ctxt AnnotatedTypeMetadata metadata);
}