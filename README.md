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
