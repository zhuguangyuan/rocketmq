/**
 * @author: zhuguangyuan
 * @date: 2019/1/3 18:11
 * @version: 1.0
 * @describe 名称服务器
 * 从NamesrvStartup开始启动
 *      主要是读取namesrvConfig及nettyServerConfig,
 *      并根据启动参数创建控制器
 * 总控逻辑NamesrvController
 *      启动线程池，接收其他角色上报的状态，处理并返回相应的状态
 *      remotingService // netty通信服务
 *          remotingServer
 *          remotingExecutor
 *          TLS链路
 *      DefaultRequestProcessor //处理客户端发来的请求
 *          #processRequest()
 *              注册broker
 *              新建topic
 *              ...
 *              更新nameserver的config
 *          #rejectRequest()
 *      两个定时线程
 *          定时扫描失效的broker
 *          定时打印配置信息
 *
 *      RouteInfoManager 保存和维护集群的各种元数据
 *          clusterAddrTable
 *          brokerAddrTable
 *          brokerLiveTable
 *          filterSeverTable
 *          topicQueueTable
 *
 *
 * @since 1.6
 */
package org.apache.rocketmq.namesrv;