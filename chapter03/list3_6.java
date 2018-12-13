//程序清单3.6 ProfileCondition检查某个bean profile是否可用
class ProfileCondition implements Condition{
	public boolean matches(ConditionContext context,AnnotatedTypeMetadata metadata){
		if(context.getEnvironment() != null){
			MultiValueMap<String, Object> attrs 
			= metadata.getAllAnnotationAttributes(Profile.class.getName());
			if(attrs != null){
				for(Object value:attrs.get("value")){
					if(context.getEnvironment().acceptsProfile(((String[]) value))){
						return true;
					}
				}
				return false;
			}
		}
		return true;
	}
}