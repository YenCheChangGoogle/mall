'use strict'
const merge = require('webpack-merge')
const prodEnv = require('./prod.env')

module.exports = merge(prodEnv, {
  NODE_ENV: '"development"',
  
  /*
  
  入口點 http://localhost:8090
  
  搭建步驟
  
  ▓ 
  因為有些函式庫的相依問題需要配合特定的node版本 因此需要安裝NVM環境 來管理不同版本的node
  安裝NVM環境 nvm-setup.exe 
    nvm install 輸入要安裝的版本	：安裝特定版本的 Node.js
	nvm uninstall 輸入要安裝的版本	：刪除指定版本Node.js
	nvm ls							：列出本定端所安裝的 Node.js 環境
	nvm use 輸入要安裝的版本		：當前命令列套用特定版本的 Node.js
	
	
	npm install -g node-sass@6.0.1
	
	
  ▓ 
  - 下載node並安裝：[https://nodejs.org/dist/v12.14.0/node-v12.14.0-x64.msi](https://nodejs.org/dist/v12.14.0/node-v12.14.0-x64.msi)
  
  - 該項目為前後端分離項目 後端可以是 一般後臺環境 或是 微服務後臺環境 
    
    一般後臺環境
	後端原始碼 https://github.com/YenCheChangGoogle/mall.git 啟動後台連線的對應是 http://localhost:8080
	其中 `config/dev.env.js`文件中的`BASE_API`改為[http://localhost:8080]
	或
	若不想建立後臺環境，只需將`config/dev.env.js`文件中的`BASE_API`改為[http://admin-api.macrozheng.com] 暫時使用此也可
    或
	微服務後臺環境
	微服務後臺 的原始碼 https://github.com/YenCheChangGoogle/mall-swarm.git 啟動微服務後臺連線的對應是 http://localhost:8201/mall-admin
	所有接口都需要通過網關訪問，需要將`config/dev.env.js`文件中的`BASE_API`改為[http://localhost:8201/mall-admin]
    
  
  - 克隆源代碼到本地，使用IDEA打開，並完成編譯
  - 在IDEA命令行中運行命令：npm install,下載相關依賴
  - 在IDEA命令行中運行命令：npm run dev,運行項目
  - 訪問地址：[http://localhost:8090] 即可打開後臺管理系統頁面
  
  - 具體部署過程請參考：[mall前端項目的安裝與部署](http://www.macrozheng.com/#/deploy/mall_deploy_web)
  - `注意`：如果遇到無法運行npm命令，需要配置npm的環境變量，如在path變量中添加：C:\Users\zhenghong\AppData\Roaming\npm;
  - `注意`：如果遇到npm install無法成功下載依賴，請參考[使用Jenkins一鍵打包部署前端應用，就是這麼6！](http://www.macrozheng.com/#/reference/jenkins_vue) 中`遇到的坑`部分

  */
  
  BASE_API: '"http://localhost:8080"' //連結後台 原本的預設
  //BASE_API: '"http://admin-api.macrozheng.com]"' //連結後台 暫時指定 http://admin-api.macrozheng.com 可以連線與測試
  //BASE_API: '"http://localhost:8201/mall-admin"' //連結後台 暫時指定  http://localhost:8201/mall-admin 微服務後臺
  
  
})
