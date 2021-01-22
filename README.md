#微服务架构的4大问题#  
  1.服务太多，客户端如何访问。  
  2.服务之间如何通讯。  
  3.服务太多，如何治理。  
  4.服务挂了怎么办。  

解决方案：  
1.SpringCloud Netflix(一站式开发)  
   API网关  zuul组件  
   Feign --- HttpClient --- Http通信方式 同步并阻塞  
   服务的注册与发现：Eureka  
   熔断机制：Hystrix  
2.Dubbo + Zookeeper  
   API网关 借助第三方组件  
   Dubbo RPC 一款高性能的基于Java开发的RPC框架  
   Zookeeper  
   熔断机制：Hystrix 借助第三方组件  
3.SpringCloud Alibaba(一站式开发)  
   API网关  
   Dubbo RPC  
   Nacos  
   流量控制、服务降级  
4.Service Mesh(服务网格)  

万变不离其宗：  
   API网关  
   RPC/Http  
   微服务的注册与发现  
   熔断机制  
    
