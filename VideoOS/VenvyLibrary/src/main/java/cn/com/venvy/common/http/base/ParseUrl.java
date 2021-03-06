package cn.com.venvy.common.http.base;

import java.util.HashMap;

import cn.com.venvy.common.debug.DebugStatus;

/**
 * Created by yanjiangbo on 2017/5/25.
 */

public class ParseUrl {

    public enum VenvyUrl {
        ADS_API("ads-api.videojj.com", "test-ads-api.videojj.com", "test-ads-api.videojj.com"),
        VA("va.videojj.com", "test-va.videojj.com", "test-va.videojj.com"),
        CYTRON("cytron.videojj.com", "test-cytron.videojj.com", "test-cytron.videojj.com"),
        LIVE("liveapi.videojj.com", "test.liveapi.videojj.com", "test.liveapi.videojj.com"),
        LOG_REPORT("log.videojj.com", "test-log.videojj.com", "test-log.videojj.com"),
        OS("os-open.videojj.com", "test-os-open.videojj.com", "dev-os-open.videojj.com"),
        PLAT_LIVE("plat.videojj.com", "pre-plat.videojj.com", "test-plat.videojj.com");

        private String url;
        private String preUrl;
        private String debugUrl;

        VenvyUrl(String url, String preUrl, String debugUrl) {
            this.url = url;
            this.preUrl = preUrl;
            this.debugUrl = debugUrl;
        }

        public String getCurrentUrl() {
            if (DebugStatus.isDebug()) {
                return debugUrl;
            } else if (DebugStatus.isPreView()) {
                return preUrl;
            } else {
                return url;
            }
        }

        public String getOnlineUrl() {
            return url;
        }
    }

    public static HashMap<String, VenvyUrl> urlMap = new HashMap<>();

    static {
        urlMap.put(VenvyUrl.ADS_API.getOnlineUrl(), VenvyUrl.ADS_API);
        urlMap.put(VenvyUrl.VA.getOnlineUrl(), VenvyUrl.VA);
        urlMap.put(VenvyUrl.CYTRON.getOnlineUrl(), VenvyUrl.CYTRON);
        urlMap.put(VenvyUrl.LIVE.getOnlineUrl(), VenvyUrl.LIVE);
        urlMap.put(VenvyUrl.LOG_REPORT.getOnlineUrl(), VenvyUrl.LOG_REPORT);
        urlMap.put(VenvyUrl.PLAT_LIVE.getOnlineUrl(), VenvyUrl.PLAT_LIVE);
        urlMap.put(VenvyUrl.OS.getOnlineUrl(), VenvyUrl.OS);
    }
}
