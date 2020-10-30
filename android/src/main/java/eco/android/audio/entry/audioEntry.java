package eco.android.audio.entry;

import android.content.Context;

import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.common.WXException;

import app.eco.framework.extend.annotation.ModuleEntry;
import eco.android.audio.module.WeexaudioModule;

@ModuleEntry
public class audioEntry {

    /**
     * APP启动会运行此函数方法
     * @param content Application
     */
    public void init(Context content) {

        try {
            WXSDKEngine.registerModule("ecoAudio", WeexaudioModule.class);
        } catch (WXException e) {
            e.printStackTrace();
        }
    }

}
