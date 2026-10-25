package com.yangcheng.nutrition;

import android.os.Bundle;
import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Clear only WebView resource cache after an APK upgrade. Web storage
        // (history, custom foods and settings) is intentionally preserved.
        if (this.bridge != null && this.bridge.getWebView() != null) {
            this.bridge.getWebView().clearCache(true);
            // A versioned same-origin URL bypasses any stale navigation entry
            // while retaining localStorage from previous installed versions.
            this.bridge.getWebView().post(() ->
                this.bridge.getWebView().loadUrl("https://localhost/?v=38")
            );
        }
    }
}
