#springboot-dubbo配置过程
注：参考：https://github.com/Snailclimb/springboot-guide
参考优秀博主guide哥一步步搭建完成，十分感谢


##1.步骤

1）搭建zk环境
2）实现服务接口 dubbo-interface
3）实现服务提供者 dubbo-provider
4）实现服务消费者 dubbo-consumer
5）查看zk节点：
zk客户端查看节点； 
或者去一个可视化平台去查看（监控服务中心搭建）

##2.搭建zk环境
参考自己的笔记

##3.实现服务接口 dubbo-interface
创建 Maven项目;
创建 dubbo-interface模块;
创建接口类
将项目打成jar包供其他项目使用（打包其实达到了本地仓库.m2，后面依赖该jar包拉取的时候也是先从远程拉取，没有的话从本地拉取）

##4.实现服务提供者 dubbo-provider
创建dubbo-provider模块; （当然实际项目中，我们的消费者和生产者肯定不会在一个项目中的，我们只需引用api模块的pom就行了）
加入dubbo 、zookeeper以及【自己建立的接口】的相关依赖jar包；
在 application.properties 配置文件中配置 dubbo 相关信息；
编写实习那类：实现接口类; 注意@service的注解是dubbo的而不是Spring的！！！
服务提供者启动类编写：注意dubbo相关的注解：@EnableDubboConfiguration
启动启动类试一下

##5.实现服务消费者 dubbo-consumer
创建dubbo-consumer模块;（当然实际项目中，我们的消费者和生产者肯定不会在一个项目中的，我们只需引用api模块的pom就行了）
加入 dubbo 、zookeeper以及接口的相关依赖 jar 包；
在 application.properties配置文件中配置dubbo相关信息；
编写controller调用远程服务;
服务消费者启动类编写
测试效果:controller: http://localhost:8330/hello

##6.查看zk节点
1）zk客户端查看节点
需要启动zk客户端连接zk服务端
查看zk节点的变化：https://blog.csdn.net/qq_28336067/article/details/98084393
2）监控服务中心搭建 监控dubbo的生产者提供的服务和消费者的情况
https://www.cnblogs.com/mingxiaoyue/p/9194431.html

