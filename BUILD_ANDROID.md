# 构建 Android 安装包

当前目录是一个可安装 PWA。要生成 APK，建议使用 Capacitor：

```powershell
npm install
npm install @capacitor/core @capacitor/cli @capacitor/android
npx cap init "养成" "com.yangcheng.nutrition" --web-dir .
npx cap add android
npx cap copy android
npx cap open android
```

在 Android Studio 中选择 `Build > Generate App Bundles or APKs > Generate APKs`，生成的文件通常位于：

`android/app/build/outputs/apk/debug/app-debug.apk`

构建环境需要：

- Android Studio
- Android SDK Platform 34 或更高
- JDK 17

生成 APK 后，可以通过微信文件传输、USB 或网盘发送到手机，点击 APK 安装。首次安装需要允许浏览器或文件管理器“安装未知来源应用”。
