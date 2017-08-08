﻿# Spring_Study

## 跟着视频学的spring，方便以后查阅

+ web.xml  DispatcherServlet的配置
```
<servlet>
	<servlet-name>springDispatcherServlet</servlet-name>
	<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
	<init-param>
		<param-name>contextConfigLocation</param-name>
		<param-value>classpath:springmvc.xml</param-value>
	</init-param>
	<load-on-startup>1</load-on-startup>
</servlet>
<servlet-mapping>
	<servlet-name>springDispatcherServlet</servlet-name>
	<url-pattern>/</url-pattern>
</servlet-mapping>
```
+ 在springmvc.xml
```
<!--配置包扫描器-->
<context:component-scan base-package="cn.wzl"></context:component-scan>
```

```
<!-- 配置视图解析器 -->
<bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
	<property name="prefix" value="/WEB-INF/views/"></property>
	<property name="suffix" value=".jsp"></property>
</bean>
```

---

1. @Component 是一个泛化的概念，仅仅表示一个组件 (Bean) ，可以作用在任何层次。
2. @Service 通常作用在业务层，但是目前该功能与 @Component 相同。
3. @Constroller 通常作用在控制层，但是目前该功能与 @Component 相同。

*@Repository 只能标注在DAO类上呢？这是因为该注解的作用不只是将类识别为Bean，同时它还能将所标注的类中抛出的数据访问异常封装为Spring的数据访问异常类型。Spring本身提供了一个丰富的并且是与具体的数据访问技术无关的数据访问异常结构，用于封装不同的持久层框架抛出的异常，使得异常独立于底层的框架。*
通过在类上使用 @Repository、@Component、@Service 和 @Constroller 注解，***Spring会自动创建相应的 BeanDefinition 对象，并注册到 ApplicationContext*** 中。这些类就成了 Spring受管组件。这三个注解除了作用于不同软件层次的类，其使用方式与 @Repository 是完全相同的。


1. 另外，除了上面的四个注解外，用户可以创建自定义的注解，然后在注解上标注 @Component，那么，该自定义注解便具有了与所@Component 相同的功能。不过这个功能并不常用。
2. 当一个 Bean被自动检测到时，会根据那个扫描器的BeanNameGenerator 策略生成它的 bean名称。默认情况下，对于包含name属性的@Component、@Repository、@Service和@Controller，会把name取值作为Bean的名字。如果这个注解不包含name值或是其他被自定义过滤器发现的组件，默认Bean名称会是小写开头的非限定类名。如果你不想使用默认bean命名策略，可以提供一个自定义的命名策略。首先实现BeanNameGenerator接口，确认包含了一个默认的无参数构造方法。然后在配置扫描器时提供一个全限定类名

----

+ spring 中的 autowire


|模式|说明|
|----|----|
| no | 不使用自动装配，必须通过ref元素指定依赖，默认设置 |
| byName | 根据属性名自动装配。此选项将检查容器并根据名字查找与   属性完全一致的bean，并将其与属性自动装配。 |
|byType| 如果容器中存在一个与指定属性类型相同的bean，那么将与该属性自动装配；如果存在多个该类型bean，那么抛出异常，并指出不能使用byType方式进行自动装配；如果没有找到相匹配的bean，则什么事都不发生，也可以通过设置dependency-check="objects"让Spring抛出异常。|
|constructor| 与byType方式类似，不同之处在于它应用于构造器参数。如果容器中没有找到与构造器参数类型一致的bean，那么抛出异常。|
|autodetect|通过bean类的自省机制（introspection）来决定是使用constructor还是byType方式进行自动装配。如果发现默认的构造器，那么将使用byType方式。|

*采用xml格式配置bean时，将<bean/>元素的autowire-candidate属性设置为false，这样容器在查找自动装配对象时，将不考虑该bean，即它不会被考虑作为其它bean自动装配的候选者，但是该bean本身还是可以使用自动装配来注入其它bean的。*

----










