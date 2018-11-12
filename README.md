# mulitmode
dubbo多模块及整合tcc-transaction分布式事物
注意事项
- TransactionManager 事物管理器  
在xml中定义domain tbSuffix在事物管理器中使用到
- Transaction 事物
- Participant 事物参与者
- TransactionXid  事物编号
- Terminator 执行器
- CompensableTransactionAspect APO 可补偿事务拦截器
- ResourceCoordinatorInterceptor 资源协调者拦截器
- 事物恢复定时 RecoverScheduledJob
#### tcc-transaction是开源的TCC补偿性分布式事务框架，git地址：https://github.com/changmingxie/tcc-transaction 
#### 整合dubbo要添加
```
<dependency>
            <groupId>org.mengyun</groupId>
            <artifactId>tcc-transaction-spring</artifactId>
            <version>${project.tcc-transaction-spring}</version>
        </dependency>

        <dependency>
            <groupId>org.mengyun</groupId>
            <artifactId>tcc-transaction-dubbo</artifactId>
            <version>${project.tcc-transaction-spring}</version>
        </dependency>
```
#### dubbo启动默认的加载的xml文件要引入
```
    <import resource="classpath:tcc-transaction.xml"/>
    <import resource="classpath:config/appcontext-service-tcc.xml" />
```
