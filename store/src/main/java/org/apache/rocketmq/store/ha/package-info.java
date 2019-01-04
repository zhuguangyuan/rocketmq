/**
 * @author: zhuguangyuan
 * @date: 2019/1/4 16:11
 * @version: 1.0
 * @describe 同步消息体，即CommitLog内容
 * 与 broker 集群中同步元数据采用 RemotingCommand 进行请求来同步的方式不同
 * 消息体的同步直接进行TCP连接，这样效率更高
 * 连接成功之后，通过对比master和slave的offset 不断进行同步
 * @since 1.6
 */
package org.apache.rocketmq.store.ha;