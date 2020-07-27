# cloud-zookeeper

## zk-client 服务消费者
对外提供服务，开放接口

## zk-service 服务提供者
被消费者调用，提供数据服务

如果要实现负载均衡，则修改zk-service启动端口，再启动即可。外部访问消费者接口，返回数据这是再多个提供者之间来回切换

###### 参考
[https://www.codenong.com/telim-2509187](https://www.codenong.com/telim-2509187)
