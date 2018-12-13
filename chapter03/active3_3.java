//程序清单3.3 在Web应用的web.xml文件中设置默认的profile
<?xml version="1.0" encoding="UTF-8" ?>
<web-app version="2.5" xmlns="http://java.sun.com/xml/ns/javaee"
         xmlns="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLoaction="http://java.sun.com/xml/ns/javaee
            http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd">
    <context-param>
        <param-name>contextConfiguration</param-name>
        <param-value>/WEB-INF/spring/root-context.xml</param-value>
    </context-param>
    <context-param>
        <param-name>spring.profile.default</param-name>    //为上下文设置默认的 profile
        <param-value>dev</param-value>
    </context-param>
    <listener>
        <listener-class>org.springframework.web.context.ContextLoderListener</listener-class>
    </listener>
    <servlet>
        <servlet-name>appServlet</servlet-name>
        <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
        <init-param>
            <param-name>spring.profiles.default</param-name>
            <param-value>dev</param-value>
        </init-param>
        <load-on-startup>1</load-on-startup>
    </servlet>
    <servlet-mappring>
        <servlet-name>appServlet</servlet-name>
        <url-pattern>/</url-pattern>
    </servlet-mappring>
</web-app>