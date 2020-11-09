@Bean是一个方法级别上的注解，@Component是一个类级别的注解。
@Configuration和@Bean同时使用，可以将某个方法添加到IoC去管理，相对更灵活。

@Component倾向于组件扫描和自动装配。
引入第三方库时，无法在该类上添加@Component，自动设置也就无从下手。
但@Bean或者XML的形式会返回一个被spring认可的Bean。@Bean所注释的方法内部可以对这个第三方库的实例进行设置。
