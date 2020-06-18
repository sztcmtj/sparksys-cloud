package com.sparksys.authorization.infrastructure.mq.producer;

import com.sparksys.authorization.infrastructure.mq.message.UserMessage;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFuture;

import javax.annotation.Resource;
import java.util.concurrent.ExecutionException;

/**
 * description：
 *
 * @author zhouxinlei
 * @date 2020/6/7 5:11 下午
 */
@Component
public class UserProducer {

    @Resource
    private KafkaTemplate<Object, Object> kafkaTemplate;


    public SendResult<Object, Object> syncSend(Integer id) throws ExecutionException, InterruptedException {
        // 创建 Demo01Message 消息
        UserMessage message = new UserMessage();
        message.setId(id);
        // 同步发送消息
        return kafkaTemplate.send(UserMessage.TOPIC, message).get();
    }

    public ListenableFuture<SendResult<Object, Object>> asyncSend(Integer id) {
        // 创建 Demo01Message 消息
        UserMessage message = new UserMessage();
        message.setId(id);
        // 异步发送消息
        return kafkaTemplate.send(UserMessage.TOPIC, message);
    }

}
