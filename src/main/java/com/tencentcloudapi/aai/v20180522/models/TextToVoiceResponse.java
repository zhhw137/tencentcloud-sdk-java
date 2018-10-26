/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.aai.v20180522.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TextToVoiceResponse  extends AbstractModel{

    /**
    * base编码的wav音频
    */
    @SerializedName("Audio")
    @Expose
    private String Audio;

    /**
    * 一次请求对应一个SessionId
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取base编码的wav音频
     * @return Audio base编码的wav音频
     */
    public String getAudio() {
        return this.Audio;
    }

    /**
     * 设置base编码的wav音频
     * @param Audio base编码的wav音频
     */
    public void setAudio(String Audio) {
        this.Audio = Audio;
    }

    /**
     * 获取一次请求对应一个SessionId
     * @return SessionId 一次请求对应一个SessionId
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * 设置一次请求对应一个SessionId
     * @param SessionId 一次请求对应一个SessionId
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * 获取唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @return RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @param RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Audio", this.Audio);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}
