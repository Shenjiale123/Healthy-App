# 养成 · 营养记录

面向 Android 和移动浏览器的个人营养记录应用，基于 Capacitor 构建。

## 功能

- 记录每日蛋白质、碳水、脂肪、膳食纤维、维生素与矿物质
- 分类食物库及自定义食物增删改
- 按体重和训练阶段设置营养目标
- 历史记录查看、补记、逐项修改与删除
- JSON 完整备份/恢复与 CSV 导出
- 本地账户及个人身体信息

## Web 运行

```powershell
python -m http.server 4173 --bind 0.0.0.0
```

## Android 构建

```powershell
npm install
npx cap sync android
cd android
gradlew.bat assembleDebug
```

构建产物位于 `android/app/build/outputs/apk/debug/app-debug.apk`。

项目根目录中的 `养成营养记录-Android.apk` 是当前可安装版本。

