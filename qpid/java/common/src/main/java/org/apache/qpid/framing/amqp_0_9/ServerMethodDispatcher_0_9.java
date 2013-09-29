/*
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 */

/*
 * This file is auto-generated by Qpid Gentools v.0.1 - do not modify.
 * Supported AMQP version:
  *   0-9
  */

package org.apache.qpid.framing.amqp_0_9;

import org.apache.qpid.AMQException;
import org.apache.qpid.framing.*;


public interface ServerMethodDispatcher_0_9 extends ServerMethodDispatcher
{

    public boolean dispatchAccessRequest(AccessRequestBody body, int channelId) throws AMQException;
    public boolean dispatchBasicAck(BasicAckBody body, int channelId) throws AMQException;
    public boolean dispatchBasicCancel(BasicCancelBody body, int channelId) throws AMQException;
    public boolean dispatchBasicConsume(BasicConsumeBody body, int channelId) throws AMQException;
    public boolean dispatchBasicGet(BasicGetBody body, int channelId) throws AMQException;
    public boolean dispatchBasicPublish(BasicPublishBody body, int channelId) throws AMQException;
    public boolean dispatchBasicQos(BasicQosBody body, int channelId) throws AMQException;
    public boolean dispatchBasicRecover(BasicRecoverBody body, int channelId) throws AMQException;
    public boolean dispatchBasicRecoverSync(BasicRecoverSyncBody body, int channelId) throws AMQException;
    public boolean dispatchBasicReject(BasicRejectBody body, int channelId) throws AMQException;
    public boolean dispatchChannelClose(ChannelCloseBody body, int channelId) throws AMQException;
    public boolean dispatchChannelCloseOk(ChannelCloseOkBody body, int channelId) throws AMQException;
    public boolean dispatchChannelFlow(ChannelFlowBody body, int channelId) throws AMQException;
    public boolean dispatchChannelFlowOk(ChannelFlowOkBody body, int channelId) throws AMQException;
    public boolean dispatchChannelOk(ChannelOkBody body, int channelId) throws AMQException;
    public boolean dispatchChannelOpen(ChannelOpenBody body, int channelId) throws AMQException;
    public boolean dispatchChannelPing(ChannelPingBody body, int channelId) throws AMQException;
    public boolean dispatchChannelPong(ChannelPongBody body, int channelId) throws AMQException;
    public boolean dispatchChannelResume(ChannelResumeBody body, int channelId) throws AMQException;
    public boolean dispatchConnectionClose(ConnectionCloseBody body, int channelId) throws AMQException;
    public boolean dispatchConnectionCloseOk(ConnectionCloseOkBody body, int channelId) throws AMQException;
    public boolean dispatchConnectionOpen(ConnectionOpenBody body, int channelId) throws AMQException;
    public boolean dispatchConnectionSecureOk(ConnectionSecureOkBody body, int channelId) throws AMQException;
    public boolean dispatchConnectionStartOk(ConnectionStartOkBody body, int channelId) throws AMQException;
    public boolean dispatchConnectionTuneOk(ConnectionTuneOkBody body, int channelId) throws AMQException;
    public boolean dispatchDtxSelect(DtxSelectBody body, int channelId) throws AMQException;
    public boolean dispatchDtxStart(DtxStartBody body, int channelId) throws AMQException;
    public boolean dispatchExchangeBound(ExchangeBoundBody body, int channelId) throws AMQException;
    public boolean dispatchExchangeDeclare(ExchangeDeclareBody body, int channelId) throws AMQException;
    public boolean dispatchExchangeDelete(ExchangeDeleteBody body, int channelId) throws AMQException;
    public boolean dispatchFileAck(FileAckBody body, int channelId) throws AMQException;
    public boolean dispatchFileCancel(FileCancelBody body, int channelId) throws AMQException;
    public boolean dispatchFileConsume(FileConsumeBody body, int channelId) throws AMQException;
    public boolean dispatchFileOpen(FileOpenBody body, int channelId) throws AMQException;
    public boolean dispatchFileOpenOk(FileOpenOkBody body, int channelId) throws AMQException;
    public boolean dispatchFilePublish(FilePublishBody body, int channelId) throws AMQException;
    public boolean dispatchFileQos(FileQosBody body, int channelId) throws AMQException;
    public boolean dispatchFileReject(FileRejectBody body, int channelId) throws AMQException;
    public boolean dispatchFileStage(FileStageBody body, int channelId) throws AMQException;
    public boolean dispatchMessageAppend(MessageAppendBody body, int channelId) throws AMQException;
    public boolean dispatchMessageCancel(MessageCancelBody body, int channelId) throws AMQException;
    public boolean dispatchMessageCheckpoint(MessageCheckpointBody body, int channelId) throws AMQException;
    public boolean dispatchMessageClose(MessageCloseBody body, int channelId) throws AMQException;
    public boolean dispatchMessageConsume(MessageConsumeBody body, int channelId) throws AMQException;
    public boolean dispatchMessageEmpty(MessageEmptyBody body, int channelId) throws AMQException;
    public boolean dispatchMessageGet(MessageGetBody body, int channelId) throws AMQException;
    public boolean dispatchMessageOffset(MessageOffsetBody body, int channelId) throws AMQException;
    public boolean dispatchMessageOk(MessageOkBody body, int channelId) throws AMQException;
    public boolean dispatchMessageOpen(MessageOpenBody body, int channelId) throws AMQException;
    public boolean dispatchMessageQos(MessageQosBody body, int channelId) throws AMQException;
    public boolean dispatchMessageRecover(MessageRecoverBody body, int channelId) throws AMQException;
    public boolean dispatchMessageReject(MessageRejectBody body, int channelId) throws AMQException;
    public boolean dispatchMessageResume(MessageResumeBody body, int channelId) throws AMQException;
    public boolean dispatchMessageTransfer(MessageTransferBody body, int channelId) throws AMQException;
    public boolean dispatchQueueBind(QueueBindBody body, int channelId) throws AMQException;
    public boolean dispatchQueueDeclare(QueueDeclareBody body, int channelId) throws AMQException;
    public boolean dispatchQueueDelete(QueueDeleteBody body, int channelId) throws AMQException;
    public boolean dispatchQueuePurge(QueuePurgeBody body, int channelId) throws AMQException;
    public boolean dispatchQueueUnbind(QueueUnbindBody body, int channelId) throws AMQException;
    public boolean dispatchStreamCancel(StreamCancelBody body, int channelId) throws AMQException;
    public boolean dispatchStreamConsume(StreamConsumeBody body, int channelId) throws AMQException;
    public boolean dispatchStreamPublish(StreamPublishBody body, int channelId) throws AMQException;
    public boolean dispatchStreamQos(StreamQosBody body, int channelId) throws AMQException;
    public boolean dispatchTunnelRequest(TunnelRequestBody body, int channelId) throws AMQException;
    public boolean dispatchTxCommit(TxCommitBody body, int channelId) throws AMQException;
    public boolean dispatchTxRollback(TxRollbackBody body, int channelId) throws AMQException;
    public boolean dispatchTxSelect(TxSelectBody body, int channelId) throws AMQException;

}